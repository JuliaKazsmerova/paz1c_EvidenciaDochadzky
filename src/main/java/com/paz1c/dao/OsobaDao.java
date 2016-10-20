package com.paz1c.dao;

import com.paz1c.other.Osoba;
import java.util.List;

public interface OsobaDao {

    /**Zaregistruje osobu do systemu*/
    public void pridaj(Osoba pridavanaOsoba);
    
    /**zmaze osobu s danym id zo systemu*/
    public void zmaz(Osoba mazanaOsoba);
    
}
