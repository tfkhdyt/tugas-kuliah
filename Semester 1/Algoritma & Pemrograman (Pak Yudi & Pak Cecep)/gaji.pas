program gaji;
uses crt;
procedure input(var nama:string;var gol:char);
begin
  write('Masukkan nama             : '); readln(nama);
  write('Masukkan golongan (A/B/C) : '); readln(gol);
end;

function get_gapok(gol:char):real;
var
  tmp_gapok : real;
begin
  if (gol = 'A') then
    tmp_gapok := 600000
  else if (gol = 'B') then
    tmp_gapok := 800000
  else if (gol = 'C') then
    tmp_gapok := 1000000;
  get_gapok:=tmp_gapok;
end;

function get_tunja(gol:char):real;
var
  tmp_tunja : real;
begin
  if (gol = 'A') then
    tmp_tunja := 50000
  else if (gol = 'B') then
    tmp_tunja := 70000
  else if (gol = 'C') then
    tmp_tunja := 120000;
  get_tunja:=tmp_tunja;
end;

function get_trans(gol:char):real;
var
  tmp_trans : real;
begin
  if (gol = 'A') then
    tmp_trans := 100000
  else if (gol = 'B') then
    tmp_trans := 200000
  else if (gol = 'C') then
    tmp_trans := 300000;
  get_trans:=tmp_trans;
end;

function get_prosen_pajak(gol:char):real;
var
  tmp_prosen_pajak : real;
begin
  if (gol = 'A') then
    tmp_prosen_pajak := 0.02
  else if (gol = 'B') then
    tmp_prosen_pajak := 0.03
  else if (gol = 'C') then
    tmp_prosen_pajak := 0.04;
  get_prosen_pajak:=tmp_prosen_pajak;
end;

function get_gatot(gol:char):real;
var
  tmp_gatot : real;
begin
  tmp_gatot := get_gapok(gol) + get_tunja(gol) + get_trans(gol);
  get_gatot:=tmp_gatot;
end;

function get_pajak(gol:char):real;
var
  tmp_pajak : real;
begin
  tmp_pajak := get_gatot(gol)*get_prosen_pajak(gol);
  get_pajak:=tmp_pajak;
end;

function get_gaber(gol:char):real;
var
  tmp_gaber : real;
begin
  tmp_gaber:= get_gatot(gol)-get_pajak(gol);
  get_gaber:=tmp_gaber;
end;

procedure output(nama:string;gol:char);
begin
  writeln;
  writeln('===========Output=============');
  writeln;
  writeln('Nama Karyawan : ',nama);
  writeln('Golongan      : ',gol);
  writeln('Gaji Pokok    : Rp',get_gapok(gol):5:2);
  writeln('Tunjangan     : Rp',get_tunja(gol):5:2);
  writeln('Transport     : Rp',get_trans(gol):5:2);
  writeln('Pajak         : Rp',get_pajak(gol):5:2);
  writeln('Gaji Bersih   : Rp',get_gaber(gol):5:2);
end;
var
  nama : string;
  gol : char;
begin
  clrscr();
  input(nama,gol);
  output(nama,gol);
end.
