package com.paz1c.manager;

import com.paz1c.constants.Nastavenia;
import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.SpravcaDao;
import com.paz1c.other.Spravca;
import java.util.ArrayList;
import java.util.List;

public class DefaultSpravcaManager implements SpravcaManager{

    private SpravcaDao spravcaDao;
    private List<Spravca> spravcovia = new ArrayList<>();

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
        spravcovia = spravcaDao.getVsetkychSpravcov(Nastavenia.idFirma);
        return spravcovia;
    }

    @Override
    public Spravca getSpravcuId(Long id) {
        return spravcaDao.getSpravcuId(id);
    }

    @Override
    public List<Spravca> getSpravcovMenoPriezvisko(String meno, String priezvisko) {
        return spravcaDao.getSpravcovMenoPriezvisko(meno, priezvisko);
    }

    @Override
    public Spravca getSpravcuEmail(String email) {
        return spravcaDao.getSpravcuEmail(email);
    }

    @Override
    public boolean existsEmail(String email) {
        if(getSpravcuEmail(email) == null)
            return false;
        else
            return true;
    }

    @Override
    public Spravca getVsetkychSpravcov(int index) {
        return spravcovia.get(index);
    }

    @Override
    public int pocetSpravcov() {
        return spravcovia.size();
    }
}
