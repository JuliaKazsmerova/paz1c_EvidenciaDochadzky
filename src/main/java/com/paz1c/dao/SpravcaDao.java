package com.paz1c.dao;

import com.paz1c.other.Spravca;
import java.util.List;

public interface SpravcaDao {
    
    public boolean vlozSpravcu(Spravca pridavanySpravca);
    
    public boolean zmazSpravcu(Spravca mazanySpravca);
    
    public List<Spravca> getVsetkychSpravcov();

    public Spravca getSpravcu(Long id);
    
    public List<Spravca> getSpravcov(String meno,String priezvisko);

}
