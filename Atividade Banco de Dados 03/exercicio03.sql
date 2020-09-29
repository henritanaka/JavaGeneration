create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;
create table tb_categoria(
	id bigint auto_increment,
    Assunto varchar(255),
    Professor varchar(255),
    primary key(id)
);
create table tb_curso(
	id bigint,
    preco float,
    hora time,
    inicio date,
    n_horas int,
    foreign key(id) references tb_categoria(id)
);

drop database db_cursoDaMinhaVida;
insert into tb_categoria (Assunto, Professor) values ("Java", "Haward"), ("Cobol", "Thomas"), ("Assembly", "Richard"), ("C", "Elisabeth");
insert into tb_curso (id, preco, hora, inicio, n_horas) values (1, 500.00, "17:00", "2020-09-28", 4), (1, 700.00, "08:00", "2020-09-28", 6), (4, 200, "08:00","2020-07-01", 2);

select * from tb_categoria;
select * from tb_curso;

select tb_categoria.Assunto, tb_Categoria.Professor, tb_curso.* from tb_curso
inner join tb_categoria on tb_categoria.id = tb_curso.id where Assunto like "%Ja%";

select tb_categoria.Assunto, tb_Categoria.Professor, tb_curso.* from tb_curso
inner join tb_categoria on tb_categoria.id = tb_curso.id where Professor = "Haward";




