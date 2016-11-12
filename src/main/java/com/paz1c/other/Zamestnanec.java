package com.paz1c.other;

import java.sql.Date;


public class Zamestnanec extends Osoba{
    /**funkcia, specializacia alebo kratky popis jeho cinnosti*/
    private String zameranie;
    /**datum kedy nastupuje a kazdy mesiac v tento den bude mat vyplatu*/
    private Date datumNastupu;
    /**pocet hodin ktore by mal kazdy den odrobit*/
    private int pocetHodinNaDen;

    /**toString vracia retazec "meno,priezvisko,id_firma,pocetHodinNaDen,datumNastupu,zameranie"*/
    @Override
    public String toString() {
        return super.toString()+", "+pocetHodinNaDen+" ,'"+datumNastupu+"','"+zameranie+"'";
    }

    public String getZameranie() {
        return zameranie;
    }

    public Date getDatumNastupu() {
        return datumNastupu;
    }

    public int getPocetHodinNaDen() {
        return pocetHodinNaDen;
    }

    public void setZameranie(String zameranie) {
        this.zameranie = zameranie;
    }

    public void setDatumNastupu(Date datumNastupu) {
        this.datumNastupu = datumNastupu;
    }

    public void setPocetHodinNaDen(int pocetHodinNaDen) {
        this.pocetHodinNaDen = pocetHodinNaDen;
    }
   
    
}
