-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dochadzky
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dochadzky` DEFAULT CHARACTER SET utf8 ;
USE `dochadzky` ;

-- -----------------------------------------------------
-- Table `dochadzky`.`predmet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dochadzky`.`predmet` (
  `id` VARCHAR(36) NOT NULL,
  `nazov` VARCHAR(60) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dochadzky`.`ucastnik`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dochadzky`.`ucastnik` (
  `id` VARCHAR(36) NOT NULL,
  `meno` VARCHAR(45) NOT NULL,
  `priezvisko` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dochadzky`.`prezencka`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dochadzky`.`prezencka` (
  `id` VARCHAR(36) NOT NULL,
  `id_predmetu` VARCHAR(36) NOT NULL,
  `datum` DATETIME NOT NULL,
    PRIMARY KEY (`id`),
  INDEX `id_predmetu_idx` (`id_predmetu` ASC),
  CONSTRAINT `predmet.id`
    FOREIGN KEY (`id_predmetu`)
    REFERENCES `dochadzky`.`predmet` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dochadzky`.`dochadzka`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dochadzky`.`dochadzka` (
  `id_prezencky` VARCHAR(36) NULL DEFAULT NULL,
  `id_ucastnika` VARCHAR(36) NULL DEFAULT NULL,
  INDEX `id_prezencky_idx` (`id_prezencky` ASC),
  INDEX `id_ucastnika_idx` (`id_ucastnika` ASC),
  CONSTRAINT `prezencka.id`
    FOREIGN KEY (`id_prezencky`)
    REFERENCES `dochadzky`.`prezencka` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `ucastnik.id`
    FOREIGN KEY (`id_ucastnika`)
    REFERENCES `dochadzky`.`ucastnik` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE USER 'dochadzkyUser'@'localhost' IDENTIFIED BY 'dochadzkyPassword';
GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP ON dochadzky.* TO 'dochadzkyUser'@'localhost';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

