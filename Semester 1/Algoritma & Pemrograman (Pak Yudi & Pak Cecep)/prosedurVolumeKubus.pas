program prosedurVolumeKubus;
uses crt;
  procedure volume(a,b,c:byte; var d:integer);
  begin
    d := a * b * c;
  end;
var
  hasil,sisi:integer;
begin
  clrscr();
  writeln('###PROGRAM MENGHITUNG VOLUME KUBUS###');
  write('Masukkan sisi : '); readln(sisi);
  writeln('Sisi : ', sisi);
  volume(sisi,sisi,sisi,hasil);
  writeln('Volume dari kubus adalah : ',hasil,' cm³');
  readln;
end.
