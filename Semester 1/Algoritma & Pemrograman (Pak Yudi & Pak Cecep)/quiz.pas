program quiz;
uses crt;
var
  i,j,k : integer;
begin
  clrscr;
  Write('Perkalian dengan : '); readln(i);
  Write('Jumlah perkalian : '); readln(j);
  writeln('--------------------');
  WriteLn(' 1 x ',i,' = ',1*i);
  WriteLn(' 2 x ',i,' = ',2*i);
  WriteLn(' 3 x ',i,' = ',3*i);
  WriteLn(' 4 x ',i,' = ',4*i);
  WriteLn(' 5 x ',i,' = ',5*i);
  WriteLn(' 6 x ',i,' = ',6*i);
  WriteLn(' 7 x ',i,' = ',7*i);
  WriteLn(' 8 x ',i,' = ',8*i);
  WriteLn(' 9 x ',i,' = ',9*i);
  WriteLn('10 x ',i,' = ',10*i);
  /*for k := 1 to j do
    begin
      WriteLn('  ',k,'  x  ',i,'  =  ',k*i);
      writeln('--------------------');
    end;*/
    
  /*k := 1;
  while k <= j do
    begin
      WriteLn('  ',k,'  x  ',i,'  =  ',k*i);
      writeln('--------------------');
      k := k + 1;
    end;*/
      
  /*k := 0;
  repeat
    begin
      k := k + 1;
      WriteLn('  ',k,'  x  ',i,'  =  ',k*i);
      writeln('--------------------');
    end;
  until k = j;*/
  readln;
end.
