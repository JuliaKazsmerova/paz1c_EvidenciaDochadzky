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
    //ci pana sak uz ic
    
    
    
    
    
    
    /////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    


    //udaje ktore zistujeme
    private boolean stav;
    
    //pre zamestnanca
            /**pocet hodin za posledne prihlasenie a odhlasenie zadane v systeme*/
    private int pocetOdrobenychHodin;
            /**sucet hodin odrobenych od poslednej vyplaty*/
    private int sucetOdrobenychHodin;
    }
