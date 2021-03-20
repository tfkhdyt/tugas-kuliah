program arrayPenjumlahan;
uses crt;
var
  angka : array[1..2] of integer;
  hasil : integer;
begin
  clrscr();
  WriteLn('Program penjumlahan dengan Array Pascal');
  WriteLn('---------------------------------------');
  Write('Masukkan angka 1 : '); readln(angka[1]);
  Write('Masukkan angka 2 : '); readln(angka[2]);
  hasil := angka[1] + angka[2];
  WriteLn('---------------------------------------');
  WriteLn(angka[1],' + ',angka[2],' = ',hasil);
  readln;
end.
