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
ADD CONSTRAINT pk_Position PRIMARY KEY (idPosition)
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
ALTER TABLE WorkerXMatch
ADD CONSTRAINT pk_worker_match PRIMARY KEY (idWorker, idMatch) 
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-----------------------------------------------------
----------------Player/Match Relation----------------
ALTER TABLE PlayerXMatch
ADD CONSTRAINT pk_player_match PRIMARY KEY (idPlayer, idMatch) 
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
ADD CONSTRAINT pk_IdType PRIMARY KEY (idType) 
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
(idPosition) REFERENCES PlayerPosition(idPosition);

ALTER TABLE Team
ADD CONSTRAINT fk_team_group FOREIGN KEY
(idGroup) REFERENCES GroupEvent(idGroup);

ALTER TABLE Team
ADD CONSTRAINT fk_team_country FOREIGN KEY
(idCountry) REFERENCES Country(idCountry);
