package com.paz1c.gui.cviciaci;

import com.paz1c.gui.zamestnanec.*;
import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Cviciaci;
import com.paz1c.other.Zamestnanec;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ZmazatCviciaceho extends javax.swing.JPanel {

    private SpravaCviciacich parentJForm;
    private MazanyCviciaciTableModel model;
    private Cviciaci cviciaci;
    private Map<String,String> mapaString = new HashMap<>();
   
    
    public ZmazatCviciaceho() {
        initComponents();
        nastavJazyk();
        model = (MazanyCviciaciTableModel) cviciaciNaMazanieTable.getModel(); 
        cviciaciNaMazanieTable.getTableHeader().setUI(null);
        overovaciaOtazkaLabel.setVisible(false);
        jScrollPane2.setVisible(false);
        potvrditButton.setVisible(false);
    }
    

    public void setParent(SpravaCviciacich parent){
        this.parentJForm = parent;
        zmenaJazykaPanel1.setParentSpravaCviciacich(parentJForm);
    }
    
     void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod1", "Zmazať cvičiaceho");
                    mapaString.put("uvod2", "Zadajte ID cvičiaceho: ");
                    mapaString.put("otazka", "Naozaj si prajete zmazať tohto cvičiaceho?");
                    mapaString.put("zmazat", "Zmazať");
                    mapaString.put("spat", "Späť");
                    mapaString.put("potvrdit", "Potvrdiť");
                    mapaString.put("idPrazdneText", "Nezadali ste ID cvičiaceho!");
                    mapaString.put("idPrazdneNadpis", "Upozornenie");
                    mapaString.put("idNeexistujuceText", "Cvičiaceho s daným ID neexistuje!");
                    mapaString.put("idNeexistujuceNadpis", "Upozornenie");
                    mapaString.put("zmazanyUpozornenieText", "Cvičiaceho bol zmazaný.");
                    mapaString.put("zmazanyUpozornenieNadpis", "OK");
                    mapaString.put("neoznacenyUpozornenieText", "Neoznačili ste cvičiaceho!");
                    mapaString.put("neoznacenyUpozornenieNadpis", "Upozornenie");
                    break;
                case "EN" :
                    mapaString.put("uvod1", "Delete employee");
                    mapaString.put("uvod2", "Enter employee's ID: ");
                    mapaString.put("otazka", "Are you sure you want to delete this emoloyee? ");
                    mapaString.put("zmazat", "Delete");
                    mapaString.put("spat", "Back");
                    mapaString.put("potvrdit", "Confirm");
                    mapaString.put("idPrazdneText", "Enter employee ID!");
                    mapaString.put("idPrazdneNadpis", "Warning");
                    mapaString.put("idNeexistujuceText", "Employee ID does not exist!");
                    mapaString.put("idNeexistujuceNadpis", "Warning");
                    mapaString.put("zmazanyUpozornenieText", "Emoloyee was deleted.");
                    mapaString.put("zmazanyUpozornenieNadpis", "OK");
                    mapaString.put("neoznacenyUpozornenieText", "Choose an employee!");
                    mapaString.put("neoznacenyUpozornenieNadpis", "Warning");
                    break;
                
            }
            this.mapaString = mapaString;
    }
    
    void nastavJazyk() {
        initTexts(Nastavenia.jazyk);
        
        zmazatCviciacehoLabel.setText(mapaString.get("uvod1"));
        zadatIDCviciacehoLabel.setText(mapaString.get("uvod2"));
        overovaciaOtazkaLabel.setText(mapaString.get("otazka"));
        zmazatButton.setText(mapaString.get("zmazat"));
        spatButton.setText(mapaString.get("spat"));
        potvrditButton.setText(mapaString.get("potvrdit"));
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zmazatCviciacehoLabel = new javax.swing.JLabel();
        zadatIDCviciacehoLabel = new javax.swing.JLabel();
        IDCviciacehoTextField = new javax.swing.JTextField();
        zmazatButton = new javax.swing.JButton();
        overovaciaOtazkaLabel = new javax.swing.JLabel();
        potvrditButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cviciaciNaMazanieTable = new javax.swing.JTable();
        spatButton = new javax.swing.JButton();
        zmenaJazykaPanel1 = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        setBackground(new java.awt.Color(255, 250, 226));

        zmazatCviciacehoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zmazatCviciacehoLabel.setText("Zmazať cviciaceho");

        zadatIDCviciacehoLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        zadatIDCviciacehoLabel.setText("Zadajte ID cviciaceho:");

        IDCviciacehoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDCviciacehoTextFieldKeyReleased(evt);
            }
        });

        zmazatButton.setText("Zmazať");
        zmazatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatButtonActionPerformed(evt);
            }
        });

        overovaciaOtazkaLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        overovaciaOtazkaLabel.setText("Naozaj si prajete zmazať tohto cviciaceho?");

        potvrditButton.setText("Potvrdiť");
        potvrditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrditButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setMaximumSize(new java.awt.Dimension(50, 5));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(50, 5));

        cviciaciNaMazanieTable.setModel(new com.paz1c.gui.cviciaci.MazanyCviciaciTableModel());
        cviciaciNaMazanieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cviciaciNaMazanieTableMouseClicked(evt);
            }
        });
        cviciaciNaMazanieTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cviciaciNaMazanieTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(cviciaciNaMazanieTable);

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IDCviciacehoTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(overovaciaOtazkaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zmazatCviciacehoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zadatIDCviciacehoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(potvrditButton)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(zmazatCviciacehoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zadatIDCviciacehoLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDCviciacehoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zmazatButton))
                .addGap(18, 18, 18)
                .addComponent(overovaciaOtazkaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potvrditButton)
                    .addComponent(spatButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zmazatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatButtonActionPerformed
        if(IDCviciacehoTextField.getText().equals("")){
            JOptionPane.showMessageDialog(parentJForm, mapaString.get("idPrazdneText"), mapaString.get("idPrazdneNadpis"), JOptionPane.ERROR_MESSAGE);
        }else{
            Long zadaneID = Long.parseLong(IDCviciacehoTextField.getText());
            try{
                model.zobrazCviciacehoSId(zadaneID);
                cviciaci = parentJForm.getCviciacehoPodlaID(zadaneID);
                
                if(!cviciaci.getIdFirma().equals(Nastavenia.idFirma)){
                    throw new Exception();
                }
                
                overovaciaOtazkaLabel.setVisible(true);  
                jScrollPane2.setVisible(true);
                potvrditButton.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(parentJForm, mapaString.get("idNeexistujuceText"), mapaString.get("idNeexistujuceNadpis"), JOptionPane.ERROR_MESSAGE);    
            }
        }
        
       
    }//GEN-LAST:event_zmazatButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJForm.otvorOkno("tableCviciaci");
        IDCviciacehoTextField.setText("");
        overovaciaOtazkaLabel.setVisible(false);  
        jScrollPane2.setVisible(false);
        potvrditButton.setVisible(false);
        model.setHodnota(false);
    }//GEN-LAST:event_spatButtonActionPerformed

    private void potvrditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrditButtonActionPerformed
        if((boolean)cviciaciNaMazanieTable.getValueAt(0, 3)){
            parentJForm.zmazCviciaceho(cviciaci);
            JOptionPane.showMessageDialog(parentJForm, mapaString.get("zmazanyUpozornenieText"), mapaString.get("zmazanyUpozornenieNaspis"), JOptionPane.PLAIN_MESSAGE);
            IDCviciacehoTextField.setText("");
            overovaciaOtazkaLabel.setVisible(false);  
            jScrollPane2.setVisible(false);
            potvrditButton.setVisible(false);
            model.setHodnota(false);
        }else{
            JOptionPane.showMessageDialog(parentJForm, mapaString.get("neoznacenyUpozornenieText"), mapaString.get("neoznacenyUpozornenieNadpis"), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_potvrditButtonActionPerformed

    private void cviciaciNaMazanieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cviciaciNaMazanieTableMouseClicked
        model.setHodnota(!(boolean) cviciaciNaMazanieTable.getValueAt(0, 3));
    }//GEN-LAST:event_cviciaciNaMazanieTableMouseClicked

    private void IDCviciacehoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDCviciacehoTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            zmazatButtonActionPerformed(null);
        }
    }//GEN-LAST:event_IDCviciacehoTextFieldKeyReleased

    private void cviciaciNaMazanieTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cviciaciNaMazanieTableKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            potvrditButtonActionPerformed(null);
        }
    }//GEN-LAST:event_cviciaciNaMazanieTableKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDCviciacehoTextField;
    private javax.swing.JTable cviciaciNaMazanieTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel overovaciaOtazkaLabel;
    private javax.swing.JButton potvrditButton;
    private javax.swing.JButton spatButton;
    private javax.swing.JLabel zadatIDCviciacehoLabel;
    private javax.swing.JButton zmazatButton;
    private javax.swing.JLabel zmazatCviciacehoLabel;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel1;
    // End of variables declaration//GEN-END:variables

    
}
