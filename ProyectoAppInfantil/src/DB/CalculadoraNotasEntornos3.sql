CREATE DATABASE if not exists calculadoraNotasEntornos
CHARACTER SET utf8 
COLLATE utf8_spanish_ci;

USE calculadoraNotasEntornos;

create table grupo (
	NombreGrupo varchar(40) primary key not null
);

create table alumno (
	NIA varchar(8) primary key not null,
    Nombre varchar(40),
    Apellido varchar(40),
    NombreGrupo varchar(40) not null,
    foreign key (NombreGrupo) references grupo (NombreGrupo)
);

create table ExamenClasico (
	porcentaje double,
    descripcion varchar(200),
    nota int,
    NIA varchar(8),
    foreign key (NIA) references alumno(NIA),
    constraint pk_exClasico_desc_NIA primary key(descripcion, NIA)
);

create table ExamenTest (
	porcentaje double,
    descripcion varchar(200),
    preguntasAciertos int,
    preguntasFallos int,
    NIA varchar(8),
    foreign key (NIA) references alumno(NIA),
    constraint pk_exTest_desc_NIA primary key(descripcion, NIA)
);

create table Trabajo (
	diasRetrasado int,
    descripcion varchar(200),
    NIA varchar(8),
    foreign key (NIA) references alumno(NIA),
    constraint pk_tra_desc_NIA primary key(descripcion, NIA)
);

SET SQL_SAFE_UPDATES = 0;


select * from grupo;
select * from alumno;

#insert into ExamenClasico values ("0.5","exCl1","10","1");

select * from ExamenClasico;
select * from ExamenTest;

#delete from ExamenClasico
#where (descripcion = "exCl1") & (NIA = "1");

