program coba;
uses crt;
var
  nama, status : string;
  gol : char;
  gajiPokok, tunjangan, potIuran, gajiBersih, prosentase : real;
begin
  write('Masukkan nama                : '); readln(nama);
  write('Masukkan golongan (A/B)      : '); readln(gol);
  write('Masukkan Status (Nikah/Belum : '); readln(status);
    
  if(gol = 'A') and (status = 'Nikah') then
    begin
      gajiPokok := 200000;
      tunjangan := 50000;
    end
  else if(gol = 'A') and (status = 'Belum') then
    begin
      gajiPokok := 200000;
      tunjangan := 25000;
    end
  else if(gol = 'B') and (status = 'Nikah') then
    begin
      gajiPokok := 350000;
      tunjangan := 75000;
    end
  else if(gol = 'B') and (status = 'Belum') then
    begin
      gajiPokok := 200000;
      tunjangan := 50000;
    end;
  
  if gajiPokok <= 300000 then
    prosentase := 0.05
  else
    prosentase := 0.10;
    
  potIuran := (gajiPokok + tunjangan) * prosentase;
  gajiBersih := gajiPokok + tunjangan - potIuran;
  
  WriteLn('Nama           : ', nama);
  writeln('Gaji Pokok     : ', gajiPokok:5:2);
  writeln('Tunjangan      : ', tunjangan:5:2);
  writeln('Potongan Iuran : ', potIuran:5:2);
  writeln('Gaji bersih    : ', gajiBersih:5:2);
  readln;
end.
