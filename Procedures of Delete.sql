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
CREATE OR REPLACE PROCEDURE deletePlayerPosition (v_idPosition IN NUMBER) 
AS BEGIN 
    DELETE FROM PlayerPosition 
    WHERE idPosition = v_idposition; 
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
    WHERE idPlayer = v_idposition AND idCountry = v_idCountry; 
    Commit;  
END deletePlayerXCountry;

--This procedure delete an element in the table WorkerXSportMatch
CREATE OR REPLACE PROCEDURE deleteWorkerXSportMatch (v_idWorker IN NUMBER, v_idSportMatch IN NUMBER) 
AS BEGIN 
    DELETE FROM WorkerXSportMatch 
    WHERE idWorker = v_idWorker AND idSportMatch = v_idSportMatch; 
    Commit;  
END deleteWorkerXSportMatch;
