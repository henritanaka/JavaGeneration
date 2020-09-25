create database db_escola;
use db_escola;
create table tb_alunos(
	id bigint auto_increment,
    nome varchar(25),
    nota1 float,
    nota2 float,
    media float,
    primary key (id)
);
insert into tb_alunos(nome, nota1, nota2, media) values ("Leandro", 8.5, 7.6, 8.0);
insert into tb_alunos(nome, nota1, nota2, media) values ("José", 7.5, 6.9, 7.2);
insert into tb_alunos(nome, nota1, nota2, media) values ("Maria", 9.1, 8.7, 8.9);
insert into tb_alunos(nome, nota1, nota2, media) values ("Alexandra", 8.9, 8.7, 8.8);
insert into tb_alunos(nome, nota1, nota2, media) values ("Rita", 10.0, 9.5,9.75);
select * from tb_alunos where media > 7;
select * from tb_alunos where media < 7;

