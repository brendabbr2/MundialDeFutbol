--By: Rodolfo Acuña López
---------------Gender------------------
------- GenderCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertGender
BEFORE INSERT ON proj.Gender
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertGender;

------- GenderModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateGender
BEFORE UPDATE ON proj.Gender 
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateGender;

---------------Worker------------------
------- WorkerCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertWorker
BEFORE INSERT ON proj.Worker
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertWorker;

------- WorkerModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateWorker
BEFORE UPDATE ON proj.Worker 
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateWorker;

---------------WorkerType------------------
------- WorkerTypeCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertWorkerType
BEFORE INSERT ON proj.WorkerType
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertWorkerType;

------- WorkerTypeModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateWorkerType
BEFORE UPDATE ON proj.WorkerType 
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateWorkerType;

---------------PlayerPosition------------------
------- PlayerPositionCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertPlayerPosition
BEFORE INSERT ON proj.PlayerPosition
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertPlayerPosition;

------- PlayerPositionModification
CREATE OR REPLACE TRIGGER proj.beforeUpdatePlayerPosition
BEFORE UPDATE ON proj.PlayerPosition 
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdatePlayerPosition;

---------------PlayerXSportMatch------------------
------- PlayerXSportMatchCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertPlayerXSportMatch
BEFORE INSERT ON proj.PlayerXSportMatch
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertPlayerXSportMatch;

------- PlayerXSportMatchModification
CREATE OR REPLACE TRIGGER proj.beforeUpdatePlayerXSportMatch
BEFORE UPDATE ON proj.PlayerXSportMatch 
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdatePlayerXSportMatch;

---------------PlayerXCountry------------------
------- PlayerXCountryCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertPlayerXCountry
BEFORE INSERT ON proj.PlayerXCountry
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertPlayerXCountry;

------- PlayerXCountryModification
CREATE OR REPLACE TRIGGER proj.beforeUpdatePlayerXCountry
BEFORE UPDATE ON proj.PlayerXCountry 
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdatePlayerXCountry;

---------------WorkerXSportMatch------------------
------- WorkerXSportMatchCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertWorkerXSportMatch
BEFORE INSERT ON proj.WorkerXSportMatch
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertWorkerXSportMatch;

------- WorkerXSportMatchModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateWorkerXSportMatch
BEFORE UPDATE ON proj.WorkerXSportMatch 
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateWorkerXSportMatch;
