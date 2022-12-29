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


--This is a procedure that return a cursor of the table Worker
CREATE OR REPLACE FUNCTION getWorker(v_idWorker IN NUMBER) 
RETURN SYS_REFCURSOR AS WorkerCursor SYS_REFCURSOR; 
BEGIN 
    OPEN WorkerCursor FOR  
    SELECT idWorker, idWorkerType, hireDate 
    FROM Worker  
    WHERE idWorker = NVL(v_idWorker, idWorker); 
    RETURN WorkerCursor; 
END getWorker;

--This is a procedure that return a cursor of the table WorkerType
CREATE OR REPLACE FUNCTION getWorkerType(v_idWorkerType IN NUMBER) 
RETURN SYS_REFCURSOR AS WorkerTypeCursor SYS_REFCURSOR; 
BEGIN 
    OPEN WorkerTypeCursor FOR  
    SELECT idWorkerType, nameWorkerType 
    FROM WorkerType  
    WHERE idWorkerType = NVL(v_idWorkerType, idWorkerType); 
    RETURN WorkerTypeCursor; 
END getWorkerType;

--This is a procedure that return a cursor of the table PlayerPosition
CREATE OR REPLACE FUNCTION getPlayerPosition(v_idPlayerPosition IN NUMBER) 
RETURN SYS_REFCURSOR AS PlayerPositionCursor SYS_REFCURSOR; 
BEGIN 
    OPEN PlayerPositionCursor FOR  
    SELECT idPosition, positionName 
    FROM PlayerPosition  
    WHERE idPosition = NVL(v_idPlayerPosition, idPosition); 
    RETURN PlayerPositionCursor; 
END getPlayerPosition;

--This is a procedure that return a cursor of the table PlayerXSportMatch
CREATE OR REPLACE FUNCTION getPlayerXSportMatch(v_idPlayer IN NUMBER, 
    v_idSportMatch IN NUMBER) 
RETURN SYS_REFCURSOR AS PlayerXSportMatchCursor SYS_REFCURSOR; 
BEGIN 
    OPEN PlayerXSportMatchCursor FOR  
    SELECT idPlayer, idSportMatch, yellow_card, red_card, savers, offside, expulsion, goals, corners 
    FROM PlayerXSportMatch  
    WHERE idPlayer = NVL(v_idPlayer, idPlayer)
    AND idSportMatch = NVL(v_idSportMatch, idSportMatch); 
    RETURN PlayerXSportMatchCursor; 
END getPlayerXSportMatch;
