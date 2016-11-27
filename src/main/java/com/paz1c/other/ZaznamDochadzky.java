package com.paz1c.other;

import java.sql.Date;
import java.sql.Timestamp;

public class ZaznamDochadzky {
    private Long id;
    private Timestamp prichod;
    private Timestamp odchod;
    private int odrobeneHodiny;
    private Long idZamestnanec;
    private Long idCviciaci;

    public int getOdrobeneHodiny() {
        return odrobeneHodiny;
    }

    public void setIdCviciaci(Long idCviciaci) {
        this.idCviciaci = idCviciaci;
    }

    public Long getIdCviciaci() {
        return idCviciaci;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrichod(Timestamp prichod) {
        this.prichod = prichod;
    }

    public void setOdchod(Timestamp odchod) {
        this.odchod = odchod;
    }

    public void setOdrobeneHodiny(int odrobeneHodiny) {
        this.odrobeneHodiny = odrobeneHodiny;
    }

    public void setIdZamestnanec(Long idOsoba) {
        this.idZamestnanec = idOsoba;
    }

    public Long getId() {
        return id;
    }

    public Timestamp getPrichod() {
        return prichod;
    }

    public Timestamp getOdchod() {
        return odchod;
    }

    public Long getIdZamestnanec() {
        return idZamestnanec;
    }
}
