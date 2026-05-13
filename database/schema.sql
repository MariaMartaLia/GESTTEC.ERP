CREATE TABLE categoria(
   id UUID PRIMARY KEY NOT NULL,
   nome VARCHAR(100) NOT NULL,
   descricao VARCHAR(200)
);
CREATE TABLE tipo(
     id UUID PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(200)
);
CREATE TABLE marca(
    id UUID PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL ,
    descricao VARCHAR(200)
);
CREATE TABLE  produto(
    id UUID PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(200),
    preco_venda DECIMAL(10,2) NOT NULL,
    codigo_barras VARCHAR(50),
    ativo  BOOLEAN NOT NULL,
    perecivel BOOLEAN NOT NULL,
    data_cadastro TIMESTAMP NOT NULL,
    categoria_id UUID NOT NULL,
    tipo_id UUID NOT NULL,
    marca_id UUID NOT NULL,
    FOREIGN KEY (categoria_id)
                REFERENCES categoria(id),
    FOREIGN KEY (tipo_id)
            REFERENCES tipo(id),
    FOREIGN KEY (marca_id)
            REFERENCES marca(id)
);
CREATE TABLE venda(
    id UUID PRIMARY KEY NOT NULL,
    data_venda TIMESTAMP NOT NULL,
    valor_total DECIMAL(10,2) NOT NULL,
    status VARCHAR(20),
    observacao VARCHAR(200)
);
CREATE TABLE item_venda (
    id UUID PRIMARY KEY NOT NULL,
    quantidade INTEGER NOT NULL,
    preco_unitario DECIMAL(10,2) NOT NULL,
    subtotal DECIMAL(10,2) NOT NULL,
    venda_id UUID NOT NULL,
    produto_id UUID NOT NULL,
    FOREIGN KEY (venda_id)
            REFERENCES venda(id),
    FOREIGN KEY (produto_id)
            REFERENCES produto(id)
);
CREATE TABLE receita(
    id UUID PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    modo_preparo VARCHAR(300) NOT NULL,
    ativo BOOLEAN NOT NULL,
    produto_id UUID NOT NULL,
    FOREIGN KEY (produto_id)
            REFERENCES produto(id)
);
CREATE TABLE ingrediente(

   id UUID PRIMARY KEY NOT NULL,
   nome VARCHAR(100) NOT NULL,
   ativo BOOLEAN NOT NULL,
   quantidade_estoque INTEGER NOT NULL,
   unidade_medida VARCHAR(20),
   perecivel BOOLEAN NOT NULL,
   validade Date NOT NULL
);
CREATE TABLE receita_ingrediente(
    id UUID PRIMARY KEY NOT NULL,
    quantidade DECIMAL(10,2) NOT NULL,
    unidade_medida VARCHAR(20) NOT NULL,
    receita_id UUID NOT NULL,
    ingrediente_id UUID NOT NULL,
    FOREIGN KEY (receita_id)
            REFERENCES receita(id),
    FOREIGN KEY (ingrediente_id)
        REFERENCES ingrediente(id)
);
CREATE TABLE estoque(
       id UUID PRIMARY KEY NOT NULL,
       quantidade_atual INTEGER NOT NULL,
       estoque_minimo INTEGER,
       estoque_maximo INTEGER,
       ultima_movimentacao TIMESTAMP,
       produto_id UUID NOT NULL UNIQUE,

       FOREIGN KEY (PRODUTO_ID)
           REFERENCES produto(id)
);
CREATE TABLE movimentacao_estoque(
    id UUID PRIMARY KEY NOT NULL,
    tipo_movimentacao VARCHAR(100) NOT NULL,
    quantidade INTEGER NOT NULL,
    data_movimentacao TIMESTAMP NOT NULL,
    observacao VARCHAR(300),
    estoque_id UUID NOT NULL,
    FOREIGN KEY (estoque_id)
        REFERENCES estoque(id)
);


