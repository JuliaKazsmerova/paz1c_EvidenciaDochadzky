package com.paz1c.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import com.paz1c.other.Cviciaci;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CviciaciRowMapper implements RowMapper<Cviciaci>{

    @Override
    public Cviciaci mapRow(ResultSet rs, int i) throws SQLException {
        Cviciaci cviciaci = new Cviciaci();
        cviciaci.setIdOsoba(rs.getLong("ID_cviciaci"));
        cviciaci.setMeno(rs.getString("meno"));
        cviciaci.setPriezvisko(rs.getString("priezvisko"));
        cviciaci.setKredit(rs.getDouble("kredit"));
        cviciaci.setIdFirma(rs.getLong("ID_firma"));
        cviciaci.setSumaZaHodinu(rs.getDouble("suma_za_hodinu"));
        return cviciaci;
    }
    
}
    
