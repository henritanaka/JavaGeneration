create database db_ecommerce;
use db_ecommerce;
create table tb_categoria(
	id bigint auto_increment,
	tipo varchar(25),
    marca varchar(25),
    primary key(id)
);
create table tb_produtos(
	nome varchar(50) not null,
	preco float,
    disponivel boolean,
    chegada date,
    categoria bigint,
    foreign key(categoria) references tb_categoria(id)
);
insert into tb_categoria (tipo, marca) values ("Livro", "Companhia das Letras");
insert into tb_categoria (tipo, marca) values ("Eletronico", "Apple");
insert into tb_categoria (tipo, marca) values ("Instrumento", "Yamaha");
insert into tb_categoria (tipo, marca) values ("Livro", "Antofagica Editora");
insert into tb_categoria (tipo, marca) values ("Eletronico", "Samsung");
select * from tb_categoria;
select * from tb_produtos;
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values("Steve Jobs by Water Isaacson", 70.00, true, '2020-06-03', 1);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("Iphone 11", 4299.99, true, '2020-09-17', 2);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("Piano Digital P45", 3490.99, false, '2019-08-01',3);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("Memórias Póstumas De Brás Cubas – Edição Exclusiva", 59.90, false, '2020-11-20',4);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("Notebook Samsung X30", 3704.00, true, '2020-09-09', 5);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("1984-George Orwell", 34.50, true, '2020-10-01', 1);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("A Revolução dos Bichos", 29.90, true, '2020-09-01', 1);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("Apple Watch 3", 1599.90, true, '2020-08-01', 2);
insert into tb_produtos (nome, preco, disponivel, chegada, categoria) values ("Coleção Freud", 1200.00, true, '2020-11-01', 1);
update tb_produtos set categoria=3 where categoria = 1 and nome="Apple Watch 3" ;
select * from tb_produtos;
select * from tb_categoria;
select * from tb_produtos where preco < 2000;
select * from tb_produtos where preco > 1000 and preco < 2000;
select nome,preco from tb_produtos where nome like "C%";

