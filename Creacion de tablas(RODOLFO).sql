CREATE TABLE Gender(
    idGender NUMBER(6),
    descriptionGender VARCHAR2(100),
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);

CREATE TABLE Worker(
    idWorker NUMBER(6),
    idWorkerType NUMBER(6),
    hireDate DATE,
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);

CREATE TABLE WorkerType(
    idWorkerType NUMBER(6),
    nameWorkerType VARCHAR2(20),
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);

CREATE TABLE Pos(
    idPosition NUMBER(6),
    descriptionPos VARCHAR2(100),
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);

CREATE TABLE PlayerXMatch(
    idWorker NUMBER(6),
    idMatch NUMBER(6),
    yellow_card INTEGER,
    red_card INTEGER,
    savers INTEGER,
    offside INTEGER,
    expulsion INTEGER,
    goals INTEGER,
    corners INTEGER,
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);

CREATE TABLE PlayerXCountry (
    idPlayer NUMBER(6),
    idCountry NUMBER(6),
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);

CREATE TABLE WorkerXMatch (
    idWorker NUMBER(6),
    idMatch NUMBER(6),
    creationUser VARCHAR2(50),
    creationDate DATE,
    modificationUser VARCHAR2(50),
    modificationDate DATE
);