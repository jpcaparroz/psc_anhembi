-- Criar novo Banco de Dados (Schema): create database 'nome do banco'
create database aula_psc;

-- Selecionar o Banco de Dados: use 'nome do banco'
use aula_psc;

-- Criar tabelas dentro do Banco de Dados: create table 'nome da table' ( 'todas colunas da tabela' );
create table cliente (
	cpf integer not null,
    rg integer,
    nome varchar(50) not null,
    constraint PK_CLIENTE primary key(cpf)
);

create table produto (
	codigo integer not null auto_increment,
    descricao varchar(60) not null,
    preco_tabela double not null,
    quantidade integer not null,
    constraint PK_PRODUTO primary key(codigo)
);

create table venda (
	nf integer not null,
    data_venda date not null,
    cpf integer not null,
    constraint PK_VENDA primary key(nf)
);

create table venda_produto (
	nf_venda integer not null,
    codigo_produto integer not null,
    quantidade_vendida integer not null,
    preco_venda double not null,
    constraint PK_VENDA_PRODUTO primary key(nf_venda, codigo_produto)
);

-- Apagar a tablea *PERIGOSO*: drop table 'nome da tabela'
drop table venda;

-- Alterar tabela: alter table 'nome da tabela'
alter table produto
add constraint CH_PRECO check (preco_tabela >= 0),
add constraint CH_QUANTIDADE check (quantidade >= 0);

-- Referenciar coluna de uma tabela: references 'tabela' ('coluna')
alter table venda
add constraint FK_VENDA foreign key(cpf) references cliente(cpf);

alter table venda_produto
add constraint CH_PRECO_VENDA check (preco_venda >= 0),
add constraint CH_QUANTIDADE_VENDA check (quantidade_vendida >= 0);

-- Inserir dados na tabela: insert into 'nome da tabela' values ()
insert into cliente values (123456, 01012, 'Joao de Paula');
insert into cliente values (932400, 14252, 'Rafaela Silva');
insert into cliente values (333, 55555, 'Carlos Silva');

insert into produto values (null, 'Mouse', 100, 8);
insert into produto values (null, 'Fone', 300, 2);

insert into venda values
(100, '2022-05-20', 123456),
(99, '2022-05-15', 932400);

insert into venda_produto values (100, 1, 1, 100);
insert into venda_produto values (99, 2, 2, 300);

-- Consultar ao Banco de Dados: select * from 'nome da tabela'
select * from cliente;

select nome from cliente;

select nome from cliente where cpf = 123456;

-- Consulta mais especifica
select nome from cliente where cpf not in (select distinct cpf from venda);

select distinct cpf from venda;

-- Media dos preços
select avg (preco_tabela) from produto;

-- Quais clientes e suas NF
select nome, nf from cliente, venda where cliente.cpf = venda.cpf;


