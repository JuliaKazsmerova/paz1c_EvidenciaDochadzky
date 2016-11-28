package com.paz1c.mysqldao;

import com.paz1c.dao.ZamestnanecDao;
import com.paz1c.other.Zamestnanec;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.paz1c.rowMapper.ZamestnanecRowMapper;

public class MySQLZamestnanecDao implements ZamestnanecDao{
    
    private JdbcTemplate jdbcTemplate;
     
    public MySQLZamestnanecDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public boolean vlozZamestnanca(Zamestnanec pridavanyZamestnanec) {
        String sql = "INSERT INTO Zamestnanec (meno,priezvisko,ID_firma,pocet_hodin_na_den,datum_nastupu,funkcia) VALUES (?,?,?,?,?,?);";
        return 1 == jdbcTemplate.update(sql,pridavanyZamestnanec.getMeno(),pridavanyZamestnanec.getPriezvisko(),pridavanyZamestnanec.getIdFirma(),
                pridavanyZamestnanec.getPocetHodinNaDen(),pridavanyZamestnanec.getDatumNastupu(),pridavanyZamestnanec.getZameranie());
    }

    @Override
    public boolean zmazZamestnanca(Zamestnanec mazanyZamestnanec) {  
        String sql = "DELETE FROM Zamestnanec WHERE ID_Zamestnanec = ?;";
        return 1 == jdbcTemplate.update(sql,mazanyZamestnanec.getIdOsoba());
    }
        
    @Override
    public List<Zamestnanec> getVsetkychZamestnancov(Long idFirmy) {
        String sql = "SELECT ID_Zamestnanec,meno,priezvisko,ID_firma,pocet_hodin_na_den,datum_nastupu,funkcia"
                + ",pocet_hodin_na_den,datum_nastupu,funkcia FROM Zamestnanec WHERE ID_firma = ?;";   
        return jdbcTemplate.query(sql,new ZamestnanecRowMapper(),idFirmy);
    }

    @Override
    public List<Zamestnanec> getZamestnanci(String meno,String priezvisko) {
       String sql = "SELECT ID_Zamestnanec,meno,priezvisko,ID_firma,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia,pocet_hodin_na_den,datum_nastupu FROM Zamestnanec WHERE meno = ? AND priezvisko = ?;";   
        return jdbcTemplate.query(sql,new ZamestnanecRowMapper(),meno,priezvisko);
    }
    
    @Override
    public Zamestnanec getZamestnanec(Long id) {
        System.out.println("robim");
        String sql = "SELECT ID_Zamestnanec,meno,priezvisko,ID_firma,pocet_hodin_na_den,datum_nastupu,"
                + "funkcia ,pocet_hodin_na_den,datum_nastupu FROM Zamestnanec WHERE ID_Zamestnanec = ?;";   
        return jdbcTemplate.queryForObject(sql,new ZamestnanecRowMapper(),id);
    }
    
    
    @Override
    public boolean upravZamestnanca(Zamestnanec upravovanyZamestnanec) {
        String sql = "UPDATE Zamestnanec SET meno = ?,priezvisko = ?,pocet_hodin_na_den = ?,datum_nastupu = ?,funkcia = ? WHERE ID_zamestnanec = ?";
        return 1 == jdbcTemplate.update(sql,upravovanyZamestnanec.getMeno(),upravovanyZamestnanec.getPriezvisko(),upravovanyZamestnanec.getPocetHodinNaDen(),
                upravovanyZamestnanec.getDatumNastupu(),upravovanyZamestnanec.getZameranie(),upravovanyZamestnanec.getIdOsoba());
    }

    

    

    
}
