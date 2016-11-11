package com.paz1c.dao;

import com.paz1c.other.Cviciaci;
import java.util.List;

public interface CviciaciDao {
    
    public void vlozCvicaceho(Cviciaci pridavanaOsoba);
    
    public boolean zmazCviciaceho(Cviciaci mazanaOsoba);
    
    public List<Cviciaci> getVsetkychCviciacich();

    public Cviciaci getCviciaceho(long id);

    public boolean upravCviciaceho(Cviciaci upravovanaOsoba);
}
