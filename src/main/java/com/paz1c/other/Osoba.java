package com.paz1c.other;

import java.time.LocalDate;

public class Osoba {
    
    ///////udaje ktore sa uchovavaju V SYSTEME/////////
    /**unikatne cislo osoby*/
    private int idOsoba;
    /**meno danej osoby*/
    private String meno;
    /**priezvisko danej osoby*/
    private String priezvisko;

    public void setIdOsoba(int idOsoba) {
        this.idOsoba = idOsoba;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setIdFirma(int idFirma) {
        this.idFirma = idFirma;
    }

    public int getIdOsoba() {
        return idOsoba;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getIdFirma() {
        return idFirma;
    }
    /**unikatne cislo firmy pre ktoru pracuje*/
    private int idFirma;
  

    /**toString vracia retazec "id_osoba,meno,priezvisko,id_firma"*/
    @Override
    public String toString() {
        return /*idOsoba+","+*/"'"+meno+"','"+priezvisko+"','"+idFirma+"'";
    }
    
    
    
    
}