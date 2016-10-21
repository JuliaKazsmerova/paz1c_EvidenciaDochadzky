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
    
   
    ///////udaje ktore ZISTUJEME/////////
    private boolean stav;
    
}