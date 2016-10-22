package com.paz1c.dao;

import com.paz1c.other.Osoba;
import java.util.List;

public interface OsobaDao {

    /**Zaregistruje osobu do systemu*/
    public void vlozOsobu(Osoba pridavanaOsoba);
    
    /**zmaze osobu s danym id zo systemu*/
    public boolean zmazOsobu(Osoba mazanaOsoba);
    
    /**vrati zoznam vsetkych osob v systeme*/
    public List<Osoba> getVsetkyOsoby();

    /**vrati osobu so zadanym id*/
    public Osoba getOsoba(int id);

    /**upravi zadanu osobu v systeme*/
    public boolean upravOsobu(Osoba upravovanaOsoba);
    
}
