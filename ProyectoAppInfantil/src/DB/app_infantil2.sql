CREATE DATABASE IF NOT EXISTS app_infantil
CHARACTER SET utf8 
COLLATE utf8_spanish_ci;

USE app_infantil;



CREATE TABLE Usuarios (
  NombreUsuario VARCHAR(30) NOT NULL,
  NombreAlumno VARCHAR(30) NOT NULL,
  Apellido1Alumno VARCHAR(30) NOT NULL,
  Apellido2Alumno VARCHAR(30) NOT NULL,
  EdadAlumno int NOT NULL,
  Avatar VARCHAR(20) NOT NULL,
  NombreProgenitor VARCHAR(30) NOT NULL,
  Apellido1Progenitor VARCHAR(30) NOT NULL,
  Apellido2Progenitor VARCHAR(30) NOT NULL,
  Contrasenya VARCHAR(30) NOT NULL,
  PRIMARY KEY (NombreUsuario)
) ENGINE = innodb;





INSERT INTO Usuarios VALUES ('b3rnieball', 'Berni', 'Vila', 'Ferrer', 39, '1', 'Bernardo', 'Vila', 'Noguera', '1234');

SELECT * FROM Usuarios;


DELETE FROM Usuarios WHERE NombreUsuario = 'capitanCavernicola';