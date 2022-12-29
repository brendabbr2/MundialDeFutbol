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




