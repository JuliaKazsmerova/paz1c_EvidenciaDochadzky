package com.paz1c.manager;

import com.paz1c.other.Osoba;
import com.paz1c.other.Zamestnanec;
import java.util.List;

public interface ZamestnanecManager {
     public void vlozZamestnanca(Zamestnanec pridavanaOsoba);
    
    public boolean zmazZamestnanca(Zamestnanec mazanaOsoba);
    
    public List<Zamestnanec> getVsetkychZamestnancov();

    public Zamestnanec getZamestnanec(Long id);

    public boolean upravZamestnanca(Zamestnanec upravovanaOsoba);
}
