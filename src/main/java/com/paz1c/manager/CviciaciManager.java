package com.paz1c.manager;

import com.paz1c.other.Cviciaci;
import java.util.List;

public interface CviciaciManager {
    
    public boolean vlozCvicaceho(Cviciaci pridavanyCviciaci);
    
    public boolean zmazCviciaceho(Cviciaci mazanyCviciaci);
    
    public List<Cviciaci> getVsetkychCviciacich();
    
    public List<Cviciaci> getAktivnychCviciacich();
    
    public List<Cviciaci> getNeaktivnychCviciacich();
    
    public Cviciaci getNacitanychCviciacich(int index);

    public List<Cviciaci> getCviciacich(String meno,String priezvisko);

    public Cviciaci getCviciaceho(Long id);    
    
    public boolean upravCviciaceho(Cviciaci upravovanyCviciaci);
    
    public int pocetCviciacich();
    
}
