postagempostagemcreate database db_RH2;
use db_RH2;
create table tb_cargo(
	numeracao bigint auto_increment,
    cargo varchar(50),
    setor varchar(50),
    primary key(numeracao)
);
create table tb_funcionarios(
    id bigint,
	nome varchar(50),
    idade int,
    salario float,
    numeracao bigint,
    foreign key (numeracao) references tb_cargo(numeracao)
);

insert into tb_cargo(cargo, setor) values ("Diretor", "Geral"), ("Analista", "Treinamento e Desevolvimento"),
 ("Coodernador", "Remuneração e Benefício"), ("Analista", "Recrutamento e Seleção");

insert into tb_funcionarios (id, nome, idade, salario, numeracao) values (1, "Andressa", 26, 10000.00, 1), (2, "Michele", 29, 5000.00, 3),
(3, "Camila", 35, "1900.00", 4);
  
select * from tb_funcionarios where salario > 2000.00;
select * from tb_funcionarios where salario < 2000.00 and salario > 1000.00;
select * from tb_funcionarios where nome like "C%";







