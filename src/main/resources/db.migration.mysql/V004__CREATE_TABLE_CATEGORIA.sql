CREATE TABLE `pessoa` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`cpf` VARCHAR(17),
`nome` VARCHAR(150)
);

CREATE TABLE `tag` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`descricao` VARCHAR(150)
);

CREATE TABLE `financa` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`descricao` VARCHAR(17),
`dataEntrada` DATETIME,
`dataVencimento` DATE,
`pessoa_id_pk`int,
`tag_id_pk` int
);

ALTER TABLE `financa` ADD CONSTRAINT `tag_id_pk` FOREIGN KEY ( `id` ) REFERENCES `tag` ( `id` ) ;
ALTER TABLE `financa` ADD CONSTRAINT `pessoa_id_pk` FOREIGN KEY ( `id` ) REFERENCES `pessoa` ( `id` ) ;