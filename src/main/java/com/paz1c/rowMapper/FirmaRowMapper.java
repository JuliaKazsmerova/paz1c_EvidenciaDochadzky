package com.paz1c.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import com.paz1c.other.Firma;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirmaRowMapper implements RowMapper<Firma>{

    @Override
    public Firma mapRow(ResultSet rs, int i) throws SQLException {
        Firma firma = new Firma();
        firma.setIdFirma(rs.getLong("ID_Firma"));
        firma.setNazov(rs.getString("nazov"));
        firma.setIco(rs.getString("ico"));
        firma.setDic(rs.getString("dic"));
        firma.setSidlo(rs.getString("sidlo"));
        firma.setVybratyMod(rs.getString("vybraty_mod"));
        return firma;
    }
    
}
