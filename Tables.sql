---Tables Created: Gender,Phone,Email,Identification,identificationType,person,
---                userType,personUser,userLog,userComment,userReview,userSave,News
---By: David Salazar Rodriguez
---Date: 22/12/2022 4:23 PM

--------People Tables-----------------
CREATE TABLE Gender(
    --------------PK------------------
    idGender number(6),
    genderDescription varchar2(50),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE Phone(
    --------------PK------------------
    phone number(8),
    --------------FK------------------
    idPerson number(6),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
)

CREATE TABLE Email(
    --------------PK------------------
    idEmail number(6),
    --------------FK------------------
    idPerson number(6),
    ----------------------------------
    mail varchar2(200),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
)

CREATE TABLE Identification(
    --------------PK------------------
    id number(6),
    --------------FK------------------
    idPerson number(6),
    idType number(6),
    ----------------------------------
    value number(10),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
)

CREATE TABLE identificationType(
    --------------PK------------------
    idType number(6),
    --------------------------------
    idName varchar2(50),
    idMask number(10),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE person(
    --------------PK------------------
    idPerson number(6),
    --------------FK------------------
    idGender number(6),
    idAdress number(6),
    ----------------------------------
    birthday date,
    name varchar2(20),
    photo int,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);
-----------------------------------------------------
-------------------User Tables-----------------------

CREATE TABLE userType(
    --------------PK------------------
    idUsertype number(6),
    ----------------------------------
    name varchar(50),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
    
    
);
CREATE TABLE personUser(
    --------------PK------------------
    idUser number(6),
    --------------FK------------------
    idUserType number(6),
    ----------------------------------
    username varchar2(50),
    password varchar2(50),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);
-----------------------------------------------------
-------------------User/News Relations---------------
CREATE TABLE userLog(
    --------------PK------------------
    idLog number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    ----------------------------------
    logDate date,
    text varchar2(200),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE userComment(
    --------------PK------------------
    idComment number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    ----------------------------------
    CommentDate date,
    text varchar2(200),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE userReview(
    --------------PK------------------
    idReview number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    ----------------------------------
    score number(5),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

CREATE TABLE userSave(
    --------------PK------------------
    idSave number(6),
    --------------FK------------------
    idNews number(6),
    idUser number(6),
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);
-------------------News---------------
CREATE TABLE News(
    --------------PK------------------
    idNews number(6),
    --------------FK------------------
    idUser number(6),
    ----------------------------------
    title varchar(2), 
    text varchar2(200),
    author varchar2(50),
    newsDate date,
    photo int,
    --------------Audit---------------
    creationUser varchar(20),
    creationDate date,
    modificationUser varchar2(20),
    modificationDate date
);

