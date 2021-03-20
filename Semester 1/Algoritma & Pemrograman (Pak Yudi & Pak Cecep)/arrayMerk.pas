program arrayMerk;
uses crt;
var
  merk : array[1..2,1..2] of string;
begin
  clrscr();
  WriteLn('Program input merk kendaraan dengan array 2 dimensi');
  writeln();
  writeln('--------------------Tekan enter--------------------');
  readln();
  clrscr();
  
  write('Masukkan merk mobil 1 : '); readln(merk[1,1]);
  clrscr();
  
  write('Masukkan merk mobil 2 : '); readln(merk[1,2]);
  clrscr();
  
  write('Masukkan merk motor 1 : '); readln(merk[2,1]);
  clrscr();
  
  write('Masukkan merk motor 2 : '); readln(merk[2,2]);
  clrscr();
  
  WriteLn('Daftar merk kendaraan bermotor');
  writeln('------------------------------');
  writeln('|    Mobil    |     Motor    |');
  writeln('------------------------------');
  writeln('|    ',merk[1,1],'    |     ',merk[2,1],'    |');
  writeln('|    ',merk[1,2],'    |     ',merk[2,2],'    |');
  writeln('------------------------------');
  readln;
end.
