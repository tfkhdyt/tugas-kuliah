program functionPangkat;
uses crt;
function fpangkat(dipangkatkan:real;pangkat:integer):real;
  var 
    i : integer;
    hasilpangkat : real;
  begin
    hasilpangkat := 1;
    for i:=1 to pangkat do 
      hasilpangkat:=hasilpangkat*dipangkatkan;
    fpangkat := hasilpangkat
  end;
var
  dipangkatkan : real;
  pangkat : integer;
begin
  clrscr();
  write('Bilangan yang akan dipangkatkan : '); readln(dipangkatkan);
  write('Masukkan pangkatnya : '); readln(pangkat); 
  write(dipangkatkan,' ^ ',pangkat,' : ',fpangkat(dipangkatkan,pangkat));
  readkey;
end.
