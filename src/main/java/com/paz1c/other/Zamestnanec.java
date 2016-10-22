package com.paz1c.other;

import java.time.LocalDate;


public class Zamestnanec extends Osoba{
    /**funkcia, specializacia alebo kratky popis jeho cinnosti*/
    private String zameranie;
    /**datum kedy nastupuje a kazdy mesiac v tento den bude mat vyplatu*/
    private LocalDate datumNastupu;
    /**pocet hodin ktore by mal kazdy den odrobit*/
    private int pocetHodinNaDen;

     /**toString vracia retazec "id_osoba,meno,priezvisko,id_firma,zameranie,datumNastupu,pocetHodinNaDen"*/
    @Override
    public String toString() {
        return super.toString()+",'"+pocetHodinNaDen+"','"+datumNastupu+"','"+zameranie+"'";
    }

    public String getZameranie() {
        return zameranie;
    }

    public LocalDate getDatumNastupu() {
        return datumNastupu;
    }

    public int getPocetHodinNaDen() {
        return pocetHodinNaDen;
    }

    public void setZameranie(String zameranie) {
        this.zameranie = zameranie;
    }

    public void setDatumNastupu(LocalDate datumNastupu) {
        this.datumNastupu = datumNastupu;
    }

    public void setPocetHodinNaDen(int pocetHodinNaDen) {
        this.pocetHodinNaDen = pocetHodinNaDen;
    }
   
    
}
