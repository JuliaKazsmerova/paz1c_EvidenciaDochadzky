/*inicializacia databazy a vytvorenie vsetkych potrebnych tabuliek*/

CREATE TABLE IF NOT EXISTS Firma
(
    ID_firma INT NOT NULL AUTO_INCREMENT,
    nazov VARCHAR(20),
    ico VARCHAR(20),
    dic VARCHAR(20),
    sidlo VARCHAR(50),
    vybraty_mod VARCHAR(20),
    PRIMARY KEY (ID_firma)
);


CREATE TABLE IF NOT EXISTS Spravca
(
    ID_admin INT NOT NULL AUTO_INCREMENT,
    meno VARCHAR(20),
    priezvisko VARCHAR(20),
    email VARCHAR(40),
    heslo VARCHAR(64),
    sol VARCHAR(64),
    ID_firma INT NOT NULL,
    FOREIGN KEY (ID_firma) REFERENCES Firma(ID_firma),
    PRIMARY KEY (ID_admin)
);


CREATE TABLE IF NOT EXISTS Cviciaci
(
    ID_cviciaci INT NOT NULL AUTO_INCREMENT,
    meno VARCHAR(20),
    priezvisko VARCHAR(20),
    kredit DECIMAL(5,2),
    suma_za_hodinu DECIMAL(5,2),
    ID_firma INT NOT NULL,
    FOREIGN KEY (ID_firma) REFERENCES Firma(ID_firma),
    PRIMARY KEY (ID_cviciaci)
);

CREATE TABLE IF NOT EXISTS Zamestnanec
(
    ID_zamestnanec INT NOT NULL AUTO_INCREMENT,
    meno VARCHAR(20),
    priezvisko VARCHAR(20),
    pocet_hodin_na_den INT NOT NULL,
    datum_nastupu DATETIME,
    funkcia VARCHAR(20),
    hod_mzda DECIMAL(3,2),
    ID_firma INT NOT NULL,
    FOREIGN KEY (ID_firma) REFERENCES Firma(ID_firma),
    PRIMARY KEY (ID_zamestnanec)
);

CREATE TABLE IF NOT EXISTS Denna_dochadzka
(
    ID_den INT NOT NULL AUTO_INCREMENT,
    prichod DATETIME,
    odchod DATETIME,
    odrobene_hodiny INT NOT NULL,
    ID_zamestnanec INT,
    ID_cviciaci INT,
    FOREIGN KEY (ID_zamestnanec) REFERENCES Zamestnanec(ID_zamestnanec),
    FOREIGN KEY (ID_cviciaci) REFERENCES Cviciaci(ID_cviciaci),
    PRIMARY KEY (ID_den)
);

CREATE TABLE IF NOT EXISTS Mesacna_dochadzka
(
    ID_mesiac INT NOT NULL AUTO_INCREMENT,
    datum_vyplaty DATETIME,
    odrobene_hodiny INT NOT NULL,
    ID_zamestnanec INT NOT NULL,
    FOREIGN KEY (ID_zamestnanec) REFERENCES Zamestnanec(ID_zamestnanec),
    PRIMARY KEY (ID_mesiac)
);