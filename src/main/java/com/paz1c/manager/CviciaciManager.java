package com.paz1c.manager;

import com.paz1c.other.Cviciaci;
import java.util.List;

public interface CviciaciManager {
    
    public boolean vlozCvicaceho(Cviciaci pridavanaOsoba);
    
    public boolean zmazCviciaceho(Cviciaci mazanaOsoba);
    
    public List<Cviciaci> getVsetkychCviciacich();

    public Cviciaci getCviciaceho(Long id);
    
    public List<Cviciaci> getCviciacich(String meno,String priezvisko);

    public boolean upravCviciaceho(Cviciaci upravovanaOsoba);
    
}
