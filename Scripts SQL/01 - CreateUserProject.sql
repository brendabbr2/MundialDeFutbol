CREATE TABLESPACE proj_data
   DATAFILE 'C:\app\brenda\oradata\DATABASE\projdata01.dbf'
   SIZE 10M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;
   
CREATE TABLESPACE proj_Ind
   DATAFILE 'C:\app\brenda\oradata\DATABASE\projind01.dbf'
   SIZE 10M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;
   
   
CREATE USER proj 
    IDENTIFIED BY proj 
    DEFAULT TABLESPACE proj_data 
    QUOTA 10M ON proj_data 
    TEMPORARY TABLESPACE temp
    QUOTA 5M ON system ;
    --PROFILE app_user 
    --PASSWORD EXPIRE;


GRANT connect TO proj;
--------------------------------------------------
GRANT create session to proj;
--------------------------------------------------
GRANT create table to proj;
--------------------------------------------------
grant create view to proj;

grant CREATE ANY INDEX to proj;
grant DROP PUBLIC SYNONYM to proj;
GRANT UNLIMITED TABLESPACE TO proj;
grant CREATE ANY PROCEDURE TO proj;
GRANT CREATE ANY SEQUENCE to proj;
GRANT CREATE TRIGGER TO proj;

commit;
