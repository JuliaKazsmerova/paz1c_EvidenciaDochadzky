package com.paz1c.manager;

import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.FirmaDao;
import com.paz1c.other.Firma;

public class DefaultFirmaManager implements FirmaManager{

    private FirmaDao firmaDao;

    public DefaultFirmaManager() {
        firmaDao = DaoFactory.INSTANCE.getFirmaDao();
    }
    
    
    @Override
    public boolean vlozFirmu(Firma pridavanaFirma) {
        return firmaDao.vlozFirmu(pridavanaFirma);
    }

    @Override
    public boolean zmazFirmu(Firma mazanaFirma) {
        return firmaDao.zmazFirmu(mazanaFirma);
    }

    @Override
    public Firma getFirma(Long id) {
        return firmaDao.getFirma(id);
    }

    @Override
    public Firma getFirma(String nazov, String ico) {
        return firmaDao.getFirma(nazov, ico);
    }

    @Override
    public boolean existsFirmaNazov(String nazov) {
        return firmaDao.existsFirmaNazov(nazov);
    }

    @Override
    public boolean existsFirmaIco(String ico) {
        return firmaDao.existsFirmaIco(ico);
    }
    
}
