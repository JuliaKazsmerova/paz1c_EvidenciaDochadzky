package com.paz1c.gui.spravcovia;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Spravca;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class MazanieSpravcu extends javax.swing.JPanel {

    private Spravcovia parentJDialog;
    private MazanySpravcaTableModel model;
    Spravca spravca;
    private Map<String,String> mapaString = new HashMap<>();
   
    
    public MazanieSpravcu() {
        initComponents();
        aktualizovatSpravcov();
        mazanySpravcaTable.getTableHeader().setUI(null);
        overovaciaOtazkaLabel.setVisible(false);
        tableScrollPane.setVisible(false);
        potvditButton.setVisible(false);
    }
    
    public void aktualizovatSpravcov(){
        model = (MazanySpravcaTableModel) mazanySpravcaTable.getModel();
        
    }

    public void setParent(Spravcovia parent){
        parentJDialog = parent;
        zmenaJazykaPanel1.setParentSpravcovia(parentJDialog);
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("zmazat", "Zmazať");
                    mapaString.put("potrdit", "Potvrdiť");
                    mapaString.put("spat", "Späť");
                    mapaString.put("mazanie", "Mazanie správcu");
                    mapaString.put("zadajteID", "Zadajte ID správcu:");
                    mapaString.put("overovaciaOtazka", "Naozaj si prajete zmazať tohto správcu?");
                    mapaString.put("prazdneIdText", "Nezadali ste ID správcu!");
                    mapaString.put("prazdneIdNadpis", "Upozornenie");
                    mapaString.put("neexistujeIdText", "Správca s daným ID neexistuje!");
                    mapaString.put("neexistujeIdNadpis", "Upozornenie");
                    mapaString.put("sebaUpozornenieText", "Nemôžte zmazať seba! ");
                    mapaString.put("sebaUpozornenieNadpis", "Upozornenie");
                    mapaString.put("zmazanySpravcaText", "Správca bol zmazaný.");
                    mapaString.put("zmazanySpravcaNadpis", "OK");
                    mapaString.put("neoznacenySpravcaText", "Neoznačili ste správcu!");
                    mapaString.put("neoznacenySpravcaNadpis", "Upozornenie");
                    break;
                case "EN" :
                    mapaString.put("zmazat", "Delete");
                    mapaString.put("potrdit", "Confirm");
                    mapaString.put("spat", "Back");
                    mapaString.put("mazanie", "Delete administrator");
                    mapaString.put("zadajteID", "Enter administrator ID: ");
                    mapaString.put("overovaciaOtazka", "Are you sure you want to delete this administrator?");
                    mapaString.put("prazdneIdText", "You forgot to enter administrator's ID!");
                    mapaString.put("prazdneIdNadpis", "Warning");
                    mapaString.put("neexistujeIdText", "Adminisitrator ID does not exist!");
                    mapaString.put("neexistujeIdNadpis", "Warning");
                    mapaString.put("sebaUpozornenieText", "You can't delete yourself! ");
                    mapaString.put("sebaUpozornenieNadpis", "Warning");
                    mapaString.put("zmazanySpravcaText", "Administrator was deleted.");
                    mapaString.put("zmazanySpravcaNadpis", "OK");
                    mapaString.put("neoznacenySpravcaText", "You need to mark administrator!");
                    mapaString.put("neoznacenySpravcaNadpis", "Warning");
                    break;
                
            }
            this.mapaString = mapaString;
    }
    
    void nastavJazyk() {
        initTexts(Nastavenia.jazyk);
        
        zmazatButton.setText(mapaString.get("zmazat"));
        potvditButton.setText(mapaString.get("potrdit"));
        spatButton.setText(mapaString.get("spat"));
        mazanieSpravcuLabel.setText(mapaString.get("mazanie"));
        zadajteIDSpravcuLabel.setText(mapaString.get("zadajteID"));
        overovaciaOtazkaLabel.setText(mapaString.get("overovaciaOtazka"));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zmenaJazykaPanel1 = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        mazanieSpravcuLabel = new javax.swing.JLabel();
        zadajteIDSpravcuLabel = new javax.swing.JLabel();
        IDSpravcuTextField = new javax.swing.JTextField();
        zmazatButton = new javax.swing.JButton();
        overovaciaOtazkaLabel = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        mazanySpravcaTable = new javax.swing.JTable();
        spatButton = new javax.swing.JButton();
        potvditButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 250, 226));

        mazanieSpravcuLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mazanieSpravcuLabel.setText("Mazanie správcu");

        zadajteIDSpravcuLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        zadajteIDSpravcuLabel.setText("Zadajte ID správcu:");

        zmazatButton.setText("Zmazať");
        zmazatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatButtonActionPerformed(evt);
            }
        });

        overovaciaOtazkaLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        overovaciaOtazkaLabel.setText("Naozaj si prajete zmazať tohto správcu?");

        mazanySpravcaTable.setModel(new MazanySpravcaTableModel());
        mazanySpravcaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mazanySpravcaTableMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(mazanySpravcaTable);

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        potvditButton.setText("Potvrdiť");
        potvditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(overovaciaOtazkaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(potvditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDSpravcuTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zadajteIDSpravcuLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mazanieSpravcuLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mazanieSpravcuLabel)
                    .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zadajteIDSpravcuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDSpravcuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zmazatButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overovaciaOtazkaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatButton)
                    .addComponent(potvditButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zmazatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatButtonActionPerformed
        if(IDSpravcuTextField.getText().equals("")){
            JOptionPane.showMessageDialog(parentJDialog, mapaString.get("prazdneIdText"), mapaString.get("prazdneIdNadpis"), JOptionPane.ERROR_MESSAGE);
        }else{
            Long zadaneID = Long.parseLong(IDSpravcuTextField.getText());
            try{
                
                model.zobrazSpravcuSId(zadaneID);
                spravca = parentJDialog.getSpravcuPodlaId(zadaneID);
                
                if(spravca.getIdFirma() != Nastavenia.idFirma){
                    throw new Exception();
                }
                
                overovaciaOtazkaLabel.setVisible(true);  
                tableScrollPane.setVisible(true);
                potvditButton.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(parentJDialog, mapaString.get("neexistujeIdText"), mapaString.get("neexistujeIdNadpis"), JOptionPane.ERROR_MESSAGE);  
                        
            }
        }
        
       
    }//GEN-LAST:event_zmazatButtonActionPerformed

    private void potvditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvditButtonActionPerformed
        
        if(Nastavenia.idSpravca.equals(Long.parseLong(IDSpravcuTextField.getText()))){
            JOptionPane.showMessageDialog(parentJDialog, mapaString.get("sebaUpozornenieText"), mapaString.get("sebaUpozornenieNadpis"), JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        
        if((boolean)mazanySpravcaTable.getValueAt(0, 2)){
            parentJDialog.zmazatSpravcu(spravca);
            JOptionPane.showMessageDialog(parentJDialog, mapaString.get("zmazanySpravcaText"), mapaString.get("zmazanySpravcaNadpis"), JOptionPane.PLAIN_MESSAGE);
            IDSpravcuTextField.setText("");
            overovaciaOtazkaLabel.setVisible(false);  
            tableScrollPane.setVisible(false);
            potvditButton.setVisible(false);
            model.setHodnota(false);
        }else{
            JOptionPane.showMessageDialog(parentJDialog, mapaString.get("neoznacenySpravcaText"), mapaString.get("neoznacenySpravcaNadpis"), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_potvditButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJDialog.otvorOkno("prehladSpravcov");
        IDSpravcuTextField.setText("");
        overovaciaOtazkaLabel.setVisible(false);  
        tableScrollPane.setVisible(false);
        potvditButton.setVisible(false);
        model.setHodnota(false);
        parentJDialog.aktualizovatSpravcov();
    }//GEN-LAST:event_spatButtonActionPerformed

    private void mazanySpravcaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mazanySpravcaTableMouseClicked
        model.setHodnota(!(boolean) mazanySpravcaTable.getValueAt(0, 2));
    }//GEN-LAST:event_mazanySpravcaTableMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDSpravcuTextField;
    private javax.swing.JLabel mazanieSpravcuLabel;
    private javax.swing.JTable mazanySpravcaTable;
    private javax.swing.JLabel overovaciaOtazkaLabel;
    private javax.swing.JButton potvditButton;
    private javax.swing.JButton spatButton;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel zadajteIDSpravcuLabel;
    private javax.swing.JButton zmazatButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel1;
    // End of variables declaration//GEN-END:variables
}
