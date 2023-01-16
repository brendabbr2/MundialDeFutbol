-------------------------------COMMENTS FOR TABLES------------------------------------------------------------------------------------------------------------------------------------------------------------

COMMENT ON TABLE Gender
IS 'This table is for save the genders of a person that going to be necessary in data base for a personal information.';

COMMENT ON TABLE Phone
IS 'This table is for save the number phones of people that going to be necessary in data base for a personal information.';

COMMENT ON TABLE Email
IS 'This table is for save the emails of people that going to be necessary in data base for a personal information.';

COMMENT ON TABLE Identification
IS 'This table is for save the indentification of a person that going to be necessary in data base for a personal information.';

COMMENT ON TABLE IdentificationType
IS 'This table is for save type of personal identification that going to be necessary in data base. the type of identification is specified in the mask attribute.';

COMMENT ON TABLE Person
IS 'In the conceptual model, this is going to be like a super class because here is going to be register';

COMMENT ON TABLE Usertype
IS 'This table is for save a type of user in a resgister.';

COMMENT ON TABLE UserPerson
IS 'This table is for save all the users that are register in the system.';

COMMENT ON TABLE UserLog
IS 'This is a table that is the result of the tables News and User. Here are saved the log of users.';

COMMENT ON TABLE UserComment
IS 'This is a table that is the result of the tables News and User. Here are saved the comments of the people.';

COMMENT ON TABLE UserReview
IS 'This is a table that is the result of the tables News and User. Here are saved the review of the people.';

COMMENT ON TABLE UserSave
IS 'This is a table that is the result of the tables News and User. Here are saved all saved of the people.';

COMMENT ON TABLE News
IS 'This table is for save the news of the world cup.';

COMMENT ON TABLE Event
IS 'This table is for save the events of the world cup.';

COMMENT ON TABLE EventType
IS 'This table is for save a type of event of the world cup.';

COMMENT ON TABLE ParameterEvent
IS 'This table is for save general parameters of the data base like the path of images or top of results.';

COMMENT ON TABLE GroupEvent
IS 'This table is to save the groups that are going to be registered in the event.';

COMMENT ON TABLE Team
IS 'This table is for save all the teams of the groups.';

COMMENT ON TABLE Lineup
IS 'This table is for save the lineup of a team. This is the way of how they going to play.';

COMMENT ON TABLE Helper
IS 'This table is for save all the helpers of the world cup. This is a type of person.';

COMMENT ON TABLE HelperType
IS 'This table is for save all helper types like a doctor for the world cup.';

COMMENT ON TABLE Player
IS 'This table is for save a register of the players that going to be in the world cup.';

COMMENT ON TABLE PlayerPosition
IS 'This table is for save the register of the position that going to have a player.';

COMMENT ON TABLE Demonym
IS 'This table is to save the demonym of people from any country.';

COMMENT ON TABLE Continent
IS 'This table is to save the continent where a person comes from.';

COMMENT ON TABLE Country
IS 'This table is to save the country where a person comes from.';

COMMENT ON TABLE Province
IS 'This table is to save the province where a person comes from.';

COMMENT ON TABLE Canton
IS 'This table is to save the Canton where a person comes from.';

COMMENT ON TABLE District
IS 'This table is to save the distric where a person comes from.';

COMMENT ON TABLE Address
IS 'This table is to save the adrress where a person comes from.';

COMMENT ON TABLE Stadium
IS 'This table is to save all the stadium where the players going to play during the event.';

COMMENT ON TABLE StadiumXSportMatch
IS 'This table is for the relation between Stadium and SportMatch. This table going to save the date of the matches.';

COMMENT ON TABLE SportMatch
IS 'This table is to save all the matches of the events.';

COMMENT ON TABLE Worker
IS 'This table is to save registers of the people who going to work for the world cup.';

COMMENT ON TABLE WorkerType
IS 'This table is to save the type of worker that going to work in the world cup like a police.';

COMMENT ON TABLE WorkerXSportMatch
IS 'This table is the result of the entitys Worker and SportMatch.';

COMMENT ON TABLE PlayerXSportMatch
IS 'This table is to save registers of a match like yellow cards, savers and others.';

COMMENT ON TABLE PlayerXCountry
IS 'This table is the result of the entitys Player and Country.';



-------------------------------COMMENTS FOR ATTRIBUTES OF AUDITS------------------------------------------------------------------------------------------------------------------------------------------------------------
COMMENT ON COLUMN Gender.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Gender.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Gender.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Gender.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Phone.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Phone.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Phone.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Phone.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Email.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Email.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Email.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Email.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Identification.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Identification.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Identification.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Identification.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN IdentificationType.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN IdentificationType.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN IdentificationType.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN IdentificationType.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Person.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Person.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Person.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Person.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN UserType.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN UserType.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN UserType.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN UserType.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN UserPerson.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN UserPerson.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN UserPerson.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN UserPerson.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN UserLog.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN UserLog.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN UserLog.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN UserLog.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN UserComment.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN UserComment.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN UserComment.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN UserComment.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN UserReview.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN UserReview.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN UserReview.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN UserReview.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN UserSave.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN UserSave.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN UserSave.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN UserSave.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN UserSave.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN UserSave.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN UserSave.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN UserSave.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN News.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN News.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN News.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN News.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Event.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Event.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Event.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Event.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN EventType.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN EventType.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN EventType.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN EventType.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN ParameterEvent.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN ParameterEvent.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN ParameterEvent.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN ParameterEvent.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN GroupEvent.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN GroupEvent.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN GroupEvent.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN GroupEvent.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Team.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Team.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Team.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Team.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Lineup.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Lineup.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Lineup.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Lineup.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Helper.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Helper.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Helper.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Helper.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN HelperType.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN HelperType.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN HelperType.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN HelperType.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Player.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Player.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Player.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Player.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN PlayerPosition.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN PlayerPosition.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN PlayerPosition.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN PlayerPosition.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Demonym.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Demonym.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Demonym.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Demonym.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Continent.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Continent.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Continent.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Continent.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Country.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Country.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Country.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Country.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Continent.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Continent.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Continent.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Continent.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Province.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Province.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Province.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Province.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Canton.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Canton.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Canton.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Canton.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN District.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN District.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN District.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN District.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Address.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Address.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Address.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Address.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Stadium.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Stadium.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Stadium.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Stadium.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN StadiumXSportMatch.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN StadiumXSportMatch.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN StadiumXSportMatch.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN StadiumXSportMatch.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN SportMatch.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN SportMatch.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN SportMatch.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN SportMatch.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN Worker.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN Worker.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN Worker.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN Worker.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN WorkerType.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN WorkerType.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN WorkerType.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN WorkerType.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN WorkerXSportMatch.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN WorkerXSportMatch.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN WorkerXSportMatch.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN WorkerXSportMatch.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN PlayerXSportMatch.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN PlayerXSportMatch.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN PlayerXSportMatch.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN PlayerXSportMatch.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';

COMMENT ON COLUMN PlayerXCountry.creationUser
IS 'This attribute is an audit attribute. This saves the user who created the tuple.';

COMMENT ON COLUMN PlayerXCountry.creationDate
IS 'This attribute is an audit attribute. This saves the date when the user created the tuple.';

COMMENT ON COLUMN PlayerXCountry.modificationUser
IS 'This attribute is an audit attribute. This saves the user who modificated the tuple.';

COMMENT ON COLUMN PlayerXCountry.modificationDate
IS 'This attribute is an audit attribute. This saves the date when the user modificated the tuple.';







-------------------------------COMMENTS FOR NORMAL ATTRIBUTES------------------------------------------------------------------------------------------------------------------------------------------------------------
COMMENT ON COLUMN Gender.idGender
IS 'This attribute saves the primer key of the table Gender.';

COMMENT ON COLUMN Gender.genderDescription
IS 'This attribute saves a little description of a gender.';

COMMENT ON COLUMN Phone.phone
IS 'This attribute saves the primer key of the Gender table. Also, this is the phone of a person.';

COMMENT ON COLUMN Phone.idPerson
IS 'This attribute saves a foreing key of the Person table.';

COMMENT ON COLUMN Email.idEmail
IS 'This attribute saves the primer key of the Email table.';

COMMENT ON COLUMN Email.idPerson
IS 'This attribute saves a foreing key of the table Person.';

COMMENT ON COLUMN Email.mail
IS 'This attribute saves the mail of a person.';

COMMENT ON COLUMN Identification.idIdentification
IS 'This attribute saves the primer key of the Identification table.';

COMMENT ON COLUMN Identification.idPerson
IS 'This attribute saves a foreing key of the Person table.';

COMMENT ON COLUMN Identification.idType
IS 'This attribute saves a foreing key of the UserType table.';

COMMENT ON COLUMN Identification.valueIdentification
IS 'This attribute saves the identification of a person.';

COMMENT ON COLUMN IdentificationType.idIdentificationType
IS 'This attribute saves the primer key of the IdentificationType table.';

COMMENT ON COLUMN IdentificationType.idName
IS 'This attribute saves the name of the type of identification.';

COMMENT ON COLUMN IdentificationType.idMask
IS 'This attribute saves a type of mask for an identification according to the country.';

COMMENT ON COLUMN Person.idPerson
IS 'This attribute saves the primer key of the Person table.';

COMMENT ON COLUMN Person.idGender
IS 'This attribute saves a foreing key of the Gender table.';

COMMENT ON COLUMN Person.idAddress
IS 'This attribute saves the primer key of the Address table.';

COMMENT ON COLUMN Person.idEvent
IS 'This attribute saves the primer key of the Event table.';

COMMENT ON COLUMN Person.idUser
IS 'This attribute saves the primer key of the UserType table.';

COMMENT ON COLUMN Person.birthday
IS 'This attribute saves the birthday of a person.';

COMMENT ON COLUMN Person.personName
IS 'This attribute saves the name of a person.';

COMMENT ON COLUMN Person.photo
IS 'This attribute saves a photo of a person.';

COMMENT ON COLUMN UserType.idUserType
IS 'This attribute saves the primer key of the UserType table.';

COMMENT ON COLUMN UserType.nameUserType
IS 'This attribute saves the name of the type of user.';

COMMENT ON COLUMN UserPerson.idUser
IS 'This attribute saves the primer key of the UserPerson table.';

COMMENT ON COLUMN UserPerson.idUserType
IS 'This attribute saves a foreing key of the UserType table.';

COMMENT ON COLUMN UserPerson.userName
IS 'This attribute saves the name of the user.';

COMMENT ON COLUMN UserPerson.passwordUser
IS 'This attribute saves the password of the user.';

COMMENT ON COLUMN UserLog.idLog
IS 'This attribute saves the primer key of the UserLog table.';

COMMENT ON COLUMN UserLog.idNews
IS 'This attribute saves a foreing key of the News table.';

COMMENT ON COLUMN UserLog.idUser
IS 'This attribute saves a foreing key of the UserPerson table.';

COMMENT ON COLUMN UserLog.logDate
IS 'This attribute saves the date when a person makes a logging.';

COMMENT ON COLUMN UserLog.logText
IS 'This attribute saves a little text of the log.';

COMMENT ON COLUMN UserComment.idComment
IS 'This attribute saves the primer key of the UserComment.';

COMMENT ON COLUMN UserComment.idNews
IS 'This attribute saves a foreing key of the News table.';

COMMENT ON COLUMN UserComment.idUser
IS 'This attribute saves a foreing key of the UserPerson table.';

COMMENT ON COLUMN UserComment.commentDate
IS 'This attribute saves the the date when a person makes a comments in some news.';

COMMENT ON COLUMN UserComment.commentText
IS 'This attribute saves the comment of a person about the news.';

COMMENT ON COLUMN UserReview.idReview
IS 'This attribute saves the primer key of the UserReview table.';

COMMENT ON COLUMN UserReview.idNews
IS 'This attribute saves a fereing key of the News table.';

COMMENT ON COLUMN UserReview.idUser
IS 'This attribute saves a foreing key of the UserPerson table.';

COMMENT ON COLUMN UserReview.score
IS 'This attribute saves an score of some review.';

COMMENT ON COLUMN UserSave.idSave
IS 'This attribute saves the primer key of the UserSave table.';

COMMENT ON COLUMN UserSave.idNews
IS 'This attribute saves a fereing key of the News table.';

COMMENT ON COLUMN UserSave.idUser
IS 'This attribute saves a foreing key of the UserPerson table.';

COMMENT ON COLUMN News.idNews
IS 'This attribute saves the primer key of the News table.';

COMMENT ON COLUMN News.idEvent
IS 'This attribute saves a fereing key of the Event table.';

COMMENT ON COLUMN News.idUser
IS 'This attribute saves a foreing key of the UserPerson table.';

COMMENT ON COLUMN News.tittle
IS 'This attribute saves the name or title of the news.';

COMMENT ON COLUMN News.text
IS 'This attribute saves all the text that is in the news.';

COMMENT ON COLUMN News.author
IS 'This attribute saves the name of the author who creted the news.';

COMMENT ON COLUMN News.newDate
IS 'This attribute saves the publication date of the news.';

COMMENT ON COLUMN News.photo
IS 'This attribute saves path for the image of the news.';

COMMENT ON COLUMN Event.idEvent
IS 'This attribute saves the primer key of the Event table.';

COMMENT ON COLUMN Event.idEventType
IS 'This attribute saves the primer key of the EventType table.';

COMMENT ON COLUMN Event.nameEvent
IS 'This attribute saves the name of the Event of the world cup.';

COMMENT ON COLUMN EventType.idEventType
IS 'This attribute saves the primer key of the EventType table.';

COMMENT ON COLUMN EventType.nameEventType
IS 'This attribute saves the type of the event in the world cup.';

COMMENT ON COLUMN ParameterEvent.idParameter
IS 'This attribute saves the primer key of the ParameterEvent table.';

COMMENT ON COLUMN ParameterEvent.nameParameter
IS 'This attribute saves some important name of the world cup.';

COMMENT ON COLUMN ParameterEvent.valueParameter
IS 'This attribute saves the top of some results.';

COMMENT ON COLUMN GroupEvent.idGroup
IS 'This attribute saves the primer key of the GroupEvent table.';

COMMENT ON COLUMN GroupEvent.idEvent
IS 'This attribute saves the primer key of the Event table.';

COMMENT ON COLUMN GroupEvent.nameGroup
IS 'This attribute saves the names of the groups for the world cup.';

COMMENT ON COLUMN Team.idTeam
IS 'This attribute saves the primer key of the Team table.';

COMMENT ON COLUMN Team.idGroup
IS 'This attribute saves a foreing key of the GroupEvent table.';

COMMENT ON COLUMN Team.idCountry
IS 'This attribute saves a foreing key of the Country table.';

COMMENT ON COLUMN Team.idEvent
IS 'This attribute saves a foreing key of the Event table.';

COMMENT ON COLUMN Team.idLineup
IS 'This attribute saves a foreing key of the Lineup table.';

COMMENT ON COLUMN Team.captainNumber
IS 'This attribute saves the number of the captain of a team.';

COMMENT ON COLUMN Team.logoPhoto
IS 'This attribute saves the path of the logo for a team.';

COMMENT ON COLUMN Lineup.idLineup
IS 'This attribute saves the primer key of the Lineup table.';

COMMENT ON COLUMN Lineup.nameLineup
IS 'This attribute saves the Lineups for the teams.';

COMMENT ON COLUMN Helper.idHelper
IS 'This attribute saves the primer key of the Helper table.';

COMMENT ON COLUMN Helper.idTeam
IS 'This attribute saves a foreing key of the Team table.';

COMMENT ON COLUMN Helper.idHelperType
IS 'This attribute saves a foreing key of the HelperType table.';

COMMENT ON COLUMN Helper.hireDate
IS 'This attribute saves the hire date of a person who gets a job in the world cup.';

COMMENT ON COLUMN HelperType.idHelperType
IS 'This attribute saves the primer key of the HelperType table.';

COMMENT ON COLUMN HelperType.nameHelperType
IS 'This attribute saves the name of the helper type.';

COMMENT ON COLUMN Player.idPlayer
IS 'This attribute saves the primer key of the Player table.';

COMMENT ON COLUMN Player.idTeam
IS 'This attribute saves the primer key of the Team table.';

COMMENT ON COLUMN Player.idPosition
IS 'This attribute saves the primer key of the PlayerPosition table.';

COMMENT ON COLUMN Player.numberPlayer
IS 'This attribute saves the number of a player in a team.';

COMMENT ON COLUMN PlayerPosition.idPlayerPosition
IS 'This attribute saves the primer key of the PlayerPosition table.';

COMMENT ON COLUMN PlayerPosition.playerPositionName
IS 'This attribute saves the position that going to have a player.';

COMMENT ON COLUMN Demonym.idDemonym
IS 'This attribute saves the primer key of the Demonym table.';

COMMENT ON COLUMN Demonym.idDemonym
IS 'This attribute saves the the demonym of a person.';

COMMENT ON COLUMN Continent.idContinent
IS 'This attribute saves the primer key of the Continent table.';

COMMENT ON COLUMN Continent.idEvent
IS 'This attribute saves the primer key of the Event table.';

COMMENT ON COLUMN Continent.nameContinent
IS 'This attribute saves the continent where a person comes from.';

COMMENT ON COLUMN Country.idCountry
IS 'This attribute saves the primer key of the Country table.';

COMMENT ON COLUMN Country.idContinent
IS 'This attribute saves the primer key of the Continent table.';

COMMENT ON COLUMN Country.idDemonym
IS 'This attribute saves the primer key of the Demonym table.';

COMMENT ON COLUMN Country.nameCountry
IS 'This attribute saves the country where a person comes from.';

COMMENT ON COLUMN Province.idProvince
IS 'This attribute saves the primer key of the Province table.';

COMMENT ON COLUMN Province.idCountry
IS 'This attribute saves a foreing key of the Country table.';

COMMENT ON COLUMN Province.nameProvince
IS 'This attribute saves the name of the Province where a person comes from.';

COMMENT ON COLUMN Canton.idCanton
IS 'This attribute saves the primer key of the Canton table.';

COMMENT ON COLUMN Canton.idProvince
IS 'This attribute saves a foreing key of the Province table.';

COMMENT ON COLUMN Canton.nameCanton
IS 'This attribute saves the name of the canton where a person comes from.';

COMMENT ON COLUMN District.idDistrict
IS 'This attribute saves the primer key of the District table.';

COMMENT ON COLUMN District.idCanton
IS 'This attribute saves a foreing key of the Canton table.';

COMMENT ON COLUMN District.nameDistrict
IS 'This attribute saves the name of the distric where a person comes from.';

COMMENT ON COLUMN Address.idAddress
IS 'This attribute saves the primer key of the Address table.';

COMMENT ON COLUMN Address.idDistrict
IS 'This attribute saves a foreing key of the district table.';

COMMENT ON COLUMN Address.nameAddress
IS 'This attribute saves the name of the address where a person comes from.';

COMMENT ON COLUMN Stadium.idStadium
IS 'This attribute saves the primer key of the Stadium table.';

COMMENT ON COLUMN Stadium.idAddress
IS 'This attribute saves a foreing key of the Address table.';

COMMENT ON COLUMN Stadium.idEvent
IS 'This attribute saves a foreing key of the Event table.';

COMMENT ON COLUMN Stadium.nameStadium
IS 'This attribute saves the name of the stadium.';

COMMENT ON COLUMN StadiumXSportMatch.idStadium
IS 'This attribute saves the primer key and foreing of the Stadium table.';

COMMENT ON COLUMN StadiumXSportMatch.idSportMatch
IS 'This attribute saves the primer key and foreing of the SportMatch table.';

COMMENT ON COLUMN StadiumXSportMatch.dateStadiumXSportMatch
IS 'This attribute saves the date of the match.';

COMMENT ON COLUMN SportMatch.idSportMatch
IS 'This attribute saves the primer key of the SportMatch table.';

COMMENT ON COLUMN SportMatch.idEvent
IS 'This attribute saves a foreing key of the Event table.';

COMMENT ON COLUMN Worker.idWorker
IS 'This attribute saves the primer key of the Worker table.';

COMMENT ON COLUMN Worker.idWorkerType
IS 'This attribute saves a foreing key of the WorkerType table.';

COMMENT ON COLUMN Worker.idEvent
IS 'This attribute saves a foreing key of the Event table.';

COMMENT ON COLUMN Worker.hireDate
IS 'This attribute saves the hire date of a new worker.';

COMMENT ON COLUMN WorkerType.idWorkerType
IS 'This attribute saves the primer key of the WorkerType table.';

COMMENT ON COLUMN WorkerType.nameWorkerType
IS 'This attribute saves the types of workers.';

COMMENT ON COLUMN WorkerXSportMatch.idWorker
IS 'This attribute saves the primer and foreing key of the Worker table.';

COMMENT ON COLUMN WorkerXSportMatch.idSportMatch
IS 'This attribute saves the primer and foreing key of theSportMatch table.';

COMMENT ON COLUMN PlayerXSportMatch.idPlayer
IS 'This attribute saves the primer and foreing key of the Player table.';

COMMENT ON COLUMN PlayerXSportMatch.idSportMatch
IS 'This attribute saves the primer and foreing key of the SportMatch table.';

COMMENT ON COLUMN PlayerXSportMatch.yellow_card
IS 'This attribute saves all yellow cards in a match.';

COMMENT ON COLUMN PlayerXSportMatch.red_card
IS 'This attribute saves all red cards in a match.';

COMMENT ON COLUMN PlayerXSportMatch.savers
IS 'This attribute saves all savers in a match.';

COMMENT ON COLUMN PlayerXSportMatch.offside
IS 'This attribute saves all offsides in a match.';

COMMENT ON COLUMN PlayerXSportMatch.expulsion
IS 'This attribute saves all expulsions in a match.';

COMMENT ON COLUMN PlayerXSportMatch.goals
IS 'This attribute saves all goals in a match.';

COMMENT ON COLUMN PlayerXSportMatch.corners
IS 'This attribute saves all corners in a match.';

COMMENT ON COLUMN PlayerXCountry.idPlayer
IS 'This attribute saves the primer and foreing key of the Player table.';

COMMENT ON COLUMN PlayerXCountry.idCountry
IS 'This attribute saves the primer and foreing key of the Country table.';