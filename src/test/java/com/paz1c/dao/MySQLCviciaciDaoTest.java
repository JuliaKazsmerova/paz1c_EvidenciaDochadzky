package com.paz1c.dao;

import com.paz1c.other.Cviciaci;
import com.paz1c.other.Firma;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MySQLCviciaciDaoTest {
   
        
    private FirmaDao firmaDao;
    private Firma testovaciaFirma;
    private CviciaciDao cviciaciDao;
    private Cviciaci testovaciCviciaci;
    
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
        
        cviciaciDao = DaoFactory.INSTANCE.getCviciaciDao();
        testovaciCviciaci = vytvorCviciaceho();
    }
    
    
    
    @After
    public void tearDown() {
        firmaDao.zmazFirmu(testovaciaFirma);
    }
    
    public Firma vytvorFirmu(){
        Firma forma = new Firma();
        forma.setNazov("Forma");
        forma.setIco("03010709");
        forma.setDic("44444444");
        forma.setSidlo("Presov, Hlavna 5");
        forma.setVybratyMod("Cviciaci");
        
        return forma;
    }
    
    public Cviciaci vytvorCviciaceho(){
        Cviciaci cviciaci = new Cviciaci();
        cviciaci.setIdFirma(testovaciaFirma.getIdFirma());
        cviciaci.setMeno("Johny");
        cviciaci.setPriezvisko("Valibuk");
        
        return cviciaci;
    }

    
    
     @Test
    public void vlozCvicaceho() {
        int pocetPredPridanim = cviciaciDao.getVsetkychCviciacich().size();
        boolean result = cviciaciDao.vlozCvicaceho(testovaciCviciaci);
        int pocetPoPridani = cviciaciDao.getVsetkychCviciacich().size();
        
        assertTrue(pocetPoPridani-1==pocetPredPridanim && result);
        
        Cviciaci cviciaci = cviciaciDao.getCviciacich(testovaciCviciaci.getMeno(), testovaciCviciaci.getPriezvisko()).get(0);
        cviciaciDao.zmazCviciaceho(cviciaci);
    
    }

    @Test
    public void zmazCviciaceho() {
        cviciaciDao.vlozCvicaceho(testovaciCviciaci);
        String meno = testovaciCviciaci.getMeno();
        String priezvisko = testovaciCviciaci.getPriezvisko();
        Cviciaci cviciaci = cviciaciDao.getCviciacich(meno, priezvisko).get(0);
        
        int pocetPredMazanim = cviciaciDao.getVsetkychCviciacich().size();
        boolean result = cviciaciDao.zmazCviciaceho(cviciaci);
        int pocetPoMazani = cviciaciDao.getVsetkychCviciacich().size();
        
        assertTrue(pocetPredMazanim-1==pocetPoMazani && result);
    
    }

    @Test
    public void getVsetkychCviciacich() {
        List<Cviciaci> cviciaci = cviciaciDao.getVsetkychCviciacich();
        assertTrue(cviciaci != null);
    }

    @Test
    public void getCviciaceho() {
        cviciaciDao.vlozCvicaceho(testovaciCviciaci);
        String meno = testovaciCviciaci.getMeno();
        String priezvisko = testovaciCviciaci.getPriezvisko();
        Cviciaci cviciaci1 = cviciaciDao.getCviciacich(meno, priezvisko).get(0);
        
        Cviciaci cviciaci2 = cviciaciDao.getCviciaceho(cviciaci1.getIdOsoba());
        assertTrue(cviciaci2.getMeno().equals(meno) && cviciaci2.getPriezvisko().equals(priezvisko));
        
        cviciaciDao.zmazCviciaceho(cviciaci2);
    }
    
    @Test
    public void getCviciacich() {
        cviciaciDao.vlozCvicaceho(testovaciCviciaci);
        String meno = testovaciCviciaci.getMeno();
        String priezvisko = testovaciCviciaci.getPriezvisko();
        Cviciaci cviciaci = cviciaciDao.getCviciacich(meno, priezvisko).get(0);
        
        assertTrue(cviciaci.getMeno().equals(meno) && cviciaci.getPriezvisko().equals(priezvisko));
        
        cviciaciDao.zmazCviciaceho(cviciaci);
    }

    @Test
    public void upravCviciaceho() {
        cviciaciDao.vlozCvicaceho(testovaciCviciaci);
        String meno = testovaciCviciaci.getMeno();
        String priezvisko = testovaciCviciaci.getPriezvisko();
        Cviciaci cviciaci = cviciaciDao.getCviciacich(meno, priezvisko).get(0);
        
        cviciaci.setMeno("jozo");
        cviciaci.setPriezvisko("cvikla");
        boolean result = cviciaciDao.upravCviciaceho(cviciaci);
        Cviciaci upraveny = cviciaciDao.getCviciaceho(cviciaci.getIdOsoba());

        assertTrue(upraveny.getMeno().equals("jozo") && upraveny.getPriezvisko().equals("cvikla") && result);
        
        cviciaciDao.zmazCviciaceho(upraveny);
    }
    
}
