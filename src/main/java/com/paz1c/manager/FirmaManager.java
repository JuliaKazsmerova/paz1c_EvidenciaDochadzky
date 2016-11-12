package com.paz1c.manager;

import com.paz1c.other.Firma;

public interface FirmaManager {
    /***/
    public boolean vlozFirmu(Firma pridavanaFirma);
    
    /***/
    public boolean zmazFirmu(Firma mazanaFirma);
    
    /***/
    public Firma getFirma(Long id);
    
    /***/
    public Firma getFirma(String nazov,String ico);
    
}
