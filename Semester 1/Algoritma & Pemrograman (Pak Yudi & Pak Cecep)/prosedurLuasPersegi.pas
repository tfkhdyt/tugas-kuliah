program prosedurLuasPersegi;
uses crt;
  procedure luas(a,b:byte; var c:integer);
  begin
    c := a * b;
  end;
var
  hasil, sisi:integer;
begin
  clrscr;
  writeln('###PROGRAM MENGHITUNG LUAS PERSEGI');
  write('Masukkan sisi : '); readln(sisi);
  luas(sisi,sisi,hasil);
  writeln('Sisi : ',sisi);
  writeln('Luas persegi :',hasil,' cm²');
  readln;
end.
