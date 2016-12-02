package com.paz1c.dao;

import com.paz1c.other.Cviciaci;
import java.util.List;

public interface CviciaciDao {
    
    public boolean vlozCvicaceho(Cviciaci pridavanyCviciaci);
    
    public boolean zmazCviciaceho(Cviciaci mazanyCviciaci);
    
    public List<Cviciaci> getVsetkychCviciacich(Long idFirma);

    public Cviciaci getCviciaceho(Long id);
    
    public List<Cviciaci> getCviciacich(String meno,String prieavisko);

    public boolean upravCviciaceho(Cviciaci upravovanaOsoba);
}
