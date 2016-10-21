/*inicializacia databazy a vytvorenie vsetkych potrebnych tabuliek*/

CREATE TABLE IF NOT EXISTS Firma
(
    ID_firma INT NOT NULL PRIMARY KEY,
    nazov VARCHAR(20),
    ico VARCHAR(20),
    dic VARCHAR(20),
    sidlo VARCHAR(50)
);


CREATE TABLE IF NOT EXISTS Spravca
(
    ID_admin INT NOT NULL PRIMARY KEY,
    meno VARCHAR(20),
    priezvisko VARCHAR(20),
    email VARCHAR(40),
    heslo VARCHAR(15),
    ID_firma INT NOT NULL,
    FOREIGN KEY (ID_firma) REFERENCES Firma(ID_firma)
);

CREATE TABLE IF NOT EXISTS Zamestnanec
(
    ID_zamestnanec INT NOT NULL PRIMARY KEY,
    meno VARCHAR(20),
    priezvisko VARCHAR(20),
    pocet_hodin_na_den INT NOT NULL,
    datum_nastupu DATETIME,
    funkcia VARCHAR(20),
    ID_firma INT NOT NULL,
    FOREIGN KEY (ID_firma) REFERENCES Firma(ID_firma) 
);

CREATE TABLE IF NOT EXISTS Denna_dochadzka
(
    ID_den INT NOT NULL PRIMARY KEY,
    prichod DATETIME,
    odchod DATETIME,
    odrobene_hodiny INT NOT NULL,
    ID_zamestnanec INT NOT NULL,
    FOREIGN KEY (ID_zamestnanec) REFERENCES Zamestnanec(ID_zamestnanec)
);

CREATE TABLE IF NOT EXISTS Mesacna_dochadzka
(
    ID_mesiac INT NOT NULL PRIMARY KEY,
    datum_vyplaty DATETIME,
    odrobene_hodiny INT NOT NULL,
    ID_zamestnanec INT NOT NULL,
    FOREIGN KEY (ID_zamestnanec) REFERENCES Zamestnanec(ID_zamestnanec) 
);