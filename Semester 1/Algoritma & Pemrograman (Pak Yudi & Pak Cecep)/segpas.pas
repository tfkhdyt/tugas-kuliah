program segpas;
uses crt;
//function
function kolom(i,n : integer):real;
  var
    j,k : integer;
    fak_n,fak_r,fak_nr : longint;
  begin
    for k:=0 to n-i do
          write(' ':2);
    for j:=0 to i do
      begin
        fak_n :=1;
        for k:=1 to i do
          fak_n := fak_n * k;
        fak_r := 1;
        for k:=1 to j do
          fak_r := fak_r * k;
        fak_nr := 1;
        for k:=1 to i-j do
          fak_nr := fak_nr * k;
        kolom := fak_n/(fak_nr*fak_r);
        write(kolom:5:0);
      end;
  end;
//procedure
procedure baris(var n : integer);
  var
    i : integer;
  begin
    for i:=0 to n do
      begin
        kolom(i,n);
      writeln;
    end;
  end;
//program utama
var
  n : integer;
begin
  clrscr;
  n:=10;
  baris(n);
  readkey;
end.