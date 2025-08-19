
-- Tabela Cliente
CREATE TABLE Cliente (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    cpf TEXT UNIQUE NOT NULL,
    telefone TEXT
);

-- Tabela Imovel
CREATE TABLE Imovel (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    endereco TEXT NOT NULL,
    tipo TEXT NOT NULL,
    valorAluguel REAL NOT NULL,
    disponivel BOOLEAN NOT NULL
);

-- Tabela Contrato
CREATE TABLE Contrato (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    dataInicio DATE NOT NULL,
    dataFim DATE NOT NULL,
    valor REAL NOT NULL,
    cliente_id INTEGER NOT NULL,
    imovel_id INTEGER NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id),
    FOREIGN KEY (imovel_id) REFERENCES Imovel(id)
);

-- =============================
-- Inserções de exemplo
-- =============================

-- Clientes
INSERT INTO Cliente (nome, cpf, telefone) VALUES ('João Silva', '12345678900', '11999990000');
INSERT INTO Cliente (nome, cpf, telefone) VALUES ('Maria Oliveira', '98765432100', '11988880000');

-- Imóveis
INSERT INTO Imovel (endereco, tipo, valorAluguel, disponivel) VALUES ('Rua A, 100', 'Apartamento', 1200.0, 1);
INSERT INTO Imovel (endereco, tipo, valorAluguel, disponivel) VALUES ('Av. B, 200', 'Casa', 2500.0, 1);

-- Contratos
INSERT INTO Contrato (dataInicio, dataFim, valor, cliente_id, imovel_id) 
VALUES ('2025-08-01', '2026-07-31', 1200.0, 1, 1);

INSERT INTO Contrato (dataInicio, dataFim, valor, cliente_id, imovel_id) 
VALUES ('2025-09-01', '2026-08-31', 2500.0, 2, 2);
