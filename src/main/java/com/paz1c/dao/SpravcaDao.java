package com.paz1c.dao;

import com.paz1c.other.Spravca;
import java.util.List;

public interface SpravcaDao {
    
    public void vlozSpravcu(Spravca pridavanaOsoba);
    
    public boolean zmazSpravcu(Spravca mazanaOsoba);
    
    public List<Spravca> getVsetkychSpravcov();

    public Spravca getSpravcu(long id);

}
