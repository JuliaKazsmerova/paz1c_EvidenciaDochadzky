package com.paz1c.other;

import java.time.LocalDate;
import org.springframework.security.crypto.bcrypt.BCrypt;

public abstract class Osoba {
    
    private Long idOsoba;
    private String meno;
    private String priezvisko;
    
    
    public void setIdOsoba(Long idOsoba) {
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

   
    public Long getIdOsoba() {
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
  

    /**toString vracia retazec "meno,priezvisko,id_firma"*/
    @Override
    public String toString() {
        return "'"+meno+"','"+priezvisko+"','"+idFirma+"'";
    }
    
    
    
    
}