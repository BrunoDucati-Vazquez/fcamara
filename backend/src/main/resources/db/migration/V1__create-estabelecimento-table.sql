CREATE TABLE estabelecimento (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    cnpj VARCHAR(20),
    endereco VARCHAR(255),
    telefone VARCHAR(20),
    vaga_motos INTEGER,
    vaga_carros INTEGER
);