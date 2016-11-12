package com.paz1c.mysqldao;

import com.paz1c.dao.CviciaciDao;
import com.paz1c.other.Cviciaci;
import com.paz1c.other.Spravca;
import com.paz1c.rowMapper.CviciaciRowMapper;
import com.paz1c.rowMapper.SpravcaRowMapper;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySQLCviciaciDao implements CviciaciDao{

    private JdbcTemplate jdbcTemplate;
    
    public MySQLCviciaciDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean vlozCvicaceho(Cviciaci pridavanyCviciaci) {
         String sql = "INSERT INTO Cviciaci "
                + "(meno,priezvisko,ID_firma,kredit) "
                + "VALUES (" + pridavanyCviciaci + ");";
         
        try{
            return 1 == jdbcTemplate.update(sql);
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("cviciaceho: "+pridavanyCviciaci+" sa nepodarilo ulozit");
            return false;
        }
    }

    @Override
    public boolean zmazCviciaceho(Cviciaci mazanyCviciaci) {
        String sql = "DELETE FROM Cviciaci WHERE ID_cviciaci = " + mazanyCviciaci.getIdOsoba() + ";";
           
        try{
            return 1 == jdbcTemplate.update(sql);
        }catch(DataAccessException e){
            System.out.println(sql);
            return false;
        }
    }

    @Override
    public List<Cviciaci> getVsetkychCviciacich() {
        String sql = "SELECT ID_cviciaci,meno,priezvisko"
                + ",ID_firma,kredit"
                + " FROM Cviciaci;";
        
        List<Cviciaci> cviciaci = null;
         try{
            cviciaci = jdbcTemplate.query(sql,new CviciaciRowMapper());
        }catch(Exception e) {
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat vsetkych cviciacich");
        }
        return cviciaci;
    }

    @Override
    public Cviciaci getCviciaceho(Long id) {
        String sql = "SELECT ID_cviciaci,meno,priezvisko"
                + ",ID_firma,kredit"
                + " FROM Cviciaci WHERE ID_cviciaci = "+id+";";   
         
        Cviciaci cviciaci = null;
         try{
            cviciaci = jdbcTemplate.query(sql,new CviciaciRowMapper()).get(0);
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat cviciaceho s id: "+id);
        }
        return cviciaci;
    }
    
    @Override
    public List<Cviciaci> getCviciacich(String meno,String priezvisko) {
         String sql = "SELECT ID_cviciaci,meno,priezvisko"
                + ",ID_firma,kredit"
                + " FROM Cviciaci WHERE meno = '"+meno+"' AND priezvisko = '"+priezvisko+"';";   
        
        List<Cviciaci> cviciaci = null;
        try{
            cviciaci = jdbcTemplate.query(sql,new CviciaciRowMapper());
        }catch(Exception e){
            System.out.println(sql);
            System.err.println("Nepodarilo sa nacitat cviciacich s menom: "+meno+" a priezviskom: "+priezvisko);
        }
        return cviciaci;
    }

    @Override
    public boolean upravCviciaceho(Cviciaci upravovanaOsoba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
