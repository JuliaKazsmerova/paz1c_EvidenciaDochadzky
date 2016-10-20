package com.paz1c.dao;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.paz1c.other.Osoba;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLOsobaDao implements OsobaDao{
        private String host = "sql14.dnsserver.eu";
        private String dbname = "db86233xpaz1c";
        private String userName = "db86233xpaz1c";
        private String userPassword = "dochadzka1";
        
    
    public static void main(String[] args){
        
    }

    public MySQLOsobaDao() {
        
        mySQLconnection();
    }
    
        /**Vytvori pripojenie na databazu*/
    public void mySQLconnection(){
        MysqlDataSource dataSource = new MysqlDataSource();
        
        String url =  "jdbc:mysql://"+host+"/"+dbname+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        
        dataSource.setUser(userName);
        dataSource.setPassword(userPassword);
        dataSource.setURL(url);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        

        // Example insert
        //String sql = "INSERT INTO vymazat(meno,priezvisko,vek) VALUES(?,?,?)";
        //jdbcTemplate.update(sql,"chu","ju","25");
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
