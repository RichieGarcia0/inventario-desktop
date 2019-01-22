/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Richie
 * Created: 22/01/2019
 */

DROP DATABASE IF EXISTS gacetas;

CREATE DATABASE gacetas;

USE gacetas;

CREATE TABLE altas(
	id int auto_increment primary key not null,
    numeroGaceta int not null,
    tipo varchar(20) not null,
    numeroTomo int not null,
    fechaEjemplar date not null,
    ejemplares int not null,
    nombre varchar(75) not null,
    fechaAlta datetime not null
);

CREATE TABLE gacetas(
	id int auto_increment primary key not null,
    numeroGaceta int not null,
    paginasEjemplar int not null,
    tipo varchar(20) not null,
    fechaEjemplar date not null,
    archivoDigital varchar(250) not null,
    numeroTomo int not null,
    fechaRecepcion date not null,
    persona varchar(75) not null,
    numeroEjemplares int not null,
    ejemplaresHemeroteca int not null,
    entregadaDirector boolean,
    entregadaHemeroteca boolean,
    entregadaRuta boolean,
    entregadaModulo boolean,
    entregadaSuscripciones boolean
);

CREATE TABLE modificaciones(
	id int auto_increment primary key not null,
    numeroGaceta int not null,
    tipo varchar(20) not null,
    numeroTomo int not null,
    fechaEjemplar date not null,
    ejemplares int not null,
    nombre varchar(75) not null,
    fechaBaja datetime not null,
    razon varchar(100),
    cliente varchar(75),
    referencia varchar(25)
);

CREATE TABLE usuarios(
	id int auto_increment primary key not null,
    nombre varchar(75) not null,
    contraseña varchar(20) not null,
    numTrabajador int not null    
);

INSERT INTO usuarios (nombre, contraseña, numTrabajador) VALUES ('Edgar Ricardo García Aldana', 'richie', 12345);
INSERT INTO usuarios (nombre, contraseña, numTrabajador) VALUES ('Edgar Ricardo García Ramírez', 'edgar', 67890);
--INSERT INTO usuarios (nombre, contraseña, numTrabajador) VALUES ('Brenda Iveth Cruz Gálvez', 'brenda', 67890);
--INSERT INTO usuarios (nombre, contraseña, numTrabajador) VALUES ('Benjamin García Gálvez', 'benjamin', 15973);
