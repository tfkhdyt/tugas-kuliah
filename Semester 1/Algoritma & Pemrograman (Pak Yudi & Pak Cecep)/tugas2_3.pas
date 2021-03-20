program tugas2_3;
uses crt;
//deklarasi variabel
var 
  nama : String;
  nilai,quiz,absen,uts,uas,tugas:real;
  hurufMutu:char;
begin
  clrscr;
//input
  WriteLn('Program menghitung nilai');
  writeln('------------------------');
  write('Masukkan nama        : '); readln(nama);
  write('Masukkan nilai absen : '); readln(absen);
  write('Masukkan nilai tugas : '); readln(tugas);
  write('Masukkan nilai quiz  : '); readln(quiz);
  write('Masukkan nilai UTS   : '); readln(uts);
  write('Masukkan nilai UAS   : '); readln(uas);
  writeln('------------------------');
  writeln();
  
//proses
  nilai:= ((0.1*absen)+(0.2*tugas)+(0.2*quiz)+(0.25*uts)+(0.25*uas));
  if (nilai>85) and (nilai<=100) then 
    hurufMutu:='A'
  else if (nilai>70) and (nilai<=85) then 
    hurufMutu:='B'
  else if (nilai>55) and (nilai<=70) then 
    hurufMutu:='C'
  else if (nilai>40) and (nilai<=55) then 
    hurufMutu:='D'
  else if (nilai>=0) and (nilai<=40) then 
    hurufMutu:='E';
  
//output
  WriteLn('Laporan nilai');
  writeln('------------------------');
  writeln('Nama       = ',nama);
  writeln('Absen      = ',absen:5:2);
  writeln('Tugas      = ',tugas:5:2);
  writeln('Quiz       = ',quiz:5:2);
  writeln('UTS        = ',uts:5:2);
  writeln('UAS        = ',uas:5:2);
  writeln('Huruf Mutu = ',hurufMutu);
  writeln('------------------------');
end.
