---Tables Created: Gender,Phone,Email,Identification,identificationType,person,
---                userType,personUser,userLog,userComment,userReview,userSave,News
---By: David Salazar Rodriguez
---Date: 22/12/2022 4:23 PM
--Annotation: PKs and FKs will be added on a separate file
--------People Tables-----------------
CREATE TABLE Gender(
    --------------PK------------------
    idGender number(6),
    genderDescription varchar2(50) NOT NULL,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE Phone(
    --------------PK------------------
    phone number(8),
    --------------FK------------------
    idPerson number(6),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE Email(
    --------------PK------------------
    idEmail number(6),
    --------------FK------------------
    idPerson number(6),
    --------------Attribute------------
    mail varchar2(200) UNIQUE NOT NULL,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE Identification(
    --------------PK------------------
    idIdentification number(6),
    --------------FK------------------
    idPerson number(6),
    idType number(6),
    --------------Attribute------------
    valueIdentification number(10) UNIQUE NOT NULL,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE identificationType(
    --------------PK------------------
    idIdentificationType number(6),
    --------------Attribute------------
    idName varchar2(50),
    idMask number(10),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE person(
    --------------PK------------------
    idPerson number(6),
    --------------FK------------------
    idGender number(6),
    idAddress number(6),
    idUser NUMBER(6),
    --------------Attribute------------
    birthday date NOT NULL,
    personName varchar2(20) NOT NULL,
    photo VARCHAR2(100),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);
-----------------------------------------------------
-------------------User Tables-----------------------
CREATE TABLE userType(
    --------------PK------------------
    idUserType number(6),
    --------------Attribute------------
    nameUserType varchar(50) NOT NULL,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE userPerson(
    --------------PK------------------
    idUser number(6),
    --------------FK------------------
    idUserType number(6),
    --------------Attribute------------
    username varchar2(80) UNIQUE NOT NULL,
    passwordUser varchar2(80) NOT NULL,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);
-----------------------------------------------------
----------------User/News Relations------------------
CREATE TABLE userLog(
    --------------PK------------------
    idLog number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    --------------Attribute------------
    logDate date NOT NULL,
    logText varchar2(200),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE userComment(
    --------------PK------------------
    idComment number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    --------------Attribute------------
    commentDate date NOT NULL,
    commentText varchar2(200),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE userReview(
    --------------PK------------------
    idReview number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    --------------Attribute------------
    score number(5) NOT NULL,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE userSave(
    --------------PK------------------
    idSave number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);
-----------------------------------------------------
---------------------News Table----------------------
CREATE TABLE News(
    --------------PK------------------
    idNews number(6),
    --------------FK------------------
    idEvent number(6),
    --------------Attribute------------

    title varchar(100) NOT NULL, 

    text varchar2(200) NOT NULL,
    author varchar2(50) NOT NULL,
    newsDate date NOT NULL,
    photo VARCHAR2(100),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);
-----------------------------------------------------
--Tables created: Event, EventType, GroupEvent, Helper, HelperType, ParameterEvent, Player, Team
--By: Brenda Badilla Rodriguez
--Date: 12/Dic/2022 11:46 p.m
--------------------Event Tables---------------------
CREATE TABLE Event( 
    --------------PK------------------
    idEvent NUMBER(6),
    --------------FK------------------
    idEventType NUMBER(6),
    --------------Attribute------------
    nameEvent VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE EventType(
    --------------PK------------------
    idEventType NUMBER(6),
    --------------Attribute------------
    nameEventType VARCHAR(50) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
------------------Parameter Table--------------------
CREATE TABLE ParameterEvent( 
    --------------PK------------------
    idParameter NUMBER(6),
    --------------Attribute-----------
    nameParameter VARCHAR2(20) NOT NULL,
    valueParameter NUMBER(6) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
------------------Group Table--------------------
CREATE TABLE GroupEvent( 
    --------------PK------------------
    idGroup NUMBER(6),
    --------------FK------------------
    idEvent NUMBER(6),
    --------------Attribute-----------
    nameGroup VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
---------------------Team Table----------------------
CREATE TABLE Team( 
    --------------PK------------------
    idTeam NUMBER(6),
    --------------FK------------------
    idGroup NUMBER(6),
    idCountry NUMBER(6),
    idEvent NUMBER(6),
    idLineup NUMBER(6),
    --------------Attribute-----------
    captainNumber NUMBER(6) NOT NULL,
    logoPhoto VARCHAR2(100),
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE Lineup( 
    --------------PK------------------
    idLineup NUMBER(6),
    --------------Attribute-----------
    nameLineup VARCHAR(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-----------------------------------------------------
--------------------Helper Tables--------------------
CREATE TABLE Helper( 
    --------------PK------------------
    idHelper NUMBER(6),
    --------------FK------------------
    idEvent NUMBER(6),
    idTeam NUMBER(6),
    idHelperType NUMBER(6),
    --------------Attribute-----------
    hireDate DATE NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE HelperType( 
    --------------PK------------------
    idHelperType NUMBER(6),
    --------------Attribute-----------
    nameHelperType VARCHAR(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
--------------------Player Tables--------------------
CREATE TABLE Player( 
    --------------PK------------------
    idPlayer NUMBER(6),
    --------------FK------------------
    idEvent NUMBER(6),
    idTeam NUMBER(6),
    idPosition NUMBER(6),
    --------------Attribute-----------
    numberPlayer NUMBER(6),
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
CREATE TABLE PlayerPosition(
    --------------PK------------------
    idPlayerPosition NUMBER(6),
    --------------FK------------------
    playerPositionName VARCHAR2(100)NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
--Tables created: Continent, Country, Province, District, Address, Stadium, 
--                SportMatch, StadiumXSportMatch
--By: Joxan Andrey Fuertes Villegas
--Date: 23/Dic/2022 1:22 a.m
CREATE TABLE Demonym( 
    --------------PK------------------
    idDemonym NUMBER(6),
    --------------Attribute-----------
    nameDemonym VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

--------------------Adress Tables--------------------
CREATE TABLE Continent( 
    --------------PK------------------
    idContinent NUMBER(6),
    --------------Attribute-----------
    nameContinent VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE Country( 
    --------------PK------------------
    idCountry NUMBER(6),
    --------------FK------------------
    idContinent NUMBER(6),
    idDemonym NUMBER(6),
    --------------Attribute-----------
    nameCountry VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE Province( 
    --------------PK------------------
    idProvince NUMBER(6),
    --------------FK------------------
    idCountry NUMBER(6),
    --------------Attribute-----------
    nameProvince VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE Canton(
    idCanton NUMBER(6),
    idProvince NUMBER(6),
    nameCanton VARCHAR2(20),
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE District( 
    --------------PK------------------
    idDistrict NUMBER(6),
    --------------FK------------------
    idCanton NUMBER(6),
    --------------Attribute-----------
    nameDistrict VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);    

CREATE TABLE Address( 
    --------------PK------------------
    idAddress NUMBER(6),
    --------------FK------------------
    idDistrict NUMBER(6),
    --------------Attribute-----------
    nameAddress VARCHAR2(250) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
-------------------Stadium Table---------------------
CREATE TABLE Stadium( 
    --------------PK------------------
    idStadium NUMBER(6),
    --------------FK------------------
    idAddress NUMBER(6),
    idEvent NUMBER(6),
    --------------Attribute-----------
    nameStadium VARCHAR2(20) NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
------------------Stadium/Match Relation-------------
CREATE TABLE StadiumXSportMatch( 
    --------------PK - FK-------------
    idStadium NUMBER(6),
    idSportMatch NUMBER(6),
    --------------Attribute-----------
    dateStadiumXSportMatch DATE NOT NULL,
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
-------------------Match Table-----------------------
CREATE TABLE SportMatch(
    --------------PK-----------------
    idSportMatch NUMBER(6),
    --------------FK------------------
    idEvent NUMBER(6),
    --------------Audit---------------
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
-----------------------------------------------------
--Tables created: Worker, WorkerType, PlayerXMatch, PlayerXCountry, WorkerXMatch
--By: Rodolfo Acuna Lopez
--Date: 23/Dic/2022 12:22 p.m
-------------------Worker Tables----------------------
CREATE TABLE Worker(
    --------------PK-----------------
    idWorker NUMBER(6),
    --------------FK-----------------
    idWorkerType NUMBER(6),
    idEvent NUMBER(6),
    --------------Attribute-----------
    hireDate DATE,
    --------------Audit---------------
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);

CREATE TABLE WorkerType(
    --------------PK-----------------
    idWorkerType NUMBER(6),
    --------------Attribute----------
    nameWorkerType VARCHAR2(20),
    --------------Audit---------------
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);
-----------------------------------------------------
----------------Worker/Match Relation----------------
CREATE TABLE WorkerXSportMatch (
    --------------PK-FK---------------
    idWorker NUMBER(6),
    idSportMatch NUMBER(6),
    --------------Audit---------------
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);
-----------------------------------------------------
----------------Player/Match Relation----------------
CREATE TABLE PlayerXSportMatch(
    --------------PK-FK---------------
    idPlayer NUMBER(6),
    idSportMatch NUMBER(6),
    --------------Attribute-----------
    yellow_card INTEGER,
    red_card INTEGER,
    savers INTEGER,
    offside INTEGER,
    expulsion INTEGER,
    goals INTEGER,
    corners INTEGER,
    --------------Audit---------------
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);
-----------------------------------------------------
---------------Player/Country Relation---------------
CREATE TABLE PlayerXCountry (
    --------------PK-FK---------------
    idPlayer NUMBER(6),
    idCountry NUMBER(6),
    --------------Audit---------------
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);
