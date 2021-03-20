program tabel2;
uses crt;
var
 x,i,pangkat,hasilpangkat:integer;
begin 
 writeln(' x 1/x x^2 x^3');
 writeln('-----------------------------------');
 x:=1;
 while (x<=10) do
 begin
 write(x:5,(1.0/x):8:5);
 pangkat:=2;
 while(pangkat<=3) do
 begin
 hasilpangkat:=1;
 for i:=1 to pangkat do 
 hasilpangkat:=hasilpangkat*x;
 write(hasilpangkat:8); 
 pangkat:=pangkat+1;
 end;
 writeln; 
 x:=x+1;
 end;
end.
