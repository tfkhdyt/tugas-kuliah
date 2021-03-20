program quiz2;
uses crt;
var
  i,j,k, brs, klm : integer;
begin
  clrscr;
  write ('Masukan Jumlah Baris = '); readln (brs); 
  write ('Masukan Jumlah Kolom = '); readln (klm);
  writeln;

  k:=1;
  for i:=1 to brs do
    begin
      write(k:5);
      k:=k+1;
    end;  
end.
