package com.paz1c.manager;

import com.paz1c.other.Spravca;
import java.util.List;

public interface SpravcaManager {
    public boolean vlozSpravcu(Spravca pridavanySpravca);
    
    public boolean zmazSpravcu(Spravca mazanySpravca);
    
    public List<Spravca> getVsetkychSpravcov();

    public Spravca getSpravcu(Long id);
    
    public List<Spravca> getSpravcov(String meno,String priezvisko);

}
