package com.paz1c.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import com.paz1c.other.Cviciaci;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CviciaciRowMapper implements RowMapper<Cviciaci>{

    @Override
    public Cviciaci mapRow(ResultSet rs, int i) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
