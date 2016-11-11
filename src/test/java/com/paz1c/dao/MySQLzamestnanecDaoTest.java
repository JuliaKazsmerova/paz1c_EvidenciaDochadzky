package com.paz1c.dao;

import com.paz1c.other.Zamestnanec;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MySQLzamestnanecDaoTest {
    
    public MySQLzamestnanecDaoTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private Zamestnanec jano;
    
    public Zamestnanec vytvorZamestnanca(){
        if(jano == null){
            jano = new Zamestnanec();
            jano.setIdFirma(1);
            jano.setMeno("Jano");
            jano.setPriezvisko("Novak");
            jano.setPocetHodinNaDen(8);
            jano.setZameranie("umyvac okien");
        }
        return jano;
    }
    
    @Test
    public void vlozZamestnanca() {
        ZamestnanecDao osobaDao = DaoFactory.INSTANCE.getZamestnanecDao();
        int pocetPredPridanim = osobaDao.getVsetkychZamestnancov().size();
        osobaDao.vlozZamestnanca(vytvorZamestnanca());
        int pocetPoPridani = osobaDao.getVsetkychZamestnancov().size();
        assertTrue(pocetPoPridani-1==pocetPredPridanim);
     }
    
    @Test
    public void zmazZamestnanca(){
        ZamestnanecDao osobaDao = DaoFactory.INSTANCE.getZamestnanecDao();
        int pocetPredMazanim = osobaDao.getVsetkychZamestnancov().size();
        osobaDao.zmazZamestnanca(vytvorZamestnanca());
        int pocetPoMazani = osobaDao.getVsetkychZamestnancov().size();
        assertTrue(pocetPredMazanim-1==pocetPoMazani);
    }
}
