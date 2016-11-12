package com.paz1c.mysqldao;

import com.paz1c.dao.FirmaDao;
import com.paz1c.other.Firma;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.paz1c.rowMapper.FirmaRowMapper;

public class MySQLFirmaDao implements FirmaDao{

    private JdbcTemplate jdbcTemplate;
    
    public MySQLFirmaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean vlozFirmu(Firma pridavanaFirma) {
        String sql = "INSERT INTO Firma (nazov,ico,dic,sidlo,vybraty_mod) "
                + "VALUES ("+pridavanaFirma+");";
        System.out.println(sql);
        return jdbcTemplate.update(sql) == 1;
    }

    @Override
    public boolean zmazFirmu(Firma mazanaFirma) {
        try{
            String sql = "DELETE FROM Firma WHERE nazov = '"+mazanaFirma.getNazov()
                    +"' AND ico = '"+mazanaFirma.getIco()+"';";
            System.out.println(sql);
            return 1 == jdbcTemplate.update(sql);
        }catch(DataAccessException e){
            return false;
        }
    }

    @Override
    public Firma getFirma(Long id) {
        String sql = "SELECT ID_Firma,nazov,ico"
                + ",dic,sidlo,vybraty_mod"
                + " FROM Firma WHERE ID_firma = "+id+";";   
        System.out.println(sql);
        Firma firma = null;
        try{
            firma = jdbcTemplate.query(sql,new FirmaRowMapper()).get(0);
        }catch(Exception e){
            System.err.println("Firma s id: "+id+" neexistuje v evidencii");
        }
        return firma;
   }
    
   @Override
   public Firma getFirma(String nazov,String ico) {
        String sql = "SELECT ID_Firma,nazov,ico"
                + ",dic,sidlo,vybraty_mod"
                + " FROM Firma WHERE nazov = '"+nazov+"' AND "
                + "ico = '"+ico+"';";   
        System.out.println(sql);
        Firma firma = null;
        try{
            firma = jdbcTemplate.query(sql,new FirmaRowMapper()).get(0);
        }catch(Exception e){
            System.err.println("Firma: "+nazov+" neexistuje v evidencii");
        }
        return firma;
   }

    
    
}
