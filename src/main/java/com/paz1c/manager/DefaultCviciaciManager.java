package com.paz1c.manager;

import com.paz1c.dao.CviciaciDao;
import com.paz1c.dao.DaoFactory;
import com.paz1c.other.Cviciaci;
import java.util.List;

public class DefaultCviciaciManager implements CviciaciManager{

    private CviciaciDao cviciaciDao;

    public DefaultCviciaciManager() {
        cviciaciDao = DaoFactory.INSTANCE.getCviciaciDao();
    }
    
    @Override
    public boolean vlozCvicaceho(Cviciaci pridavanaOsoba) {
        return cviciaciDao.vlozCvicaceho(pridavanaOsoba);
    }

    @Override
    public boolean zmazCviciaceho(Cviciaci mazanaOsoba) {
        return cviciaciDao.zmazCviciaceho(mazanaOsoba);
    }

    @Override
    public List<Cviciaci> getVsetkychCviciacich() {
        return cviciaciDao.getVsetkychCviciacich();
    }

    @Override
    public Cviciaci getCviciaceho(Long id) {
        return cviciaciDao.getCviciaceho(id);
    }

    @Override
    public List<Cviciaci> getCviciacich(String meno, String priezvisko) {
        return cviciaciDao.getCviciacich(meno, priezvisko);
    }

    @Override
    public boolean upravCviciaceho(Cviciaci upravovanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
