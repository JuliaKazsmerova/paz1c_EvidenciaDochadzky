package com.paz1c.gui.zamestnanec;

import com.paz1c.manager.DefaultZamestnanecManager;
import com.paz1c.manager.ZamestnanecManager;
import com.paz1c.other.Zamestnanec;
import javax.swing.table.AbstractTableModel;

public class MazanyZamestnanecTableModel extends AbstractTableModel{
    
    private ZamestnanecManager zamestnanecManager = new DefaultZamestnanecManager();
    private static final String[] NAZVY_STLPCOV = { "Meno", "Priezvisko", "Zameranie", "Označenie" };
    private static final String[] COLUMN_NAME = { "Name", "Surname", "Assignment", "Mark" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;
    private Long id;
    private boolean hodnota;
    private Zamestnanec zamestnanec;
    
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
        
        if(columnIndex == 0){
            zamestnanec = zamestnanecManager.getZamestnanec(id);
        }
        
        switch (columnIndex) {
            case 0:
                return zamestnanec.getMeno();
            case 1:
                return zamestnanec.getPriezvisko();
            case 2:
                return zamestnanec.getZameranie();
            case 3:
                return hodnota;
            default:
                return "???";
        }
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex==3)
            return true;
        else 
            return false;
    } 
    
        @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 3) {
            return Boolean.class;
        }
        
        return super.getColumnClass(columnIndex);
    }    


    void zobrazZamestnancaSId(Long id) {
        this.id = id;
        fireTableDataChanged();
    }
    
    void setHodnota(boolean value){
        hodnota = value;
    }   
    
    Zamestnanec dajPodlaId(long id){
        return zamestnanecManager.getZamestnanec(id);     
    }
}
