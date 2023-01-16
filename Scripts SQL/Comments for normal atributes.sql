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