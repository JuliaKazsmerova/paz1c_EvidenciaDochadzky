package com.paz1c.dao;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Osoba;
import com.paz1c.other.Zamestnanec;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLOsobaDao implements OsobaDao{
    
        private String host = "sql14.dnsserver.eu";
        private String dbname = "db86233xpaz1c";
        private String userName = "db86233xpaz1c";
        private String userPassword = "dochadzka1";

        private JdbcTemplate jdbcTemplate;
        
    
    public static void main(String[] args){
        MySQLOsobaDao a = new MySQLOsobaDao();
    }

    public MySQLOsobaDao() {
        jdbcTemplate = mySQLconnection(host, dbname);
        Zamestnanec n = new Zamestnanec();
        n.setIdFirma(1);
        n.setMeno("Jano");
        n.setPriezvisko("Novak");
        n.setPocetHodinNaDen(8);
        n.setZameranie("umyvac okien");
        
        System.out.println(n);
        vlozOsobu(n);
    }
    
        /**Vytvori pripojenie na databazu*/
    public JdbcTemplate mySQLconnection(String host,String dbname){
        MysqlDataSource dataSource = new MysqlDataSource();
        String url =  "jdbc:mysql://"+host+"/"+dbname+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true";
        
        dataSource.setUser(userName);
        dataSource.setPassword(userPassword);
        dataSource.setURL(url);
        return new JdbcTemplate(dataSource);
    }
    
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
    public void vlozOsobu(Osoba pridavanaOsoba) {
        String sql = "INSERT INTO "+Nastavenia.vybranyMod;
        if(Nastavenia.vybranyMod.equals("Zamestnanec")){
            sql += " (meno,priezvisko,ID_firma,pocet_hodin_na_den,datum_nastupu,funkcia) "
                    + "VALUES ("+(Zamestnanec)pridavanaOsoba+")";
        }else if (Nastavenia.vybranyMod.equals("Cviciaci")){
            sql += " () VALUES ()";
            System.err.println("treba dopisal insert");
        }else if (Nastavenia.vybranyMod.equals("Student")){
            sql += " () VALUES ()";
            System.err.println("treba dopisal insert");
        }
        System.out.println(sql);
        jdbcTemplate.update(sql);
    }

    @Override
    public boolean zmazOsobu(Osoba mazanaOsoba) {
        boolean uspesne;
        try{
            uspesne = true;
            String tabulka = Nastavenia.vybranyMod;
            String sql = "DELETE FROM "+tabulka+" WHERE ID_"+tabulka+"="+mazanaOsoba.getIdOsoba()+";";
            System.out.println(sql);
            jdbcTemplate.execute(sql);
        }catch(DataAccessException e){
            uspesne = false;
        }
        return uspesne;
    }
        

    @Override
    public List<Osoba> getVsetkyOsoby() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Osoba getOsoba(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean upravOsobu(Osoba upravovanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
