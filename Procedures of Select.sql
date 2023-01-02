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

--return a cursor of District
CREATE OR REPLACE FUNCTION getDistrict(v_idDistrict IN NUMBER) 
RETURN SYS_REFCURSOR AS DistrictCursor SYS_REFCURSOR; 
BEGIN 
    OPEN DistrictCursor FOR  
        SELECT idDistrict, nameDistrict
        FROM District 
        WHERE idDistrict = NVL(v_idDistrict, idDistrict); 
    RETURN DistrictCursor; 
END getDistrict;

--return a cursor of Address
CREATE OR REPLACE FUNCTION getAddress(v_idAddress IN NUMBER) 
RETURN SYS_REFCURSOR AS AddressCursor SYS_REFCURSOR; 
BEGIN 
    OPEN AddressCursor FOR  
        SELECT idAddress, nameAddress
        FROM Address 
        WHERE idAddress = NVL(v_idAddress, idAddress); 
    RETURN AddressCursor; 
END getAddress;

--return a cursor of Stadium
CREATE OR REPLACE FUNCTION getStadium(v_idStadium IN NUMBER) 
RETURN SYS_REFCURSOR AS StadiumCursor SYS_REFCURSOR; 
BEGIN 
    OPEN StadiumCursor FOR  
        SELECT idStadium, nameStadium
        FROM Stadium 
        WHERE idStadium = NVL(v_idStadium, idStadium); 
    RETURN StadiumCursor; 
END getStadium;

--return a cursor of SportMatch
CREATE OR REPLACE FUNCTION getSportMatch(v_idSportMatch IN NUMBER) 
RETURN SYS_REFCURSOR AS SportMatchCursor SYS_REFCURSOR; 
BEGIN 
    OPEN SportMatchCursor FOR  
        SELECT idSportMatch
        FROM SportMatch
        WHERE idSportMatch = NVL(v_idSportMatch, idSportMatch); 
    RETURN SportMatchCursor; 
END getSportMatch;

--return a cursor of StadiumXSportMatch
CREATE OR REPLACE FUNCTION getStadiumXSportMatch(v_idStadium IN NUMBER, v_idSportMatch IN NUMBER) 
RETURN SYS_REFCURSOR AS StadiumXSportMatchCursor SYS_REFCURSOR; 
BEGIN 
    OPEN StadiumXSportMatchCursor FOR  
        SELECT idStadium, idSportMatch, dateStadiumXSportMatch
        FROM StadiumXSportMatch
        WHERE idStadium = NVL(v_idStadium, idStadium) AND 
        idSportMatch = NVL(v_idSportMatch, idSportMatch); 
    RETURN StadiumXSportMatchCursor; 
END getStadiumXSportMatch;

-----------------------------------------------------
--By: David Salazar Rodriguez
--Date: 30/Dic/2022 6:54 p.m
CREATE OR REPLACE FUNCTION getPhone(v_Phone IN NUMBER) 
RETURN SYS_REFCURSOR AS phoneCursor SYS_REFCURSOR; 
BEGIN 
    OPEN phoneCursor FOR  
        SELECT phone, idPerson
        FROM Phone
        WHERE phone = NVL(v_Phone,phone); 
    RETURN phoneCursor; 
END getPhone;

CREATE OR REPLACE FUNCTION getEmail(v_idPerson IN NUMBER) 
RETURN SYS_REFCURSOR AS emailCursor SYS_REFCURSOR; 
BEGIN 
    OPEN emailCursor FOR  
        SELECT idEmail, mail
        FROM Email
        WHERE idPerson = NVL(v_idPerson,idPerson); 
    RETURN emailCursor; 
END getEmail;

CREATE OR REPLACE FUNCTION getIdentification(v_idPerson IN NUMBER) 
RETURN SYS_REFCURSOR AS IdentificationCursor SYS_REFCURSOR; 
BEGIN 
    OPEN IdentificationCursor FOR  
        SELECT idIdentification,idType,valueIdentification
        FROM Identification
        WHERE idPerson = NVL(v_idPerson,idPerson); 
    RETURN IdentificationCursor; 
END getIdentification;

CREATE OR REPLACE FUNCTION getIdentificationType(v_idType IN NUMBER) 
RETURN SYS_REFCURSOR AS IdentificationTypeCursor SYS_REFCURSOR; 
BEGIN 
    OPEN IdentificationTypeCursor FOR  
        SELECT idType,idName,idMask
        FROM identificationType
        WHERE idType = NVL(v_idType,idType); 
    RETURN IdentificationTypeCursor; 
END getIdentificationType;

CREATE OR REPLACE FUNCTION getPerson(v_idPerson IN NUMBER) 
RETURN SYS_REFCURSOR AS PersonCursor SYS_REFCURSOR; 
BEGIN 
    OPEN PersonCursor FOR  
        SELECT idPerson,idGender,idAddress,birthday,personName,photo
        FROM person
        WHERE idPerson = NVL(v_idPerson,idPerson); 
    RETURN PersonCursor; 
END getPerson;

CREATE OR REPLACE FUNCTION getUserType(v_idUserType IN NUMBER) 
RETURN SYS_REFCURSOR AS UserTypeCursor SYS_REFCURSOR; 
BEGIN 
    OPEN UserTypeCursor FOR  
        SELECT idUserType, nameUserType
        FROM userType
        WHERE idUserType = NVL(v_idUserType,idUserType); 
    RETURN UserTypeCursor; 
END getUserType;

CREATE OR REPLACE FUNCTION getUserPerson(v_username IN NUMBER) 
RETURN SYS_REFCURSOR AS UserPersonCursor SYS_REFCURSOR; 
BEGIN 
    OPEN UserPersonCursor FOR  
        SELECT idUser, idUserType,username,passwordUser
        FROM userPerson
        WHERE username = NVL(v_username,username); 
    RETURN UserPersonCursor; 
END getUserPerson;

CREATE OR REPLACE FUNCTION getUserLog(v_idUser IN NUMBER) 
RETURN SYS_REFCURSOR AS LogCursor SYS_REFCURSOR; 
BEGIN 
    OPEN LogCursor FOR  
        SELECT idLog, idNews,idUser,logDate,logText
        FROM userLog
        WHERE idUser = NVL(v_idUser,idUser); 
    RETURN LogCursor; 
END getUserLog;

CREATE OR REPLACE FUNCTION getUserComment(v_idUser IN NUMBER) 
RETURN SYS_REFCURSOR AS CommentCursor SYS_REFCURSOR; 
BEGIN 
    OPEN CommentCursor FOR  
        SELECT idComment, idNews,idUser,CommentDate,CommentText
        FROM userComment
        WHERE idUser = NVL(v_idUser,idUser); 
    RETURN CommentCursor; 
END getUserComment;

CREATE OR REPLACE FUNCTION getUserReview(v_idUser IN NUMBER) 
RETURN SYS_REFCURSOR AS ReviewCursor SYS_REFCURSOR; 
BEGIN 
    OPEN ReviewCursor FOR  
        SELECT idReview, idNews,idUser,score
        FROM userReview
        WHERE idUser = NVL(v_idUser,idUser); 
    RETURN ReviewCursor; 
END getUserReview;

CREATE OR REPLACE FUNCTION getUserSave(v_idUser IN NUMBER) 
RETURN SYS_REFCURSOR AS SaveCursor SYS_REFCURSOR; 
BEGIN 
    OPEN SaveCursor FOR  
        SELECT idSave, idNews,idUser
        FROM userSave
        WHERE idUser = NVL(v_idUser,idUser); 
    RETURN SaveCursor; 
END getUserSave;

CREATE OR REPLACE FUNCTION getNews(v_idEvent IN NUMBER) 
RETURN SYS_REFCURSOR AS NewsCursor SYS_REFCURSOR; 
BEGIN 
    OPEN NewsCursor FOR  
        SELECT idNews,idUser,idEvent,title,text,author,newsDate,photo
        FROM News
        WHERE idEvent = NVL(v_idEvent,idEvent); 
    RETURN NewsCursor; 
END getNews;

--- code for making tests ------
DECLARE 
    pStadiumXSportMatch SYS_REFCURSOR := getStadiumXSportMatch(NULL, NULL);
    idStadium NUMBER(6);
    idSportMatch NUMBER(6);
    dateStadiumXSportMatch VARCHAR2(50);

BEGIN
    LOOP 
        FETCH pStadiumXSportMatch
        INTO idStadium, idSportMatch, dateStadiumXSportMatch;
        EXIT WHEN pStadiumXSportMatch%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(idStadium || '|' || idSportMatch || '|' || dateStadiumXSportMatch);
    END LOOP;
    CLOSE pStadiumXSportMatch;
END;
--------------------------------------------------------