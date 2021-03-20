program tugas1_3;
uses crt;
var
 sisi, persegi, panjang, lebar, ppanjang, alas, tinggi, segitiga, jari, lingkaran: real;
begin
 clrscr;
 WriteLn('Program menghitung luas persegi');
 WriteLn('-------------------------------');
 Write('Masukkan sisi persegi (cm) : '); readln(sisi);
 persegi := sisi * sisi;
 WriteLn('-------------------------------');
 WriteLn('Luas persegi adalah : ',persegi:5:1,' cm²');
 WriteLn('');
 
WriteLn('Program menghitung luas persegi panjang');
 WriteLn('-------------------------------');
 Write('Masukkan panjang persegi panjang (cm) : '); readln(panjang);
 Write('Masukkan lebar persegi panjang (cm) : '); readln(lebar);
 ppanjang := panjang * lebar;
 WriteLn('-------------------------------');
 WriteLn('Luas persegi panjang adalah : ',ppanjang:5:1,' cm²');
 WriteLn('');
 
 WriteLn('Program menghitung luas segitiga');
 WriteLn('-------------------------------');
 Write('Masukkan alas segitiga (cm) : '); readln(alas);
 Write('Masukkan tinggi segitiga (cm) : '); readln(tinggi);
 segitiga := alas * tinggi / 2;
 WriteLn('-------------------------------');
 WriteLn('Luas segitiga adalah : ', segitiga:5:1,' cm²');
 WriteLn('');
 
 WriteLn('Program menghitung luas lingkaran');
 WriteLn('-------------------------------');
 Write('Masukkan jari-jari lingkaran (cm) : '); readln(jari);
 lingkaran := jari * jari * 3.14;
 WriteLn('-------------------------------');
 WriteLn('Luas lingkaran adalah : ', lingkaran:5:1,' cm²');
 WriteLn('');
 
 readln;
end.
