
INSERT INTO `dochadzky`.`predmet` (`nazov`) VALUES ('Matematická analýza');
INSERT INTO `dochadzky`.`predmet` (`nazov`) VALUES ('Algebra');
INSERT INTO `dochadzky`.`predmet` (`nazov`) VALUES ('Konkurentné programovanie');
INSERT INTO `dochadzky`.`predmet` (`nazov`) VALUES ('Vývoj mobilných aplikácií');
INSERT INTO `dochadzky`.`predmet` (`nazov`) VALUES ('PAZ');
INSERT INTO `dochadzky`.`predmet` (`nazov`) VALUES ('Teória vypočítateľnosti');


INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Jozko','Mrkvicka');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Janko','Hrasko');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Anton','Novak');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Maria','Novakova');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Zuzana','Placha');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Daniela','Rychla');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Katka','Stara');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Marian','Biely');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Jozef','Mak');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Karol','Zeleny');
INSERT INTO `dochadzky`.`ucastnik` (`meno`,`priezvisko`) 
		VALUES ('Peter','Mrkva');
        


INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (2,'2018-01-01 09:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (2,'2018-01-08 09:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (3,'2018-01-02 08:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (3,'2018-01-09 08:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (4,'2018-01-03 10:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (4,'2018-01-10 10:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (4,'2018-01-17 10:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (5,'2018-01-04 12:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (5,'2018-01-11 12:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (5,'2018-01-18 12:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id_predmetu`,`datum`) 
		VALUES (5,'2018-01-25 12:00:00');

INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (1,11);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (1,9);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (1,8);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (1,6);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (1,5);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (1,2);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (1,1);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (2,2);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (2,3);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (2,4);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (2,7);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (2,9);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (2,8);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (3,4);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (3,6);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (3,7);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (3,8);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (3,5);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (4,1);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (4,2);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (4,3);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (4,5);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (4,6);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (4,8);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (4,9);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (5,1);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (5,3);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (5,6);
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) VALUES (5,2);

