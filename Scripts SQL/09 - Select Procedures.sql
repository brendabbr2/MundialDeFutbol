--This is a procedure that return a cursor of the table Gender
CREATE OR REPLACE PROCEDURE getGender(v_idGender IN NUMBER, GenderCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN GenderCursor FOR  
    SELECT idGender, genderDescription, creationUser, creationDate, modificationUser, modificationDate
    FROM Gender  
    WHERE idGender = NVL(v_idGender, idGender); 
END getGender;

--This is a procedure that return a cursor of the table Worker
CREATE OR REPLACE PROCEDURE getWorker(v_idWorker IN NUMBER, v_idEvent IN NUMBER,
WorkerCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN WorkerCursor FOR  
    SELECT idWorker, idWorkerType, idEvent, hireDate , creationUser, creationDate, modificationUser, modificationDate
    FROM Worker  
    WHERE idWorker = NVL(v_idWorker, idWorker) AND idEvent = v_idEvent;  
END getWorker;

--This is a procedure that return a cursor of the table WorkerType
CREATE OR REPLACE PROCEDURE getWorkerType(v_idWorkerType IN NUMBER,
WorkerTypeCursor OUT SYS_REFCURSOR)
AS
BEGIN 
    OPEN WorkerTypeCursor FOR  
    SELECT idWorkerType, nameWorkerType , creationUser, creationDate, modificationUser, modificationDate
    FROM WorkerType  
    WHERE idWorkerType = NVL(v_idWorkerType, idWorkerType);  
END getWorkerType;

--This is a procedure that return a cursor of the table PlayerPosition
CREATE OR REPLACE PROCEDURE getPlayerPosition(v_idPlayerPosition IN NUMBER,
PlayerPositionCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN PlayerPositionCursor FOR  
    SELECT idPlayerPosition, playerPositionName , creationUser, creationDate, modificationUser, modificationDate
    FROM PlayerPosition  
    WHERE idPlayerPosition = NVL(v_idPlayerPosition, idPlayerPosition); 
END getPlayerPosition;

--This is a procedure that return a cursor of the table Player
CREATE OR REPLACE PROCEDURE getPlayer(v_idPlayer IN NUMBER, v_idEvent IN NUMBER,
PlayerCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN PlayerCursor FOR  
    SELECT idPlayer, idTeam, idPosition, numberPlayer, creationUser, creationDate, modificationUser, modificationDate
    FROM Player
    WHERE idPlayer = NVL(v_idPlayer, idPlayer) AND idEvent = v_idEvent;  
END getPlayer;

--This is a procedure that return a cursor of the table PlayerXSportMatch
CREATE OR REPLACE PROCEDURE getPlayerXSportMatch(v_idPlayer IN NUMBER, 
    v_idSportMatch IN NUMBER, PlayerXSportMatchCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN PlayerXSportMatchCursor FOR  
    SELECT idPlayer, idSportMatch, yellow_card, red_card, savers, offside, expulsion, goals, corners , creationUser, creationDate, modificationUser, modificationDate
    FROM PlayerXSportMatch  
    WHERE idPlayer = NVL(v_idPlayer, idPlayer)
    AND idSportMatch = NVL(v_idSportMatch, idSportMatch);  
END getPlayerXSportMatch;

-----------------------------------------------------
--By: Joxan Andrey Fuertes Villegas
--Date: 28/Dic/2022 9:00 p.m

--return a cursor of Continent
CREATE OR REPLACE PROCEDURE getContinent(v_idContinent IN NUMBER, ContinentCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN ContinentCursor FOR  
        SELECT idContinent, nameContinent, creationUser, creationDate, modificationUser, modificationDate
        FROM Continent  
        WHERE idContinent = NVL(v_idContinent, idContinent); 
END getContinent;

--return a cursor of Country
CREATE OR REPLACE PROCEDURE getCountry(v_idCountry IN NUMBER, CountryCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN CountryCursor FOR  
        SELECT idCountry, nameCountry, creationUser, creationDate, modificationUser, modificationDate
        FROM Country  
        WHERE idCountry = NVL(v_idCountry, idCountry); 
END getCountry;

--return a cursor of Demonym
CREATE OR REPLACE PROCEDURE getDemonym(v_idDemonym IN NUMBER, DemonymCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN DemonymCursor FOR  
        SELECT idDemonym, nameDemonym, creationUser, creationDate, modificationUser, modificationDate
        FROM Demonym  
        WHERE idDemonym = NVL(v_idDemonym, idDemonym); 
END getDemonym;

--return a cursor of Province
CREATE OR REPLACE PROCEDURE getProvince(v_idProvince IN NUMBER, ProvinceCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN ProvinceCursor FOR  
        SELECT idProvince, nameProvince, creationUser, creationDate, modificationUser, modificationDate
        FROM Province 
        WHERE idProvince = NVL(v_idProvince, idProvince);  
END getProvince;

--return a cursor of District
CREATE OR REPLACE PROCEDURE getDistrict(v_idDistrict IN NUMBER, DistrictCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN DistrictCursor FOR  
        SELECT idDistrict, nameDistrict, creationUser, creationDate, modificationUser, modificationDate
        FROM District 
        WHERE idDistrict = NVL(v_idDistrict, idDistrict); 
END getDistrict;

--return a cursor of Canton
CREATE OR REPLACE PROCEDURE getCanton(v_idCanton IN NUMBER, CantonCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN CantonCursor FOR  
        SELECT idCanton, nameCanton, creationUser, creationDate, modificationUser, modificationDate
        FROM Canton
        WHERE idCanton = NVL(v_idCanton, idCanton); 
    COMMIT;
END getCanton;

--return a cursor of Address
CREATE OR REPLACE PROCEDURE getAddress(v_idAddress IN NUMBER, AddressCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN AddressCursor FOR  
        SELECT idAddress, nameAddress, creationUser, creationDate, modificationUser, modificationDate
        FROM Address 
        WHERE idAddress = NVL(v_idAddress, idAddress); 
END getAddress;

--return a cursor of Stadium
CREATE OR REPLACE PROCEDURE getStadium(v_idStadium IN NUMBER, v_idEvent IN NUMBER,
StadiumCursor OUT SYS_REFCURSOR)
AS
BEGIN 
    OPEN StadiumCursor FOR  
        SELECT idStadium, idEvent, nameStadium, creationUser, creationDate, modificationUser, modificationDate
        FROM Stadium 
        WHERE idStadium = NVL(v_idStadium, idStadium)AND idEvent = v_idEvent;  
END getStadium;

--return a cursor of SportMatch
CREATE OR REPLACE PROCEDURE getSportMatch(v_idSportMatch IN NUMBER, SportMatchCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN SportMatchCursor FOR  
        SELECT idSportMatch, idEvent, creationUser, creationDate, modificationUser, modificationDate
        FROM SportMatch
        WHERE idSportMatch = NVL(v_idSportMatch, idSportMatch); 
END getSportMatch;

--return a cursor of Team
CREATE OR REPLACE PROCEDURE getTeam(v_idTeam IN NUMBER, v_idEvent IN NUMBER, TeamCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN TeamCursor FOR  
        SELECT idTeam, idGroup, idCountry, idEvent, Lineup,
        captainNumber, logoPhoto, creationUser, creationDate, modificationUser, modificationDate
        FROM Team
        WHERE idTeam = NVL(v_idTeam, idTeam) AND idEvent = v_idEvent; 
END getTeam;

--return a cursor of StadiumXSportMatch
CREATE OR REPLACE PROCEDURE getStadiumXSportMatch(v_idStadium IN NUMBER,
v_idSportMatch IN NUMBER, StadiumXSportMatchCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN StadiumXSportMatchCursor FOR  
        SELECT idStadium, idSportMatch, dateStadiumXSportMatch, creationUser, creationDate, modificationUser, modificationDate
        FROM StadiumXSportMatch
        WHERE idStadium = NVL(v_idStadium, idStadium) AND 
        idSportMatch = NVL(v_idSportMatch, idSportMatch);  
END getStadiumXSportMatch;

-----------------------------------------------------
--By: David Salazar Rodriguez
--Date: 30/Dic/2022 6:54 p.m
CREATE OR REPLACE PROCEDURE getPhone(v_Phone IN NUMBER, phoneCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN phoneCursor FOR  
        SELECT phone, idPerson, creationUser, creationDate, modificationUser, modificationDate
        FROM Phone
        WHERE phone = NVL(v_Phone,phone); 
END getPhone;

CREATE OR REPLACE PROCEDURE getEmail(v_idPerson IN NUMBER, emailCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN emailCursor FOR  
        SELECT idEmail, mail, creationUser, creationDate, modificationUser, modificationDate
        FROM Email
        WHERE idPerson = NVL(v_idPerson,idPerson);  
END getEmail;

CREATE OR REPLACE PROCEDURE getIdentification(v_idPerson IN NUMBER,
IdentificationCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN IdentificationCursor FOR  
        SELECT idIdentification,idType,valueIdentification, creationUser, creationDate, modificationUser, modificationDate
        FROM Identification
        WHERE idPerson = NVL(v_idPerson,idPerson);  
END getIdentification;

CREATE OR REPLACE PROCEDURE getIdentificationType(v_idType IN NUMBER,
IdentificationTypeCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN IdentificationTypeCursor FOR  
        SELECT idIdentificationType,idName,idMask, creationUser, creationDate, modificationUser, modificationDate
        FROM identificationType
        WHERE idIdentificationType = NVL(v_idType,idIdentificationType);
END getIdentificationType;

CREATE OR REPLACE PROCEDURE getPerson(v_idPerson IN NUMBER, PersonCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN PersonCursor FOR  
        SELECT idPerson,idGender,idAddress, idUser,birthday,personName,photo, creationUser, creationDate, modificationUser, modificationDate
        FROM person
        WHERE idPerson = NVL(v_idPerson,idPerson); 
END getPerson;

CREATE OR REPLACE PROCEDURE getUserType(v_idUserType IN NUMBER,
UserTypeCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN UserTypeCursor FOR  
        SELECT idUserType, nameUserType, creationUser, creationDate, modificationUser, modificationDate
        FROM userType
        WHERE idUserType = NVL(v_idUserType,idUserType); 
END getUserType;

CREATE OR REPLACE PROCEDURE getUserPerson(v_idUser IN NUMBER, UserPersonCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN UserPersonCursor FOR  
        SELECT userP.idUser, userT.nameUserType, userP.username, userP.passwordUser, 
            userT.creationUser, userT.creationDate, userT.modificationUser, userT.modificationDate
        FROM userPerson userP
        INNER JOIN userType userT
        ON userP.idUserType = userT.idUserType
        WHERE userP.idUser = NVL(v_idUser, userP.idUser); 
END getUserPerson;

CREATE OR REPLACE PROCEDURE getUserLog(v_idUser IN NUMBER, LogCursor OUT SYS_REFCURSOR) 
AS
BEGIN 
    OPEN LogCursor FOR  
        SELECT idLog, idNews,idUser,logDate,logText, creationUser, creationDate, modificationUser, modificationDate
        FROM userLog
        WHERE idUser = NVL(v_idUser,idUser);
END getUserLog;

CREATE OR REPLACE PROCEDURE getUserComment(v_idUser IN NUMBER, CommentCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN CommentCursor FOR  
        SELECT idComment, idNews,idUser,CommentDate,CommentText, creationUser, creationDate, modificationUser, modificationDate
        FROM userComment
        WHERE idUser = NVL(v_idUser,idUser);
END getUserComment;

CREATE OR REPLACE PROCEDURE getUserReview(v_idUser IN NUMBER, ReviewCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN ReviewCursor FOR  
        SELECT idReview, idNews,idUser,score, creationUser, creationDate, modificationUser, modificationDate
        FROM userReview
        WHERE idUser = NVL(v_idUser,idUser); 
END getUserReview;

CREATE OR REPLACE PROCEDURE getUserSave(v_idUser IN NUMBER, SaveCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN SaveCursor FOR  
        SELECT idSave, idNews,idUser, creationUser, creationDate, modificationUser, modificationDate
        FROM userSave
        WHERE idUser = NVL(v_idUser,idUser);  
END getUserSave;

CREATE OR REPLACE PROCEDURE getUserSaveMostVoted(SaveCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN SaveCursor FOR  
        SELECT idNews, COUNT(idNews) AS voting
        FROM UserSave GROUP BY idNews
        ORDER BY voting DESC;
END getUserSaveMostVoted;

CREATE OR REPLACE PROCEDURE getNews(v_idNews IN NUMBER, NewsCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN NewsCursor FOR
        SELECT n.idNews,n.idEvent,e.nameEvent,n.title,n.text,n.author,n.newsDate,
        n.photo, n.creationUser, n.creationDate, n.modificationUser, n.modificationDate
        FROM News n
        INNER JOIN Event e
        ON n.idEvent = e.idEvent
        WHERE n.idNews = NVL(v_idNews,n.idNews);
END getNews;

CREATE OR REPLACE PROCEDURE getParameterEvent(v_idParameter IN NUMBER, ParameterEventCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN ParameterEventCursor FOR  
        SELECT idParameter, nameParameter, valueParameter, creationUser, creationDate, modificationUser, modificationDate
        FROM ParameterEvent
        WHERE idParameter = NVL(v_idParameter,idParameter); 
END getParameterEvent;

CREATE OR REPLACE PROCEDURE getEventType(v_idEventType IN NUMBER, EventTypeCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN EventTypeCursor FOR  
        SELECT idEventType, nameEventType, creationUser, creationDate, modificationUser, modificationDate
        FROM EventType
        WHERE idEventType = NVL(v_idEventType,idEventType); 
END getEventType;

CREATE OR REPLACE PROCEDURE getEvent(v_idEvent IN NUMBER, EventCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN EventCursor FOR  
        SELECT idEvent, idEventType, nameEvent, creationUser, creationDate, modificationUser, modificationDate
        FROM Event
        WHERE idEvent = NVL(v_idEvent,idEvent); 
END getEvent;

CREATE OR REPLACE PROCEDURE getGroupEvent(v_idGroup IN NUMBER,v_idEvent IN NUMBER,
GroupCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN GroupCursor FOR  
        SELECT idGroup, idEvent, nameGroup, creationUser, creationDate, modificationUser, modificationDate
        FROM GroupEvent
        WHERE idGroup = NVL(v_idGroup,idGroup) AND idEvent = v_idEvent; 
END getGroupEvent;

CREATE OR REPLACE PROCEDURE getLineup(v_idLineup IN NUMBER, LineupCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN LineupCursor FOR  
        SELECT idLineup, nameLineup, creationUser, creationDate, modificationUser, modificationDate
        FROM Lineup
        WHERE idLineup = NVL(v_idLineup,idLineup); 
END getLineup;

CREATE OR REPLACE PROCEDURE getHelper(v_idHelper IN NUMBER,
HelperCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN HelperCursor FOR  
        SELECT idHelper, idTeam, idhelperType, hiredate, creationUser, creationDate, modificationUser, modificationDate
        FROM Helper
        WHERE idHelper = NVL(v_idHelper,idHelper); 
END getHelper;

CREATE OR REPLACE PROCEDURE getHelperType(v_idHelperType IN NUMBER, HelperTypeCursor OUT SYS_REFCURSOR) 
AS 
BEGIN 
    OPEN HelperTypeCursor FOR  
        SELECT idHelperType, nameHelperType, creationUser, creationDate, modificationUser, modificationDate
        FROM HelperType
        WHERE idHelperType = NVL(v_idHelperType,idHelperType); 
END getHelperType;
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