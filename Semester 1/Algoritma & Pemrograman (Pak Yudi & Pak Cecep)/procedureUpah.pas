program procedureUpah;
uses crt;
procedure input(var Nama:String;var gol:char;var jmlanak:integer);
  begin
    write('Masukkan nama anda      : '); readln(nama);
    write('Masukkan golongan (A-D) : '); readln(gol);
    write('Masukkan jumlah anak    : '); readln(jmlanak);
  end;
function Upahkotor(gol:char):real;
  begin
    Case gol of
      'A' : Upahkotor:=1000000;
      'B' : Upahkotor:=800000;
      'C' : Upahkotor:=600000;
      'D' : Upahkotor:=400000;
    end;
  end;
function Persentunjangan(jmlanak:integer):real;
  begin
    if(JmlAnak>2)then 
      persentunjangan := 0.3 
    else
      PersenTunjangan := 0.2;
  end;
var
  Nama : string;
  Gol : char;
  JmlAnak : integer;
  upahbersih : real;
begin
  clrscr();
  input(Nama,Gol,jmlanak);
  writeln('--------------------------');
  Upahbersih:= upahkotor(Gol) - (upahkotor(Gol)*persentunjangan(jmlanak));
  writeln('Upah    : Rp ',upahbersih:5:2);
  writeln('--------------------------');
  readln;
end.
