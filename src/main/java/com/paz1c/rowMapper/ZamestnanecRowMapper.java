package com.paz1c.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import com.paz1c.other.Zamestnanec;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZamestnanecRowMapper implements RowMapper<Zamestnanec>{

    @Override
    public Zamestnanec mapRow(ResultSet rs, int i) throws SQLException {
        Zamestnanec zamestnanec = new Zamestnanec();
        zamestnanec.setIdOsoba(rs.getLong("ID_Zamestnanec"));
        zamestnanec.setMeno(rs.getString("meno"));
        zamestnanec.setPriezvisko(rs.getString("priezvisko"));
        zamestnanec.setIdFirma(rs.getLong("ID_firma"));
        zamestnanec.setPocetHodinNaDen(rs.getInt("pocet_hodin_na_den"));
        zamestnanec.setDatumNastupu(rs.getDate("datum_nastupu"));
        zamestnanec.setZameranie(rs.getString("funkcia"));
        zamestnanec.setHodMzda(rs.getDouble("hod_mzda"));
        
        return zamestnanec;
    }
    
}
