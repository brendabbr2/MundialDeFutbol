-----------------------------------------------------
--By: Joxan Andrey Fuertes Villegas
--Date: 29/Dic/2022 11:13 a.m

-- Update Continent
CREATE OR REPLACE PROCEDURE updateContinent 
    (VidContinent IN NUMBER,v_idEvent IN NUMBER, VnameContinent IN VARCHAR2)
    AS BEGIN
        UPDATE Continent
        SET nameContinent = NVL(VnameContinent, nameContinent), 
        idEvent = NVL(v_idEvent, idEvent)
        WHERE idContinent = VidContinent;
    COMMIT; 
END updateContinent;

-- Update Country
CREATE OR REPLACE PROCEDURE updateCountry
    (VidCountry IN NUMBER, VnameCountry IN VARCHAR2, V_idDemonym IN NUMBER, VidContinent IN NUMBER)
    AS BEGIN
        UPDATE Country
        SET nameCountry = NVL(VnameCountry, nameCountry),
        idDemonym = NVL(V_idDemonym, idDemonym),
        idContinent = NVL(VidContinent, idContinent)
        WHERE idCountry = VidCountry;
    COMMIT; 
END updateCountry;

-- Update Province
CREATE OR REPLACE PROCEDURE updateProvince
    (VidProvince IN NUMBER, VnameProvince IN VARCHAR2, VidCountry IN NUMBER)
    AS BEGIN
        UPDATE Province
        SET nameProvince = NVL(VnameProvince, nameProvince),
        idCountry = NVL(VidCountry, idCountry)
        WHERE idProvince = VidProvince;
    COMMIT; 
END updateProvince;

-- Update Canton
CREATE OR REPLACE PROCEDURE updateCanton
    (VidCanton IN NUMBER, VnameCanton IN VARCHAR2, VidProvince IN NUMBER)
    AS BEGIN
        UPDATE Canton
        SET nameCanton = NVL(VnameCanton, nameCanton),
        idProvince = VidProvince
        WHERE idCanton = VidCanton;
    COMMIT; 
END updateCanton;

-- Update District
CREATE OR REPLACE PROCEDURE updateDistrict
    (VidDistrict IN NUMBER, VnameDistrict IN VARCHAR2, VidCanton IN NUMBER)
    AS BEGIN
        UPDATE District
        SET nameDistrict = NVL(VnameDistrict, nameDistrict),
        idCanton = NVL(VidCanton, idCanton)
        WHERE idDistrict = VidDistrict;
    COMMIT; 
END updateDistrict;

-- Update Address
CREATE OR REPLACE PROCEDURE updateAddress
    (VidAddress IN NUMBER, VnameAddress IN VARCHAR2, VidDistrict IN NUMBER)
    AS BEGIN
        UPDATE Address
        SET nameAddress = NVL(VnameAddress, nameAddress),
        idDistrict = NVL(VidDistrict, idDistrict)
        WHERE idAddress = VidAddress;
    COMMIT; 
END updateAddress;

-- Update Stadium
CREATE OR REPLACE PROCEDURE updateStadium
    (VidStadium IN NUMBER, VnameStadium IN VARCHAR2, VidAddress IN NUMBER, v_idEvent IN NUMBER)
    AS BEGIN
        UPDATE Stadium
        SET nameStadium = NVL(VnameStadium, nameStadium),
        idAddress = NVL(VidAddress, idAddress),
        idEvent = NVL(v_idEvent ,idEvent)
        WHERE idStadium = VidStadium;
    COMMIT; 
END updateStadium;

-- SportMatch no tiene atributos editables

-- Update StadiumXSportMatch
CREATE OR REPLACE PROCEDURE updateStadiumXSportMatch
    (VidStadium IN NUMBER, VidSportMatch IN NUMBER, VdateStadiumXSportMatch IN DATE)
    AS BEGIN
        UPDATE StadiumXSportMatch
        SET dateStadiumXSportMatch = NVL(VdateStadiumXSportMatch, dateStadiumXSportMatch)
        WHERE idStadium = VidStadium AND idSportMatch = VidSportMatch;
    COMMIT; 
END updateStadiumXSportMatch;

-------------------------------------------------------------------------------------------------
-- By: Rodolfo Acuña Lopez

-- Update Gender
CREATE OR REPLACE PROCEDURE updateGender 
    (V_idGender IN NUMBER, V_descriptionGender IN VARCHAR2)
    AS BEGIN
        UPDATE Gender
        SET genderDescription = NVL(V_descriptionGender, genderDescription)
        WHERE idGender = V_idGender;
    COMMIT; 
END updateGender;

-- Update Worker
CREATE OR REPLACE PROCEDURE updateWorker 
    (V_idWorker IN NUMBER, V_hireDate IN DATE)
    AS BEGIN
        UPDATE Worker
        SET hireDate = NVL(V_hireDate, hireDate)
        WHERE idWorker = V_idWorker;
    COMMIT; 
END updateWorker;

-- Update WorkerType
CREATE OR REPLACE PROCEDURE updateWorkerType 
    (V_idWorkerType IN NUMBER, V_nameWorkerType IN VARCHAR2)
    AS BEGIN
        UPDATE WorkerType
        SET nameWorkerType = NVL(V_nameWorkerType, nameWorkerType)
        WHERE idWorkerType = V_idWorkerType;
    COMMIT; 
END updateWorkerType;

-- Update PlayerPosition
CREATE OR REPLACE PROCEDURE updatePlayerPosition 
    (V_idPlayerPosition IN NUMBER, V_playerPositionName IN VARCHAR2)
    AS BEGIN
        UPDATE PlayerPosition
        SET playerPositionName = NVL(V_playerPositionName, playerPositionName)
        WHERE idPlayerPosition = V_idPlayerPosition;
    COMMIT; 
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
    COMMIT;
END updatePlayerXSportMatch;
--------------------------------------------------------------------------------------------
--By: David Salazar Rodriguez
--Date: 29/Dic/2022 5:45 a.m

CREATE OR REPLACE PROCEDURE updatePhone
    (V_oldPhone IN NUMBER, V_newPhone IN NUMBER)
    AS BEGIN
        UPDATE Phone
        SET phone = NVL(V_newPhone, phone)
        WHERE phone = V_oldPhone;
    COMMIT; 
END updatePhone;

CREATE OR REPLACE PROCEDURE updateEmail
    (V_oldEmail IN NUMBER, V_newEmail IN NUMBER)
    AS BEGIN
        UPDATE Email
        SET mail = NVL(V_newEmail, mail)
        WHERE mail = V_oldEmail;
    COMMIT; 
END updateEmail;

CREATE OR REPLACE PROCEDURE updateIdentification
    (V_oldIdentification IN NUMBER, V_newIdentification IN NUMBER)
    AS BEGIN
        UPDATE Identification
        SET valueIdentification = NVL(V_newIdentification, valueIdentification)
        WHERE valueIdentification = V_oldIdentification;
    COMMIT; 
END updateIdentification;

CREATE OR REPLACE PROCEDURE updateIdentificationType
    (V_idType IN NUMBER, V_idName IN VARCHAR2, V_idMask IN NUMBER)
    AS BEGIN
        UPDATE identificationType
        SET idName = NVL(V_idName , idName),
        idMask = NVL(V_idMask , idMask)
        WHERE idIdentificationType = V_idType;
    COMMIT; 
END updateIdentificationType;

CREATE OR REPLACE PROCEDURE updatePerson
    (V_idPerson IN NUMBER, V_idGender IN NUMBER, V_idAddress IN NUMBER, v_idEvent IN NUMBER, 
        v_idUser IN NUMBER, V_BirthDate IN Date, V_personName IN VARCHAR2, V_Photo IN VARCHAR2)
    AS BEGIN
        UPDATE person
        SET idGender = NVL(V_idGender, idGender),
        idAddress = NVL(V_idAddress, idAddress),
        idEvent = NVL(v_idEvent, idEvent),
        idUser = NVL(v_idUser, idUser),
        birthday = NVL(V_BirthDate, birthday),
        personName = NVL(V_personName, personName),
        photo = NVL(V_Photo, photo)
        WHERE idPerson = V_idPerson;
    COMMIT; 
END updatePerson;

CREATE OR REPLACE PROCEDURE updateUserType
    (V_idUserType IN NUMBER, V_nameUserType IN NUMBER)
    AS BEGIN
        UPDATE userType
        SET nameUserType = NVL(V_nameUserType, nameUserType)
        WHERE idUserType = V_idUserType;
    COMMIT; 
END updateUserType;

CREATE OR REPLACE PROCEDURE updateUserPerson
    (V_idUser IN NUMBER, V_idUserType IN NUMBER, V_username IN VARCHAR2, V_password VARCHAR2)
    AS BEGIN
        UPDATE userPerson
        SET idUserType = NVL(V_idUserType, idUserType),
        username = NVL(V_username, username),
        passwordUser = NVL(V_password, passwordUser)
        WHERE idUser = V_idUser;
    COMMIT; 
END updateUserPerson;

CREATE OR REPLACE PROCEDURE updateUserLog
    (V_idLog IN NUMBER, V_idNews IN NUMBER, V_idUser NUMBER, V_logDate IN DATE, V_logText IN VARCHAR2)
    AS BEGIN
        UPDATE userLog
        SET idNews = NVL(V_idNews, idNews),
        idUser = NVL(V_idUser, idUser),
        logDate = NVL(V_logDate, logDate),
        logText = NVL(V_logText, logText)
        WHERE idLog = V_idLog;
    COMMIT; 
END updateUserLog;

CREATE OR REPLACE PROCEDURE updateUserComment
    (V_idComment IN NUMBER, V_idNews IN NUMBER, V_idUser NUMBER, V_commentDate IN DATE, V_commentText IN VARCHAR2)
    AS BEGIN
        UPDATE userComment
        SET idNews = NVL(V_idNews, idNews),
        idUser = NVL(V_idUser, idUser),
        commentDate = NVL(V_commentDate, commentDate),
        commentText = NVL(V_commentText, commentText)
        WHERE idComment = V_idComment;
    COMMIT; 
END updateUserComment;

CREATE OR REPLACE PROCEDURE updateUserReview
    (V_idReview IN NUMBER, V_idNews IN NUMBER, V_idUser NUMBER, V_score IN NUMBER)
    AS BEGIN
        UPDATE userReview
        SET idNews = NVL(V_idNews, idNews),
        idUser = NVL(V_idUser, idUser),
        score = NVL(V_score, score)
        WHERE idReview = V_idReview;
    COMMIT; 
END updateUserReview;

CREATE OR REPLACE PROCEDURE updateUserSave
    (V_idSave IN NUMBER, V_idNews IN NUMBER, V_idUser NUMBER)
    AS BEGIN
        UPDATE userSave
        SET idNews = NVL(V_idNews, idNews),
        idUser = NVL(V_idUser, idUser)
        WHERE idSave = V_idSave;
    COMMIT; 
END updateUserSave;

CREATE OR REPLACE PROCEDURE updateNews
    (V_idNews IN NUMBER, V_idEvent NUMBER, V_title IN VARCHAR2, V_text IN VARCHAR2,
        V_author IN VARCHAR2, V_newsDate IN DATE,V_Photo IN VARCHAR2)
    AS BEGIN
        UPDATE News
        SET idEvent = NVL(V_idEvent, idEvent),
            title = NVL(V_title, title),
            text = NVL(V_text, text),
            author = NVL(V_author, author),
            newsDate = NVL(V_newsDate, newsDate),
            photo = NVL(V_Photo, photo)
        WHERE idNews = V_idNews;
    COMMIT; 
END updateNews;

CREATE OR REPLACE PROCEDURE updateParameterEvent
    (V_idParameter IN NUMBER, v_nameParameter IN VARCHAR2, v_valueParameter IN VARCHAR2)
    AS BEGIN
        UPDATE ParameterEvent
        SET nameParameter = NVL(V_nameParameter, nameParameter),
            valueParameter = NVL(v_valueParameter, valueParameter)
        WHERE idParameter = V_idParameter;
    COMMIT; 
END updateParameterEvent;

CREATE OR REPLACE PROCEDURE updateDemonym
    (V_idDemonym IN NUMBER, v_nameDemonym IN VARCHAR2)
    AS BEGIN
        UPDATE Demonym
        SET nameDemonym = NVL(v_nameDemonym, nameDemonym)
        WHERE idDemonym = V_idDemonym;
    COMMIT; 
END updateDemonym;
