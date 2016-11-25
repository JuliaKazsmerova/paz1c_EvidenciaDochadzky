package com.paz1c.other;

import java.sql.Date;
import java.sql.Timestamp;

public class ZaznamDochadzky {
    private Long id;
    private Timestamp prichod;
    private Timestamp odchod;
    private int odrobeneHodiny;
    private Long idOsoba;

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

    public void setIdOsoba(Long idOsoba) {
        this.idOsoba = idOsoba;
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

    public float getOdrobeneHodiny() {
        return odrobeneHodiny;
    }

    public Long getIdOsoba() {
        return idOsoba;
    }
}
