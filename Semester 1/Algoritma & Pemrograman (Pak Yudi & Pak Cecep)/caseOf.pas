program caseOf;
uses crt;
var
  angka : integer;
begin
  clrscr();
  Write('Masukkan angka : '); ReadLn(angka);
  
  case angka of
    1 : WriteLn('Bulan dengan angka ', angka,' : Januari');
    2 : WriteLn('Bulan dengan angka ', angka,' : Februari');
    3 : WriteLn('Bulan dengan angka ', angka,' : Maret');
    4 : WriteLn('Bulan dengan angka ', angka,' : April');
    5 : WriteLn('Bulan dengan angka ', angka,' : Mei');
    6 : WriteLn('Bulan dengan angka ', angka,' : Juni');
    7 : WriteLn('Bulan dengan angka ', angka,' : Juli');
    8 : WriteLn('Bulan dengan angka ', angka,' : Agustus');
    9 : WriteLn('Bulan dengan angka ', angka,' : September');
    10 : WriteLn('Bulan dengan angka ', angka,' : Oktober');
    11 : WriteLn('Bulan dengan angka ', angka,' : November');
    12 : WriteLn('Bulan dengan angka ', angka,' : Desember');
  else
    writeln('Angka tidak valid');
  end;
  readln;
end.
