Procedure Scan;

Var 
  Idx: integer;
  e: integer;

Begin
  If (Not LookAhead) Then
    GetCh;
  LookAhead := false;
  Repeat
    Case Ch Of 
      tab, LineFeed, space:
        Begin
          GetCh;
        End;
      car_return:
        Begin
          GetCh;
          inc(LineNumber);
        End;
      eof: { end of file }
        exit;
      'A'..'Z', 'a'..'z': { identifier }
        Begin
          id := '';
          Repeat
            id := id + Ch;
            GetCh;
          Until (Not (Ch In ['0'..'9', 'A'..'Z', 'a'..'z']));
          LookAhead := true;
          Idx := 0;
          Repeat
            Idx := Idx + 1;
          Until ((Idx = num_reserved_word) Or (Id = KeyStr[Idx
                ]));
          If (Id = KeyStr[Idx]) Then
            Begin
              token := KeySym[Idx]
            End;
          Else
            Begin
              token := t_id;
            End;
          exit;
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
          exit;
        End;
      Else
        Begin
          error_report(1);
          GetCh;
        End;
    End; { case }
  Until (false);
End;
