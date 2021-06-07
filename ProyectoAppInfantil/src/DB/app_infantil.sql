CREATE DATABASE IF NOT EXISTS app_infantil
CHARACTER SET utf8 
COLLATE utf8_spanish_ci;

USE app_infantil;



CREATE TABLE Usuarios (
  CodigoUsuario INTEGER AUTO_INCREMENT,
  Nickname VARCHAR(30) NOT NULL,
  NombreUsuario VARCHAR(30) NOT NULL,
  Apellido1Usuario VARCHAR(30) NOT NULL,
  Apellido2Usuario VARCHAR(30) NOT NULL,
  Avatar VARCHAR(30) NOT NULL UNIQUE,
  PRIMARY KEY (CodigoUsuario)
) ENGINE = innodb;

CREATE TABLE Progenitores (
  CodigoProgenitor INTEGER AUTO_INCREMENT,
  NombreProgenitor VARCHAR(30) NOT NULL,
  Apellido1Progenitor VARCHAR(30) NOT NULL,
  Apellido2Progenitor VARCHAR(30) NOT NULL,
  Contrasenya VARCHAR(30) NOT NULL,
  CodigoUsuario INTEGER NOT NULL,
  PRIMARY KEY (CodigoProgenitor),
  FOREIGN KEY (CodigoUsuario) REFERENCES Usuarios (CodigoUsuario)
) ENGINE = innodb;


CREATE TABLE Puntuaciones (
  CodigoPuntuacion INTEGER AUTO_INCREMENT,
  NombreUsuario VARCHAR(30) NOT NULL,
  NombreJuego VARCHAR(30) NOT NULL,
  Puntos VARCHAR(30) NOT NULL,
  CodigoUsuario INTEGER NOT NULL,
  PRIMARY KEY (CodigoPuntuacion),
  FOREIGN KEY (CodigoUsuario) REFERENCES Usuarios (CodigoUsuario)
) ENGINE = innodb;



INSERT INTO Usuarios VALUES (NULL, 'Berni', 'Vila','Ferrer','1');

SELECT * FROM Usuarios;

INSERT INTO Progenitores VALUES (NULL, 'Berni', 'Vila','Noguera','1234', '1');

SELECT * FROM Progenitores;

DELETE FROM Progenitores WHERE CodigoUsuario = 1;
DELETE FROM Usuarios WHERE CodigoUsuario = 1;