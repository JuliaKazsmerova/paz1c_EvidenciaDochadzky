package com.paz1c.mysqldao;

import com.paz1c.constants.Nastavenia;
import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.ZamestnanecDao;
import com.paz1c.other.Osoba;
import com.paz1c.other.Zamestnanec;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import com.paz1c.rowMapper.ZamestnanecRowMapper;
import org.springframework.jdbc.core.RowMapper;

public class MySQLZamestnanecDao implements ZamestnanecDao{
    
    private JdbcTemplate jdbcTemplate;
     
    public MySQLZamestnanecDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    
   /* public static void main(String[] args){
        MySQLZamestnanecDao a;
        a = new MySQLZamestnanecDao(DaoFactory.INSTANCE.mySQLconnection("sql14.dnsserver.eu", "db86233xpaz1c"));
        a.vytvotTabulky();
    } */
    
    public void vytvotTabulky(){
        String sql = nacitajSQLScript("vytvorenieTabuliek.sql");
        jdbcTemplate.execute(sql);
    }
    
    void zmazTabulky(){
        String sql = nacitajSQLScript("zmazanieTabuliek.sql");
        jdbcTemplate.execute(sql);
    }
    
    public String nacitajSQLScript(String script) {
        StringBuilder obsahScriptu = new StringBuilder();
        try{
            try(Scanner skener = new Scanner(new File(script))){
                while(skener.hasNextLine()){
                    obsahScriptu.append(skener.nextLine());
                }
            }
        }catch(IOException e){
            System.err.println("script "+script+" sa nepodarilo nacitat!!!!");
        }
        return obsahScriptu.toString();
    }

    @Override
    public boolean vlozZamestnanca(Zamestnanec pridavanyZamestnanec) {
        String sql = "INSERT INTO Zamestnanec "
                + "(meno,priezvisko,ID_firma,"
                + "pocet_hodin_na_den,datum_nastupu,funkcia) "
                + "VALUES (" + pridavanyZamestnanec + ");";
         
        try{
            return 1 == jdbcTemplate.update(sql);
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("zamestnanca: "+pridavanyZamestnanec+" sa nepodarilo ulozit");
            return false;
        }
    }

    @Override
    public boolean zmazZamestnanca(Zamestnanec mazanyZamestnanec) {  
        String sql = "DELETE FROM Zamestnanec WHERE ID_Zamestnanec = " + mazanyZamestnanec.getIdOsoba() + ";";
            
        try{
            return 1 == jdbcTemplate.update(sql);
        }catch(DataAccessException e){
            System.out.println(sql);
            return false;
        }
    }
        
    @Override
    public List<Zamestnanec> getVsetkychZamestnancov() {
        String sql = "SELECT ID_Zamestnanec,meno,priezvisko"
                + ",ID_firma,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia ,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia FROM Zamestnanec;";   
        
        List<Zamestnanec> zamestnanci = null;
         try{
            zamestnanci = jdbcTemplate.query(sql,new ZamestnanecRowMapper());
        }catch(Exception e) {
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat vsetkych zamestnancov");
        }
        return zamestnanci;
    }

    @Override
    public List<Zamestnanec> getZamestnanci(String meno,String priezvisko) {
       String sql = "SELECT ID_Zamestnanec,meno,priezvisko"
                + ",ID_firma,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia,pocet_hodin_na_den,datum_nastupu"
                + " FROM Zamestnanec WHERE meno = '"+meno+"' AND priezvisko = '"+priezvisko+"';";   
        
        List<Zamestnanec> zamestnanci = null;
        try{
            zamestnanci = jdbcTemplate.query(sql,new ZamestnanecRowMapper());
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat zamestnancov s menom: "+meno+" a priezviskom: "+priezvisko);
        }
        return zamestnanci;
    }
    
    @Override
    public Zamestnanec getZamestnanec(Long id) {
        String sql = "SELECT ID_Zamestnanec,meno,priezvisko"
                + ",ID_firma,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia ,pocet_hodin_na_den,datum_nastupu"
                + " FROM Zamestnanec WHERE ID_Zamestnanec = "+id+";";   
         
        Zamestnanec zamestnanec = null;
         try{
            zamestnanec = jdbcTemplate.query(sql,new ZamestnanecRowMapper()).get(0);
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat zamestnanca s id: "+id);
        }
        return zamestnanec;
    }
    
    
    @Override
    public boolean upravZamestnanca(Zamestnanec upravovanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    
}
