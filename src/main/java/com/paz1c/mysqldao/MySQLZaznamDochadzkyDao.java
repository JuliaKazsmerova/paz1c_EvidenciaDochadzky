package com.paz1c.mysqldao;

import com.paz1c.dao.ZaznamDochadzkyDao;
import com.paz1c.other.ZaznamDochadzky;
import com.paz1c.rowMapper.ZaznamDochadzkyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLZaznamDochadzkyDao implements ZaznamDochadzkyDao{

    private JdbcTemplate jdbcTemplate;
     
    public MySQLZaznamDochadzkyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public boolean vlozZaznam(ZaznamDochadzky zaznam) {
        String sql = "INSERT INTO Denna_dochadzka (prichod,odchod,odrobene_hodiny,ID_zamestnanec,ID_cviciaci) VALUES (?,?,?,?,?);";
        return 1 == jdbcTemplate.update(sql,zaznam.getPrichod(),zaznam.getOdchod(),zaznam.getOdrobeneHodiny(),zaznam.getIdZamestnanec(),zaznam.getIdCviciaci());
    }

    @Override
    public boolean upravZaznam(ZaznamDochadzky zaznam) {
        String sql = "UPDATE Denna_dochadzka SET prichod = ?,odchod = ?,odrobene_hodiny = ? WHERE ID_den = ?";
        return 1 == jdbcTemplate.update(sql,zaznam.getPrichod(),zaznam.getOdchod(),zaznam.getOdrobeneHodiny(),zaznam.getId());
    }

    @Override
    public boolean zmazZaznam(ZaznamDochadzky zaznam) {
        String sql = "DELETE FROM Denna_dochadzka WHERE ID_den = ?;";
        return 1 == jdbcTemplate.update(sql,zaznam.getId());
    }

    @Override
    public ZaznamDochadzky getPoslednyZaznam(Long idOsoba) {
        String sql = "SELECT ID_den,prichod,odchod,odrobene_hodiny,ID_zamestnanec,ID_cviciaci FROM Denna_dochadzka WHERE ID_den = (SELECT MAX(ID_den) FROM Denna_dochadzka WHERE ID_zamestnanec = ? OR ID_cviciaci = ?);";
        return jdbcTemplate.queryForObject(sql,new ZaznamDochadzkyRowMapper(),idOsoba,idOsoba);
    }
    
}
