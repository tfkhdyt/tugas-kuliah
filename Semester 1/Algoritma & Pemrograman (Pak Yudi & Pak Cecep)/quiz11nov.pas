program quiz11nov;
uses crt;
var
  baris, kolom, i, j, x: integer;
begin
  clrscr();
  write('Masukkan Jumlah Baris : '); readln(baris);
  write('Masukkan Jumlah Kolom : '); readln(kolom);
  writeln;
  
  x := 1;
  for i := 1 to baris do
    begin
      for j := 1 to kolom do
        begin
          write('  ',x,'   ');
          x := x + 1;
        end;
        writeln;
    end;
    
  readln;
end.
