program functionLuasPPanjang;
uses crt;
function luas(a,b:byte):integer;
  begin
    luas := a * b;
  end;
var
  hasil:integer;
  panjang, lebar:byte;
begin
  clrscr();
  WriteLn('###PROGRAM MENGHITUNG LUAS PERSEGI PANJANG###');
  write('Masukkan panjang : '); readln(panjang);
  write('Masukkan lebar   : '); readln(lebar);
  writeln();
  hasil := luas(panjang,lebar);
  writeln('Panjang              : ', panjang, ' cm');
  writeln('Lebar                : ', lebar, ' cm');
  writeln('Luas persegi panjang : ', hasil, ' cm²');
  readln;
end.
