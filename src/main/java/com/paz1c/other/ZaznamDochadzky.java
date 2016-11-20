package com.paz1c.other;

import java.sql.Date;

public class ZaznamDochadzky {
    private Long id;
    private Date prichod;
    private Date odchod;
    private int odrobeneHodiny;
    private Long idOsoba;

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrichod(Date prichod) {
        this.prichod = prichod;
    }

    public void setOdchod(Date odchod) {
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

    public Date getPrichod() {
        return prichod;
    }

    public Date getOdchod() {
        return odchod;
    }

    public float getOdrobeneHodiny() {
        return odrobeneHodiny;
    }

    public Long getIdOsoba() {
        return idOsoba;
    }
}
