CREATE TABLE notaFiscal (
    id int not null auto_increment primary key,
    idNf int not null,
    idItem int not null,
    codigoProduto int not null,
    valorUnitario decimal not null,
    quantidade int not null,
    desconto int
);
    
INSERT INTO notaFiscal (
    idNf,
    idItem,
    codigoProduto,
    valorUnitario,
    quantidade,
    desconto
)
values (
    1,
    1,
    1,
    25,
    10,
    5
);

INSERT INTO notaFiscal (
    idNf,
    idItem,
    codigoProduto,
    valorUnitario,
    quantidade,
    desconto
)
values (
    1,
    2,
    2,
    14,
    3,
    null
);

INSERT INTO notaFiscal (
    idNf,
    idItem,
    codigoProduto,
    valorUnitario,
    quantidade,
    desconto
)
values (
    1,
    3,
    3,
    15,
    2,
    null
);

INSERT INTO notaFiscal (
    idNf,
    idItem,
    codigoProduto,
    valorUnitario,
    quantidade,
    desconto
)
values (
    1,
    4,
    4,
    10,
    1,
    null
);

INSERT INTO notaFiscal (
    idNf,
    idItem,
    codigoProduto,
    valorUnitario,
    quantidade,
    desconto
)
values (
    1,
    5,
    5,
    30,
    1,
    null
);

INSERT INTO notaFiscal (
    idNf,
    idItem,
    codigoProduto,
    valorUnitario,
    quantidade,
    desconto
)
values (
    4,
    1,
    5,
    30,
    10,
    15
);

INSERT INTO notaFiscal (
    idNf,
    idItem,
    codigoProduto,
    valorUnitario,
    quantidade,
    desconto
)
values (
    4,
    3,
    1,
    25,
    13,
    5
);

-- Letra a
SELECT n.idNf, n.idItem, n.codigoProduto, n.valorUnitario FROM notaFiscal n
WHERE n.desconto IS NULL;

-- Letra b
SELECT n.idNf, n.idItem, n.codigoProduto, n.valorUnitario, (valorUnitario - (valorUnitario * (desconto / 100))) as valorVendido FROM notaFiscal n
WHERE n.desconto IS NOT NULL;

-- Letra c
UPDATE notaFiscal
SET desconto = 0
WHERE desconto IS NULL;
