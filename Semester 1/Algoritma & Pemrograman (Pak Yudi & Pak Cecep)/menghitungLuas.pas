program menghitungLuas;
uses crt;
var
  menu : integer;
  opsi : char;
  sisi, hasil, panjang, lebar, alas, tinggi, jari : real;
begin
  clrscr();
  writeln('=======================');
  WriteLn();
  Writeln('Program menghitung luas');
  WriteLn();
  writeln('======Press Enter======');
  readln;
  clrscr();   
  repeat
    begin
      WriteLn('Menu :');
      WriteLn('1. Luas Persegi');
      WriteLn('2. Luas Persegi Panjang');
      WriteLn('3. Luas Segitiga');
      WriteLn('4. Luas Lingkaran');
      write('Pilih : '); readln(menu);
      clrscr();
      
      case menu of
        1 : 
          begin
            write('Masukkan sisi (cm) : '); readln(sisi);
            hasil := sisi*sisi;
            writeln('===============================');
            writeln('Luas persegi adalah = ', hasil:5:2, ' cm²');
          end;
        2 : 
          begin
            write('Masukkan panjang (cm) : '); readln(panjang);
            write('Masukkan lebar (cm) : '); readln(lebar);
            hasil := panjang*lebar;
            writeln('===============================');
            writeln('Luas persegi panjang adalah = ', hasil:5:2, ' cm²');
          end;
        3 : 
          begin
            write('Masukkan alas (cm) : '); readln(alas);
            write('Masukkan tinggi (cm) : '); readln(tinggi);
            hasil := alas*tinggi/2;
            writeln('===============================');
            writeln('Luas segitiga adalah = ', hasil:5:2, ' cm²');
          end; 
        4 : 
          begin
            write('Masukkan jari-jari (cm) : '); readln(jari);
            hasil := 3.14*jari*jari;
            writeln('===============================');
            writeln('Luas lingkaran adalah = ', hasil:5:2, ' cm²');
          end; 
      end;
    end;
    writeln();
    Write('Kembali ke menu? (y/n) : '); readln(opsi);
    clrscr();
  until opsi = 'n';
  write('Program selesai!');
  readln;
end.
