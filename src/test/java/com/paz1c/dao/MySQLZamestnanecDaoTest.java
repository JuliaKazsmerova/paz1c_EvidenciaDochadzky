package com.paz1c.dao;
 
 import com.paz1c.other.Zamestnanec;
 import com.paz1c.other.Firma;
 import java.sql.Date;
 import java.util.List;
 import org.junit.After;
 import org.junit.AfterClass;
 import org.junit.Before;
 import org.junit.BeforeClass;
 import org.junit.Test;
 import static org.junit.Assert.*;
 
 
 public class MySQLZamestnanecDaoTest {
  
     private FirmaDao firmaDao;
     private Firma testovaciaFirma;
     private ZamestnanecDao zamestnanecDao;
     private Zamestnanec testovaciZamestnanec;
     
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
         
     }
     
     @After
     public void tearDown() {
         firmaDao.zmazFirmu(testovaciaFirma);
     }
 
     public Firma vytvorFirmu(){
         Firma fresh = new Firma();
         fresh.setNazov("Fresh");
         fresh.setIco("0325896");
         fresh.setDic("6666666");
         fresh.setSidlo("Jasov, Kostolna 101");
         fresh.setVybratyMod("Zamestnanec");
         
         return fresh;
     }
     
     public Zamestnanec vytvorZamestnanca(){
         Zamestnanec zamestnanec = new Zamestnanec();
         zamestnanec.setIdFirma(testovaciaFirma.getIdFirma());
         zamestnanec.setMeno("Jano");
         zamestnanec.setPriezvisko("Novak");
         zamestnanec.setPocetHodinNaDen(8);
         zamestnanec.setZameranie("umyvac okien");
         zamestnanec.setDatumNastupu(new Date(System.currentTimeMillis()));
         
         return zamestnanec;
     }
     
     @Test
     public void vlozZamestnanca() {
         int pocetPredPridanim = zamestnanecDao.getVsetkychZamestnancov().size();
         boolean result = zamestnanecDao.vlozZamestnanca(testovaciZamestnanec);
         int pocetPoPridani = zamestnanecDao.getVsetkychZamestnancov().size();
         
         assertTrue(pocetPoPridani-1==pocetPredPridanim && result);
         
         Zamestnanec zamestnanec = zamestnanecDao.getZamestnanci(testovaciZamestnanec.getMeno(), testovaciZamestnanec.getPriezvisko()).get(0);
         zamestnanecDao.zmazZamestnanca(zamestnanec);
     }
     
     @Test
     public void zmazZamestnanca(){
         zamestnanecDao.vlozZamestnanca(testovaciZamestnanec);
         String meno = testovaciZamestnanec.getMeno();
         String priezvisko = testovaciZamestnanec.getPriezvisko();
         Zamestnanec zamestnanec = zamestnanecDao.getZamestnanci(meno, priezvisko).get(0);
         
         int pocetPredMazanim = zamestnanecDao.getVsetkychZamestnancov().size();
         boolean result = zamestnanecDao.zmazZamestnanca(zamestnanec);
         int pocetPoMazani = zamestnanecDao.getVsetkychZamestnancov().size();
         
         assertTrue(pocetPredMazanim-1==pocetPoMazani && result);
     }
     
     @Test
     public void getZamestnanci(){
         zamestnanecDao.vlozZamestnanca(testovaciZamestnanec);
         String meno = testovaciZamestnanec.getMeno();
         String priezvisko = testovaciZamestnanec.getPriezvisko();
         Zamestnanec zamestnanec = zamestnanecDao.getZamestnanci(meno, priezvisko).get(0);
         
         assertTrue(zamestnanec.getMeno().equals(meno) && zamestnanec.getPriezvisko().equals(priezvisko));
         
         zamestnanecDao.zmazZamestnanca(zamestnanec);
     }
     
     @Test
     public void getVsetkychZamestnancov(){
         List<Zamestnanec> zamestnanci = zamestnanecDao.getVsetkychZamestnancov();
         assertTrue(zamestnanci != null);
     }
     
     @Test
     public void getZamestnanec(){
         zamestnanecDao.vlozZamestnanca(testovaciZamestnanec);
         String meno = testovaciZamestnanec.getMeno();
         String priezvisko = testovaciZamestnanec.getPriezvisko();
         Zamestnanec zamestnanec1 = zamestnanecDao.getZamestnanci(meno, priezvisko).get(0);
         
         Zamestnanec zamestnanec2 = zamestnanecDao.getZamestnanec(zamestnanec1.getIdOsoba());
         assertTrue(zamestnanec2.getMeno().equals(meno) && zamestnanec2.getPriezvisko().equals(priezvisko));
         
         zamestnanecDao.zmazZamestnanca(zamestnanec2);
     }
     
     @Test
     public void upravZamestnanca() {
        zamestnanecDao.vlozZamestnanca(testovaciZamestnanec);
        String meno = testovaciZamestnanec.getMeno();
        String priezvisko = testovaciZamestnanec.getPriezvisko();
        Zamestnanec cviciaci = zamestnanecDao.getZamestnanci(meno, priezvisko).get(0);
        
        cviciaci.setMeno("dula");
        cviciaci.setPriezvisko("baci");
        boolean result = zamestnanecDao.upravZamestnanca(cviciaci);
        Zamestnanec upraveny = zamestnanecDao.getZamestnanec(cviciaci.getIdOsoba());

        assertTrue(upraveny.getMeno().equals("dula") && upraveny.getPriezvisko().equals("baci") && result);
        
        zamestnanecDao.zmazZamestnanca(upraveny);
     }
 }