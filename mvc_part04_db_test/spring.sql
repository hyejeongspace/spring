CREATE DATABASE digital_spring;

USE digital_spring;

CREATE TABLE IF NOT EXISTS tbl_member(
	uno int PRIMARY KEY AUTO_INCREMENT,
	userid VARCHAR(50) NOT NULL UNIQUE,
	userpw VARCHAR(50) NOT NULL,
	username VARCHAR(45) NOT NULL,
	regdate TIMESTAMP DEFAULT now(),
	updatedate TIMESTAMP DEFAULT now()

);

select *from tbl_member;