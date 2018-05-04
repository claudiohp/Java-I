-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema hotelaria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hotelaria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hotelaria` DEFAULT CHARACTER SET utf8 ;
USE `hotelaria` ;

-- -----------------------------------------------------
-- Table `hotelaria`.`Hospede`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelaria`.`Hospede` (
  `idHospede` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idHospede`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = dec8;


-- -----------------------------------------------------
-- Table `hotelaria`.`Quarto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelaria`.`Quarto` (
  `idQuarto` INT NOT NULL AUTO_INCREMENT,
  `numeroQuarto` INT NOT NULL,
  PRIMARY KEY (`idQuarto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hotelaria`.`Reserva`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelaria`.`Reserva` (
  `idreserva` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Hospede_idHospede` INT NOT NULL,
  `Quarto_idQuarto` INT NOT NULL,
  `dataEntrada` VARCHAR(45) NOT NULL,
  `dataSaida` VARCHAR(45) NOT NULL
)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

select * from hospede;