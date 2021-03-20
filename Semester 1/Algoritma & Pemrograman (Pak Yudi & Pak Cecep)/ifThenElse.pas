program ifThenElse;
uses crt;
var
  nama : string;
  gol : char;
  gaji, tjabat, total : integer;
begin
  clrscr();
  Write('Masukkan nama        : '); readln(nama);
  write('Pilih golongan (A/B) : '); readln(gol);
  WriteLn('=========================');
  
  if(gol = 'A') or (gol = 'a') then
    begin
      gaji := 1000000;
      tjabat := 500000;
    end
  else if (gol = 'B') or (gol = 'b') then
    begin
      gaji := 1500000;
      tjabat := 750000;
    end;
    
  total := gaji + tjabat;
  
  writeln('Gaji              : Rp ', gaji);
  writeln('Tunjangan jabatan : Rp ', tjabat);
  writeln('Total Gaji        : Rp ', total);
  readln;
end.
/*
  Taufik Hidayat
  301200032
*/
