--By: Rodolfo Acuña López
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
