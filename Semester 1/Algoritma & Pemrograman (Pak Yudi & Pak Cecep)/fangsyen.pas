program fangsyen;
uses crt;
var
  hargaAwal, diskon : integer;
  hargaAkhir, hasil : real;
function discount(a,b : integer):real;
  begin
    hargaAkhir := a * (b/100);
    discount := a - hargaAkhir;
  end;
begin
  clrscr();
  writeln('Program menghitung harga diskon');
  write('Masukkan harga awal : Rp'); readln(hargaAwal);
  write('Masukkan diskon     : '); readln(diskon);
  hasil := discount(hargaAwal,diskon);
  writeln('=========================');
  writeln('Harga awal  : Rp',hargaAwal);
  writeln('Diskon      : ',diskon,'%');
  writeln('Harga akhir : Rp',hasil);
  readln;
end.
