program caseRange;
uses crt;
var
  nilai : integer;
begin
  clrscr();
  Write('Masukkan nilai : '); readln(nilai);
  case nilai of
    85..100 : WriteLn('Huruf mutu: A');
    70..84 : WriteLn('Huruf mutu: B');
    55..69 : WriteLn('Huruf mutu: C');
    40..34 : WriteLn('Huruf mutu: D');
    0..39 : WriteLn('Huruf mutu: A');
  else
    WriteLn('Nilai tidak valid');
  end;
  readln;
end.
