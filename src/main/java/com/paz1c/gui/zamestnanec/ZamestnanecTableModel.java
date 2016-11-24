package com.paz1c.gui.zamestnanec;

import com.paz1c.other.Zamestnanec;
import javax.swing.table.AbstractTableModel;


public class ZamestnanecTableModel extends AbstractTableModel{

    private com.paz1c.manager.ZamestnanecManager zamestnanecManager = new com.paz1c.manager.DefaultZamestnanecManager();
    private static final String[] NAZVY_STLPCOV = { "ID zamestnanca", "Meno", "Priezvisko", "Pracovna doba", "Zameranie",
        "Je v praci", "Posledny prichod", "Posledny odchod" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;

    
    @Override
    public int getRowCount() {
        return zamestnanecManager.pocetZamestnancov();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zamestnanec zamestnanec = zamestnanecManager.getVsetkychZamestnancov(rowIndex);
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
                return false;
            case 6:
                return "";
            case 7:
                return "";
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
        return NAZVY_STLPCOV[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        if(columnIndex >0 && columnIndex < 5)
            return true;
        else
            return false;
    }
    
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Zamestnanec upravovany = zamestnanecManager.getVsetkychZamestnancov(rowIndex);
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
        aktualizovat();
    }
    
    void aktualizovat() {
        zamestnanecManager.getVsetkychZamestnancov();
        fireTableDataChanged();
    }
}
