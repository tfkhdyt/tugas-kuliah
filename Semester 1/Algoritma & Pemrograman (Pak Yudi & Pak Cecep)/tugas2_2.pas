program tugas2_2;
uses crt;
var
  nama, status : String;
  gol : char;
  gajiPokok, tunjangan, potIuran, gajiBersih, prosentase : real;
begin
  clrscr;
  //input
  write('Nama Karyawan        : '); readln(nama);
  write('Golongan (A/B)       : '); readln(gol);
  write('Status (Nikah/Belum) : '); readln(status);
 
  //proses
  if (gol = 'A') and (status = 'Nikah') then
    begin
      gajiPokok := 200000;
      tunjangan := 50000;
    end
  else if (gol = 'A') and (status = 'Belum') then
    begin
      gajiPokok := 200000;
      tunjangan := 25000;
    end
  else if (gol = 'B') and (status = 'Nikah') then
    begin
      gajiPokok := 350000;
      tunjangan := 75000;
    end
  else if (gol = 'B') and (status = 'Belum') then
    begin
      gajiPokok := 350000;
      tunjangan := 60000;
    end;
 
  if gajiPokok <= 300000 then
    prosentase := 5/100
  else if gajiPokok > 300000 then
    prosentase := 10/100;
 
  potIuran := (gajiPokok + tunjangan) * prosentase;
  gajiBersih := gajiPokok + tunjangan - potIuran;
 
  //output
  writeln;
  writeln('Gaji Pokok     : Rp. ', gajiPokok:10:2);
  writeln('Tunjangan      : Rp. ', tunjangan:10:2);
  writeln('Potongan Iuran : Rp. ', potIuran:10:2);
  writeln('Gaji Bersih    : Rp. ', gajiBersih:10:2);
  readln;
end.
