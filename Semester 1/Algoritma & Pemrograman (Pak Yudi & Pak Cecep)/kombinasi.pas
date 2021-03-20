program kombinasi;
uses crt;

procedure faktorial(var a, hasil:integer);
  var 
    count:integer;
  begin
    hasil:=1;
    for count := a downto 1 do
      hasil:=hasil*count;
  end;
var 
  n, r, hasiln, hasilr, n_r, hsl_n_r :integer;
  kombinasi :real;
begin
  clrscr();
  writeln('---PROGRAM MENGHITUNG KOMBINASI---');
  writeln;
  
  writeln('Aturan : nilai n harus lebih besar dari r!');
  writeln;
  
  write('Masukkan n : ');read(n);
  write('Masukkan r : ');read(r);
  
  faktorial(n,hasiln);
  faktorial(r,hasilr);
  
  n_r:=n - r;
  faktorial(n_r,hsl_n_r);
  kombinasi:= (hasiln / (hasilr*hsl_n_r));
  
  writeln('n! = ',hasiln);
  writeln('r! = ',hasilr);
  writeln('(n-r)! = ',hsl_n_r);
  write('Kombinasi ',r,' dari ',n,' objek adalah = ');writeln(kombinasi:5:0);
  readln;
end.
