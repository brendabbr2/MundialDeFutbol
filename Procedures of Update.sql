-----------------------------------------------------
--By: Joxan Andrey Fuertes Villegas
--Date: 29/Dic/2022 11:13 a.m

-- Update Continent
CREATE OR REPLACE PROCEDURE updateContinent 
    (VidContinent IN NUMBER, VnameContinent IN VARCHAR2)
    AS BEGIN
        UPDATE Continent
        SET nameContinent = NVL(VnameContinent, nameContinent)
        WHERE idContinent = VidContinent;
    --COMMIT; 
END updateContinent;

-- Update Country
CREATE OR REPLACE PROCEDURE updateCountry
    (VidCountry IN NUMBER, VnameCountry IN VARCHAR2, Vdemonym IN VARCHAR2)
    AS BEGIN
        UPDATE Country
        SET nameCountry = NVL(VnameCountry, nameCountry),
        demonym = NVL(Vdemonym, demonym)
        WHERE idCountry = VidCountry;
    --COMMIT; 
END updateCountry;

-- Update Province
CREATE OR REPLACE PROCEDURE updateProvince
    (VidProvince IN NUMBER, VnameProvince IN VARCHAR2)
    AS BEGIN
        UPDATE Province
        SET nameProvince = NVL(VnameProvince, nameProvince)
        WHERE idProvince = VidProvince;
    --COMMIT; 
END updateProvince;

-- Update District
CREATE OR REPLACE PROCEDURE updateDistrict
    (VidDistrict IN NUMBER, VnameDistrict IN VARCHAR2)
    AS BEGIN
        UPDATE District
        SET nameDistrict = NVL(VnameDistrict, nameDistrict)
        WHERE idDistrict = VidDistrict;
    --COMMIT; 
END updateDistrict;

-- Update Address
CREATE OR REPLACE PROCEDURE updateAddress
    (VidAddress IN NUMBER, VnameAddress IN VARCHAR2)
    AS BEGIN
        UPDATE Address
        SET nameAddress = NVL(VnameAddress, nameAddress)
        WHERE idAddress = VidAddress;
    --COMMIT; 
END updateAddress;

-- Update Stadium
CREATE OR REPLACE PROCEDURE updateStadium
    (VidStadium IN NUMBER, VnameStadium IN VARCHAR2)
    AS BEGIN
        UPDATE Stadium
        SET nameStadium = NVL(VnameStadium, nameStadium)
        WHERE idStadium = VidStadium;
    --COMMIT; 
END updateStadium;

-- SportMatch no tiene atributos editables

-- Update StadiumXSportMatch
CREATE OR REPLACE PROCEDURE updateStadiumXSportMatch
    (VidStadium IN NUMBER, VidSportMatch IN NUMBER, VdateStadiumXSportMatch IN DATE)
    AS BEGIN
        UPDATE StadiumXSportMatch
        SET dateStadiumXSportMatch = NVL(VdateStadiumXSportMatch, dateStadiumXSportMatch)
        WHERE idStadium = VidStadium AND idSportMatch = VidSportMatch;
    --COMMIT; 
END updateStadiumXSportMatch;

-------------------------------------------------------------------------------------------------
-- By: Rodolfo Acuña Lopez

-- Update Gender
CREATE OR REPLACE PROCEDURE updateGender 
    (V_idGender IN NUMBER, V_descriptionGender IN VARCHAR2)
    AS BEGIN
        UPDATE Gender
        SET descriptionGender = NVL(V_descriptionGender, descriptionGender)
        WHERE idGender = V_idGender;
    --COMMIT; 
END updateGender;

-- Update Worker
CREATE OR REPLACE PROCEDURE updateWorker 
    (V_idWorker IN NUMBER, V_hireDate IN DATE)
    AS BEGIN
        UPDATE Worker
        SET hireDate = NVL(V_hireDate, hireDate)
        WHERE idWorker = V_idWorker;
    --COMMIT; 
END updateWorker;

-- Update WorkerType
CREATE OR REPLACE PROCEDURE updateWorkerType 
    (V_idWorkerType IN NUMBER, V_nameWorkerType IN VARCHAR2)
    AS BEGIN
        UPDATE WorkerType
        SET nameWorkerType = NVL(V_nameWorkerType, nameWorkerType)
        WHERE idWorkerType = V_idWorkerType;
    --COMMIT; 
END updateWorkerType;

-- Update PlayerPosition
CREATE OR REPLACE PROCEDURE updatePlayerPosition 
    (V_idPosition IN NUMBER, V_descriptionPos IN VARCHAR2)
    AS BEGIN
        UPDATE PlayerPosition
        SET descriptionPos = NVL(V_descriptionPos, descriptionPos)
        WHERE idPosition = V_idPosition;
    --COMMIT; 
END updatePlayerPosition;

-- Update PlayerXSportMatch
CREATE OR REPLACE PROCEDURE updatePlayerXSportMatch 
    (v_idPlayer IN NUMBER, v_idSportMatch IN NUMBER, 
    v_yellow_card IN INTEGER, v_red_card IN INTEGER, 
    v_savers IN INTEGER, v_offside IN INTEGER,
    v_expulsion IN INTEGER, v_goals IN INTEGER, 
    v_corners IN INTEGER)
    AS BEGIN
        UPDATE PlayerXSportMatch
        SET yellow_card = NVL(V_yellow_card, yellow_card),
            red_card = NVL(V_red_card, red_card),
            savers = NVL(V_savers, savers),
            offside = NVL(V_offside, offside),
            expulsion = NVL(V_expulsion, expulsion),
            goals = NVL(V_goals, goals),
            corners = NVL(V_corners, corners)
        WHERE idPlayer = v_idPlayer 
        AND idSportMatch = v_idsportmatch;
    --COMMIT;
END updatePlayerXSportMatch;

--------------------------------------------------------------------------------------------
