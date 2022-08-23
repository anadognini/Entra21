// Criando a tabela vendedor
create table vendedor (
    codigo int, 
    nome varchar(50) not null, 
    endereco varchar (150) not null, 
    comissao int not null, 
    CONSTRAINT pk_vendedor PRIMARY KEY (codigo)
);

// Criando a tabela cliente
create table cliente (
    codigoCliente int auto_increment PRIMARY KEY, 
    nomeCliente varchar(50) not null, 
    enderecoCliente varchar (150) not null, 
    faturamento float not null, 
    limite int, 
    codVendedor int not null, 
    constraint fk_cliente foreign key (codVendedor) references vendedor(codigo)
    );

// Criando a tabela armazém
create table armazem (
    codigoArmazem int auto_increment PRIMARY KEY, 
    enderecoArmazem varchar(150) not null
);

// Criando a tabela peça
create table peca (
    codigoPeca int auto_increment PRIMARY KEY, 
    descricao varchar (100), 
    preco float not null, 
    quantidade int not null, 
    numeroArmazem int not null, 
    constraint fk_peca foreign key (numeroArmazem) references armazem (codigoArmazem)
); 

// Criando a tabela pedido
create table pedido (
    codigoPedido int AUTO_INCREMENT PRIMARY KEY, 
    dataPedido datetime, 
    codigoCliente int not null, 
    codigoVendedor int not null, 
    codigoPeca int not null, 
    CONSTRAINT fk_pedidoC foreign key (codigoCliente) references cliente (codigoCliente), 
    CONSTRAINT fk_pedidoV foreign key (codigoVendedor) references vendedor (codigo), 
    CONSTRAINT fk_pedidoP foreign key (codigoPeca) references peca (codigoPeca)
);

// Criando a tabela item
create table item (
    codigoItem int auto_increment PRIMARY KEY,
    codigoPedido int not null,
    codigoPeca int not null,
    qtde int not null,
    constraint fk_itemPedido foreign key (codigoPedido) references pedido(codigoPedido),
    constraint fk_itemPeca foreign key (codigoPeca) references peca(codigoPeca)
);

// Inserindo valores na tabela vendedor
INSERT INTO vendedor (
    codigo,
    nome,
    endereco,
    comissao)
values (
    2,
    "Roberto", 
    "Rua América", 
    305
);

INSERT INTO vendedor (
    codigo,
    nome,
    endereco,
    comissao)
values (
    1,
    "Eduardo", 
    "General Osório", 
    118
);

// Mostra todos os valores dentro da tabela
select * from vendedor;

// Inserindo valores na tabela cliente
INSERT INTO cliente (
    codigoCliente,
    nomeCliente,
    enderecoCliente,
    faturamento,
    limite,
    codVendedor)
values (
    1,
    "Ana Júlia", 
    "Rua 7 de Setembro", 
    3000,
    10000,
    2
);

select * from cliente;
