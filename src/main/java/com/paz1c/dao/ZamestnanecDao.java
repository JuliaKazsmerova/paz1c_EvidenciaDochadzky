package com.paz1c.dao;

import com.paz1c.other.Zamestnanec;
import java.util.List;

public interface ZamestnanecDao {

    public boolean vlozZamestnanca(Zamestnanec pridavanaOsoba);
    
    public boolean zmazZamestnanca(Zamestnanec mazanaOsoba);
    
    public List<Zamestnanec> getVsetkychZamestnancov(Long idFirma);

    public List<Zamestnanec> getZamestnanci(String meno,String priezvisko);

    public Zamestnanec getZamestnanec(Long id);

    
    public boolean upravZamestnanca(Zamestnanec upravovanaOsoba);
    
}
