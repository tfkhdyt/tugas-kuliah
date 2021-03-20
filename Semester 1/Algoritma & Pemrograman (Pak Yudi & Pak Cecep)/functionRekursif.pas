program functionRekursif;
uses crt;
function fakt(n:longint):longint;
  begin
    if (n=0) then
      fakt:=1
    else
      begin
        n:=n*fakt(n-1);
        fakt:=n;
      end; 
  end;
var
  n:longint;
begin
  clrscr();
  write('Masukkan n : ');readln(n);
  writeln(n,'! = ',fakt(n));
end.
