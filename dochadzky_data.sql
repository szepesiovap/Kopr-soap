
INSERT INTO `dochadzky`.`predmet` (`id`,`nazov`) 
VALUES ('aab5d5fd-70c1-11e5-a4fb-b026b977eb01','Matematická analýza');
INSERT INTO `dochadzky`.`predmet` (`id`,`nazov`) 
VALUES ('aab5d5fd-70c1-11e5-a4fb-b026b977eb02','Algebra');
INSERT INTO `dochadzky`.`predmet` (`id`,`nazov`) 
VALUES ('aab5d5fd-70c1-11e5-a4fb-b026b977eb03','Konkurentné programovanie');
INSERT INTO `dochadzky`.`predmet` (`id`,`nazov`) 
VALUES ('aab5d5fd-70c1-11e5-a4fb-b026b977eb04','Vývoj mobilných aplikácií');
INSERT INTO `dochadzky`.`predmet` (`id`,`nazov`) 
VALUES ('aab5d5fd-70c1-11e5-a4fb-b026b977eb05','PAZ');
INSERT INTO `dochadzky`.`predmet` (`id`,`nazov`) 
VALUES ('aab5d5fd-70c1-11e5-a4fb-b026b977eb06','Teória vypočítateľnosti');


INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb01','Jozko','Mrkvicka');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb02','Janko','Hrasko');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb03','Anton','Novak');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb04','Maria','Novakova');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb05','Zuzana','Placha');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb06','Daniela','Rychla');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb07','Katka','Stara');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb08','Marian','Biely');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb09','Jozef','Mak');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb10','Karol','Zeleny');
INSERT INTO `dochadzky`.`ucastnik` (`id`,`meno`,`priezvisko`) 
		VALUES ('bbb5d5fd-70c1-11e5-a4fb-b026b977eb11','Peter','Mrkva');
        


INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','aab5d5fd-70c1-11e5-a4fb-b026b977eb02','2018-01-01 09:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','aab5d5fd-70c1-11e5-a4fb-b026b977eb02','2018-01-08 09:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb03','aab5d5fd-70c1-11e5-a4fb-b026b977eb03','2018-01-02 08:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','aab5d5fd-70c1-11e5-a4fb-b026b977eb03','2018-01-09 08:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb05','aab5d5fd-70c1-11e5-a4fb-b026b977eb04','2018-01-03 10:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb06','aab5d5fd-70c1-11e5-a4fb-b026b977eb04','2018-01-10 10:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb07','aab5d5fd-70c1-11e5-a4fb-b026b977eb04','2018-01-17 10:30:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb08','aab5d5fd-70c1-11e5-a4fb-b026b977eb04','2018-01-04 12:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb09','aab5d5fd-70c1-11e5-a4fb-b026b977eb05','2018-01-11 12:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb10','aab5d5fd-70c1-11e5-a4fb-b026b977eb05','2018-01-18 12:00:00');
INSERT INTO `dochadzky`.`prezencka` (`id`,`id_predmetu`,`datum`) 
		VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb11','aab5d5fd-70c1-11e5-a4fb-b026b977eb05','2018-01-25 12:00:00');

INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','bbb5d5fd-70c1-11e5-a4fb-b026b977eb11');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','bbb5d5fd-70c1-11e5-a4fb-b026b977eb09');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','bbb5d5fd-70c1-11e5-a4fb-b026b977eb08');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','bbb5d5fd-70c1-11e5-a4fb-b026b977eb06');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','bbb5d5fd-70c1-11e5-a4fb-b026b977eb05');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','bbb5d5fd-70c1-11e5-a4fb-b026b977eb02');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb01','bbb5d5fd-70c1-11e5-a4fb-b026b977eb01');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb02');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb03');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb04');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb07');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb09');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb08');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb03','bbb5d5fd-70c1-11e5-a4fb-b026b977eb04');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb03','bbb5d5fd-70c1-11e5-a4fb-b026b977eb06');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb03','bbb5d5fd-70c1-11e5-a4fb-b026b977eb07');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb03','bbb5d5fd-70c1-11e5-a4fb-b026b977eb08');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb03','bbb5d5fd-70c1-11e5-a4fb-b026b977eb05');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','bbb5d5fd-70c1-11e5-a4fb-b026b977eb01');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','bbb5d5fd-70c1-11e5-a4fb-b026b977eb02');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','bbb5d5fd-70c1-11e5-a4fb-b026b977eb03');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','bbb5d5fd-70c1-11e5-a4fb-b026b977eb05');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','bbb5d5fd-70c1-11e5-a4fb-b026b977eb06');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','bbb5d5fd-70c1-11e5-a4fb-b026b977eb08');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb04','bbb5d5fd-70c1-11e5-a4fb-b026b977eb09');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb01');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb03');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb06');
INSERT INTO `dochadzky`.`dochadzka` (`id_prezencky`, `id_ucastnika`) 
VALUES ('ccc5d5fd-70c1-11e5-a4fb-b026b977eb02','bbb5d5fd-70c1-11e5-a4fb-b026b977eb02');

