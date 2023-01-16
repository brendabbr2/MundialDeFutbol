-- entities that are not related to the event
ALTER TABLE Person
DROP COLUMN idEvent;

ALTER TABLE CONTINENT
DROP COLUMN IDEVENT;

-- entities that are related to the event
ALTER TABLE HELPER
ADD IDEVENT NUMBER(6);

ALTER TABLE WORKER
ADD IDEVENT NUMBER(6);

ALTER TABLE PLAYER
ADD IDEVENT NUMBER(6);


ALTER TABLE HELPER
ADD CONSTRAINT fk_helper_event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

ALTER TABLE WORKER
ADD CONSTRAINT fk_worker_event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

ALTER TABLE PLAYER
ADD CONSTRAINT fk_player_event FOREIGN KEY
(idEvent) REFERENCES Event(idEvent);

-- increasing the length of News.title from 2 to 50
ALTER TABLE News
  MODIFY(Title VARCHAR2(50));