package com.paz1c.mysqldao;

import com.paz1c.dao.CviciaciDao;
import com.paz1c.other.Cviciaci;
import com.paz1c.other.Spravca;
import com.paz1c.rowMapper.CviciaciRowMapper;
import com.paz1c.rowMapper.SpravcaRowMapper;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLCviciaciDao implements CviciaciDao{

    private JdbcTemplate jdbcTemplate;
    
    public MySQLCviciaciDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean vlozCvicaceho(Cviciaci pridavanyCviciaci) {
        String sql = "INSERT INTO Cviciaci (meno,priezvisko,ID_firma,kredit) "
                + "VALUES (?,?,?,?);";
        return 1 == jdbcTemplate.update(sql,pridavanyCviciaci.getMeno(),pridavanyCviciaci.getPriezvisko(),
                    pridavanyCviciaci.getIdFirma(),pridavanyCviciaci.getKredit());    
    }

    @Override
    public boolean zmazCviciaceho(Cviciaci mazanyCviciaci) {
        String sql = "DELETE FROM Cviciaci WHERE ID_cviciaci = ?;";
        return 1 == jdbcTemplate.update(sql,mazanyCviciaci.getIdOsoba());
    }

    @Override
    public List<Cviciaci> getVsetkychCviciacich() {
        String sql = "SELECT ID_cviciaci,meno,priezvisko,ID_firma,kredit FROM Cviciaci;";
        return jdbcTemplate.query(sql,new CviciaciRowMapper());    
    }

    @Override
    public Cviciaci getCviciaceho(Long id) {
        String sql = "SELECT ID_cviciaci,meno,priezvisko,ID_firma,kredit"
                + " FROM Cviciaci WHERE ID_cviciaci = ?;";   
        return jdbcTemplate.queryForObject(sql,new CviciaciRowMapper(),id);
        
    }
    
    @Override
    public List<Cviciaci> getCviciacich(String meno,String priezvisko) {
         String sql = "SELECT ID_cviciaci,meno,priezvisko"
                + ",ID_firma,kredit"
                + " FROM Cviciaci WHERE meno = ? AND priezvisko = ?;";   
        return jdbcTemplate.query(sql,new CviciaciRowMapper(),meno,priezvisko);
        
    }

    @Override
    public boolean upravCviciaceho(Cviciaci upravovanaOsoba) {
        String sql = "UPDATE Cviciaci SET meno = ?,priezvisko = ?,kredit = ? WHERE ID_cviciaci = ?";
        return 1 == jdbcTemplate.update(sql,upravovanaOsoba.getMeno(),upravovanaOsoba.getPriezvisko(),
                upravovanaOsoba.getKredit(),upravovanaOsoba.getIdOsoba());
    }
    
}
