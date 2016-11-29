package com.paz1c.gui.spravcovia;

import com.paz1c.manager.DefaultSpravcaManager;
import com.paz1c.manager.SpravcaManager;
import com.paz1c.other.Spravca;
import javax.swing.table.AbstractTableModel;

public class MazanySpravcaTableModel extends AbstractTableModel{
    private SpravcaManager spravcaManager = new DefaultSpravcaManager();
    private static final String[] NAZVY_STLPCOV = { "Meno", "Priezvisko", "Označenie" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;
    private Long id;
    private boolean hodnota;
    private Spravca spravca;
    
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
        System.out.println(columnIndex);
        if(columnIndex == 0){
            spravca = spravcaManager.getSpravcuId(id);
        }
        
        switch (columnIndex) {
            case 0:
                return spravca.getMeno();
            case 1:
                return spravca.getPriezvisko();
            case 2:
                return hodnota;
            default:
                return "???";
        }
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex==2)
            return true;
        else 
            return false;
    } 
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 2) {
            return Boolean.class;
        }
        
        return super.getColumnClass(columnIndex);
    }

    void zobrazSpravcuSId(Long id) {
        this.id = id;
        fireTableDataChanged();
    }
    
    void setHodnota(boolean value){
        hodnota = value;
    }   
    
    Spravca dajPodlaId(long id){
        return spravcaManager.getSpravcuId(id);     
    }
    
    
    
}
