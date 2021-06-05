CREATE DATABASE IF NOT EXISTS app_infantil
CHARACTER SET utf8 
COLLATE utf8_spanish_ci;

USE app_infantil;



CREATE TABLE Usuarios (
  CodigoUsuario INTEGER AUTO_INCREMENT,
  NombreUsuario VARCHAR(30) NOT NULL,
  Apellido1Usuario VARCHAR(30) NOT NULL,
  Apellido2Usuario VARCHAR(30) NOT NULL,
  Contrasenya VARCHAR(30) NOT NULL,
  Avatar VARCHAR(3) NOT NULL UNIQUE,
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