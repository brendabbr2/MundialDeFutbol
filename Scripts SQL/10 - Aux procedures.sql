create or replace PROCEDURE verifyUserPerson(v_username IN VARCHAR2,
    v_password IN VARCHAR2, cUser OUT SYS_REFCURSOR) 
AS 
BEGIN   
        OPEN cUser FOR
        SELECT idUserType
        FROM userPerson
        WHERE username = v_username AND passwordUser = v_password; 
END verifyUserPerson;