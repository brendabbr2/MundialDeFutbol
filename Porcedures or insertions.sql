--This is an insertion for the table gender
CREATE OR REPLACE PROCEDURE insertGender 
    (vDescription IN VARCHAR2)
    AS BEGIN 
    INSERT INTO Gender(idGender, descriptionGender)  
    VALUES(s_Person.NEXTVAL, vDescription);
    --COMMIT; 
END insertGender;

--This is an insertion for the table worker
CREATE OR REPLACE PROCEDURE insertWorker 
    (V_idWorkerType IN NUMBER, V_hireDate IN DATE)
    AS BEGIN 
    INSERT INTO Worker(idWorker, idWorkerType, hiredate)  
    VALUES(s_Person.NEXTVAL, v_idworkertype, v_hiredate);
    --COMMIT; 
END insertWorker;

--This is an insertion for the table WorkerType
CREATE OR REPLACE PROCEDURE insertWorkerType 
    (V_nameWorkerType IN VARCHAR2)
    AS BEGIN 
    INSERT INTO WorkerType(idWorkerType, nameWorkerType)  
    VALUES(s_WorkerType.NEXTVAL, v_nameworkertype);
    --COMMIT; 
END insertWorkerType;

--This is an insertion for the table PlayerPosition
CREATE OR REPLACE PROCEDURE insertPlayerPosition
    (V_descritionPos IN VARCHAR2)
    AS BEGIN 
    INSERT INTO PlayerPosition(idPosition, descriptionPos)  
    VALUES(s_PlayerPosition.NEXTVAL, v_descritionpos);
    --COMMIT; 
END insertPlayerPosition;

--This is an insertion for the table PlayerXSportMatch
CREATE OR REPLACE PROCEDURE insertPlayerXSportMatch 
    (V_idPlayer IN NUMBER, V_idSportMatch IN NUMBER, V_yellow_card IN INTEGER, V_red_card IN INTEGER, 
        V_savers IN INTEGER, V_offside IN INTEGER, V_expulsion IN INTEGER, V_goals IN INTEGER, V_corners IN INTEGER)
    AS BEGIN 
    INSERT INTO PlayerXSportmatch(idPlayer, idSportMatch, yellow_card, red_card,
        savers, offside, expulsion, goals, corners)  
    VALUES(V_idPlayer, V_idSportMatch, V_yellow_card, V_red_card, 
        V_savers, V_offside, V_expulsion, V_goals, V_corners);
    --COMMIT; 
END insertPlayerXSportMatch;

--This is an insertion for the table insertPlayerXCountry
CREATE OR REPLACE PROCEDURE insertPlayerXCountry
    (V_idPlayer IN NUMBER, V_idCountry IN NUMBER)
    AS BEGIN 
    INSERT INTO PlayerXCountry(idPlayer, idCountry)  
    VALUES(V_idPlayer, V_idCountry);
    --COMMIT; 
END insertPlayerXCountry;

--This is an insertion for the table WorkerXSportMatch
CREATE OR REPLACE PROCEDURE insertWorkerXSportMatch
    (V_idWorker IN NUMBER, V_idSportMatch IN NUMBER)
    AS BEGIN 
    INSERT INTO WorkerXSportMatch(idWorker, idSportMatch)  
    VALUES(V_idWorker, V_idSportMatch);
    --COMMIT; 
END insertWorkerXSportMatch;