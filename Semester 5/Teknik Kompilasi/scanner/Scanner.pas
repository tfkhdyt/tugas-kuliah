
Unit Scanner;

Interface

Uses CRT;

Const 
  ALNG = 30; {Number of significant chars in identifiers.}
  eof = #26;
  tab = #009;
  LineFeed = #010;
  space = #032;
  car_return = #013;

Type 
  Alfa = string[ALNG];

  {Recognized symbol tokens.}
  tokens = (
            t_int, t_add, t_sub, t_mul, t_rdiv, t_double_mul,
            t_assign { ':=' },
            t_lbrack { '[' }, t_rbrack { ']' },
            t_lparent { '(' }, t_rparent { ')' },
            t_id, t_else, t_if, t_then
           );

Const 
  num_reserved_word = 3; { Number of reserved word. }

  { Recognized reserved word strings. }
  KeyStr: array[1..num_reserved_word] Of Alfa = (
                                                 'else', 'if', 'then'
                                                );

  { Recognized reserved word tokens. }
  KeySym: array[1..num_reserved_word] Of tokens = (
                                                   t_else, t_if, t_then
                                                  );

Var 
  Fin: string[12]; { Input file name. }
  FInput: text; { Input file pointer. }

  LookAhead: boolean; { TRUE if had been read ahead, else FALSE. }
  Enum: boolean; { TRUE if an enumeration delimeter countered. }
  Ch: char; { Read from finput. }
  token: tokens; { Current token. }
  Id: Alfa; { Current Identifier. }
  Inum: longint; { Integer number read, must be in --> integer; }
  LineNumber: integer;

Procedure initialize; { Membuka file }
Procedure scan;
Procedure terminate;

Implementation

Procedure Initialize; { Initialize variables. }
Begin
  If (ParamCount < 1)
    Then Repeat
           Write('File Sumber (.pas): ');
           ReadLn(FIn);
    Until (Length(FIn) <> 0)
  Else FIn := ParamStr(1);

  If (Pos('.', FIn) = 0)
    Then FIn := FIn + '.pas';
  {$I-}
  Assign(FInput, FIn);
  Reset(FInput);
  {$I+}

  If (IOResult <> 0) Then
    Begin
      WriteLn('Tidak bisa mengakses file: ''', FIn, '''');
      Halt;
    End;

  FIn := Copy(FIn, 1, Pos('.', FIn) - 1) + '.out';

  LookAhead := FALSE;
  Enum := FALSE;
  Ch := ' ';
  LineNumber := 1;
End;

Procedure Terminate;
Begin
  close(FInput);
End;

Procedure GetCh; { Get a character from finput. }
Begin
  Read(FInput, Ch);
End;

Procedure error_report(id: byte);
Begin
  Case id Of 
    1:
       WriteLn('Error --> unknown character ''', Ch, ''' Line:', LineNumber);
    2:
       WriteLn('Error --> comment not limited Line', LineNumber);
    3:
       WriteLn('Error --> integer overflow Line', LineNumber);
  End;
End;

Procedure Scan;
{ Scan input text, and send a token. }

Var 
  Idx: integer;
  // e: integer;
Begin
  If (Not LookAhead) Then
    GetCh;
  LookAhead := FALSE;
  Repeat
    Case Ch Of 
      tab, LineFeed, space: GetCh;
      car_return:
                  Begin
                    GetCh;
                    inc(LineNumber);
                  End;
      eof: { end of file } Exit;
      'A'..'Z', 'a'..'z': { identifier }
                          Begin
                            Id := '';
                            Repeat
                              Id := Id + Ch;
                              GetCh;
                            Until (Not (Ch In ['0'..'9', 'A'..'Z', 'a'..'z']));
                            LookAhead := TRUE;
                            Idx := 0;
                            Repeat
                              Idx := Idx + 1;
                            Until ((Idx = num_reserved_word) Or (Id = KeyStr[Idx
                                  ]));
                            If (Id = KeyStr[Idx]) Then
                              token := KeySym[idx]
                            Else
                              token := t_id;
                            Exit;
                          End;
      '0'..'9': { number }
                Begin
                  Inum := 0;
                  token := t_int;
                  Repeat
                    Inum := Inum * 10 + (ord(Ch) - ord('0'));
                    GetCh;
                  Until (Not (Ch In ['0'..'9']));
                  LookAhead := true;
                  Exit;
                End;
      '+':
           Begin
             token := t_add;
             Exit;
           End;
      '-':
           Begin
             token := t_sub;
             Exit;
           End;
      '*':
           Begin
             GetCh;
             If (Ch = '*') Then
               token := t_double_mul
             Else
               Begin
                 token := t_mul;
                 LookAhead := true;
               End;
             Exit;
           End;
      '/':
           Begin
             token := t_rdiv;
             Exit;
           End;
      ')':
           Begin
             token := t_rparent;
             Exit;
           End;
      '[':
           Begin
             token := t_lbrack;
             Exit;
           End;
      ']':
           Begin
             token := t_rbrack;
             Exit;
           End;
      ':':
           Begin
             GetCh;
             If (Ch = '=') Then
               Begin
                 token := t_assign;
               End
             Else
               Begin
                 WriteLn('Error --> unknown character '':'' Line: ', LineNumber)
                 ;
                 LookAhead := true;
               End;
             Exit;
           End;
      '(':
           Begin
             GetCh;
             If (Ch <> '*') Then
               Begin
                 token := t_lparent;
                 LookAhead := TRUE;
                 Exit;
               End
             Else
               Begin
                 GetCh;
                 If (Ch = eof) Then
                   Begin
                     error_report(2);
                     Exit;
                   End;
                 Repeat
                   While (Ch <> '*') Do
                     Begin
                       GetCh;
                       If (Ch = eof) Then
                         Begin
                           error_report(2);
                           Exit;
                         End;
                     End;
                   GetCh;
                   If (Ch = eof) Then
                     Begin
                       error_report(2);
                       Exit;
                     End;
                 Until (Ch = ')');
                 GetCh;
               End;
           End;
      Else
        Begin
          error_report(1);
          GetCh;
        End;
    End; { case }
  Until (FALSE);
End;
End.
