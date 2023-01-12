--By: David Acuna Lopez

--This procedure delete an element in the table Gender
CREATE OR REPLACE PROCEDURE deleteGender (v_idGender IN NUMBER) 
AS BEGIN 
    DELETE FROM Gender 
    WHERE idgender = v_idgender; 
    Commit;  
END deleteGender;

--This procedure delete an element in the table Worker
CREATE OR REPLACE PROCEDURE deleteWorker (v_idWorker IN NUMBER) 
AS BEGIN 
    DELETE FROM Worker 
    WHERE idWorker = v_idworker; 
    Commit;  
END deleteWorker;

--This procedure delete an element in the table WorkerType
CREATE OR REPLACE PROCEDURE deleteWorkerType (v_idWorkerType IN NUMBER) 
AS BEGIN 
    DELETE FROM WorkerType 
    WHERE idWorkerType = v_idWorkerType; 
    Commit;  
END deleteWorkerType;

--This procedure delete an element in the table PlayerPoition
CREATE OR REPLACE PROCEDURE deletePlayerPosition (v_idPlayerPosition IN NUMBER) 
AS BEGIN 
    DELETE FROM PlayerPosition 
    WHERE idPlayerPosition = v_idPlayerPosition; 
    Commit;  
END deletePlayerPosition;

--This procedure delete an element in the table PlayerXSportMatch
CREATE OR REPLACE PROCEDURE deletePlayerXSportMatch (v_idPlayer IN NUMBER, v_idSportMatch IN NUMBER) 
AS BEGIN 
    DELETE FROM PlayerXSportMatch 
    WHERE idPlayer = v_idPlayer AND idSportMatch = v_idSportMatch;
    Commit;  
END deletePlayerXSportMatch;

--This procedure delete an element in the table PlayerXCountry
CREATE OR REPLACE PROCEDURE deletePlayerXCountry (v_idPlayer IN NUMBER, v_idCountry IN NUMBER) 
AS BEGIN 
    DELETE FROM PlayerXCountry 
    WHERE idPlayer = v_idPlayer AND idCountry = v_idCountry; 
    Commit;  
END deletePlayerXCountry;

--This procedure delete an element in the table WorkerXSportMatch
CREATE OR REPLACE PROCEDURE deleteWorkerXSportMatch (v_idWorker IN NUMBER, v_idSportMatch IN NUMBER) 
AS BEGIN 
    DELETE FROM WorkerXSportMatch 
    WHERE idWorker = v_idWorker AND idSportMatch = v_idSportMatch; 
    Commit;  
END deleteWorkerXSportMatch;

-----------------------------------------------------
--By: Joxan Andrey Fuertes Villegas
--Date: 28/Dic/2022 9:00 p.m

--Delete StadiumXSportMatch
CREATE OR REPLACE PROCEDURE deleteStadiumXSportMatch (v_idStadium IN NUMBER, v_idSportMatch IN NUMBER) 
AS BEGIN 
    DELETE FROM StadiumXSportMatch 
    WHERE idStadium = v_idStadium AND idSportMatch = v_idSportMatch; 
    Commit;  
END deleteStadiumXSportMatch;

--Delete Stadium
CREATE OR REPLACE PROCEDURE deleteStadium (v_idStadium IN NUMBER) 
AS BEGIN 
    DELETE FROM Stadium
    WHERE idStadium = v_idStadium ; 
    Commit;  
END deleteStadium;

--Delete SportMatch
CREATE OR REPLACE PROCEDURE deleteSportMatch (v_idSportMatch IN NUMBER) 
AS BEGIN 
    DELETE FROM SportMatch
    WHERE idSportMatch = v_idSportMatch; 
    Commit;  
END deleteSportMatch;

--Delete Address
CREATE OR REPLACE PROCEDURE deleteAddress (v_idAddress IN NUMBER) 
AS BEGIN 
    DELETE FROM Address
    WHERE idAddress = v_idAddress; 
    Commit;  
END deleteAddress;

--Delete Canton
CREATE OR REPLACE PROCEDURE deleteCanton (v_idCanton IN NUMBER) 
AS BEGIN 
    DELETE FROM Canton
    WHERE idCanton = v_idCanton; 
    Commit;  
END deleteCanton;

--Delete District
CREATE OR REPLACE PROCEDURE deleteDistrict (v_idDistrict IN NUMBER) 
AS BEGIN 
    DELETE FROM District
    WHERE idDistrict = v_idDistrict; 
    Commit;  
END deleteDistrict;

--Delete Province
CREATE OR REPLACE PROCEDURE deleteProvince (v_idProvince IN NUMBER) 
AS BEGIN 
    DELETE FROM Province
    WHERE idProvince = v_idProvince; 
    Commit;  
END deleteProvince;

--Delete Country
CREATE OR REPLACE PROCEDURE deleteCountry (v_idCountry IN NUMBER) 
AS BEGIN 
    DELETE FROM Country
    WHERE idCountry = v_idCountry; 
    Commit;  
END deleteCountry;

--Delete Demonym
CREATE OR REPLACE PROCEDURE deleteDemonym (v_idDemonym IN NUMBER) 
AS BEGIN 
    DELETE FROM Demonym
    WHERE idDemonym = v_idDemonym; 
    Commit;  
END deleteDemonym;

--Delete Continent
CREATE OR REPLACE PROCEDURE deleteContinent (v_idContinent IN NUMBER) 
AS BEGIN 
    DELETE FROM Continent
    WHERE idContinent = v_idContinent; 
    Commit;  
END deleteContinent;

-----------------------------------------------------
--By: David Salazar Rodriguez
--Date: 26/Dic/2022 6:32 p.m
-------------------People Deletes--------------------
--Delete Phone
CREATE OR REPLACE PROCEDURE deletePhone (vPhoneNum IN NUMBER) 
AS BEGIN 
    DELETE FROM Phone 
    WHERE phone = vPhoneNum; 
    Commit;
END deletePhone;

--Delete Email
CREATE OR REPLACE PROCEDURE deleteEmail (vEmail IN NUMBER) 
AS BEGIN 
    DELETE FROM Email 
    WHERE vEmail = mail; 
    Commit;
END deleteEmail;

--Delete Identification
CREATE OR REPLACE PROCEDURE deleteIdentification (vidValue IN NUMBER) 
AS BEGIN 
    DELETE FROM Identification 
    WHERE valueIdentification = vidValue; 
    Commit;
END deleteIdentification;

--Delete Identification type
CREATE OR REPLACE PROCEDURE deleteIdentificationType (vidIdenticationType IN NUMBER) 
AS BEGIN 
    DELETE FROM IdentificationType 
    WHERE idIdentificationType = vidIdenticationType; 
    Commit;
END deleteIdentificationType;

--Delete Person
CREATE OR REPLACE PROCEDURE deletePerson (VidPerson IN NUMBER) 
AS BEGIN 
    DELETE FROM Person 
    WHERE idPerson = VidPerson; 
    Commit;
END deletePerson;

--Delete UserType
CREATE OR REPLACE PROCEDURE deleteUserType (VidUserType IN NUMBER) 
AS BEGIN 
    DELETE FROM UserType 
    WHERE idUserType = VidUserType; 
    Commit;
END deleteUserType;

--Delete UserPerson
CREATE OR REPLACE PROCEDURE deleteUserPerson (VidUser IN NUMBER) 
AS BEGIN 
    DELETE FROM UserPerson 
    WHERE idUser = VidUser; 
    Commit;
END deleteUserPerson;

-----------------------------------------------------
----------------User/News Relations------------------
--Delete Log
CREATE OR REPLACE PROCEDURE deleteUserLog (VidLog IN NUMBER) 
AS BEGIN 
    DELETE FROM UserLog 
    WHERE idLog = VidLog; 
    Commit;
END deleteUserLog;

--Delete Comment
CREATE OR REPLACE PROCEDURE deleteUserComment (VidComment IN NUMBER) 
AS BEGIN 
    DELETE FROM UserComment 
    WHERE idComment = VidComment; 
    Commit;
END deleteUserComment;

--Delete Review
CREATE OR REPLACE PROCEDURE deleteUserReview (VidReview IN NUMBER) 
AS BEGIN 
    DELETE FROM UserReview 
    WHERE idReview = VidReview; 
    Commit;
END deleteUserReview;

--Delete Save
CREATE OR REPLACE PROCEDURE deleteUserSave (VidSave IN NUMBER) 
AS BEGIN 
    DELETE FROM UserSave
    WHERE idSave = VidSave;
    Commit;
END deleteUserSave;

--Delete News
CREATE OR REPLACE PROCEDURE deleteNews (VidNews IN NUMBER) 
AS BEGIN 
    DELETE FROM News
    WHERE idNews = VidNews; 
    Commit;
END deleteNews;
-----------------------------------------------------

--Delete parameter
CREATE OR REPLACE PROCEDURE deleteParameterEvent (VidParameter IN NUMBER) 
AS BEGIN 
    DELETE FROM ParameterEvent
    WHERE idParameter = VidParameter; 
    Commit;
END deleteParameterEvent;

--Delete EventType
CREATE OR REPLACE PROCEDURE deleteEventType(VidEventType IN NUMBER)
AS BEGIN
    DELETE FROM EventType
    WHERE idEventType = VidEventType;
    Commit;
END deleteEventType;

--Delete Team
CREATE OR REPLACE PROCEDURE deleteTeam(VidTeam IN NUMBER)
AS BEGIN
    DELETE FROM Team
    WHERE idTeam = VidTeam;
    Commit;
END deleteTeam;

--Delete Lineup
CREATE OR REPLACE PROCEDURE deleteLineup(VidLineup IN NUMBER)
AS BEGIN
    DELETE FROM Lineup
    WHERE idLineup = VidLineup;
    Commit;
END deleteLineup;

-----------------------------------------------------
--By: Brenda Badilla Rodriguez
--Date: 31/Dic/2022 3:00 p.m
--Event, EventType, GroupEvent, Helper, HelperType, ParameterEvent, Player, Team

CREATE OR REPLACE PROCEDURE deleteEvent (VidEvent IN NUMBER) 
AS BEGIN 
    DELETE FROM Event
    WHERE idEvent = VidEvent; 
    Commit;
END deleteEvent;

CREATE OR REPLACE PROCEDURE deleteEventType (VidEventType IN NUMBER) 
AS BEGIN 
    DELETE FROM EventType
    WHERE idEventType = VidEventType; 
    Commit;
END deleteEventType;

CREATE OR REPLACE PROCEDURE deleteGroupEvent (VidGroupEvent IN NUMBER) 
AS BEGIN 
    DELETE FROM GroupEvent
    WHERE idGroupEvent = VidGroupEvent; 
    Commit;
END deleteGroupEvent;

CREATE OR REPLACE PROCEDURE deleteHelperType (VidHelperType IN NUMBER) 
AS BEGIN 
    DELETE FROM HelperType
    WHERE idHelperType = VidHelperType; 
    Commit;
END deleteHelperType;

CREATE OR REPLACE PROCEDURE deleteParameterEvent (VidParameterEvent IN NUMBER) 
AS BEGIN 
    DELETE FROM ParameterEvent
    WHERE idParameterEvent = VidParameterEvent; 
    Commit;
END deleteParameterEvent;

CREATE OR REPLACE PROCEDURE deletePlayer (VidPlayer IN NUMBER) 
AS BEGIN 
    DELETE FROM Player
    WHERE idPlayer = VidPlayer; 
    Commit;
END deletePlayer;

CREATE OR REPLACE PROCEDURE deleteTeam (VidTeam IN NUMBER) 
AS BEGIN 
    DELETE FROM Team
    WHERE idTeam = VidTeam; 
    Commit;
END deleteTeam;
