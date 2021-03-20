program procedureTabel;
uses crt;
function fpangkat(dipangkatkan:real;pangkat:integer):real;
  var 
    i : integer;
    hasilpangkat : real;
  begin
      while (pangkat <= 3) do
        begin
          hasilpangkat := 1;
          for i := 1 to pangkat do
            hasilpangkat := hasilpangkat * dipangkatkan;
          write(hasilpangkat: 8);
          pangkat := pangkat + 1;
        end;
  end;
procedure cetak(x:integer);
  var
    i, y, pangkat, hasilpangkat: integer;
  begin
    writeln('-----------------------------------');
    writeln('    x   1/x       x^2     x^3');
    writeln('-----------------------------------');
    y := 1;
    while (y <= x) do
      begin
        write(y: 5, (1.0 / y): 8: 5);
        pangkat := 2;
        fpangkat(y,pangkat);
        writeln;
        y := y + 1;
      end;
    writeln('-----------------------------------');
  end;
var
  x: integer;
begin
  clrscr();
  write('Masukkan banyaknya data : ');readln(x);
  cetak(x);
end.
