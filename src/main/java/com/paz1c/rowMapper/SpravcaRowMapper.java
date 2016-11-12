package com.paz1c.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import com.paz1c.other.Spravca;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpravcaRowMapper implements RowMapper<Spravca>{

    @Override
    public Spravca mapRow(ResultSet rs, int i) throws SQLException {
        Spravca spravca = new Spravca();
        spravca.setIdOsoba(rs.getLong("ID_admin"));
        spravca.setMeno(rs.getString("meno"));
        spravca.setPriezvisko(rs.getString("priezvisko"));
        spravca.setEmail(rs.getString("email"));
        spravca.setPasswordHash(rs.getString("heslo"));
        spravca.setIdFirma(rs.getLong("ID_firma"));
        return spravca;
    }
    
}
