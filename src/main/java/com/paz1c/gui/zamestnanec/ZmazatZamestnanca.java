package com.paz1c.gui.zamestnanec;

import com.paz1c.other.Zamestnanec;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
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
        zamestnanecNaMazanieTable.getTableHeader().setUI(null);
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
        spatButton = new javax.swing.JButton();

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
        potvrditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrditButtonActionPerformed(evt);
            }
        });

        zamestnanecNaMazanieTable.setModel(new MazanyZamestnanecTableModel());
        zamestnanecNaMazanieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zamestnanecNaMazanieTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(zamestnanecNaMazanieTable);

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
                    .addComponent(overovaciaOtazkaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potvrditButton)
                    .addComponent(spatButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zmazatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatButtonActionPerformed
        if(IDZamestnancaTextField.getText().equals("")){
            JOptionPane.showMessageDialog(parentJForm, "Nezadali ste ID zamestnanca!", "Upozornenie", JOptionPane.ERROR_MESSAGE);
        }else{
            Long zadaneID = Long.parseLong(IDZamestnancaTextField.getText());
            aktualizovatZamestnancov(zadaneID);
 
            overovaciaOtazkaLabel.setVisible(true);  
            jScrollPane2.setVisible(true);
            potvrditButton.setVisible(true);
        }
        
       
    }//GEN-LAST:event_zmazatButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJForm.otvorOkno("tableZamestnanci");
        IDZamestnancaTextField.setText("");
        overovaciaOtazkaLabel.setVisible(false);  
            jScrollPane2.setVisible(false);
            potvrditButton.setVisible(false);
    }//GEN-LAST:event_spatButtonActionPerformed

    private void potvrditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrditButtonActionPerformed
        
    }//GEN-LAST:event_potvrditButtonActionPerformed

    private void zamestnanecNaMazanieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zamestnanecNaMazanieTableMouseClicked
        int row = zamestnanecNaMazanieTable.getSelectedRow();
        int column = zamestnanecNaMazanieTable.convertColumnIndexToModel(zamestnanecNaMazanieTable.getSelectedColumn());
            MazanyZamestnanecTableModel model = (MazanyZamestnanecTableModel) zamestnanecNaMazanieTable.getModel(); 
            model.setValueAt(Boolean.TRUE, row, column);
        /*
        if (zamestnanecNaMazanieTable.getValueAt(row, column) == Boolean.FALSE){
       
        }
        */
         
    }//GEN-LAST:event_zamestnanecNaMazanieTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDZamestnancaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel overovaciaOtazkaLabel;
    private javax.swing.JButton potvrditButton;
    private javax.swing.JButton spatButton;
    private javax.swing.JTable zamestnanecNaMazanieTable;
    private javax.swing.JButton zmazatButton;
    // End of variables declaration//GEN-END:variables
}
