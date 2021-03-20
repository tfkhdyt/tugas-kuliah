program uts;
uses crt;
var
  i,j,n : integer;
begin
  clrscr;
  write  ('Masukkan jumlah akhir bintang : ');readln(n);
  for i:= 1 to n do
    begin
      for j:=1 to i do
        begin
          if(j=1) or (j=i) then
            write('* ')
          else if i = n then
            write('* ')
          else
            write(j,' ');
        end;
      writeln;
    end;
  readln;
end.
