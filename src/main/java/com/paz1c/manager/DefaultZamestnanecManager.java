package com.paz1c.manager;

import com.paz1c.dao.DaoFactory;
import com.paz1c.other.Osoba;
import java.util.List;
import com.paz1c.dao.ZamestnanecDao;
import com.paz1c.other.Zamestnanec;


public class DefaultZamestnanecManager implements ZamestnanecManager{
    private ZamestnanecDao osobaDao = DaoFactory.INSTANCE.getZamestnanecDao();

    @Override
    public void vlozZamestnanca(Zamestnanec pridavanaOsoba) {
       osobaDao.vlozZamestnanca(pridavanaOsoba);
    }

    @Override
    public boolean zmazZamestnanca(Zamestnanec mazanyZamestnanec) {
        return osobaDao.zmazZamestnanca(mazanyZamestnanec);
    }

    @Override
    public List<Zamestnanec> getVsetkychZamestnancov() {
        return osobaDao.getVsetkychZamestnancov();
    }

    @Override
    public Zamestnanec getZamestnanec(Long id) {
        return osobaDao.getZamestnanec(id);
    }

    @Override
    public boolean upravZamestnanca(Zamestnanec upravovanyZamestnanec) {
        return osobaDao.upravZamestnanca(upravovanyZamestnanec);
    }
    
    
}
