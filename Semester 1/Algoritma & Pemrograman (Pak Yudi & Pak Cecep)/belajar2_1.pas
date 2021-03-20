program belajar2_1;
uses crt;
var
  jumlahAnak : integer;
  gajiKotor, tunjangan, persenTunjangan : real;
begin
  clrscr();
  persenTunjangan := 0.2;
  Write('Gaji kotor? '); readln(gajiKotor);
  Write('Jumlah anak? '); readln(jumlahAnak);
  if jumlahAnak>2 then
    persenTunjangan := 0.3;
  tunjangan := persenTunjangan * gajiKotor;
  WriteLn('Besar tunjangan = Rp',tunjangan:10:2);
  readkey;
end.
