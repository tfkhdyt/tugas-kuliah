program tugas3_2;
uses crt;
var
  i : Integer;
  sinus, cosinus, x : real;
begin
  clrscr();
  
  writeln('TABEL SINUS DAN COSINUS DALAM SATUAN DERAJAT');
  writeln;
  writeln('x                sin(x)               cos(x)');
  writeln('--------------------------------------------');
  
  i := 0;
  
  while i <= 360 do
    begin
      x := i/57.2958;
      sinus := sin(x);
      cosinus := cos(x);
      writeln(i,'               ',sinus:5:2,'               ',cosinus:5:2);
      i := i + 30;
    end;
  readln;
end.
