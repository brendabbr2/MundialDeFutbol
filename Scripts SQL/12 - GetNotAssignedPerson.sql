---GetNotAssigned procedure 
---Tables: Helper, worker, player
---By: Brenda Badilla Rodriguez
---Date: 16/01/2023 3:00 PM

---Procedure: getNotAssignedHelper
---Annotations: This procedure shows all the helpers with:
---             name, team they work for, helper type and hire date

SELECT p.personname, h.idteam, ht.namehelpertype, h.hiredate
FROM helper h
INNER JOIN person p
ON h.idhelper = p.idperson
INNER JOIN helpertype ht
ON h.idHelperType = ht.idhelpertype;

---Procedure: getNotAssignedWorker
---Annotations: This procedure shows all the workers with:
---             name, type of worker and hire date

SELECT p.personname, wt.nameworkertype, w.hiredate
FROM Worker w
INNER JOIN person p
ON w.idWorker = p.idperson
INNER JOIN workerType wt
ON w.idWorkerType = wt.idworkertype;

---Procedure: getNotAssignedPlayer
---Annotations: This procedure shows all the players with:
---             name, team, position name, number player

SELECT p.personname, py.idTeam, pp.positionName, py.numberPlayer
FROM Player py
INNER JOIN person p
ON py.idPlayer = p.idPerson
INNER JOIN playerPosition pp
ON py.idPosition = pp.idPosition