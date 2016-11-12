package com.paz1c.mysqldao;

import com.paz1c.dao.CviciaciDao;
import com.paz1c.other.Cviciaci;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLCviciaciDao implements CviciaciDao{

    private JdbcTemplate jdbcTemplate;
    
    public MySQLCviciaciDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean vlozCvicaceho(Cviciaci pridavanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean zmazCviciaceho(Cviciaci mazanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cviciaci> getVsetkychCviciacich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cviciaci getCviciaceho(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Cviciaci> getCviciacich(String meno,String priezvisko) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean upravCviciaceho(Cviciaci upravovanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
