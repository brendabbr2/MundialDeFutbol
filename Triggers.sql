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

-----------------------------------------------------
--By: Joxan Andrey Fuertes Villegas
--Date: 28/Dic/2022 14:10 p.m

---------------Continent------------------
------- ContinentCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertContinent
BEFORE INSERT ON proj.Continent
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertContinent;

------- ContinentModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateContinent
BEFORE UPDATE ON proj.Continent
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateContinent;

---------------Country------------------
------- CountryCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertCountry
BEFORE INSERT ON proj.Country
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertCountry;

------- CountryModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateCountry
BEFORE UPDATE ON proj.Country
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateCountry;

---------------Province------------------
------- ProvinceCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertProvince
BEFORE INSERT ON proj.Province
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertProvince;

------- ProvinceModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateProvince
BEFORE UPDATE ON proj.Province
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateProvince;

---------------District------------------
------- DistrictCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertDistrict
BEFORE INSERT ON proj.District
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertDistrict;

------- DistrictModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateDistrict
BEFORE UPDATE ON proj.District
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateDistrict;

---------------Address------------------
------- AddressCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertAddress
BEFORE INSERT ON proj.Address
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertAddress;

------- AddressModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateAddress
BEFORE UPDATE ON proj.Address
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateAddress;

---------------Stadium------------------
------- StadiumCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertStadium
BEFORE INSERT ON proj.Stadium
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertStadium;

------- StadiumModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateStadium
BEFORE UPDATE ON proj.Stadium
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateStadium;

---------------SportMatch------------------
------- SportMatchCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertSportMatch
BEFORE INSERT ON proj.SportMatch
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertSportMatch;

------- SportMatchModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateSportMatch
BEFORE UPDATE ON proj.SportMatch
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateSportMatch;

---------------StadiumXSportMatch------------------
------- StadiumXSportMatchCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertStadiumXSportMatch
BEFORE INSERT ON proj.StadiumXSportMatch
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertStadiumXSportMatch;

------- StadiumXSportMatchModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateStadiumXSportMatch
BEFORE UPDATE ON proj.StadiumXSportMatch
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateStadiumXSportMatch;
   