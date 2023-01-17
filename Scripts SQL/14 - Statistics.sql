---Statistics
---Tables: Helper, worker, player
---By: Brenda Badilla Rodriguez
---Date: 16/01/2023 3:00 PM

---Procedure: totalNewsByEvent
---Annotations: gets the total of news published by event

SELECT Event.nameEvent, COUNT(idnews)
FROM News
JOIN Event ON News.idEvent = Event.idEvent
GROUP BY event.nameevent
ORDER BY event.nameevent;




