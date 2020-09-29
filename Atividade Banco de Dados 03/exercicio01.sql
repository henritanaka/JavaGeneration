create database db_cidade_das_carnes;
use db_cidade_das_carnes;
create table tb_categoria(
	id bigint auto_increment,
    nome varchar(25),
    preco float,
    primary key (id)
);
create table tb_produto(
	id bigint,
    categoria varchar(25),
    disponivel boolean,
    validade date,
    peso float,
    foreign key(id) references tb_categoria(id)
);
drop database db_cidade_das_carnes;
insert into tb_categoria(nome, preco) values ("File Mignon Bovino", 57.99),("Alcatra Bovina", 48.99), ("Carvão", 10.00), ("Alcool gel 70", 4.00), ("Farofa pronta", 14.00);
insert into tb_produto(id, categoria, disponivel, validade, peso) values (3, "outros", true, '2025-01-01', 2.5), (5, "comestível", false, '2021-09-28',2.5),
 (1, "comestível", true, '2020-10-02', 1.5), (4, "outros", true, '2022-09-28', 0.5), (2, "comestível", false, "2022-10-02", 5.0),
 (1, "comestível", true, "2020-09-29", 1.0), (3, "outros", true, '2025-01-01', 5.0);

select tb_categoria.nome, tb_categoria.preco, tb_produto.peso from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id where preco > 50;

select tb_categoria.nome, tb_categoria.preco, tb_produto.peso from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id where tb_categoria.nome like "%CO%";

select tb_categoria.nome, tb_categoria.preco, tb_produto.peso from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id where tb_categoria.preco > 3 and tb_categoria.preco < 50;





 









