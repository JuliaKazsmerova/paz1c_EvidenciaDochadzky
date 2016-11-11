
package com.paz1c.other;

public class Firma {
    private Long idFirma;
    private String nazov;
    private String ico;
    private String dic;
    private String sidlo;
    private String vybratyMod;

    public Long getIdFirma() {
        return idFirma;
    }

    public String getNazov() {
        return nazov;
    }

    public String getIco() {
        return ico;
    }

    public String getDic() {
        return dic;
    }

    public String getSidlo() {
        return sidlo;
    }

    public String getVybratyMod() {
        return vybratyMod;
    }

    public void setIdFirma(Long idFirma) {
        this.idFirma = idFirma;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public void setDic(String dic) {
        this.dic = dic;
    }

    public void setSidlo(String sidlo) {
        this.sidlo = sidlo;
    }

    public void setVybratyMod(String vybratyMod) {
        this.vybratyMod = vybratyMod;
    }

    /**toString vracia retazec "'nazov','ico','dic','sidlo','vybraty_mod'"*/
    @Override
    public String toString() {
        return "'"+nazov+"','"+ico+"','"+dic+"','"+sidlo+"','"+vybratyMod+"'";
    }
    
    
}
