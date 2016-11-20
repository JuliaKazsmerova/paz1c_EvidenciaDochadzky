package com.paz1c.rowMapper;

import com.paz1c.other.ZaznamDochadzky;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class ZaznamDochadzkyRowMapper implements RowMapper<ZaznamDochadzky>{

    @Override
    public ZaznamDochadzky mapRow(ResultSet rs, int i) throws SQLException {
        ZaznamDochadzky zaznam = new ZaznamDochadzky();
        zaznam.setId(rs.getLong("ID_den"));
        zaznam.setPrichod(rs.getDate("prichod"));
        zaznam.setOdchod(rs.getDate("odchod"));
        zaznam.setOdrobeneHodiny(rs.getInt("odrobene_hodiny"));
        zaznam.setIdOsoba(rs.getLong("ID_osoba"));
        
        return zaznam;
    }
    
}
