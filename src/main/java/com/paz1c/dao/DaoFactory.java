package com.paz1c.dao;

import com.paz1c.mysqldao.MySQLFirmaDao;
import com.paz1c.mysqldao.MySQLZamestnanecDao;
import com.mysql.cj.jdbc.MysqlDataSource;
import com.paz1c.mysqldao.MySQLCviciaciDao;
import com.paz1c.mysqldao.MySQLSpravcaDao;
import com.paz1c.mysqldao.MySQLZaznamDochadzkyDao;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {
    
    INSTANCE;
    
    private ZamestnanecDao zamestnanecDao;
    private FirmaDao firmaDao;
    private SpravcaDao spravcaDao;
    private CviciaciDao cviciaciDao;
    private ZaznamDochadzkyDao zaznamDochadzkyDao;
    
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
        zaznamDochadzkyDao = new MySQLZaznamDochadzkyDao(jdbcTemplate);
        
        vytvorTabulky();
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
    
    private void vytvorTabulky(){
        String sql = nacitajSQLScript("vytvorenieTabuliek.sql");
        jdbcTemplate.execute(sql);
    }
    
    private void zmazTabulky(){
        String sql = nacitajSQLScript("zmazanieTabuliek.sql");
        jdbcTemplate.execute(sql);
    }
    
    private String nacitajSQLScript(String script) {
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

    public ZaznamDochadzkyDao getZaznamDochadzkyDao() {
        return zaznamDochadzkyDao;
    }

    
}
