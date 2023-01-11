-----------------------------------------------------
--------------------PRYMARY KEYS---------------------
-----------------------------------------------------
-----------------------------------------------------
--Primary keys created: Event, EventType, GroupEvent, Helper, HelperType, ParameterEvent, Player, Team
--By: Brenda Badilla Rodriguez
--Date: 26/Dic/2022 05:00 p.m
--------------------Event Tables---------------------
ALTER TABLE Event
ADD CONSTRAINT pk_idEvent PRIMARY KEY (idEvent)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE EventType
ADD CONSTRAINT pk_idEventType PRIMARY KEY (idEventType)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
------------------Parameter Table--------------------
ALTER TABLE ParameterEvent
ADD CONSTRAINT pk_idParameter PRIMARY KEY (idParameter)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
------------------Group Table--------------------
ALTER TABLE GroupEvent
ADD CONSTRAINT pk_idGroup PRIMARY KEY (idGroup)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
---------------------Team Table----------------------
ALTER TABLE Team
ADD CONSTRAINT pk_idTeam PRIMARY KEY (idTeam)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
---------------------Lineup Table----------------------
ALTER TABLE Lineup
ADD CONSTRAINT pk_idLineup PRIMARY KEY (idLineup)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
--------------------Helper Tables--------------------
ALTER TABLE Helper
ADD CONSTRAINT pk_idHelper PRIMARY KEY (idHelper)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE HelperType
ADD CONSTRAINT pk_idHelperType PRIMARY KEY (idHelperType)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
--------------------Player Tables--------------------
ALTER TABLE Player
ADD CONSTRAINT pk_idPlayer PRIMARY KEY (idPlayer)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE PlayerPosition
ADD CONSTRAINT pk_PlayerPosition PRIMARY KEY (idPlayerPosition)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
--Primary Keys created: Continent, Country, Province, District, Address, Stadium, 
--                SportMatch, StadiumXSportMatch
--By: Joxan Andrey Fuertes Villegas
--Date: 23/Dic/2022 1:22 a.m
--------------------Adress Tables--------------------
ALTER TABLE Continent 
ADD CONSTRAINT pk_Continent PRIMARY KEY (idContinent)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Country
ADD CONSTRAINT pk_Country PRIMARY KEY (idCountry)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Demonym
ADD CONSTRAINT pk_Demonym PRIMARY KEY (idDemonym)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Province
ADD CONSTRAINT pk_Province PRIMARY KEY (idProvince)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE District
ADD CONSTRAINT pk_District PRIMARY KEY (idDistrict)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Canton
ADD CONSTRAINT pk_Canton PRIMARY KEY (idCanton)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Address
ADD CONSTRAINT pk_Address PRIMARY KEY (idAddress)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

-----------------------------------------------------
-------------------Stadium Table---------------------
ALTER TABLE Stadium
ADD CONSTRAINT pk_Stadium PRIMARY KEY (idStadium)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
-------------------Match Table-----------------------
ALTER TABLE SportMatch
ADD CONSTRAINT pk_SportMatch PRIMARY KEY (idSportMatch)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE SportMatch
ADD CONSTRAINT fk_SportMatch_Event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

-----------------------------------------------------
------------------Stadium/Match Relation-------------
ALTER TABLE StadiumXSportMatch
ADD CONSTRAINT pk_StadiumXSportMatch PRIMARY KEY (idStadium,idSportMatch)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

-----------------------------------------------------
--Primary keys created: Worker, WorkerType, PlayerXMatch, PlayerXCountry, WorkerXMatch
--By: Rodolfo Acuna Lopez
--Date: 23/Dic/2022 12:22 p.m
-------------------Worker Tables----------------------
ALTER TABLE Worker
ADD CONSTRAINT pk_worker PRIMARY KEY (idWorker)
USING INDEX 
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE WorkerType
ADD CONSTRAINT pk_workertype PRIMARY KEY (idWorkerType)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
----------------Worker/Match Relation----------------
ALTER TABLE WorkerXSportMatch
ADD CONSTRAINT pk_worker_sportmatch PRIMARY KEY (idWorker, idSportMatch) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
----------------Player/Match Relation----------------
ALTER TABLE PlayerXSportMatch
ADD CONSTRAINT pk_player_sportmatch PRIMARY KEY (idPlayer, idSportMatch) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
---------------Player/Country Relation---------------
ALTER TABLE PlayerXCountry
ADD CONSTRAINT pk_player_country PRIMARY KEY (idPlayer, idCountry) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

---Primary Keys Created: Gender,Phone,Email,Identification,identificationType,person,
---                userType,personUser,userLog,userComment,userReview,userSave,News
---By: David Salazar Rodriguez
---Date: 26/12/2022 7:00 PM
--------------------Person Tables---------------------
ALTER TABLE Gender
ADD CONSTRAINT pk_Gender PRIMARY KEY (idGender) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Phone
ADD CONSTRAINT pk_Phone PRIMARY KEY (Phone) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Email
ADD CONSTRAINT pk_Email PRIMARY KEY (idEmail) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Identification
ADD CONSTRAINT pk_Id PRIMARY KEY (idIdentification) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE identificationType
ADD CONSTRAINT pk_IdIdentificationType PRIMARY KEY (idIdentificationType) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE person
ADD CONSTRAINT pk_person PRIMARY KEY (idPerson) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
-------------------User Tables-----------------------
ALTER TABLE userType
ADD CONSTRAINT pk_userType PRIMARY KEY (idUserType) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE userPerson
ADD CONSTRAINT pk_UserPerson PRIMARY KEY (idUser) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
----------------User/News Relations------------------
ALTER TABLE userLog
ADD CONSTRAINT pk_userLog PRIMARY KEY (idLog) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE userComment
ADD CONSTRAINT pk_userComment PRIMARY KEY (idComment) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE userReview
ADD CONSTRAINT pk_userReview PRIMARY KEY (idReview) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE userSave
ADD CONSTRAINT pk_userSave PRIMARY KEY (idSave) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
---------------------News----------------------------
ALTER TABLE News
ADD CONSTRAINT pk_News PRIMARY KEY (idNews) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


-----------------------------------------------------
--------------------FOREIGN KEYS---------------------
-----------------------------------------------------

--By: Brenda Badilla Rodriguez
--Date: 26/Dic/2022 08:00 p.m

ALTER TABLE Event
ADD CONSTRAINT fk_event_type FOREIGN KEY
(idEventType) REFERENCES EventType(idEventType);

ALTER TABLE GroupEvent
ADD CONSTRAINT fk_group_event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

ALTER TABLE Helper
ADD CONSTRAINT fk_helper_team FOREIGN KEY
(idTeam) REFERENCES Team(idTeam);

ALTER TABLE Helper
ADD CONSTRAINT fk_helper_type FOREIGN KEY
(idHelperType) REFERENCES HelperType(idHelperType);

ALTER TABLE Player
ADD CONSTRAINT fk_player_team FOREIGN KEY
(idTeam) REFERENCES Team(idTeam);

ALTER TABLE Player
ADD CONSTRAINT fk_player_position FOREIGN KEY
(idPosition) REFERENCES PlayerPosition(idPlayerPosition);

ALTER TABLE Team
ADD CONSTRAINT fk_team_group FOREIGN KEY
(idGroup) REFERENCES GroupEvent(idGroup);

ALTER TABLE Team
ADD CONSTRAINT fk_team_country FOREIGN KEY
(idCountry) REFERENCES Country(idCountry);

ALTER TABLE Team
ADD CONSTRAINT fk_Team_Event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

ALTER TABLE Team
ADD CONSTRAINT fk_Team_Lineup FOREIGN KEY
(idLineup) REFERENCES Lineup(idLineup);
--By: Joxan Andrey Fuertes Villegas
--Date: 26/Dic/2022 08:05 p.m

-- Continent
ALTER TABLE Continent
ADD CONSTRAINT fk_Continent_Event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

-- country
ALTER TABLE Country
ADD CONSTRAINT fk_Country_Continent FOREIGN KEY
(idContinent) REFERENCES Continent(idContinent);

ALTER TABLE Country
ADD CONSTRAINT fk_Country_Demonym FOREIGN KEY
(idDemonym) REFERENCES Demonym(idDemonym);

-- province
ALTER TABLE Province
ADD CONSTRAINT fk_Province_Country FOREIGN KEY
(idCountry) REFERENCES Country(idCountry);

-- canton
 ALTER TABLE Canton
ADD CONSTRAINT fk_Canton_Province FOREIGN KEY
(idProvince) REFERENCES Province(idProvince);

-- district
ALTER TABLE District
ADD CONSTRAINT fk_District_Canton FOREIGN KEY
(idCanton) REFERENCES Canton(idCanton);

-- address
 ALTER TABLE Address
ADD CONSTRAINT fk_Address_District FOREIGN KEY
(idDistrict) REFERENCES District(idDistrict);

-- stadium
ALTER TABLE Stadium
ADD CONSTRAINT fk_Stadium_Address FOREIGN KEY
(idAddress) REFERENCES Address(idAddress);

ALTER TABLE Stadium
ADD CONSTRAINT fk_Stadium_Event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

-- stadiumXsportMatch
ALTER TABLE StadiumXSportMatch
ADD CONSTRAINT fk_StadiumXSportMatch_Stadium FOREIGN KEY
(idStadium) REFERENCES Stadium(idStadium);

ALTER TABLE StadiumXSportMatch
ADD CONSTRAINT fk_StadiumXSportMatch_SpMatch FOREIGN KEY
(idSportMatch) REFERENCES SportMatch(idSportMatch);

-----------------------------------------------------
--------------------FOREIGN KEYS---------------------
-----------------------------------------------------

--By: Rodolfo David Acuna Lopez
--Date: 26/Dic/2022 08:50 p.m

ALTER TABLE Worker
ADD CONSTRAINT fk_workertype_worker FOREIGN KEY
(idWorkerType) REFERENCES WorkerType(idWorkerType);

ALTER TABLE PlayerXSportMatch
ADD CONSTRAINT fk_playerxsportMatch_player FOREIGN KEY
(idPlayer) REFERENCES Player(idPlayer);

ALTER TABLE PlayerXSportMatch
ADD CONSTRAINT fk_playerxmatch_sportmatch FOREIGN KEY
(idSportMatch) REFERENCES SportMatch(idSportMatch);

ALTER TABLE PlayerXCountry
ADD CONSTRAINT fk_PlayerXCountry_player FOREIGN KEY
(idPlayer) REFERENCES Player(idPlayer);

ALTER TABLE PlayerXCountry
ADD CONSTRAINT fk_playerxcountry_country FOREIGN KEY
(idCountry) REFERENCES Country(idCountry);

ALTER TABLE WorkerXSportMatch
ADD CONSTRAINT fk_workerxmatch_worker FOREIGN KEY
(idWorker) REFERENCES Worker(idWorker);

ALTER TABLE WorkerXSportMatch
ADD CONSTRAINT fk_workerxmatch_sportMatch FOREIGN KEY
(idSportMatch) REFERENCES SportMatch(idSportMatch);


--By: David Salazar Rodriguez
--Date: 26/Dic/2022 08:17 p.m
-----------------People Tables-----------------------
ALTER TABLE Phone
ADD CONSTRAINT fk_phone_person FOREIGN KEY
(idPerson) REFERENCES Person(idPerson);

ALTER TABLE Email
ADD CONSTRAINT fk_email_person FOREIGN KEY
(idPerson) REFERENCES Person(idPerson);

ALTER TABLE Identification
ADD CONSTRAINT fk_id_person FOREIGN KEY
(idPerson) REFERENCES Person(idPerson);

ALTER TABLE Identification
ADD CONSTRAINT fk_id_idIdentificationType FOREIGN KEY
(idType) REFERENCES identificationType(idIdentificationType);

ALTER TABLE person
ADD CONSTRAINT fk_person_Gender FOREIGN KEY
(idGender) REFERENCES Gender(idGender);

ALTER TABLE person
ADD CONSTRAINT fk_person_Adress FOREIGN KEY
(idAddress) REFERENCES Address(idAddress);

ALTER TABLE Person
ADD CONSTRAINT fk_Person_Event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

ALTER TABLE Person
ADD CONSTRAINT fk_Person_UserPerson FOREIGN KEY
(idUser) REFERENCES UserPerson(idUser);
-----------------------------------------------------
-------------------User Tables-----------------------
ALTER TABLE userPerson
ADD CONSTRAINT fk_user_userType FOREIGN KEY
(idUserType) REFERENCES userType(idUserType);
-----------------------------------------------------
----------------User/News Relations------------------
ALTER TABLE userLog
ADD CONSTRAINT fk_log_News FOREIGN KEY
(idNews) REFERENCES News(idNews);

ALTER TABLE userLog
ADD CONSTRAINT fk_log_User FOREIGN KEY
(idUser) REFERENCES userPerson(idUser);

ALTER TABLE userComment
ADD CONSTRAINT fk_comment_news FOREIGN KEY
(idNews) REFERENCES News(idNews);

ALTER TABLE userComment
ADD CONSTRAINT fk_comment_User FOREIGN KEY
(idUser) REFERENCES userPerson(idUser);

ALTER TABLE userReview
ADD CONSTRAINT fk_review_news FOREIGN KEY
(idNews) REFERENCES News(idNews);

ALTER TABLE userReview
ADD CONSTRAINT fk_review_User FOREIGN KEY
(idUser) REFERENCES userPerson(idUser);

ALTER TABLE userSave
ADD CONSTRAINT fk_save_news FOREIGN KEY
(idNews) REFERENCES News(idNews);

ALTER TABLE userSave
ADD CONSTRAINT fk_save_User FOREIGN KEY
(idUser) REFERENCES userPerson(idUser);
-----------------------------------------------------
---------------------News Table----------------------
ALTER TABLE news
ADD CONSTRAINT fk_news_User FOREIGN KEY
(idUser) REFERENCES userPerson(idUser);

ALTER TABLE news
ADD CONSTRAINT fk_news_Event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

