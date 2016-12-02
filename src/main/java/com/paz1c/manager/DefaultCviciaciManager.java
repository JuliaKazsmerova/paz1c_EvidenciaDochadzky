package com.paz1c.manager;

import com.paz1c.constants.Nastavenia;
import com.paz1c.dao.CviciaciDao;
import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.ZaznamDochadzkyDao;
import com.paz1c.other.Cviciaci;
import com.paz1c.other.ZaznamDochadzky;
import java.util.ArrayList;
import java.util.List;

public class DefaultCviciaciManager implements CviciaciManager{

    private final CviciaciDao cviciaciDao;
     private final ZaznamDochadzkyDao zaznamDochadzkyDao;
    private List<Cviciaci> cviciaci = new ArrayList<>();
    

    public DefaultCviciaciManager() {
        cviciaciDao = DaoFactory.INSTANCE.getCviciaciDao();
        zaznamDochadzkyDao = DaoFactory.INSTANCE.getZaznamDochadzkyDao();
    }
    
    @Override
    public boolean vlozCvicaceho(Cviciaci pridavanaOsoba) {
        return cviciaciDao.vlozCvicaceho(pridavanaOsoba);
    }

    @Override
    public boolean zmazCviciaceho(Cviciaci mazanaCviciaci) {
        new DefaultZaznamDochadzkyManager().zmazVsetkyZaznamy(mazanaCviciaci.getIdOsoba());
        return cviciaciDao.zmazCviciaceho(mazanaCviciaci);
    }

    @Override
    public List<Cviciaci> getVsetkychCviciacich() {
        cviciaci = cviciaciDao.getVsetkychCviciacich(Nastavenia.idFirma);
        for (Cviciaci cvic : cviciaci) {
            cvic.setPoslednyZaznam(zaznamDochadzkyDao.getPoslednyZaznam(cvic.getIdOsoba()));
            if(cvic.getPoslednyZaznam()==null)
                cvic.setPoslednyZaznam(new ZaznamDochadzky());
        }
        return cviciaci;
    }
    
    @Override
    public List<Cviciaci> getAktivnychCviciacich() {
        List<Cviciaci> vsetci = getVsetkychCviciacich();
        List<Cviciaci> aktivny = new ArrayList<>();
        for (Cviciaci zamestnanec : vsetci) {
            ZaznamDochadzky zaznam = zamestnanec.getPoslednyZaznam();
            if(zaznam.getPrichod()!=null && zaznam.getOdchod()==null)
                aktivny.add(zamestnanec);
        }
        cviciaci = aktivny;
        return cviciaci;
    }
    
    @Override
    public List<Cviciaci> getNeaktivnychCviciacich() {
        List<Cviciaci> vsetci = getVsetkychCviciacich();
        List<Cviciaci> neaktivny = new ArrayList<>();
        for (Cviciaci zamestnanec : vsetci) {
            ZaznamDochadzky zaznam = zamestnanec.getPoslednyZaznam();
            if((zaznam.getPrichod()==null && zaznam.getOdchod()==null) || 
                    (zaznam.getPrichod()!=null && zaznam.getOdchod()!=null))
                neaktivny.add(zamestnanec);
        }
        cviciaci = neaktivny;
        return cviciaci;
    }
    
    @Override
    public Cviciaci getNacitanychCviciacich(int index) {
        return cviciaci.get(index);
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
        return cviciaciDao.upravCviciaceho(upravovanaOsoba);
    }
    
    @Override
    public int pocetCviciacich() {
        return cviciaci.size();
    }
    
}
