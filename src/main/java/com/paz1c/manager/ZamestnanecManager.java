package com.paz1c.manager;

import com.paz1c.other.Osoba;
import com.paz1c.other.Zamestnanec;
import java.util.List;

public interface ZamestnanecManager {
     public boolean vlozZamestnanca(Zamestnanec pridavanaOsoba);
    
    public boolean zmazZamestnanca(Zamestnanec mazanaOsoba);
    
    public List<Zamestnanec> getVsetkychZamestnancov();

    public List<Zamestnanec> getZamestnanec(String meno,String priezvisko);

    public boolean upravZamestnanca(Zamestnanec upravovanaOsoba);
}
