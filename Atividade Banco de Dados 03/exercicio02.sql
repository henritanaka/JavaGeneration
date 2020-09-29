create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;
create table tb_categoria(
	id bigint auto_increment,
    nome varchar(225),
    material varchar(255),
    primary key(id)
);
create table tb_produto(
	id bigint,
    cor varchar(255),
    modelo varchar(255),
    preco float,
    quantidade bigint,
    foreign key (id) references tb_categoria(id)
);

drop database db_construindo_a_nossa_vida;
insert into tb_categoria (nome, material) values ("Bloco", "Cimento"), ("Tijolo", "Cerâmica"), ("Bloco", "Vidro"), ("Telha", "PVC"), ("Cano", "PVC");

insert into tb_produto (id, cor, modelo, preco, quantidade) values (1, "Vermelho", "09x19x19cm", 0.79, 1000), (3, "Transparente", "20x20 Xadrez", 26.00, 50),
(5, "Marrom", "Tê 3/4", 1.89, 3), (1, "Cinza", "14x19x39 rústico", 1.99, 2000);
select * from tb_categoria;
select * from tb_produto;

select * from tb_produto;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id where material like "%CI%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id where preco > 3 and preco < 60;