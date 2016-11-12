package com.paz1c.manager;

import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.SpravcaDao;
import com.paz1c.other.Spravca;
import java.util.List;

public class DefaultSpravcaManager implements SpravcaManager{

    private SpravcaDao spravcaDao;

    public DefaultSpravcaManager() {
        spravcaDao = DaoFactory.INSTANCE.getSpravcaDao();
    }
    
    @Override
    public boolean vlozSpravcu(Spravca pridavanySpravca) {
        return spravcaDao.vlozSpravcu(pridavanySpravca);
    }

    @Override
    public boolean zmazSpravcu(Spravca mazanySpravca) {
        return spravcaDao.zmazSpravcu(mazanySpravca);
    }

    @Override
    public List<Spravca> getVsetkychSpravcov() {
        return spravcaDao.getVsetkychSpravcov();
    }

    @Override
    public Spravca getSpravcu(Long id) {
        return spravcaDao.getSpravcu(id);
    }

    @Override
    public List<Spravca> getSpravcov(String meno, String priezvisko) {
        return spravcaDao.getSpravcov(meno, priezvisko);
    }
    
}
