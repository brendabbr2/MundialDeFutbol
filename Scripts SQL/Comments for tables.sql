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
IS '';---------------------

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
IS '';

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