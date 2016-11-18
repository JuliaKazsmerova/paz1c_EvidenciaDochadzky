package com.paz1c.dao;

import com.paz1c.other.Firma;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MySQLFirmaDaoTest {
    
    FirmaDao firmaDao;
    Firma testovaciaFirma;
    
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
    }
    
    @After
    public void tearDown() {
    }

    
    public Firma vytvorFirmu(){
     
        Firma tesco = new Firma();
        tesco.setNazov("Tesco");
        tesco.setIco("123456789");
        tesco.setDic("999999");
        tesco.setSidlo("Kosice, Tahanovska 258");
        tesco.setVybratyMod("Zamestnanec");
        
        return tesco;
    }
    
     @Test
     public void vlozFirmu() {
        boolean result = firmaDao.vlozFirmu(testovaciaFirma);
        assertTrue(result);
        firmaDao.zmazFirmu(testovaciaFirma);
     }
     
     @Test
     public void zmazFirmu() {
        firmaDao.vlozFirmu(testovaciaFirma);
        boolean result = firmaDao.zmazFirmu(testovaciaFirma);
        assertTrue(result);
     }
     
     @Test
     public void getFirma() {
        firmaDao.vlozFirmu(testovaciaFirma);
        String nazov = testovaciaFirma.getNazov();
        String ico = testovaciaFirma.getIco();
        Firma firma = firmaDao.getFirma(nazov,ico);
        assertTrue(firma.getNazov().equals(nazov) && firma.getIco().equals(ico));  
        firmaDao.zmazFirmu(testovaciaFirma);
     }
     @Test
     public void getFirmaId() {
        firmaDao.vlozFirmu(testovaciaFirma);
        String nazov = testovaciaFirma.getNazov();
        String ico = testovaciaFirma.getIco();
        
        Firma vlozenaFirma = firmaDao.getFirma(nazov,ico);
        Firma firma = firmaDao.getFirma(vlozenaFirma.getIdFirma());
        
        assertTrue(firma.getNazov().equals(nazov) && firma.getIco().equals(ico));  
        firmaDao.zmazFirmu(testovaciaFirma);
     }
     @Test
     public void existsFirma(){
        firmaDao.vlozFirmu(testovaciaFirma);
        assertTrue(firmaDao.existsFirmaNazov(testovaciaFirma.getNazov()));
        firmaDao.zmazFirmu(testovaciaFirma);
         
     }
}
