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

-----------------------------------------------------
--By: Joxan Andrey Fuertes Villegas
--Date: 28/Dic/2022 9:00 p.m

--return a cursor of Continent
CREATE OR REPLACE FUNCTION getContinent(v_idContinent IN NUMBER) 
RETURN SYS_REFCURSOR AS ContinentCursor SYS_REFCURSOR; 
BEGIN 
    OPEN ContinentCursor FOR  
        SELECT idContinent, nameContinent
        FROM Continent  
        WHERE idContinent = NVL(v_idContinent, idContinent); 
    RETURN ContinentCursor; 
END getContinent;

--return a cursor of Country
CREATE OR REPLACE FUNCTION getCountry(v_idCountry IN NUMBER) 
RETURN SYS_REFCURSOR AS CountryCursor SYS_REFCURSOR; 
BEGIN 
    OPEN CountryCursor FOR  
        SELECT idCountry, nameCountry, demonym
        FROM Country  
        WHERE idCountry = NVL(v_idCountry, idCountry); 
    RETURN CountryCursor; 
END getCountry;

--return a cursor of Province
CREATE OR REPLACE FUNCTION getProvince(v_idProvince IN NUMBER) 
RETURN SYS_REFCURSOR AS ProvinceCursor SYS_REFCURSOR; 
BEGIN 
    OPEN ProvinceCursor FOR  
        SELECT idProvince, nameProvince
        FROM Province 
        WHERE idProvince = NVL(v_idProvince, idProvince); 
    RETURN ProvinceCursor; 
END getProvince;

--- code for making tests ------
DECLARE 
    pContinents SYS_REFCURSOR := getProvince(NULL);
    idContinent NUMBER(6);
    nameContinent VARCHAR2(50);

BEGIN
    LOOP 
        FETCH pContinents
        INTO idContinent,    
        nameContinent;
        EXIT WHEN pContinents%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(idContinent || '|' || nameContinent);
    END LOOP;
    CLOSE pContinents;
END;
--------------------------------------------------------