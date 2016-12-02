package com.paz1c.gui.cviciaci;

import com.paz1c.constants.Nastavenia;
import com.paz1c.manager.CviciaciManager;
import com.paz1c.manager.DefaultCviciaciManager;
import com.paz1c.manager.DefaultZaznamDochadzkyManager;
import com.paz1c.manager.ZaznamDochadzkyManager;
import com.paz1c.other.Cviciaci;
import com.paz1c.other.ZaznamDochadzky;
import java.sql.Timestamp;
import javax.swing.table.AbstractTableModel;


public class CviciaciTableModel extends AbstractTableModel{

    private CviciaciManager cviciaciManager = new DefaultCviciaciManager();
    private ZaznamDochadzkyManager zaznamDochzdzkyManager = new DefaultZaznamDochadzkyManager();
    private static final String[] NAZVY_STLPCOV = { "ID cvičiaci", "Meno", "Priezvisko", "Kredit",
                                                    "Cvici", "Posledny prichod", "Posledny odchod" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;
    private static final String[] COLUMN_NAME = { "", "Name", "Surname", "Hours per day", "Assignment","Is working", "Last arrival", "Last leave" };
    
    
    @Override
    public int getRowCount() {
        return cviciaciManager.pocetCviciacich();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    boolean stav(Timestamp prichod,Timestamp odchod){
        if(prichod==null)
            return false;
        if(odchod==null)
            return true;
        return false;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cviciaci cviciaci = cviciaciManager.getNacitanychCviciacich(rowIndex);
        ZaznamDochadzky zaznam = cviciaci.getPoslednyZaznam();
            
        switch (columnIndex) {
            case 0:
                return cviciaci.getIdOsoba();
            case 1:
                return cviciaci.getMeno();
            case 2:
                return cviciaci.getPriezvisko();
            case 3:
                return cviciaci.getKredit();
            case 4:
                return stav(zaznam.getPrichod(),zaznam.getOdchod());
            case 5:
                return zaznam.getPrichod();
            case 6:
                return zaznam.getOdchod();
            default:
                return "???";
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 4) {
            return Boolean.class;
        }
        
        return super.getColumnClass(columnIndex);
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        System.out.println(Nastavenia.jazyk);
        if(Nastavenia.jazyk.equals("SK"))
            return NAZVY_STLPCOV[columnIndex];
        if(Nastavenia.jazyk.equals("EN"))
            return COLUMN_NAME[columnIndex];
        return "error";
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        if(columnIndex >0 && columnIndex < 4)
            return true;
        else
            return false;
    }
    
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Cviciaci upravovany = cviciaciManager.getNacitanychCviciacich(rowIndex);
        switch (columnIndex) {
            case 1:
                upravovany.setMeno((String)value);
                break;
            case 2:
                upravovany.setPriezvisko((String)value);
                break;
            case 3:
                upravovany.setKredit(Integer.parseInt((String)value));
                break;
           
        }
        cviciaciManager.upravCviciaceho(upravovany);
        aktualizovatVsetkych();
    }
    
    void aktualizovatVsetkych() {
        cviciaciManager.getVsetkychCviciacich();
        fireTableDataChanged();
    }
    
    void aktualizovatAktivnych() {
        cviciaciManager.getAktivnychCviciacich();
        fireTableDataChanged();
    }
    
    void aktualizovatNeaktivnych() {
        cviciaciManager.getNeaktivnychCviciacich();
        fireTableDataChanged();
    }
    
    void zmenaJazyka(){
        fireTableStructureChanged();
    }
}
