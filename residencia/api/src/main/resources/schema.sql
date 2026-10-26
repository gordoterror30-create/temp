/*

Nome do BANCO desvicio
Senha: admin

CREATE TABLE IF NOT EXISTS usuario (
id_user SERIAL PRIMARY KEY,
nome VARCHAR NOT NULL,
email VARCHAR NOT NULL,
senha VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS mensagem (
id_mensagem SERIAL PRIMARY KEY,
id_user INT NOT NULL,
texto VARCHAR NOT NULL,
data_postagem DATE NOT NULL,
CONSTRAINT fk_usuario
FOREIGN KEY (id_user)
REFERENCES usuario (id_user)
);

*/