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
                + "VALUES (?,?,?,?,?);";
        return jdbcTemplate.update(sql,pridavanaFirma.getNazov(),pridavanaFirma.getIco(),
                pridavanaFirma.getDic(),pridavanaFirma.getSidlo(),pridavanaFirma.getVybratyMod()) == 1;
    }

    @Override
    public boolean zmazFirmu(Firma mazanaFirma) {
        String sql = "DELETE FROM Firma WHERE nazov = ? AND ico = ?;";
        return 1 == jdbcTemplate.update(sql,mazanaFirma.getNazov(),mazanaFirma.getIco());
        
    }

    @Override
    public Firma getFirma(Long id) {
        String sql = "SELECT ID_Firma,nazov,ico,dic,sidlo,vybraty_mod"
                + " FROM Firma WHERE ID_firma = ?;";
        
        return jdbcTemplate.queryForObject(sql,new FirmaRowMapper(),id);   
   }
    
   @Override
   public Firma getFirma(String nazov,String ico) {
        String sql = "SELECT ID_Firma,nazov,ico,dic,sidlo,vybraty_mod"
                + " FROM Firma WHERE nazov = ? AND ico = ?;";   
        return jdbcTemplate.queryForObject(sql,new FirmaRowMapper(),nazov,ico);
   }

}
