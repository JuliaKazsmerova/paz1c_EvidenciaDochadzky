package com.paz1c.manager;

import com.paz1c.other.Osoba;
import java.util.List;

public interface OsobaManager {
    List<Osoba> getVsetkyOsoby();
    void vlozOsobu(Osoba pridavanaOsoba);
    boolean zmazOsobu(Osoba mazanaOsoba);
    Osoba getOsoba(int id);
    boolean upravOsobu(Osoba upravovanaOsoba);
}
