package com.paz1c.dao;

import com.paz1c.other.Firma;
import com.paz1c.other.Zamestnanec;
import com.paz1c.other.ZaznamDochadzky;
import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MySQLZaznamDochadzkyDaoTest {
    
    private FirmaDao firmaDao;
    private Firma testovaciaFirma;
    private ZamestnanecDao zamestnanecDao;
    private Zamestnanec testovaciZamestnanec;
    
    private ZaznamDochadzkyDao zaznamDao;
    private ZaznamDochadzky testovaciZaznam;
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        firmaDao = DaoFactory.INSTANCE.getFirmaDao();
        testovaciaFirma = vytvorFirmu();
        firmaDao.vlozFirmu(testovaciaFirma);
        testovaciaFirma = firmaDao.getFirma(testovaciaFirma.getNazov(), testovaciaFirma.getIco()); 
        zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();
        testovaciZamestnanec = vytvorZamestnanca();
        zamestnanecDao.vlozZamestnanca(testovaciZamestnanec);
        testovaciZamestnanec = zamestnanecDao.getZamestnanci(testovaciZamestnanec.getMeno(),testovaciZamestnanec.getPriezvisko()).get(0);
        
        
        zaznamDao = DaoFactory.INSTANCE.getZaznamDochadzkyDao();
        testovaciZaznam = vytvorZaznam();
    }
    
    @After
    public void tearDown() {
        zamestnanecDao.zmazZamestnanca(testovaciZamestnanec);
        firmaDao.zmazFirmu(testovaciaFirma);
        
    }
    
    public Firma vytvorFirmu(){
         Firma kralovstvo = new Firma();
         kralovstvo.setNazov("Kralovstvo");
         kralovstvo.setIco("6666666");
         kralovstvo.setDic("777777");
         kralovstvo.setSidlo("Brezno, Mierova -1");
         kralovstvo.setVybratyMod("Zamestnanec");
         
         return kralovstvo;
     }
    
    public Zamestnanec vytvorZamestnanca(){
         Zamestnanec zamestnanec = new Zamestnanec();
         zamestnanec.setIdFirma(testovaciaFirma.getIdFirma());
         zamestnanec.setMeno("Karol");
         zamestnanec.setPriezvisko("Malomocny");
         zamestnanec.setPocetHodinNaDen(7);
         zamestnanec.setZameranie("sluha");
         zamestnanec.setDatumNastupu(new Date(System.currentTimeMillis()));
         
         return zamestnanec;
     }

    public ZaznamDochadzky vytvorZaznam(){
         ZaznamDochadzky zaznam = new ZaznamDochadzky();
         zaznam.setPrichod(new Date(System.currentTimeMillis()));
         zaznam.setOdchod(new Date(System.currentTimeMillis()+154545));
         zaznam.setOdrobeneHodiny(7);
         zaznam.setIdOsoba(testovaciZamestnanec.getIdOsoba());
         
         return zaznam;
     }
    
    @Test
    public void vlozZaznam() {
        boolean result = zaznamDao.vlozZaznam(testovaciZaznam);
        assertTrue(result);
        testovaciZaznam = zaznamDao.getPoslednyZaznam(testovaciZamestnanec.getIdOsoba());
        zaznamDao.zmazZaznam(testovaciZaznam);
    }
    
    @Test
    public void zmazZaznam() {
        zaznamDao.vlozZaznam(testovaciZaznam);
        testovaciZaznam = zaznamDao.getPoslednyZaznam(testovaciZamestnanec.getIdOsoba());
        boolean result = zaznamDao.zmazZaznam(testovaciZaznam);
        assertTrue(result);
    }
    
    @Test
    public void getPoslednyZaznam() {
        zaznamDao.vlozZaznam(testovaciZaznam);
        ZaznamDochadzky vratenyZaznam = zaznamDao.getPoslednyZaznam(testovaciZamestnanec.getIdOsoba());
        assertTrue(vratenyZaznam.getIdOsoba().equals(testovaciZaznam.getIdOsoba()) && 
                vratenyZaznam.getOdrobeneHodiny() == testovaciZaznam.getOdrobeneHodiny());
        zaznamDao.zmazZaznam(vratenyZaznam);
    }
    
    @Test
    public void upravZaznam() {
        zaznamDao.vlozZaznam(testovaciZaznam);
        testovaciZaznam = zaznamDao.getPoslednyZaznam(testovaciZamestnanec.getIdOsoba());
        testovaciZaznam.setOdrobeneHodiny(4);
        boolean result = zaznamDao.upravZaznam(testovaciZaznam);
        zaznamDao.zmazZaznam(testovaciZaznam);
        assertTrue(result);
    }
    
}
