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
        String sql = "INSERT INTO Spravca "
                + "(meno,priezvisko,ID_firma,"
                + "email,heslo,sol) "
                + "VALUES (" + pridavanySpravca + ");";
         
        try{
            return 1 == jdbcTemplate.update(sql);
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("spravcu: "+pridavanySpravca+" sa nepodarilo ulozit");
            return false;
        }
    }

    @Override
    public boolean zmazSpravcu(Spravca mazanSpravca) {
        String sql = "DELETE FROM Spravca WHERE ID_admin = " + mazanSpravca.getIdOsoba() + ";";
           
        try{
            return 1 == jdbcTemplate.update(sql);
        }catch(DataAccessException e){
            System.out.println(sql);
            return false;
        }
    }

    @Override
    public List<Spravca> getVsetkychSpravcov() {
        String sql = "SELECT ID_admin,meno,priezvisko"
                + ",ID_firma,email,heslo"
                + " FROM Spravca;";
        
        List<Spravca> spravcovia = null;
         try{
            spravcovia = jdbcTemplate.query(sql,new SpravcaRowMapper());
        }catch(Exception e) {
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat vsetkych spravcov");
        }
        return spravcovia;
    }

    @Override
    public Spravca getSpravcu(Long id) {
        String sql = "SELECT ID_admin,meno,priezvisko"
                + ",ID_firma,email,heslo"
                + " FROM Spravca WHERE ID_admin = "+id+";";   
         
        Spravca spravca = null;
         try{
            spravca = jdbcTemplate.query(sql,new SpravcaRowMapper()).get(0);
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat spravcu s id: "+id);
        }
        return spravca;
    }
    
    @Override
    public List<Spravca> getSpravcov(String meno,String priezvisko) {
        String sql = "SELECT ID_admin,meno,priezvisko"
                + ",ID_firma,email,heslo"
                + " FROM Spravca WHERE meno = '"+meno+"' AND priezvisko = '"+priezvisko+"';";   
        
        List<Spravca> spravcovia = null;
        try{
            spravcovia = jdbcTemplate.query(sql,new SpravcaRowMapper());
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat spravcov s menom: "+meno+" a priezviskom: "+priezvisko);
        }
        return spravcovia;
    }
    
}
