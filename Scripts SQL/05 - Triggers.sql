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

---------------Demonym------------------
------- DemonymCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertDemonym
BEFORE INSERT ON proj.Demonym
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertDemonym;

------- DemonymModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateDemonym
BEFORE UPDATE ON proj.Demonym
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateDemonym;

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

---------------Canton------------------
------- CantonCreation
CREATE OR REPLACE TRIGGER proj.beforeInsertCanton
BEFORE INSERT ON proj.Canton
FOR EACH ROW 
BEGIN
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertCanton;

------- CantonModification
CREATE OR REPLACE TRIGGER proj.beforeUpdateCanton
BEFORE UPDATE ON proj.Canton
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateCanton;

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

--By: David Salazar Rodriguez
---------------Phone------------------
------- Phone Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertPhone
BEFORE INSERT ON proj.Phone
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertPhone;

------- Phone Update
CREATE OR REPLACE TRIGGER proj.beforeUpdatePhone
BEFORE UPDATE ON proj.Phone
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdatePhone;

---------------Email------------------
------- Email Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertEmail
BEFORE INSERT ON proj.Email
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertEmail;

------- Email Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateEmail
BEFORE UPDATE ON proj.Email
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateEmail;

---------------Identification------------------
------- Identification Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertIdentification
BEFORE INSERT ON proj.Identification
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertIdentification;

------- Identification Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateIdentification
BEFORE UPDATE ON proj.Identification
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateIdentification;

---------------IdentificationType------------------
------- IdentificationType Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertIdentificationType
BEFORE INSERT ON proj.IdentificationType
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE;  
END beforeInsertIdentificationType;

------- identificationType Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateidentificationType
BEFORE UPDATE ON proj.identificationType
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateidentificationType;

---------------Person------------------
------- Person Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertPerson
BEFORE INSERT ON proj.Person
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertPerson;

------- Person Update
CREATE OR REPLACE TRIGGER proj.beforeUpdatePerson
BEFORE UPDATE ON proj.Person
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdatePerson;

---------------UserType------------------
------- UserType Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertUserType
BEFORE INSERT ON proj.UserType
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertUserType;

------- UserType Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateUserType
BEFORE UPDATE ON proj.UserType
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateUserType;

---------------UserPerson------------------
------- UserPerson Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertUserPerson
BEFORE INSERT ON proj.UserPerson
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertUserPerson;

------- UserPerson Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateUserPerson
BEFORE UPDATE ON proj.UserPerson
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateUserPerson;

---------------UserLog------------------
------- UserLog Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertUserLog
BEFORE INSERT ON proj.UserLog
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE;  
END beforeInsertUserLog;

------- UserLog Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateUserLog
BEFORE UPDATE ON proj.UserLog
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateUserLog;

---------------UserComment------------------
------- UserComment Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertUserComment
BEFORE INSERT ON proj.UserComment
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertUserComment;

------- UserComment Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateUserComment
BEFORE UPDATE ON proj.UserComment
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateUserComment;

---------------UserReview------------------
------- UserReview Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertUserReview
BEFORE INSERT ON proj.UserReview
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertUserReview;

------- UserReview Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateUserReview
BEFORE UPDATE ON proj.UserReview
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateUserReview;

---------------UserSave------------------
------- UserSave Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertUserSave
BEFORE INSERT ON proj.UserSave
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertUserSave;

------- UserSave Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateUserSave
BEFORE UPDATE ON proj.UserSave
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateUserSave;

---------------News------------------
------- News Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertNews
BEFORE INSERT ON proj.News
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertNews;

------- News Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateNews
BEFORE UPDATE ON proj.News
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateNews;

---------------Lineup------------------
------- Lineup Creation
CREATE OR REPLACE TRIGGER proj.beforeInsertLineup
BEFORE INSERT ON proj.Lineup
FOR EACH ROW 
BEGIN 
:new.creationUser:=USER; :new.creationDate:=SYSDATE; 
END beforeInsertLineup;

------- Lineup Update
CREATE OR REPLACE TRIGGER proj.beforeUpdateLineup
BEFORE UPDATE ON proj.Lineup
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeUpdateLineup;


--By: Brenda Badilla Rodriguez
--Date: 31/Dec/2022 9:00 a.m
--Event, EventType, GroupEvent, Helper, HelperType, ParameterEvent, Player, Team
CREATE OR REPLACE TRIGGER proj.beforeInsertEventType
BEFORE INSERT ON proj.EventType
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertEventType;

CREATE OR REPLACE TRIGGER proj.beforeInsertEvent
BEFORE INSERT ON proj.Event
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertEvent;

CREATE OR REPLACE TRIGGER proj.beforeInsertGroupEvent
BEFORE INSERT ON proj.GroupEvent
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertGroupEvent;

CREATE OR REPLACE TRIGGER proj.beforeInsertHelper
BEFORE INSERT ON proj.Helper
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertHelper;

CREATE OR REPLACE TRIGGER proj.beforeInsertHelperType
BEFORE INSERT ON proj.HelperType
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertHelperType;

CREATE OR REPLACE TRIGGER proj.beforeInsertParameterEvent
BEFORE INSERT ON proj.ParameterEvent
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertParameterEvent;

CREATE OR REPLACE TRIGGER proj.beforeInsertPlayer
BEFORE INSERT ON proj.Player
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertPlayer;

CREATE OR REPLACE TRIGGER proj.beforeInsertTeam
BEFORE INSERT ON proj.Team
FOR EACH ROW 
BEGIN 
:new.modificationUser:=USER; :new.modificationDate:=SYSDATE; 
END beforeInsertTeam;
