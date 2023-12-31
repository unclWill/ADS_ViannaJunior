CREATE DATABASE Autopecas;
USE Autopecas;

CREATE TABLE FORNECEDOR (
    num_fornecedor INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    fnome VARCHAR(50) NOT NULL,
    fstatus VARCHAR(12) NOT NULL,
    cidade VARCHAR(30) NOT NULL
);

CREATE TABLE PEDIDO (
	num_fornecedor INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    num_peca INT NOT NULL,
    qtd INT NOT NULL
);

CREATE TABLE PECA (
    num_peca INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    pnome VARCHAR(25) NOT NULL,
    cor VARCHAR (20) NOT NULL,
    peso DOUBLE (3,1),
	cidade VARCHAR (30),
    preco DOUBLE (5,2) NOT NULL
);