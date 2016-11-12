package com.paz1c.dao;

import com.paz1c.mysqldao.MySQLFirmaDao;
import com.paz1c.mysqldao.MySQLZamestnanecDao;
import com.mysql.cj.jdbc.MysqlDataSource;
import com.paz1c.mysqldao.MySQLCviciaciDao;
import com.paz1c.mysqldao.MySQLSpravcaDao;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {
    
    INSTANCE;
    
    private ZamestnanecDao zamestnanecDao;
    private FirmaDao firmaDao;
    private SpravcaDao spravcaDao;
    private CviciaciDao cviciaciDao;
    
    private String host = "sql14.dnsserver.eu";
    private String dbname = "db86233xpaz1c";
    private String userName = "db86233xpaz1c";
    private String userPassword = "dochadzka1";

    private JdbcTemplate jdbcTemplate;

    private DaoFactory() {
        jdbcTemplate = mySQLconnection(host, dbname);
       
        zamestnanecDao = new MySQLZamestnanecDao(jdbcTemplate);
        firmaDao = new MySQLFirmaDao(jdbcTemplate);
        spravcaDao = new MySQLSpravcaDao(jdbcTemplate);
        cviciaciDao = new MySQLCviciaciDao(jdbcTemplate);
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
    
    public SpravcaDao getSpravcaDao(){
        return spravcaDao;
    }
    
    public CviciaciDao getCviciaciDao(){
        return cviciaciDao;
    }
    
}
