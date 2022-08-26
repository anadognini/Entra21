ALTER TABLE pedido drop constraint fk_pedidoV;

ALTER TABLE pedido drop column codigoVendedor;

-- Armazém
INSERT INTO armazem (
    codigoArmazem,
    enderecoArmazem
)
values (
    1,
    "Rua Victor Konder"
);

INSERT INTO armazem (
    codigoArmazem,
    enderecoArmazem
)
values (
    2,
    "Avenida Brasil"
);

INSERT INTO armazem (
    codigoArmazem,
    enderecoArmazem
)
values (
    3,
    "Rua Paulo Zimmermann"
);

-- Cliente
INSERT INTO cliente (
    codigoCliente,
    nomeCliente,
    enderecoCliente,
    faturamento,
    limite,
    codVendedor
)
values (
    3,
    "Eduardo",
    "Rua São Paulo",
    200,
    3300,
    2
);

INSERT INTO cliente (
    codigoCliente,
    nomeCliente,
    enderecoCliente,
    faturamento,
    limite,
    codVendedor
)
values (
    2,
    "Sergio",
    "BR 407",
    4520,
    10000,
    1
);

INSERT INTO cliente (
    codigoCliente,
    nomeCliente,
    enderecoCliente,
    faturamento,
    limite,
    codVendedor
)
values (
    4,
    "Helena",
    "Rua XV de Novembro",
    50,
    200,
    2
);

-- Item
INSERT INTO item (
    codigoItem,
    codigoPedido,
    codigoPeca,
    qtde
)
values (
    1,
    1,
    1,
    10
);

INSERT INTO item (
    codigoItem,
    codigoPedido,
    codigoPeca,
    qtde
)
values (
    2,
    3,
    3,
    1
);

INSERT INTO item (
    codigoItem,
    codigoPedido,
    codigoPeca,
    qtde
)
values (
    3,
    4,
    2,
    4
);

-- Peca
INSERT INTO peca (
    codigoPeca,
    descricao,
    preco,
	quantidade,
    numeroArmazem
)
values (
    1,
    "Lâmpada LED",
    20.00,
    2,
    2
);

INSERT INTO peca (
    codigoPeca,
    descricao,
    preco,
	quantidade,
    numeroArmazem
)
values (
    2,
    "Cadeira gamer",
    6000.00,
    1,
    1
);

INSERT INTO peca (
    codigoPeca,
    descricao,
    preco,
	quantidade,
    numeroArmazem
)
values (
    3,
    "Garrafa térmica",
    200.00,
    2,
    3
);

-- Pedido
INSERT INTO pedido (
    codigoPedido,
    dataPedido,
    codigoCliente,
	codigoPeca
)
values (
    1,
    20220826,
    2,
    1
);

INSERT INTO pedido (
    codigoPedido,
    dataPedido,
    codigoCliente,
	codigoPeca
)
values (
    2,
    20190409,
    4,
    2
);

INSERT INTO pedido (
    codigoPedido,
    dataPedido,
    codigoCliente,
	codigoPeca
)
values (
    3,
    20210312,
    1,
    3
);

INSERT INTO pedido (
    codigoPedido,
    dataPedido,
    codigoCliente,
	codigoPeca
)
values (
    4,
    20210219,
    3,
    2
);

-- Vendedor
INSERT INTO vendedor (
   codigo,
   nome,
   endereco,
   comissao
)
values (
    3,
    "Paula",
    "Rua Normando Deeke",
    2000
);

INSERT INTO vendedor (
   codigo,
   nome,
   endereco,
   comissao
)
values (
    4,
    "Bruno",
    "Rua Bahia",
	1500
);

-- SELECT * FROM armazem;
-- SELECT * FROM cliente;
-- SELECT * FROM peca;
-- SELECT * FROM pedido;
-- SELECT * FROM vendedor;

-- Letra a
SELECT c.nomeCliente, c.codigoCliente as cpf, v.nome from cliente c, vendedor v 
WHERE c.codVendedor = v.codigo;

-- Letra b
SELECT c.nomeCliente, p.codigoPedido FROM cliente c, pedido p 
WHERE c.codigoCliente = p.codigoCliente
ORDER BY nomeCliente, codigoPedido;
