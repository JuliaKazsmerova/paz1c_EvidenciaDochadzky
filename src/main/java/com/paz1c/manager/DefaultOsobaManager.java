package com.paz1c.manager;

import com.paz1c.dao.OsobaDao;
import com.paz1c.dao.OsobaDaoFactory;
import com.paz1c.other.Osoba;
import java.util.List;


public class DefaultOsobaManager implements OsobaManager{
    private OsobaDao osobaDao = OsobaDaoFactory.INSTANCE.getOsobaDao();

    @Override
    public List<Osoba> getVsetkyOsoby() {
       return osobaDao.getVsetkyOsoby();
    }

    @Override
    public void vlozOsobu(Osoba pridavanaOsoba) {
        osobaDao.vlozOsobu(pridavanaOsoba);
    }

    @Override
    public boolean zmazOsobu(Osoba mazanaOsoba) {
        return osobaDao.zmazOsobu(mazanaOsoba);
    }

    @Override
    public Osoba getOsoba(int id) {
        return osobaDao.getOsoba(id);
    }

    @Override
    public boolean upravOsobu(Osoba upravovanaOsoba) {
        return osobaDao.upravOsobu(upravovanaOsoba);
    }
    
    
}
