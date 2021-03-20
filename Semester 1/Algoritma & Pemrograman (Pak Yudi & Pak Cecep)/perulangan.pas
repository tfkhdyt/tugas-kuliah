program perulangan;
uses crt;
var
  i,j,n : integer;
begin
  clrscr();
  write('Masukkan jumlah akhir angka : '); readln(n);
  for i:=1 to n do
    begin
      for j:=1 to i do
        begin
          write('*');
        end;
        writeln();
    end;
  readln;
end.
