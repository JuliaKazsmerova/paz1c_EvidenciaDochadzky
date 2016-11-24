package com.paz1c.mysqldao;

import com.paz1c.dao.SpravcaDao;
import com.paz1c.other.Spravca;
import com.paz1c.rowMapper.SpravcaRowMapper;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLSpravcaDao implements SpravcaDao{

    private JdbcTemplate jdbcTemplate;
    
    public MySQLSpravcaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public boolean vlozSpravcu(Spravca pridavanySpravca) {
        String sql = "INSERT INTO Spravca (meno,priezvisko,ID_firma,email,heslo,sol) VALUES (?,?,?,?,?,?);";
        return 1 == jdbcTemplate.update(sql,pridavanySpravca.getMeno(),pridavanySpravca.getPriezvisko(),pridavanySpravca.getIdFirma(),
                pridavanySpravca.getEmail(),pridavanySpravca.getPasswordHash(),pridavanySpravca.getSalt());
    }

    @Override
    public boolean zmazSpravcu(Spravca mazanSpravca) {
        String sql = "DELETE FROM Spravca WHERE ID_admin = ?;";
        return 1 == jdbcTemplate.update(sql,mazanSpravca.getIdOsoba());
    }

    @Override
    public List<Spravca> getVsetkychSpravcov() {
        String sql = "SELECT ID_admin,meno,priezvisko,ID_firma,email,heslo,sol FROM Spravca;";
        return jdbcTemplate.query(sql,new SpravcaRowMapper());
    }

    @Override
    public Spravca getSpravcuId(Long id) {
        String sql = "SELECT ID_admin,meno,priezvisko,ID_firma,email,heslo,sol FROM Spravca WHERE ID_admin = ?;";   
        return jdbcTemplate.queryForObject(sql,new SpravcaRowMapper(),id);
    }
    
    @Override
    public List<Spravca> getSpravcovMenoPriezvisko(String meno,String priezvisko) {
        String sql = "SELECT ID_admin,meno,priezvisko,ID_firma,email,heslo,sol "
                + "FROM Spravca WHERE meno = ? AND priezvisko = ?;";   
        return jdbcTemplate.query(sql,new SpravcaRowMapper(),meno,priezvisko);
    }

    @Override
    public Spravca getSpravcuEmail(String email) {
        String sql = "SELECT ID_admin,meno,priezvisko,ID_firma,email,heslo,sol FROM Spravca WHERE email = ?;";   
        try{
            return jdbcTemplate.queryForObject(sql,new SpravcaRowMapper(),email);
        }catch(Exception e){
            return null;
        }
    }

    
    
}
