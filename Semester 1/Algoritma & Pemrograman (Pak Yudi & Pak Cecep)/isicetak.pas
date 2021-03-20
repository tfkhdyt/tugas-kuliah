program isicetak;
uses crt;
//variabel
var
  i : integer;
  nilai : array[1..3] of integer;
begin
  clrscr();
  //input
  WriteLn('Mengisi elemen array');
  i := 1;
  while(i<=3)do
    begin
      write('Nilai ke ',i,' = '); readln(nilai[i]);
      i:=i+1;
    end;
  writeln('Mencetak elemen array');
  for i:=1 to 3 do
    writeln('Nilai ke ',i,' = ',nilai[i]);
  readln;
end.
