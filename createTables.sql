--Tables created: Event, EventType, GroupEvent, Helper, HelperType, ParameterEvent, Player, Team
--By: Brenda Badilla Rodriguez
--Date: 12/Dic/2022 11:46 p.m
--Annotation: PKs and FKs will be added on a separate file

CREATE TABLE Event( 
    idEvent NUMBER(6),
    nombre VARCHAR2(20),
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE EventType(
    idEventType NUMBER(6),
    nameEventType VARCHAR(50),
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE ParameterEvent( 
    idParameter NUMBER(6),
    nameParameter VARCHAR2(20),
    valuesParameter NUMBER(6),
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE GroupEvent( 
    idGroup NUMBER(6),
    idEvent NUMBER(6),
    nameGroup VARCHAR2(20),
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE Team( 
    idTeam NUMBER(6),
    idGroup NUMBER(6),
    idCountry NUMBER(6),
    captainNumber NUMBER(6),
    logoPhoto BLOB,
    lineup NUMBER(6),
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE Helper( 
    idHelper NUMBER(6),
    idTeam NUMBER(6),
    idHelperType NUMBER(6),
    hireDate DATE,
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE HelperType( 
    idHelperType NUMBER(6),
    nameHelperType VARCHAR(20),
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

CREATE TABLE Player( 
    idPlayer NUMBER(6),
    idTeam NUMBER(6),
    idPosition NUMBER(6),
    numberPlayer NUMBER(6),
    creationUser VARCHAR(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);
