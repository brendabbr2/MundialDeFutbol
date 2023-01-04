CREATE TABLE autor(
    id NUMBER(6),
    nombre VARCHAR(50),
    primerApellido VARCHAR2(50),
    segundoApellido VARCHAR2(50),
    fechaNac DATE
);

CREATE TABLE libro(
    codigo NUMBER(6),
    nombre VARCHAR(50),
    idAutor NUMBER(6),
    año NUMBER(6)
);

ALTER TABLE autor
ADD CONSTRAINT pk_autor PRIMARY KEY (id)
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE libro
ADD CONSTRAINT pk_libro PRIMARY KEY (codigo)
USING INDEX
TABLESPACE ge_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE libro
ADD CONSTRAINT fk_libro_autor 
FOREIGN KEY (idAutor)
REFERENCES autor(id);

INSERT INTO autor(
    id,
    nombre,
    primerApellido,
    segundoApellido,
    fechaNac
    )
VALUES (
    1,
    'Miguel',
    'De Cervantes',
    'Saavedra',
    '29-09-1547'
);

INSERT INTO autor(
    id,
    nombre,
    primerApellido,
    segundoApellido,
    fechaNac
    )
VALUES (
    2,
    'William',
    'Johannes',
    'Shakespeare',
    '23-04-1564'
);

INSERT INTO autor(
    id,
    nombre,
    primerApellido,
    segundoApellido,
    fechaNac
    )
VALUES (
    3,
    'Gabriel José de la Concordia',
    'Garcia',
    'Marquez',
    '06-03-1927'
);

-- libros

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    1,
    'Don Quijote de la Mancha',
    1,
    1605
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    2,
    'Sueño de una noche de verano',
    2,
    1595
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    3,
    'Hamlet',
    2,
    1599
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    4,
    'Macbeth',
    2,
    1606
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    5,
    '100 años de soledad',
    3,
    1967
);