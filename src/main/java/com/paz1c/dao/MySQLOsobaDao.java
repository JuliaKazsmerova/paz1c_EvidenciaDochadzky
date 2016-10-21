package com.paz1c.dao;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.paz1c.other.Osoba;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLOsobaDao implements OsobaDao{
        private String host = "sql14.dnsserver.eu";
        private String dbname = "db86233xpaz1c";
        private String userName = "db86233xpaz1c";
        private String userPassword = "dochadzka1";
        
    
    public static void main(String[] args){
        MySQLOsobaDao a = new MySQLOsobaDao();
    }

    public MySQLOsobaDao() {
        vytvotTabulky();
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
        JdbcTemplate jdbcTemplate = mySQLconnection(host, dbname);
        String sql = nacitajSQLScript("vytvorenieTabuliek.sql");
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
    public void pridaj(Osoba pridavanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void zmaz(Osoba mazanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
