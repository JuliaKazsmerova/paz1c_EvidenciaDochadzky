package com.paz1c.manager;

import com.paz1c.constants.Nastavenia;
import com.paz1c.dao.DaoFactory;
import java.util.List;
import com.paz1c.dao.ZamestnanecDao;
import com.paz1c.dao.ZaznamDochadzkyDao;
import com.paz1c.other.Zamestnanec;
import com.paz1c.other.ZaznamDochadzky;
import java.util.ArrayList;


public class DefaultZamestnanecManager implements ZamestnanecManager{
    private final ZamestnanecDao zamestnanecDao;
    private final ZaznamDochadzkyDao zaznamDochadzkyDao;
    private List<Zamestnanec> zamestnanci = new ArrayList<>();
    
    public DefaultZamestnanecManager() {
        zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();
        zaznamDochadzkyDao = DaoFactory.INSTANCE.getZaznamDochadzkyDao();
    }
    
    
    @Override
    public boolean vlozZamestnanca(Zamestnanec pridavanaOsoba) {
       return zamestnanecDao.vlozZamestnanca(pridavanaOsoba);
    }

    @Override
    public boolean zmazZamestnanca(Zamestnanec mazanyZamestnanec) {
        //najprv musim vymazat vsetky jeho zaznamy v terminaly
        new DefaultZaznamDochadzkyManager().zmazVsetkyZaznamy(mazanyZamestnanec.getIdOsoba());
        return zamestnanecDao.zmazZamestnanca(mazanyZamestnanec);
    }

    @Override
    public List<Zamestnanec> getVsetkychZamestnancov() {
        zamestnanci = zamestnanecDao.getVsetkychZamestnancov(Nastavenia.idFirma);
        for (Zamestnanec zamestnanec : zamestnanci) {
            zamestnanec.setPoslednyZaznam(zaznamDochadzkyDao.getPoslednyZaznam(zamestnanec.getIdOsoba()));
            if(zamestnanec.getPoslednyZaznam()==null)
                zamestnanec.setPoslednyZaznam(new ZaznamDochadzky());
        }
        return zamestnanci;
    }
    
    @Override
    public List<Zamestnanec> getAktivnychZamestnancov() {
        List<Zamestnanec> vsetci = getVsetkychZamestnancov();
        List<Zamestnanec> aktivny = new ArrayList<>();
        for (Zamestnanec zamestnanec : vsetci) {
            ZaznamDochadzky zaznam = zamestnanec.getPoslednyZaznam();
            if(zaznam.getPrichod()!=null && zaznam.getOdchod()==null)
                aktivny.add(zamestnanec);
        }
        zamestnanci = aktivny;
        return zamestnanci;
    }
    
    @Override
    public List<Zamestnanec> getNeaktivnychZamestnancov() {
        List<Zamestnanec> vsetci = getVsetkychZamestnancov();
        List<Zamestnanec> neaktivny = new ArrayList<>();
        for (Zamestnanec zamestnanec : vsetci) {
            ZaznamDochadzky zaznam = zamestnanec.getPoslednyZaznam();
            if((zaznam.getPrichod()==null && zaznam.getOdchod()==null) || 
                    (zaznam.getPrichod()!=null && zaznam.getOdchod()!=null))
                neaktivny.add(zamestnanec);
        }
        zamestnanci = neaktivny;
        return zamestnanci;
    }
    
    @Override
    public Zamestnanec getNacitanychZamestnancov(int index) {
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
