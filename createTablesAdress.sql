--Tables created: Continent, Country, Province, District, Address, Stadium, SportMatch, StadiumXSportMatch
--By: Joxan Andrey Fuertes Villegas
--Date: 23/Dic/2022 1:22 a.m

-- creation of tables

-- continent
CREATE TABLE Continent
( 
    idContinent NUMBER(6),
    nameContinent VARCHAR2(20) NOT NULL,
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- country
CREATE TABLE Country
( 
    idCountry NUMBER(6),
    idContinent NUMBER(6),
    nameCountry VARCHAR2(20) NOT NULL,
    demonym VARCHAR2(20) NOT NULL,
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- province
CREATE TABLE Province
( 
    idProvince NUMBER(6),
    idCountry NUMBER(6),
    nameProvince VARCHAR2(20) NOT NULL,
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- district
CREATE TABLE District
( 
    idDistrict NUMBER(6),
    idProvince NUMBER(6),
    nameDistrict VARCHAR2(20) NOT NULL,
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- address
CREATE TABLE Address
( 
    idAddress NUMBER(6),
    idDistrict NUMBER(6),
    nameAddress VARCHAR2(20) NOT NULL,
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- stadium
CREATE TABLE Stadium
( 
    idStadium NUMBER(6),
    idAddress NUMBER(6),
    nameStadium VARCHAR2(20) NOT NULL,
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- stadiumXsportMatch
CREATE TABLE StadiumXSportMatch
( 
    idStadium NUMBER(6),
    idSportMatch NUMBER(6),
    dateStadiumXSportMatch DATE NOT NULL,
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- sportMatch
CREATE TABLE SportMatch
( 
    idSportMatch NUMBER(6),
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

-- creation of address tables completed

-- creation of primary and foreign keys

-- continent
ALTER TABLE Continent 
ADD CONSTRAINT pk_Continent PRIMARY KEY (idContinent)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

-- country
ALTER TABLE Country
ADD CONSTRAINT pk_Country PRIMARY KEY (idCountry)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
 
ALTER TABLE Country
ADD CONSTRAINT fk_Country_Continent FOREIGN KEY
(idContinent) REFERENCES Continent(idContinent);

-- province
ALTER TABLE Province
ADD CONSTRAINT pk_Province PRIMARY KEY (idProvince)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
 
ALTER TABLE Province
ADD CONSTRAINT fk_Province_Country FOREIGN KEY
(idCountry) REFERENCES Country(idCountry);

-- district
ALTER TABLE District
ADD CONSTRAINT pk_District PRIMARY KEY (idDistrict)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
 
ALTER TABLE District
ADD CONSTRAINT fk_District_Province FOREIGN KEY
(idProvince) REFERENCES Province(idProvince);

-- address
ALTER TABLE Address
ADD CONSTRAINT pk_Address PRIMARY KEY (idAddress)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
 
ALTER TABLE Address
ADD CONSTRAINT fk_Address_District FOREIGN KEY
(idDistrict) REFERENCES District(idDistrict);

-- stadium
ALTER TABLE Stadium
ADD CONSTRAINT pk_Stadium PRIMARY KEY (idStadium)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
 
ALTER TABLE Stadium
ADD CONSTRAINT fk_Stadium_Address FOREIGN KEY
(idAddress) REFERENCES Address(idAddress);

-- sportMatch
ALTER TABLE SportMatch
ADD CONSTRAINT pk_SportMatch PRIMARY KEY (idSportMatch)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

-- stadiumXsportMatch
ALTER TABLE StadiumXSportMatch
ADD CONSTRAINT pk_StadiumXSportMatch PRIMARY KEY (idStadium,idSportMatch)
USING INDEX
TABLESPACE proj_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
 
ALTER TABLE StadiumXSportMatch
ADD CONSTRAINT fk_StadiumXSportMatch_Stadium FOREIGN KEY
(idStadium) REFERENCES Stadium(idStadium);

ALTER TABLE StadiumXSportMatch
ADD CONSTRAINT fk_StadiumXSportMatch_SpMatch FOREIGN KEY
(idSportMatch) REFERENCES SportMatch(idSportMatch);
 