package com.paz1c.dao;

import com.paz1c.other.Firma;
import com.paz1c.other.Spravca;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MySQLSpravcaDaoTest {
    
    private FirmaDao firmaDao;
    private Firma testovaciaFirma;
    private SpravcaDao spravcaDao;
    private Spravca testovaciSpravca;
    
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
        
        spravcaDao = DaoFactory.INSTANCE.getSpravcaDao();
        testovaciSpravca = vytvorSpravcu();
    }
    
    @After
    public void tearDown() {
        firmaDao.zmazFirmu(testovaciaFirma);
    }
    
    public Firma vytvorFirmu(){
        Firma ibm = new Firma();
        ibm.setNazov("IBM");
        ibm.setIco("147147147");
        ibm.setDic("0909080809");
        ibm.setSidlo("Kosice, Smoliarska 15");
        ibm.setVybratyMod("Zamestnanec");
        
        return ibm;
    }
    
    
    public Spravca vytvorSpravcu(){
        Spravca spravca = new Spravca();
        spravca.setIdFirma(testovaciaFirma.getIdFirma());
        spravca.setMeno("Big");
        spravca.setPriezvisko("Boss");
        spravca.setPassword("sunka");
        spravca.setEmail("ja@som.sef");
        
        return spravca;
    }
    
    @Test
    public void vlozSpravcu() {
        int pocetPredPridanim = spravcaDao.getVsetkychSpravcov().size();
        boolean result = spravcaDao.vlozSpravcu(testovaciSpravca);
        int pocetPoPridani = spravcaDao.getVsetkychSpravcov().size();
        
        assertTrue(pocetPoPridani-1==pocetPredPridanim && result);
        
        Spravca spravca = spravcaDao.getSpravcovMenoPriezvisko(testovaciSpravca.getMeno(), testovaciSpravca.getPriezvisko()).get(0);
        spravcaDao.zmazSpravcu(spravca);
    }

    @Test
    public void zmazSpravcu() {
       spravcaDao.vlozSpravcu(testovaciSpravca);
       String meno = testovaciSpravca.getMeno();
       String priezvisko = testovaciSpravca.getPriezvisko();
       Spravca spravca = spravcaDao.getSpravcovMenoPriezvisko(meno, priezvisko).get(0);
       
       int pocetPredMazanim = spravcaDao.getVsetkychSpravcov().size();
       boolean result = spravcaDao.zmazSpravcu(spravca);
       int pocetPoMazani = spravcaDao.getVsetkychSpravcov().size();
    
       assertTrue(pocetPredMazanim-1==pocetPoMazani && result);
    }
    

    @Test
    public void getVsetkychSpravcov() {
        List<Spravca> spravcovia = spravcaDao.getVsetkychSpravcov();
        assertTrue(spravcovia != null);
    }

    @Test
    public void getSpravcuId() {
        spravcaDao.vlozSpravcu(testovaciSpravca);
        String meno = testovaciSpravca.getMeno();
        String priezvisko = testovaciSpravca.getPriezvisko();
        Spravca spravca1 = spravcaDao.getSpravcovMenoPriezvisko(meno, priezvisko).get(0);
        
        Spravca spravca2 = spravcaDao.getSpravcuId(spravca1.getIdOsoba());
        assertTrue(spravca2.getMeno().equals(meno) && spravca2.getPriezvisko().equals(priezvisko));
        
        spravcaDao.zmazSpravcu(spravca2);
    }
    
    @Test
    public void getSpravcovMenoPriezvisko() {
       spravcaDao.vlozSpravcu(testovaciSpravca);
        String meno = testovaciSpravca.getMeno();
        String priezvisko = testovaciSpravca.getPriezvisko();
        Spravca spravca = spravcaDao.getSpravcovMenoPriezvisko(meno, priezvisko).get(0);
        
        assertTrue(spravca.getMeno().equals(meno) && spravca.getPriezvisko().equals(priezvisko));
        
        spravcaDao.zmazSpravcu(spravca);
    }
    
    @Test
    public void getSpravcuEmail() {
        spravcaDao.vlozSpravcu(testovaciSpravca);
        
        Spravca spravca = spravcaDao.getSpravcuEmail(testovaciSpravca.getEmail());
        assertTrue(spravca.getMeno().equals(testovaciSpravca.getMeno()) && spravca.getPriezvisko().equals(testovaciSpravca.getPriezvisko()));
        
        spravcaDao.zmazSpravcu(spravca);
    }
}
