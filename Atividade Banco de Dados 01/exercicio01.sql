create database db_servicos_rh;
use db_servicos_rh;
create table tb_funcionarios(
	id bigint auto_increment,
	nome varchar(255) not null,
    idade int not null,
    salario float not null,
    endereco varchar(255),
	primary key(id)
);

insert into tb_funcionarios (nome, idade, salario, endereco) values ("Emerson", 35, 5000.00, "Rua Getulio Vargas");
insert into tb_funcionarios (nome, idade, salario, endereco) values ("Hiroshi", 31, 10000.00, "Rua dos Bonsais");
insert into tb_funcionarios (nome, idade, salario, endereco) values ("Alberto", 25, 3000.00, "Avenida Brasil");
insert into tb_funcionarios (nome, idade ,salario, endereco) values ("Pamela", 30, 7000.00, "Avenida São Paulo");
insert into tb_funcionarios(nome, idade, salario, endereco) values ("Akemi", 26, 12000.00, "Avenida dos Pinheiros");
select * from tb_funcionarios where salario < 2000;
select * from tb_funcionarios where salario > 2000;


