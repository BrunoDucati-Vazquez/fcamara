CREATE TYPE tipo_veiculos_enum AS ENUM ('CARRO', 'MOTO');

CREATE TABLE veiculos (
    id SERIAL PRIMARY KEY,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    cor VARCHAR(50),
    placa VARCHAR(20),
    tipo tipo_veiculos_enum
);