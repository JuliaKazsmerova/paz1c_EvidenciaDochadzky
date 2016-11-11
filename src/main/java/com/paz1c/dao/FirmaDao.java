package com.paz1c.dao;

import com.paz1c.other.Firma;
import java.util.List;

public interface FirmaDao {
     /***/
    public boolean vlozFirmu(Firma pridavanaFirma);
    
    /***/
    public boolean zmazFirmu(Firma mazanaFirma);
    
    /***/
    public Firma getFirma(Long id);
    
    /***/
    public Firma getFirma(String nazov,String ico);

}
