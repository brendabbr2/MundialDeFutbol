--These are insertions for the table Gender

INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number one');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number two');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number three');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number four');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number five');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number six');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number seven');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number eight');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number nine');
    
INSERT INTO Gender(idGender, descriptionGender) 
    VALUES(s_Person.NEXTVAL, 'Description number ten');

--These are insertions for the table WorkerType(These are going first than the table Worker becouse these depends of the table workerType)
INSERT INTO WorkerType(idWorkerType, nameWorkerType) 
    VALUES(s_WorkerType.NEXTVAL, 'Referee');
    
INSERT INTO WorkerType(idWorkerType, nameWorkerType) 
    VALUES(s_WorkerType.NEXTVAL, 'Builder');
    
INSERT INTO WorkerType(idWorkerType, nameWorkerType) 
    VALUES(s_WorkerType.NEXTVAL, 'Police');
    
INSERT INTO WorkerType(idWorkerType, nameWorkerType) 
    VALUES(s_WorkerType.NEXTVAL, 'Reporter');

--These are the insertions for the table Worker
INSERT INTO Worker(idWorker, idWorkerType, hireDate) 
    VALUES(s_Person.NEXTVAL, 1, to_date('1,1,1999', 'DD,MM,YYYY'));
    
INSERT INTO Worker(idWorker, idWorkerType, hireDate) 
    VALUES(s_Person.NEXTVAL, 2, to_date('31,12,1997', 'DD,MM,YYYY'));
    
INSERT INTO Worker(idWorker, idWorkerType, hireDate) 
    VALUES(s_Person.NEXTVAL, 1, to_date('12,3,1998', 'DD,MM,YYYY'));
    
INSERT INTO Worker(idWorker, idWorkerType, hireDate) 
    VALUES(s_Person.NEXTVAL, 1, to_date('10,11,1999', 'DD,MM,YYYY'));
    
INSERT INTO Worker(idWorker, idWorkerType, hireDate) 
    VALUES(s_Person.NEXTVAL, 2, to_date('19,6,9999', 'DD,MM,YYYY'));
    
INSERT INTO Worker(idWorker, idWorkerType, hireDate) 
    VALUES(s_Person.NEXTVAL, 3, to_date('11,15,9999', 'DD,MM,YYYY'));

--These are insertions for PlayerPosition
INSERT INTO PlayerPosition(idPosition, descriptionpos) 
    VALUES(s_playerPosition.NEXTVAL, 'Foward player');
    
INSERT INTO PlayerPosition(idPosition, descriptionpos) 
    VALUES(s_playerPosition.NEXTVAL, 'Midfielder player');
    
INSERT INTO PlayerPosition(idPosition, descriptionpos) 
    VALUES(s_playerPosition.NEXTVAL, 'Defending player');
    
INSERT INTO PlayerPosition(idPosition, descriptionpos) 
    VALUES(s_playerPosition.NEXTVAL, 'Holding player');
