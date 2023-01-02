--By: Rodolfo Acuna Lopez

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
    INSERT INTO PlayerPosition(idPosition, positionName)  
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

--By: David Salazar Rodriguez
--Date: 27/Dic/2022 7:31 p.m
------------------Person procedures-------------------
CREATE OR REPLACE PROCEDURE insertGender
    (Vdescription IN VARCHAR2)
    AS BEGIN 
    INSERT INTO Gender(idGender,genderdescription)  
    VALUES(s_gender.NEXTVAL, Vdescription);
    --COMMIT; 
END insertGender;

CREATE OR REPLACE PROCEDURE insertPhone
    (Vphone IN NUMBER, VidPerson IN NUMBER)
    AS BEGIN 
    INSERT INTO Phone(phone,idPerson)  
    VALUES(Vphone, VidPerson);
    --COMMIT; 
END insertPhone;

CREATE OR REPLACE PROCEDURE insertEmail
    (VidPerson IN NUMBER, Vmail IN VARCHAR2)
    AS BEGIN 
    INSERT INTO Email(idEmail,idPerson,mail) 
    VALUES(s_email.nextVal, VidPerson, Vmail);
    --COMMIT; 
END insertEmail;

CREATE OR REPLACE PROCEDURE insertIdentificationType
    (VidName IN VARCHAR2, idMask IN NUMBER)
    AS BEGIN 
    INSERT INTO identificationType(idType,idName,idMask) 
    VALUES(s_identificationtype.nextval, VidName, idMask);
    --COMMIT; 
END insertIdentificationType;

CREATE OR REPLACE PROCEDURE insertIdentification
    (VidPerson IN NUMBER, VidType IN NUMBER, VvalueIdentification IN NUMBER)
    AS BEGIN 
    INSERT INTO identification(idIdentification,idPerson,idType,valueIdentification) 
    VALUES(s_identification.nextval,VidPerson, VidType, VvalueIdentification);
    --COMMIT; 
END insertIdentification;

CREATE OR REPLACE PROCEDURE insertPerson
    (VidGender IN NUMBER, Vadress IN NUMBER,
        Vbirthdate IN DATE, Vname IN VARCHAR2, Vphoto IN BLOB)
    AS BEGIN 
    INSERT INTO Person(idPerson, idGender, idAddress,
        birthday, personName, photo)  
    VALUES(s_person.NEXTVAL, VidGender, Vadress,
        Vbirthdate, Vname, Vphoto);
    --COMMIT; 
END insertPerson;
-----------------------------------------------------
-------------------User procedures-----------------------
CREATE OR REPLACE PROCEDURE insertUserType
    (VuserType IN VARCHAR2)
    AS BEGIN 
    INSERT INTO userType(idUserType, nameUserType)  
    VALUES(s_userType.NEXTVAL,VuserType);
    --COMMIT; 
END insertUserType;

CREATE OR REPLACE PROCEDURE insertUserPerson
    (VidUserType IN NUMBER,VuserName IN VARCHAR2,Vpasssword IN VARCHAR2)
    AS BEGIN 
    INSERT INTO userPerson(idUser,idUserType, username, passwordUser)  
    VALUES(s_userPerson.NEXTVAL,VidUserType, VuserName, Vpasssword);
    --COMMIT; 
END insertUserPerson;

-----------------------------------------------------
----------------User/News procedures------------------
CREATE OR REPLACE PROCEDURE insertUserLog
    (VidNews IN NUMBER,VidUser IN NUMBER, VlogDate date, VlogText varchar2)
    AS BEGIN 
    INSERT INTO userLog(idLog,idNews, idUser, logDate,logText)  
    VALUES(s_userLog.NEXTVAL,VidNews, VidUser, VlogDate,VlogText);
    --COMMIT; 
END insertUserLog;

CREATE OR REPLACE PROCEDURE insertUserComment
    (VidNews IN NUMBER,VidUser IN NUMBER, VcommentDate date, VlcommentText varchar2)
    AS BEGIN 
    INSERT INTO UserComment(idComment,idNews, idUser, commentDate,commentText)  
    VALUES(s_UserComment.NEXTVAL,VidNews, VidUser, VcommentDate,VlcommentText);
    --COMMIT; 
END insertUserComment;

CREATE OR REPLACE PROCEDURE insertUserReview
    (VidNews IN NUMBER,VidUser IN NUMBER, Vscore IN NUMBER)
    AS BEGIN 
    INSERT INTO UserReview(idReview,idNews, idUser, score)  
    VALUES(s_UserReview.NEXTVAL,VidNews, VidUser, Vscore);
    --COMMIT; 
END insertUserReview;

CREATE OR REPLACE PROCEDURE insertUserSave
    (VidNews IN NUMBER,VidUser IN NUMBER)
    AS BEGIN 
    INSERT INTO UserSave(idSave,idNews, idUser)  
    VALUES(s_UserSave.NEXTVAL,VidNews, VidUser);
    --COMMIT; 
END insertUserSave;
-----------------------------------------------------
---------------------News Table----------------------
CREATE OR REPLACE PROCEDURE insertNews
    (VidUser IN NUMBER,VidEvent IN NUMBER,Vtitle IN VARCHAR2,Vtext IN VARCHAR2,
    Vauthor IN VARCHAR2,VnewsDate IN DATE,Vphoto IN blob)
    AS BEGIN 
    INSERT INTO News(idNews,idUser,idEvent,title,text,author,newsDate,photo)  
    VALUES(s_News.NEXTVAL,VidUser, VidEvent,Vtitle,Vtext,Vauthor, VnewsDate,Vphoto);
    --COMMIT; 
END insertNews;
-----------------------------------------------------
--By: Brenda Badilla Rodriguez
--Date: 28/Dic/2022 00:00 a.m

--Event
CREATE OR REPLACE PROCEDURE insertEvent 
    (VidEventType IN NUMBER, VnameEvent IN VARCHAR2)
    AS BEGIN
    INSERT INTO Event(idEvent, idEventType, nameEvent)
    VALUES(s_event.nextval, VidEventType, VnameEvent);
    --COMMIT; 
END insertEvent;

--Event Type
CREATE OR REPLACE PROCEDURE insertEventType 
    (VnameEventType IN VARCHAR2)
    AS BEGIN
    INSERT INTO EventType(idEventType, nameEventType)
    VALUES(s_eventtype.nextval, VnameEventType);
    --COMMIT; 
END insertEventType;

--Group Event
CREATE OR REPLACE PROCEDURE insertGroupEvent 
    (VidEvent IN NUMBER, VnameGroup IN VARCHAR2)
    AS BEGIN
    INSERT INTO groupEvent(idGroup, idEvent, nameGroup)
    VALUES(s_groupevent.nextval, VidEvent, VnameGroup);
    --COMMIT; 
END insertGroupEvent;

--Helper
CREATE OR REPLACE PROCEDURE insertHelper 
    (VidHelper IN NUMBER, VidTeam IN NUMBER, VidHelperType IN NUMBER, VhireDate IN DATE)
    AS BEGIN
    INSERT INTO helper(idHelper, idTeam, idHelperType, hireDate)
    VALUES(VidHelper, VidTeam, VidHelperType, VhireDate);
    --COMMIT; 
END insertHelper;

--HelperType
CREATE OR REPLACE PROCEDURE insertHelper 
    (VidTeam IN NUMBER, VidHelperType IN NUMBER, VhireDate IN DATE)
    AS BEGIN
    INSERT INTO helper(idHelper, idTeam, idHelperType, hireDate)
    VALUES(s_person.nextval, VidTeam, VidHelperType, VhireDate);
    --COMMIT; 
END insertHelper;

--Parameter
CREATE OR REPLACE PROCEDURE insertParameterEvent 
    (VnameParameter IN VARCHAR2, VvalueParameter IN NUMBER)
    AS BEGIN
    INSERT INTO ParameterEvent(idParameter, nameParameter, valueParameter)
    VALUES(s_parameterEvent.nextval, VnameParameter,VvalueParameter);
    --COMMIT; 
END insertParameterEvent;

--Player
CREATE OR REPLACE PROCEDURE insertPlayer 
    (VidTeam IN NUMBER, VidPosition IN NUMBER, VnumberPlayer IN NUMBER)
    AS BEGIN
    INSERT INTO Player(idPlayer, idTeam, idPosition, numberPlayer)
    VALUES(s_person.nextval, VidTeam, VidPosition, VnumberPlayer);
    --COMMIT; 
END insertPlayer;

--Team
CREATE OR REPLACE PROCEDURE insertTeam 
    (VidGroup IN NUMBER, VidCountry IN NUMBER, VcaptainNumber IN NUMBER, VlogoPhoto IN BLOB, Vlineup IN NUMBER)
    AS BEGIN
    INSERT INTO Team(idteam, idgroup, idcountry, captainnumber, logophoto, lineup)
    VALUES(s_team.nextval, VidGroup, VidCountry, VcaptainNumber, VlogoPhoto, Vlineup);
    --COMMIT; 
END insertTeam;

-----------------------------------------------------
--By: Joxan Andrey Fuertes Villegas
--Date: 28/Dic/2022 8:00 p.m

--Continent
CREATE OR REPLACE PROCEDURE insertContinent 
    (VnameContinent IN VARCHAR2)
    AS BEGIN
    INSERT INTO Continent(idContinent, nameContinent)
    VALUES(s_continent.nextval, VnameContinent);
    --COMMIT; 
END insertContinent;

-- Insert Country
CREATE OR REPLACE PROCEDURE insertCountry
    (V_idContinent IN NUMBER, V_nameCountry IN VARCHAR2, V_demonym IN VARCHAR2)
    AS BEGIN 
    INSERT INTO Country(idCountry, idContinent, nameCountry, demonym)  
    VALUES(s_Country.NEXTVAL, V_idContinent, V_nameCountry, V_demonym);
    --COMMIT; 
END insertCountry;

-- Insert Province
CREATE OR REPLACE PROCEDURE insertProvince
    (V_idCountry IN NUMBER, V_nameProvince IN VARCHAR2)
    AS BEGIN 
    INSERT INTO Province(idProvince, idCountry, nameProvince)  
    VALUES(s_Province.NEXTVAL, V_idCountry, V_nameProvince);
    --COMMIT; 
END insertProvince;

-- Insert District
CREATE OR REPLACE PROCEDURE insertDistrict
    (V_idProvince IN NUMBER, V_nameDistrict IN VARCHAR2) 
    AS BEGIN
    INSERT INTO District(idDistrict, idProvince, nameDistrict)
    VALUES(s_District.NEXTVAL, V_idProvince, V_nameDistrict);
END insertDistrict;

-- Insert Address
CREATE OR REPLACE PROCEDURE insertAddress
    (V_idDistrict IN NUMBER, V_nameAddress IN VARCHAR2) 
    AS BEGIN
    INSERT INTO Address(idAddress, idDistrict, nameAddress)
    VALUES(s_Address.NEXTVAL, V_idDistrict, V_nameAddress);
END insertAddress;

-- Insert Stadium
CREATE OR REPLACE PROCEDURE insertStadium
    (V_idAddress IN NUMBER, V_nameStadium IN VARCHAR2) 
    AS BEGIN
    INSERT INTO Stadium(idStadium, idAddress, nameStadium)
    VALUES(s_Stadium.NEXTVAL, V_idAddress, V_nameStadium);
END insertStadium;

-- Insert SportMatch
CREATE OR REPLACE PROCEDURE insertSportMatch 
    AS BEGIN
    INSERT INTO SportMatch(idSportMatch)
    VALUES(s_SportMatch.NEXTVAL);
END insertSportMatch;

-- Insert StadiumXSportMatch
CREATE OR REPLACE PROCEDURE insertStadiumXSportMatch
    (V_idStadium IN NUMBER, V_idSportMatch IN NUMBER, V_dateStadiumXSportMatch IN DATE)
    AS BEGIN
    INSERT INTO StadiumXSportMatch(idStadium, idSportMatch, dateStadiumXSportMatch)
    VALUES(V_idStadium, V_idSportMatch, V_dateStadiumXSportMatch);
END insertStadiumXSportMatch;