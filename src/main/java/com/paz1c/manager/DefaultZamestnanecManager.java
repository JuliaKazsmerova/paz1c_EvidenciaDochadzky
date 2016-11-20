package com.paz1c.manager;

import com.paz1c.dao.DaoFactory;
import com.paz1c.other.Osoba;
import java.util.List;
import com.paz1c.dao.ZamestnanecDao;
import com.paz1c.other.Zamestnanec;
import java.util.ArrayList;


public class DefaultZamestnanecManager implements ZamestnanecManager{
    private ZamestnanecDao zamestnanecDao;
    private List<Zamestnanec> zamestnanci = new ArrayList<>();
    
    public DefaultZamestnanecManager() {
        zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();
    }
    
    
    @Override
    public boolean vlozZamestnanca(Zamestnanec pridavanaOsoba) {
       return zamestnanecDao.vlozZamestnanca(pridavanaOsoba);
    }

    @Override
    public boolean zmazZamestnanca(Zamestnanec mazanyZamestnanec) {
        return zamestnanecDao.zmazZamestnanca(mazanyZamestnanec);
    }

    @Override
    public List<Zamestnanec> getVsetkychZamestnancov() {
        zamestnanci = zamestnanecDao.getVsetkychZamestnancov();
        return zamestnanci;
    }
    
    public List<Zamestnanec> getAktivnychZamestnancov() {
        List<Zamestnanec> vsetci = zamestnanecDao.getVsetkychZamestnancov();
        return null;
    }
    
    @Override
    public Zamestnanec getVsetkychZamestnancov(int index) {
        return zamestnanci.get(index);
    }

    @Override
    public List<Zamestnanec> getZamestnanci(String meno,String priezvisko) {
        return zamestnanecDao.getZamestnanci(meno,priezvisko);
    }
    
    @Override
    public Zamestnanec getZamestnanec(Long id) {
        return zamestnanecDao.getZamestnanec(id);
    }

    @Override
    public boolean upravZamestnanca(Zamestnanec upravovanyZamestnanec) {
        return zamestnanecDao.upravZamestnanca(upravovanyZamestnanec);
    }

    @Override
    public int pocetZamestnancov() {
        return zamestnanci.size();
    }
    
    
}
