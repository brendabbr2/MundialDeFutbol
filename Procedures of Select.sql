--This is a procedure that return a cursor of the table Gender
CREATE OR REPLACE FUNCTION getGender(v_idGender IN NUMBER) 
RETURN SYS_REFCURSOR AS GenderCursor SYS_REFCURSOR; 
BEGIN 
    OPEN GenderCursor FOR  
    SELECT idGender, genderDescription 
    FROM Gender  
    WHERE idGender = NVL(v_idGender, idGender); 
    RETURN GenderCursor; 
END getGender;
