package com.paz1c.manager;

import com.paz1c.other.Spravca;
import java.util.List;

public interface SpravcaManager {
    public boolean vlozSpravcu(Spravca pridavanySpravca);
    
    public boolean zmazSpravcu(Spravca mazanySpravca);
    
    public List<Spravca> getVsetkychSpravcov();
    
    public Spravca getVsetkychSpravcov(int index);

    public Spravca getSpravcuId(Long id);
    
    public List<Spravca> getSpravcovMenoPriezvisko(String meno,String priezvisko);

    public Spravca getSpravcuEmail(String email); 
    
    public boolean existsEmail(String email);

    public int pocetSpravcov();
}
