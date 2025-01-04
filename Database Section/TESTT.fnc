CREATE OR REPLACE function testt (pp in int,z in out int) 
return int
is  x int;
BEGIN
x:=pp;
z:=pp;
dbms_output.put_line (z);
return x;
END;
declare 
zzz int:=0;
xx int;
begin
zzz := testt (10,xx);
dbms_output.put_line (zzz);
dbms_output.put_line (xx);
end;