package com.paz1c.dao;

import com.paz1c.other.Firma;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MySQLFirmaDaoTest {
    
    public MySQLFirmaDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    private Firma tesco;
    
    public Firma vytvorFirmu(){
        if(tesco == null){
            tesco = new Firma();
            tesco.setNazov("Tesco");
            tesco.setIco("123456789");
            tesco.setDic("999999");
            tesco.setSidlo("Kosice, Tahanovska 258");
            tesco.setVybratyMod("Zamestnanec");
        }
        return tesco;
    }
    
     @Test
     public void vlozFirmu() {
        FirmaDao firmaDao = DaoFactory.INSTANCE.getFirmaDao();
        boolean result = firmaDao.vlozFirmu(vytvorFirmu());
        assertTrue(result);
        zmazFirmu();
     }
     
     @Test
     public void zmazFirmu() {
        FirmaDao firmaDao = DaoFactory.INSTANCE.getFirmaDao();
        boolean result = firmaDao.zmazFirmu(vytvorFirmu());
        assertTrue(result);
     }
     
     @Test
     public void getFirma() {
        FirmaDao firmaDao = DaoFactory.INSTANCE.getFirmaDao();
        String nazov = vytvorFirmu().getNazov();
        String ico = vytvorFirmu().getIco();
        Firma firma = firmaDao.getFirma(nazov,ico);
        assertTrue(firma.getNazov().equals(nazov) && firma.getIco().equals(ico));
     
     }
}
