CREATE TABLE MASCOTAS (
    id      INT          NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    nombre  VARCHAR(100) NOT NULL,
    especie VARCHAR(50)  NOT NULL,
    color   VARCHAR(50),
    sexo    VARCHAR(10),
    edad    INT,
    CONSTRAINT pk_mascotas PRIMARY KEY (id)
);