package com.paz1c.gui.zamestnanec;

import com.paz1c.other.Zamestnanec;
import javax.swing.table.AbstractTableModel;

public class MazanyZamestnanecTableModel extends AbstractTableModel{
    
    private com.paz1c.manager.ZamestnanecManager zamestnanecManager = new com.paz1c.manager.DefaultZamestnanecManager();
    private static final String[] NAZVY_STLPCOV = { "Meno", "Priezvisko", "Zameranie" };
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
            default:
                return "???";
        }
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
