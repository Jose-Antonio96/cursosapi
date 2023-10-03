CREATE DATABASE academia;
USE academia;
DROP TABLE IF EXISTS  `cursos`;

CREATE TABLE `cursos` (`cod_curso` INT NOT NULL,`nombre` VARCHAR(255) NOT NULL,`duracion` INT NOT NULL ,`precio` INT NOT NULL,PRIMARY KEY (`cod_curso`));



INSERT INTO `cursos` (`cod_curso`, `nombre`, `duracion`, `precio`) VALUES (0, 'PHP', 40, 15);
INSERT INTO `cursos` (`cod_curso`, `nombre`, `duracion`, `precio`) VALUES (1, 'ANGULAR', 3, 20);