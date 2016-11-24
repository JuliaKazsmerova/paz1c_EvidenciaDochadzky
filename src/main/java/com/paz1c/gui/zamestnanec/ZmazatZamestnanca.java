package com.paz1c.gui.zamestnanec;

import com.paz1c.other.Zamestnanec;
import javax.swing.table.DefaultTableModel;

public class ZmazatZamestnanca extends javax.swing.JPanel {

    private SpravaZamestnancov parentJForm;
    
    public ZmazatZamestnanca() {
        initComponents();
        overovaciaOtazkaLabel.setVisible(false);
        jScrollPane2.setVisible(false);
        potvrditButton.setVisible(false);
    }
    
        private void aktualizovatZamestnancov(Long ID) {
        // ziskaj model
        MazanyZamestnanecTableModel model = (MazanyZamestnanecTableModel) zamestnanecNaMazanieTable.getModel();        
        // pridaj zamestnanca
        model.najdiPodlaId(ID);
    }

    public void setParent(SpravaZamestnancov parent){
        parentJForm = parent;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDZamestnancaTextField = new javax.swing.JTextField();
        zmazatButton = new javax.swing.JButton();
        overovaciaOtazkaLabel = new javax.swing.JLabel();
        potvrditButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        zamestnanecNaMazanieTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 250, 226));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Zmazať zamestnanca");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Zadajte ID zamestnanca:");

        zmazatButton.setText("Zmazať");
        zmazatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatButtonActionPerformed(evt);
            }
        });

        overovaciaOtazkaLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        overovaciaOtazkaLabel.setText("Naozaj si prajete zmazať túto osobu?");

        potvrditButton.setText("Potvrdiť");

        zamestnanecNaMazanieTable.setModel(new MazanyZamestnanecTableModel());
        jScrollPane2.setViewportView(zamestnanecNaMazanieTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(overovaciaOtazkaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(potvrditButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IDZamestnancaTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDZamestnancaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zmazatButton))
                .addGap(18, 18, 18)
                .addComponent(overovaciaOtazkaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(potvrditButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zmazatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatButtonActionPerformed
        Long zadaneID = Long.parseLong(IDZamestnancaTextField.getText());
        aktualizovatZamestnancov(zadaneID);
        
        
        
        overovaciaOtazkaLabel.setVisible(true);  
        jScrollPane2.setVisible(true);
        potvrditButton.setVisible(true);
    }//GEN-LAST:event_zmazatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDZamestnancaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel overovaciaOtazkaLabel;
    private javax.swing.JButton potvrditButton;
    private javax.swing.JTable zamestnanecNaMazanieTable;
    private javax.swing.JButton zmazatButton;
    // End of variables declaration//GEN-END:variables
}
