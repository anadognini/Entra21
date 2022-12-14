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
SELECT n.idNf, n.idItem, n.codigoProduto, n.valorUnitario 
FROM notaFiscal n
WHERE n.desconto IS NULL;

-- Letra b
SELECT n.idNf, n.idItem, n.codigoProduto, n.valorUnitario, (valorUnitario - (valorUnitario * (desconto / 100))) as valorVendido 
FROM notaFiscal n
WHERE n.desconto IS NOT NULL;

-- Letra c
UPDATE notaFiscal
SET notaFiscal.desconto = 0
WHERE notaFiscal.desconto IS NULL;

-- Letra d 
SELECT n.idNf, n.idItem, n.codigoProduto, n.valorUnitario, n.desconto, (quantidade * valorUnitario) as valorTotal, (valorUnitario - (valorUnitario * (desconto / 100))) as valorVendido 
FROM notaFiscal n;

-- Letra e
SELECT n.idNf, sum(quantidade * valorUnitario) as valorTotal 
FROM notaFiscal n
GROUP by n.idNf
ORDER by valorTotal DESC;

-- Letra f
SELECT n.idNf, sum(quantidade * valorUnitario) as valorTotal, sum(valorUnitario - (valorUnitario * (desconto/100))) as valorVendido 
FROM NotaFiscal n
GROUP by n.idNf
ORDER by valorVendido DESC;

-- Letra g
SELECT codigoProduto, max(quantidade) as quantidade
FROM notaFiscal
GROUP by codigoProduto;

-- Letra h
SELECT idNf, codigoProduto, quantidade 
FROM notaFiscal
WHERE quantidade > 10
GROUP by idNf, codigoProduto;

-- Letra i 
SELECT idNf, sum(quantidade * valorUnitario) as valorTotal 
FROM notaFiscal
GROUP by idNf
HAVING (valorTotal) > 500
ORDER by valorTotal DESC;

-- Letra j
SELECT codigoProduto, avg(desconto) as media 
FROM notaFiscal n 
WHERE (desconto) > 0
GROUP BY codigoProduto;

-- Letra k
SELECT codigoProduto, min(desconto) as minimo, max(desconto) as maximo, avg(desconto) as media 
FROM notaFiscal n
WHERE (desconto) > 0
GROUP by codigoProduto;

-- Letra l
SELECT idNf, count(idItem) as qtdItens
FROM notaFiscal
GROUP by idNf
HAVING qtdItens > 3;
