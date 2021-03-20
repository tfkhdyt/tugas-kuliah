program tugas2_2_FuncProc;
uses crt;

function gajiPokok(gol:char):real;
  begin
    if (gol = 'A') then
      gajiPokok := 200000
    else if (gol = 'B') then
      gajiPokok := 350000;
  end;

function tunjangan(gol:char;status:string):real;
  begin
    if (gol = 'A') and (status = 'Nikah') then
      tunjangan := 50000
    else if (gol = 'A') and (status = 'Belum') then
      tunjangan := 25000
    else if (gol = 'B') and (status = 'Nikah') then
      tunjangan := 75000
    else if (gol = 'B') and (status = 'Belum') then
      tunjangan := 60000;
  end;

function prosentase(gapok2:real):real;
  begin
    if gapok2 <= 300000 then
      prosentase := 5/100
    else if gapok2 > 300000 then
      prosentase := 10/100;
  end;

function potIuran(gapok2:real;tunja:real;prosen:real):real;
  begin
    potIuran := (gapok2 + tunja) * prosen;
  end;
  
function gajiBersih(gapok2:real;tunja:real;potong:real):real;
  begin
    gajiBersih := gapok2 + tunja - potong;
  end;

procedure input(var nama : string;var gol : char;var status : string);
  begin
    write('Nama Karyawan        : '); readln(nama);
    write('Golongan (A/B)       : '); readln(gol);
    write('Status (Nikah/Belum) : '); readln(status);
  end;
    
procedure cetak(gol:char;status:string);
  var
    gajiBersih, potIuran, prosentase, gajiPokok, tunjangan: Real;
  begin
    gajiPokok := gajipokok(gol);
    tunjangan := tunjangan(gol,status);
    prosentase := prosentase(gajipokok);
    potIuran := potIuran(gajipokok, tunjangan, prosentase);
  
    writeln;
    writeln('Gaji Pokok     : Rp. ', gajipokok:10:2);
    writeln('Tunjangan      : Rp. ', tunjangan:10:2);
    writeln('Potongan Iuran : Rp. ', potIuran:10:2);
    writeln('Gaji Bersih    : Rp. ', gajibersih(gajipokok, tunjangan, potIuran):10:2);
  end;
var
  nama, status : String;
  gol : char;
begin
  clrscr;
  input(nama,gol,status);
  cetak(gol,status);
  readln;
end.
