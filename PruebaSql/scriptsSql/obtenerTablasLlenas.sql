CREATE TABLE autor(
    id NUMBER(6),
    nombre VARCHAR(50),
    primerApellido VARCHAR2(50),
    segundoApellido VARCHAR2(50),
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

-- creacion de secuencias
CREATE SEQUENCE s_Autor
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 10000000
NOCACHE
NOCYCLE;

CREATE SEQUENCE s_Libro
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 10000000
NOCACHE
NOCYCLE;

-- insercion de datos

INSERT INTO autor(
    id,
    nombre,
    primerApellido,
    segundoApellido
    )
VALUES (
    s_Autor.NEXTVAL,
    'Miguel',
    'De Cervantes',
    'Saavedra'
);

INSERT INTO autor(
    id,
    nombre,
    primerApellido,
    segundoApellido
    )
VALUES (
    s_Autor.NEXTVAL,
    'William',
    'Johannes',
    'Shakespeare'
);

INSERT INTO autor(
    id,
    nombre,
    primerApellido,
    segundoApellido
    )
VALUES (
    s_Autor.NEXTVAL,
    'Gabriel José de la Concordia',
    'Garcia',
    'Marquez'
);

-- libros

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    s_Libro.NEXTVAL,
    'Don Quijote de la Mancha',
    0,
    1605
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    s_Libro.NEXTVAL,
    'Sueño de una noche de verano',
    1,
    1595
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    s_Libro.NEXTVAL,
    'Hamlet',
    1,
    1599
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    s_Libro.NEXTVAL,
    'Macbeth',
    1,
    1606
);

INSERT INTO libro(
    codigo,
    nombre,
    idAutor,
    año
    )
VALUES (
    s_Libro.NEXTVAL,
    '100 años de soledad',
    2,
    1967
);