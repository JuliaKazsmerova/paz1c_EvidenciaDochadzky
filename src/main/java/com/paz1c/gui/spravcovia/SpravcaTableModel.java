package com.paz1c.gui.spravcovia;

import com.paz1c.manager.DefaultSpravcaManager;
import com.paz1c.manager.SpravcaManager;
import com.paz1c.other.Spravca;
import javax.swing.table.AbstractTableModel;

public class SpravcaTableModel extends AbstractTableModel{

    private SpravcaManager spravcaManager = new DefaultSpravcaManager();
    private static final String[] NAZVY_STLPCOV = { "ID spravcu", "Meno", "Priezvisko", "E-mail", "Heslo" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;

    
    @Override
    public int getRowCount() {
        return spravcaManager.pocetSpravcov();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Spravca spravca = spravcaManager.getVsetkychSpravcov(rowIndex);
        switch (columnIndex) {
            case 0:
                return spravca.getIdOsoba();
            case 1:
                return spravca.getMeno();
            case 2:
                return spravca.getPriezvisko();
            case 3:
                return spravca.getEmail();
            case 4:
                return spravca.getPasswordHash();
            default:
                return "???";
        }
    }
    
    
    @Override
    public String getColumnName(int columnIndex) {
        return NAZVY_STLPCOV[columnIndex];
    }
    
   
    void aktualizovat() {
        spravcaManager.getVsetkychSpravcov();
        fireTableDataChanged();
    }
    
}
