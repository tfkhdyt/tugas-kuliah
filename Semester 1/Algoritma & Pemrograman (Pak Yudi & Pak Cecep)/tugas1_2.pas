program tugas1_2;
uses crt;
var
 i, j : integer;
begin
 clrscr;
 write('Masukkan nilai i : '); readln(i);
 Write('Masukkan nilai j : '); readln(j);
 writeln('----------------------------');
 writeln('| operasi | hasil operasi |');
 writeln('----------------------------');
 writeln('|  ',i,' + ',j,'  |       ',i + j,'      |');
 writeln('|  ',i,' - ',j,'  |       ',i - j,'      |');
 writeln('|  ',i,' * ',j,'  |       ',i * j,'      |');
 writeln('| ',i,' div ',j,' |        ',i div j,'      |');
 writeln('| ',i,' mod ',j,' |        ',i mod j,'      |');
 writeln('----------------------------');
 readln;
end.
