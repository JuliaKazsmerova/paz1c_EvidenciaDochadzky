package com.paz1c.gui.zamestnanec;

import com.paz1c.constants.Nastavenia;
import com.paz1c.manager.DefaultZamestnanecManager;
import com.paz1c.manager.DefaultZaznamDochadzkyManager;
import com.paz1c.manager.ZamestnanecManager;
import com.paz1c.manager.ZaznamDochadzkyManager;
import com.paz1c.other.Zamestnanec;
import com.paz1c.other.ZaznamDochadzky;
import java.sql.Timestamp;
import javax.swing.table.AbstractTableModel;


public class ZamestnanecTableModel extends AbstractTableModel{

    private ZamestnanecManager zamestnanecManager = new DefaultZamestnanecManager();
    private ZaznamDochadzkyManager zaznamDochzdzkyManager = new DefaultZaznamDochadzkyManager();
    private static final String[] NAZVY_STLPCOV = { "ID zamestnanca", "Meno", "Priezvisko", "Pracovna doba", "Zameranie",
        "Je v praci", "Posledny prichod", "Posledny odchod" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;
    private static final String[] COLUMN_NAME = { "Employee ID", "Name", "Surname", "Hours per day", "Assignment","Is working", "Last arrival", "Last leave" };
    
    
    @Override
    public int getRowCount() {
        return zamestnanecManager.pocetZamestnancov();
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
        Zamestnanec zamestnanec = zamestnanecManager.getNacitanychZamestnancov(rowIndex);
        ZaznamDochadzky zaznam = zamestnanec.getPoslednyZaznam();
            
        switch (columnIndex) {
            case 0:
                return zamestnanec.getIdOsoba();
            case 1:
                return zamestnanec.getMeno();
            case 2:
                return zamestnanec.getPriezvisko();
            case 3:
                return zamestnanec.getPocetHodinNaDen();
            case 4:
                return zamestnanec.getZameranie();
            case 5:
                return stav(zaznam.getPrichod(),zaznam.getOdchod());
            case 6:
                return zaznam.getPrichod();
            case 7:
                return zaznam.getOdchod();
            default:
                return "???";
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 5) {
            return Boolean.class;
        }
        
        return super.getColumnClass(columnIndex);
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(Nastavenia.jazyk.equals("SK"))
            return NAZVY_STLPCOV[columnIndex];
        if(Nastavenia.jazyk.equals("EN"))
            return COLUMN_NAME[columnIndex];
        return "error";
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        if(columnIndex >0 && columnIndex < 5)
            return true;
        else
            return false;
    }
    
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Zamestnanec upravovany = zamestnanecManager.getNacitanychZamestnancov(rowIndex);
        switch (columnIndex) {
            case 1:
                upravovany.setMeno((String)value);
                break;
            case 2:
                upravovany.setPriezvisko((String)value);
                break;
            case 3:
                upravovany.setPocetHodinNaDen(Integer.parseInt((String)value));
                break;
            case 4:
                upravovany.setZameranie((String)value);
                break;
           
        }
        zamestnanecManager.upravZamestnanca(upravovany);
        aktualizovatVsetkych();
    }
    
    void aktualizovatVsetkych() {
        zamestnanecManager.getVsetkychZamestnancov();
        fireTableDataChanged();
    }
    
    void aktualizovatAktivnych() {
        zamestnanecManager.getAktivnychZamestnancov();
        fireTableDataChanged();
    }
    
    void aktualizovatNeaktivnych() {
        zamestnanecManager.getNeaktivnychZamestnancov();
        fireTableDataChanged();
    }
    
    void zmenaJazyka(){
        fireTableStructureChanged();
    }
}
