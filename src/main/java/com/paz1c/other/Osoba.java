package com.paz1c.other;

import java.time.LocalDate;

public class Osoba {
    
    ///////udaje ktore sa uchovavaju V SYSTEME/////////
    /**unikatne cislo osoby*/
    private int id;
    /**meno danej osoby*/
    private String meno;
    /**priezvisko danej osoby*/
    private String priezvisko;
    /**cas a datum posledneho zaznamenaneho prichodu*/
    private LocalDate poslednyPrichod;
    /**cas a datum posledneho zaznamenaneho odchodu*/
    private LocalDate poslednyOdchod;
    
    
    //pre zamestnanca
    /**funkcia, specializacia alebo kratky popis jeho cinnosti*/
    private String zameranie;

    //pre cviciaceho
    /**suma ktoru ma osob na permanentke*/
    private double kredit;
    
    //pre studenta
    
    
    
    
    
    
    /////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    


    //udaje ktore zistujeme
    private boolean stav;
    
    //pre zamestnanca
            /**pocet hodin za posledne prihlasenie a odhlasenie zadane v systeme*/
    private int pocetOdrobenychHodin;
            /**sucet hodin odrobenych od poslednej vyplaty*/
    private int sucetOdrobenychHodin;
    
    
    /*
    pri registracii firmy si potrebujeme zapamatat
        ak je to firma sportoveho zariadenia tak cennik kolko stoji hodina pripadne viac hodin za inu cenu,
        aby sme vedeli kolko mame odratavat
    
    pri registracii osoby potrebujeme si zapamatat
        1. ak je to zamestnanec:
            -datum kedy nastupuje
            -nejaky interval vyplaty(napriklad kazdy mesiac,stvrtrok,polrok,...)
            -denny pocet hodin ktory ma odpracovat
            -pripadne ci moze mat nadcasy a kolko max???
        2.ak je to osoba do sportoveho zariadenia:
            -vstupny kredit ktory si vklada
            -
        3.ak je to student:
            -
    
    */
    
}
