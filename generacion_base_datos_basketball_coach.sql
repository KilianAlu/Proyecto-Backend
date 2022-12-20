
# ATENCIÓN: La siguiente sentencia SQL, borra la estructura de la base de datos entera
# y también sus datos. No la descomenteis, a no ser que sea eso lo que queréis lograr.
#------------------------------------------
# DROP DATABASE IF EXISTS basketball_coach;
#------------------------------------------

CREATE DATABASE basketball_coach;

USE basketball_coach;

CREATE TABLE entrenador (

	id int,
	usuario VARCHAR(15),
    correo Varchar(90),
    contrasena VARCHAR(20),
    
    PRIMARY KEY(id)
);

CREATE TABLE perfil(
	
    nombre varchar(50),
    apellidos VARCHAR(30),
	fechaNacimiento date,
    idEntrenador int NOT NULL,
    
    FOREIGN KEY(idEntrenador) REFERENCES entrenador(id)

);

CREATE TABLE anotacion (

	id INT,
    titulo VARCHAR(30),
    texto VARCHAR(5000),
    fecha DATE,
    idEntrenador int NOT NULL,
    
    PRIMARY KEY(id),
    FOREIGN KEY(idEntrenador) REFERENCES entrenador(id)
);

CREATE TABLE jugada (

	id INT,
    posiciones_json longtext,
	idEntrenador int NOT NULL,

    
    PRIMARY KEY(id),
    FOREIGN KEY(idEntrenador) REFERENCES entrenador(id)
);

CREATE TABLE equipo (

	id INT,
    nombre VARCHAR(30),
	idEntrenador int NOT NULL,
    
    PRIMARY KEY(id),
	FOREIGN KEY(idEntrenador) REFERENCES entrenador(id)
);

CREATE TABLE jugador (

	id INT,
    nombre VARCHAR(30),
    apellido VARCHAR(30),
    altura INT,
    peso DECIMAL(1),
    mano_habil ENUM('zurdo', 'diestro'),
    idEquipo INT,
    
    PRIMARY KEY(id),
    FOREIGN KEY(idEquipo) REFERENCES equipo(id)
);

CREATE TABLE partido (

	id INT,
    fecha DATE,
    idEquipo int,
    nombreEquipo1 VARCHAR(30),
    nombreEquipo2 VARCHAR(30),
    puntuacionEquipo1 INT,
    puntuacionEquipo2 INT,
    
    PRIMARY KEY(id),
    Foreign KEY(idEquipo) References equipo(id)
);

CREATE TABLE entrenador_participa_partido (

	usuario_entrenador VARCHAR(30),
    partido_id INT,
    
    PRIMARY KEY(usuario_entrenador, partido_id),
    FOREIGN KEY(usuario_entrenador) REFERENCES entrenador(usuario),
    FOREIGN KEY(partido_id) REFERENCES partido(id)
);

    
    
    
    
    
    