package com.paz1c.dao;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {
    
    INSTANCE;
    
    private ZamestnanecDao zamestnanecDao;
    private FirmaDao firmaDao;
    private String host = "sql14.dnsserver.eu";
    private String dbname = "db86233xpaz1c";
    private String userName = "db86233xpaz1c";
    private String userPassword = "dochadzka1";

    private JdbcTemplate jdbcTemplate;

    private DaoFactory() {
        jdbcTemplate = mySQLconnection(host, dbname);
       
        zamestnanecDao = new MySQLZamestnanecDao(jdbcTemplate);
        firmaDao = new MySQLFirmaDao(jdbcTemplate);
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
    
    public ZamestnanecDao getZamestnanecDao(){
        return zamestnanecDao;
    }
    
    public FirmaDao getFirmaDao(){
        return firmaDao;
    }
    
    
    
}
