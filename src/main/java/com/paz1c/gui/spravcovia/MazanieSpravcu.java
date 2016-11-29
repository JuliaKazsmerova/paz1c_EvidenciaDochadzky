package com.paz1c.gui.spravcovia;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Spravca;
import javax.swing.JOptionPane;


public class MazanieSpravcu extends javax.swing.JPanel {

    private Spravcovia parentJDialog;
    private MazanySpravcaTableModel model;
    Spravca spravca;
    
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zmenaJazykaPanel1 = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDSpravcuTextField = new javax.swing.JTextField();
        zmazatButton = new javax.swing.JButton();
        overovaciaOtazkaLabel = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        mazanySpravcaTable = new javax.swing.JTable();
        spatButton = new javax.swing.JButton();
        potvditButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 250, 226));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mazanie správcu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Zadajte ID správcu:");

        zmazatButton.setText("Zmazať");
        zmazatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatButtonActionPerformed(evt);
            }
        });

        overovaciaOtazkaLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        overovaciaOtazkaLabel.setText("Naozaj si prajete zmazať tohto správcu?");

        mazanySpravcaTable.setModel(new MazanySpravcaTableModel());
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
                    .addComponent(overovaciaOtazkaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDSpravcuTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(potvditButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDSpravcuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zmazatButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overovaciaOtazkaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatButton)
                    .addComponent(potvditButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zmazatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatButtonActionPerformed
        if(IDSpravcuTextField.getText().equals("")){
            JOptionPane.showMessageDialog(parentJDialog, "Nezadali ste ID správcu!", "Upozornenie", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(parentJDialog, "Správca s daným ID neexistuje!", "Upozornenie", JOptionPane.ERROR_MESSAGE);  
                        
            }
        }
        
       
    }//GEN-LAST:event_zmazatButtonActionPerformed

    private void potvditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvditButtonActionPerformed
        
        if((boolean)mazanySpravcaTable.getValueAt(0, 2)){
            parentJDialog.zmazatSpravcu(spravca);
            JOptionPane.showMessageDialog(parentJDialog, "Správca bol zmazaný.", "OK", JOptionPane.PLAIN_MESSAGE);
            IDSpravcuTextField.setText("");
            overovaciaOtazkaLabel.setVisible(false);  
            tableScrollPane.setVisible(false);
            potvditButton.setVisible(false);
            model.setHodnota(false);
        }else{
            JOptionPane.showMessageDialog(parentJDialog, "Neoznačili ste správcu!", "Upozornenie", JOptionPane.ERROR_MESSAGE);
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

    void nastavJazyk() {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDSpravcuTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable mazanySpravcaTable;
    private javax.swing.JLabel overovaciaOtazkaLabel;
    private javax.swing.JButton potvditButton;
    private javax.swing.JButton spatButton;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton zmazatButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel1;
    // End of variables declaration//GEN-END:variables
}
