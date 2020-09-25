create database db_e_commerce;
use db_e_commerce;
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(25),
    preco decimal(5.2),
    marca varchar(25),
    disponivel boolean,
    primary key(id)
);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Iphone 11", 4000.00, "Apple", true);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Camisa", 50.00, "Adidas", false);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Steve Jobs", 32.00, "Companhia das Letras", false);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Biblia", 30.00, "CNBB", true);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Notebook",3720.00, "Samsung", true);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Alexa", 299.00, "Amazon", false);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Kindel", 500.00, "Amazon", true);
insert into tb_produtos (nome, preco, marca, disponivel) values ("Tênis", 270.99, "Nike", true);
select * from tb_produtos where preco < 500;
select * from tb_produtos where preco > 500;

