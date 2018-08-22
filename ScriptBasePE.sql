create database basePE;
use basePE;
drop database basepe;

create table usuario(
username varchar(50) primary key,
pass varchar(50)
);

create table facultad(
codigoFacultad int(11) primary key auto_increment,
nombre varchar(50),
telefono varchar(20),
estado smallint default 1
);

create table carrera(
codigoCarrera int(11) primary key auto_increment,
nombre varchar(50),
cantidadMaterias int(11),
codigoFacultad int(11),
estado smallint default 1,
foreign key (codigoFacultad)
references facultad(codigoFacultad)
on update cascade on delete no action
);

create table estudiante(
codigoEstudiante int(11) primary key auto_increment,
nombre varchar(50),
edad int(11),
genero varchar(50),
cum double,
intereses varchar(75),
codigoCarrera int(11),
estado smallint default 1,
foreign key (codigoCarrera)
references carrera(codigoCarrera)
on update cascade on delete no action
);

-- Facultad --
delimiter $
create procedure insertarFacultad(in nombre varchar(50), in telefono varchar(20))
begin
	insert into facultad (nombre,telefono) values(nombre,telefono);
end $

drop procedure insertarFacultad;

delimiter $
create procedure modificarFacultad(in codigoFac int(11), in nombre varchar(50), in telefono varchar(20))
begin
	update facultad set nombre=nombre, telefono=telefono where codigoFacultad=codigoFac;
end $

delimiter $
create procedure eliminarFacultad(in codigoFac int(11))
begin
	delete from facultad where codigoFacultad=codigoFac;
end $

delimiter $
create procedure mostrarFacultad()
begin
	select * from facultad where estado=1;
end $

delimiter $
create procedure papeleraFacultad(in codigoFac int(11))
begin
	update facultad set estado=2 where codigoFactura=codigoFac;
end $

delimiter $
create procedure mostrarPapeleraFacultad()
begin
	select * from facultad where estado=2;
end $

delimiter $
create procedure buscarFacultad(in codigoFac int(11))
begin
	select * from facultad where codigoFacultad=codigoFac and estado=1;
end $

delimiter $
create procedure buscarPapeleraFacultad(in codigoFac int(11))
begin
	select * from facultad where codigoFacultad=codigoFac and estado=2;
end $

delimiter $
create procedure restaurarFacultad(in codigoFac int(11))
begin
	update facultad set estado=1 where codigoFacultad=codigoFac;
end $

-- Carrera --
delimiter $
create procedure insertarCarrera(in nombre varchar(50), in cantidadMaterias int(11), in codigoFac int(11))
begin
	insert into carrera (nombre,cantidadMaterias,codigoFactura) values(nombre,cantidadMaterias,codigoFac);
end $

drop procedure insertarCarrera;

delimiter $
create procedure modificarCarrera(in codigoCar int(11), in nombre varchar(50), in cantidadMaterias int(11), in codigoFac int(11))
begin
	update carrera set nombre=nombre, cantidadMaterias=cantidadMaterias, codigoFacultad=codigoFac where codigoCarrera=codigoCar;
end $

delimiter $
create procedure eliminarCarrera(in codigoCar int(11))
begin
	delete from carrera where codigoCarrera=codigoCar;
end $

delimiter $
create procedure papeleraCarrera(in codigoCar int(11))
begin
	update carrera set estado=2 where codigoCarrera=codigoCar;
end $

delimiter $
create procedure mostrarPapeleraCarrera(in codigoCar int(11))
begin
	select * from carrera where estado=2;
end $

delimiter $
create procedure mostrarCarrera()
begin
	select * from carrera where estado=1;
end $

delimiter $
create procedure buscarCarrera(in codigoCar int(11))
begin
	select * from carrera where codigoCarrera=codigoCar and estado=1;
end $

delimiter $
create procedure buscarPapeleraCarrera(in codigoCar int(11))
begin
	select * from carrera where codigoCarrera=codigoCar and estado=2;
end $

delimiter $
create procedure restaurarCarrera(in codigoCar int(11))
begin
	update carrera set estado=1 where codigoCarrera=codigoCar;
end $

-- Estudiante --
delimiter $
create procedure insertarEstudiante(in nombre varchar(50), in edad int(11), in genero varchar(50), in cum double, in intereses varchar(75), in codigoCar int(11))
begin
	insert into estudiante (nombre,edad,genero,cum,intereses,codigoCarrera) values(nombre,edad,genero,cum,intereses,codigoCar);
end $

drop procedure insertarEstudiante;

delimiter $
create procedure modificarEstudiante(in codigoEst int(11), in nombre varchar(50), in edad int(11), in genero varchar(50), in cum double, in intereses varchar(75), in codigoCar int(11))
begin
	update estudiante set nombre=nombre, edad=edad, genero=genero, cum=cum, intereses=intereses, codigoCarrera=codigoCar where codigoEstudiante=codigoEst;
end $

delimiter $
create procedure eliminarEstudiante(in codigoEst int(11))
begin
	delete from estudiante where codigoEstudiante=codigoEst;
end $

delimiter $
create procedure papeleraEstudiante(in codigoEst int(11))
begin
	update estudiante set estado=2 where codigoEstudiante=codigoEst;
end $

delimiter $
create procedure mostrarEstudiante()
begin
	select * from estudiante where estado=1;
end $

delimiter $
create procedure mostrarPapeleraEstudiante()
begin
	select * from estudiante where estado=2;
end $

delimiter $
create procedure buscarEstudiante(in codigoEst int(11))
begin
	select * from estudiante where codigoEstudiante=codigoEst;
end $

delimiter $
create procedure buscarPapeleraEstudiante(in codigoEst int(11))
begin
	select * from estudiante where codigoEstudiante=codigoEst and estado=2;
end $

call insertarFacultad("Biología","(503)2222-2222");
call modificarFacultad(1,"Ciencias Naturales","(503)2222-2222");
call eliminarFacultad(1);
call mostrarFacultad();
call buscarFacultad(1);

call insertarCarrera(1,"Licenciatura en Biología",80,1);
call modificarCarrera(1,"Ingenieria en MicroBiología",80,1);
call eliminarCarrera(1);
call mostrarCarrera();
call buscarCarrera(1);

call insertarEstudiante(1,"Jennifer Ramírez",22,"femenino",8.0,"MarioKart/Reggaeton",1);
call modificarEstudiante(1,"Jennifer Ramírez",22,"femenino",8.3,"MarioKart/Reggaeton",1);
call eliminarEstudiante(1);
call mostrarEstudiante();
call buscarEstudiante(1);

drop table facultad;

drop table carrera;

drop table estudiante;

insert into usuario values("ElBenjaParker","f217c2527772e5db5c34892dc26ac2af")