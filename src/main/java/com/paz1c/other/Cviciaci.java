package com.paz1c.other;


public class Cviciaci extends Osoba{
    /**suma ktoru ma osob na permanentke*/
    private double kredit;

    public double getKredit() {
        return kredit;
    }

    public void setKredit(double kredit) {
        this.kredit = kredit;
    }
    
       /**toString vracia retazec "'meno','priezvisko',id_firma,kredit"*/
    @Override
    public String toString() {
        return super.toString()+","+kredit;
    }
}
