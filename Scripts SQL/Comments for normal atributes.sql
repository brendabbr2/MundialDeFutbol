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

COMMENT ON COLUMN Identification.idIdentification
IS 'This attribute saves the primer key of the Identification table.';