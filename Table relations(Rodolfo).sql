--------KEYS FOR TABLE Worker---------
ALTER TABLE Gender
ADD CONSTRAINT pk_gender PRIMARY KEY (idGender)
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------KEYS FOR TABLE Pos---------
ALTER TABLE Pos
ADD CONSTRAINT pk_pos PRIMARY KEY (idPosition)
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------KEYS FOR TABLE Worker---------
ALTER TABLE Worker
ADD CONSTRAINT pk_worker PRIMARY KEY (idWorker)
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE Worker
ADD CONSTRAINT fk_worker_workertype FOREIGN KEY
(idWorkerType) REFERENCES WorkerType(idWorkerType);

--------KEYS FOR TABLE Worker---------
ALTER TABLE WorkerType
ADD CONSTRAINT pk_workertype PRIMARY KEY (idWorkerType)
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--***************THESE KEYS ARE FOR TABLES OF THE RELATIONS********************
ALTER TABLE PlayerXMatch
ADD CONSTRAINT pk_player_match PRIMARY KEY (idPlayer, idMatch) 
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE PlayerXMatch
ADD CONSTRAINT fk_player_playerxmatch FOREIGN KEY
(idPlayer) REFERENCES Player(idPlayer);

ALTER TABLE PlayerXMatch
ADD CONSTRAINT fk_match_playerxmatch FOREIGN KEY
(idMatch) REFERENCES Match(idMatch);--CORREGIR

-----------------------------------------------------------------------
ALTER TABLE PlayerXCountry
ADD CONSTRAINT pk_player_country PRIMARY KEY (idPlayer, idCountry) 
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE PlayerXCountry
ADD CONSTRAINT fk_player_PlayerXCountry FOREIGN KEY
(idPlayer) REFERENCES Player(idPlayer);

ALTER TABLE PlayerXCountry
ADD CONSTRAINT fk_country_playerxcountry FOREIGN KEY
(idCountry) REFERENCES Country(idCountry);

-----------------------------------------------------------------------
ALTER TABLE WorkerXMatch
ADD CONSTRAINT pk_worker_match PRIMARY KEY (idWorker, idMatch) 
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE WorkerXMatch
ADD CONSTRAINT fk_worker_workerxmatch FOREIGN KEY
(idWorker) REFERENCES Worker(idWorker);

ALTER TABLE WorkerXMatch
ADD CONSTRAINT fk_worker_workerxmatch FOREIGN KEY
(idMatch) REFERENCES Match(idMatch); --CORREGIR