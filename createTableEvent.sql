--Creation of table EVENT
--No FK assigned yet for EventType

CREATE TABLE EVENT( 
    idEvent NUMBER(6),
    nombre VARCHAR2(20),
    creationUser VARCHAR2(20),
    creationDate DATE,
    modificationUser VARCHAR2(20),
    modificationDate DATE
);

ALTER TABLE EVENT 
ADD CONSTRAINT pk_idEvent PRIMARY KEY (idEvent)
USING INDEX
TABLESPACE proj_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);