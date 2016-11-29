package com.paz1c.dao;

import com.paz1c.other.Spravca;
import java.util.List;

public interface SpravcaDao {
    
    public boolean vlozSpravcu(Spravca pridavanySpravca);
    
    public boolean zmazSpravcu(Spravca mazanySpravca);
    
    public List<Spravca> getVsetkychSpravcov(Long idFirma);

    public Spravca getSpravcuId(Long id);
    
    public List<Spravca> getSpravcovMenoPriezvisko(String meno,String priezvisko);

    public Spravca getSpravcuEmail(String email);    
}
