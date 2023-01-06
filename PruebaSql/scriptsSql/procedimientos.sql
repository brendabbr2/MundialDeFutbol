-- Procedimientos --

------------
-- Libro --
------------

-- mostrado
CREATE OR REPLACE PROCEDURE MOSTRAR_LIBROS(cursorLibro OUT SYS_REFCURSOR)
AS
BEGIN 
    OPEN cursorLibro FOR  
    SELECT codigo, nombre, idAutor, año 
    FROM Libro; 
END MOSTRAR_LIBROS;

-- insercion
CREATE OR REPLACE PROCEDURE AGREGAR_LIBRO 
    (v_nombre IN VARCHAR2, v_idAutor IN NUMBER, v_año IN NUMBER)
    AS BEGIN 
    INSERT INTO libro(codigo, nombre, idAutor, año)  
    VALUES(s_Libro.NEXTVAL, v_nombre, v_idAutor, v_año);
    COMMIT; 
END AGREGAR_LIBRO;

-- borrado
CREATE OR REPLACE PROCEDURE BORRAR_LIBRO (v_codigo IN NUMBER) 
AS BEGIN 
    DELETE FROM Libro 
    WHERE codigo = v_codigo; 
    Commit;  
END BORRAR_LIBRO;

----------------------------------------------
-- pruebas de los 3 procedimientos de libro --
----------------------------------------------

DECLARE 
    cLibro SYS_REFCURSOR;
    v_codigo NUMBER(6);
    v_nombre VARCHAR(50);
    v_idAutor NUMBER(6);
    v_año NUMBER(6);
BEGIN
    MOSTRAR_LIBROS(cLibro);
    LOOP
        FETCH cLibro INTO v_codigo, v_nombre, v_idAutor, v_año;
        EXIT WHEN cLibro%NOTFOUND;
        dbms_output.put_line(v_codigo || ' - ' || v_nombre|| ' - ' || v_idAutor || ' - ' || v_año);
    END LOOP;
END;

-- CALL BORRAR_LIBRO(5);

-- CALL AGREGAR_LIBRO('Romeo y Julieta', 1, 1595);

-----------
-- autor --
-----------

-- mostrado
CREATE OR REPLACE PROCEDURE MOSTRAR_AUTORES(cursorAutor OUT SYS_REFCURSOR)
AS
BEGIN 
    OPEN cursorAutor FOR  
    SELECT id, nombre, primerApellido, segundoApellido
    FROM Autor; 
END MOSTRAR_AUTORES;

-- insercion
CREATE OR REPLACE PROCEDURE AGREGAR_AUTOR 
    (v_nombre IN VARCHAR2, v_primerApellido IN VARCHAR2, v_segundoApellido IN VARCHAR2)
    AS BEGIN 
    INSERT INTO autor(id, nombre, primerApellido, segundoApellido)  
    VALUES(s_Autor.NEXTVAL, v_nombre, v_primerApellido, v_segundoApellido);
    COMMIT; 
END AGREGAR_Autor;

-- borrado
CREATE OR REPLACE PROCEDURE BORRAR_AUTOR (v_id IN NUMBER) 
AS BEGIN 
    DELETE FROM autor
    WHERE id = v_id; 
    Commit;  
END BORRAR_AUTOR;

----------------------------------------------
-- pruebas de los 3 procedimientos de libro --
----------------------------------------------

DECLARE 
    cAutor SYS_REFCURSOR;
    v_id NUMBER(6);
    v_nombre VARCHAR(50);
    v_primerApellido VARCHAR(50);
    v_segundoApellido VARCHAR(50);
BEGIN
    MOSTRAR_AUTORES(cAutor);
    LOOP
        FETCH cAutor INTO v_id, v_nombre, v_primerApellido, v_segundoApellido;
        EXIT WHEN cAutor%NOTFOUND;
        dbms_output.put_line(v_id || ' - ' || v_nombre || ' - ' || v_primerApellido || ' - ' || v_segundoApellido);
    END LOOP;
END;

-- CALL BORRAR_AUTOR(3);

-- CALL AGREGAR_AUTOR('Jules', 'Gabriel', 'Verne');
