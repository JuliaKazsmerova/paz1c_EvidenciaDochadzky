package com.paz1c.gui.zamestnanec;

import com.paz1c.other.Zamestnanec;
import javax.swing.table.AbstractTableModel;

public class MazanyZamestnanecTableModel extends AbstractTableModel{
    
    private com.paz1c.manager.ZamestnanecManager zamestnanecManager = new com.paz1c.manager.DefaultZamestnanecManager();
    private static final String[] NAZVY_STLPCOV = { "Meno", "Priezvisko", "Zameranie", "Označenie" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;
    private Long id;
    
    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zamestnanec zamestnanec = zamestnanecManager.getZamestnanec(id);
        switch (columnIndex) {
            case 0:
                return zamestnanec.getMeno();
            case 1:
                return zamestnanec.getPriezvisko();
            case 2:
                return zamestnanec.getZameranie();
            case 3:
                return false;
            default:
                return "???";
        }
        
    }
    
        @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 3) {
            return Boolean.class;
        }
        
        return super.getColumnClass(columnIndex);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public String getColumnName(int columnIndex) {
        return NAZVY_STLPCOV[columnIndex];
    }

    void najdiPodlaId(Long id) {
        this.id = id;
        fireTableDataChanged();
    }
    
}
