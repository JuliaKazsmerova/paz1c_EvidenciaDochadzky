package com.paz1c.dao;

import com.paz1c.constants.Nastavenia;
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
    /*
    public static void main(String[] args){
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
    public void vlozZamestnanca(Zamestnanec pridavanaOsoba) {
        String sql = "INSERT INTO Zamestnanec "
                + "(meno,priezvisko,ID_firma,"
                + "pocet_hodin_na_den,datum_nastupu,funkcia) "
                + "VALUES ("+pridavanaOsoba+")";
         
        System.out.println(sql);
        jdbcTemplate.update(sql);
    }

    @Override
    public boolean zmazZamestnanca(Zamestnanec mazanaOsoba) {  
        try{
            String sql = "DELETE FROM Zamestnanec WHERE ID_Zamestnanec="+mazanaOsoba.getIdOsoba()+";";
            System.out.println(sql);
            return 1 == jdbcTemplate.update(sql);
        }catch(DataAccessException e){
            return false;
        }
    }
        

    @Override
    public List<Zamestnanec> getVsetkychZamestnancov() {
        String sql = "SELECT ID_Zamestnanec,meno,priezvisko"
                + ",ID_firma,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia ,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia FROM Zamestnanec;";   
        System.out.println(sql);
        
        List<Zamestnanec> zamestnanci = null;
         try{
            zamestnanci = jdbcTemplate.query(sql,new ZamestnanecRowMapper());
        }catch(Exception e){
            System.err.println("Nepodarilo sa nacitat vsetkych zamestnancov");
        }
        return zamestnanci;
    }

    @Override
    public Zamestnanec getZamestnanec(Long id) {
       String sql = "SELECT ID_Zamestnanec,meno,priezvisko"
                + ",ID_firma,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia ,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia FROM Zamestnanec WHERE ID_sZamestnanec = "+id+";";   
        System.out.println(sql);
        
        Zamestnanec zamestnanec = null;
         try{
            zamestnanec = jdbcTemplate.query(sql,new ZamestnanecRowMapper()).get(0);
        }catch(Exception e){
            System.err.println("Nepodarilo sa nacitat vsetkych zamestnancov");
        }
        return zamestnanec;
    }

    @Override
    public boolean upravZamestnanca(Zamestnanec upravovanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
