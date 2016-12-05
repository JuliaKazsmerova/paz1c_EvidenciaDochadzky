package com.paz1c.gui.cviciaci;

import com.paz1c.manager.DefaultCviciaciManager;
import com.paz1c.manager.CviciaciManager;
import com.paz1c.other.Cviciaci;
import javax.swing.table.AbstractTableModel;

public class MazanyCviciaciTableModel extends AbstractTableModel{
    
    private CviciaciManager cviciaciManager = new DefaultCviciaciManager();
    private static final String[] NAZVY_STLPCOV = { "Meno", "Priezvisko", "Kredit", "Označenie" };
    private static final String[] COLUMN_NAME = { "Name", "Surname", "Credit", "Mark" };
    private static final int POCET_STLPCOV = NAZVY_STLPCOV.length;
    private Long id;
    private boolean hodnota;
    private Cviciaci cviciaci;
    
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
            cviciaci = cviciaciManager.getCviciaceho(id);
        }
        
        switch (columnIndex) {
            case 0:
                return cviciaci.getMeno();
            case 1:
                return cviciaci.getPriezvisko();
            case 2:
                return cviciaci.getKredit();
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


    void zobrazCviciacehoSId(Long id) {
        this.id = id;
        fireTableDataChanged();
    }
    
    void setHodnota(boolean value){
        hodnota = value;
    }   
    
    Cviciaci dajPodlaId(long id){
        return cviciaciManager.getCviciaceho(id);     
    }
}
