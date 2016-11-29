package com.paz1c.gui.zamestnanec;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Zamestnanec;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ZmazatZamestnanca extends javax.swing.JPanel {

    private SpravaZamestnancov parentJForm;
    private boolean potvrdene;
    MazanyZamestnanecTableModel model;
    Zamestnanec zamestnanec;
    
    public ZmazatZamestnanca() {
        initComponents();
        model = (MazanyZamestnanecTableModel) zamestnanecNaMazanieTable.getModel(); 
        zamestnanecNaMazanieTable.getTableHeader().setUI(null);
        overovaciaOtazkaLabel.setVisible(false);
        jScrollPane2.setVisible(false);
        potvrditButton.setVisible(false);
    }
    

    public void setParent(SpravaZamestnancov parent){
        this.parentJForm = parent;
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
        zmenaJazykaPanel1 = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        setBackground(new java.awt.Color(255, 250, 226));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Zmazať zamestnanca");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Zadajte ID zamestnanca:");

        IDZamestnancaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDZamestnancaTextFieldKeyReleased(evt);
            }
        });

        zmazatButton.setText("Zmazať");
        zmazatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatButtonActionPerformed(evt);
            }
        });

        overovaciaOtazkaLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        overovaciaOtazkaLabel.setText("Naozaj si prajete zmazať tohto zamestnanca?");

        potvrditButton.setText("Potvrdiť");
        potvrditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrditButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setMaximumSize(new java.awt.Dimension(50, 5));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(50, 5));

        zamestnanecNaMazanieTable.setModel(new MazanyZamestnanecTableModel());
        zamestnanecNaMazanieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zamestnanecNaMazanieTableMouseClicked(evt);
            }
        });
        zamestnanecNaMazanieTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                zamestnanecNaMazanieTableKeyReleased(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IDZamestnancaTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(overovaciaOtazkaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDZamestnancaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(IDZamestnancaTextField.getText().equals("")){
            JOptionPane.showMessageDialog(parentJForm, "Nezadali ste ID zamestnanca!", "Upozornenie", JOptionPane.ERROR_MESSAGE);
        }else{
            Long zadaneID = Long.parseLong(IDZamestnancaTextField.getText());
            try{
                model.zobrazZamestnancaSId(zadaneID);
                zamestnanec = parentJForm.getZamestnancaPodlaID(zadaneID);
                
                if(zamestnanec.getIdFirma() != Nastavenia.idFirma){
                    throw new Exception();
                }
                
                overovaciaOtazkaLabel.setVisible(true);  
                jScrollPane2.setVisible(true);
                potvrditButton.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(parentJForm, "Zamestnanec s daným ID neexistuje!", "Upozornenie", JOptionPane.ERROR_MESSAGE);    
            }
        }
        
       
    }//GEN-LAST:event_zmazatButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJForm.otvorOkno("tableZamestnanci");
        IDZamestnancaTextField.setText("");
        overovaciaOtazkaLabel.setVisible(false);  
        jScrollPane2.setVisible(false);
        potvrditButton.setVisible(false);
        model.setHodnota(false);
        parentJForm.aktualizovatZamestnancov();

    }//GEN-LAST:event_spatButtonActionPerformed

    private void potvrditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrditButtonActionPerformed
        if((boolean)zamestnanecNaMazanieTable.getValueAt(0, 3)){
            parentJForm.zmazZamestnanca(zamestnanec);
            JOptionPane.showMessageDialog(parentJForm, "Zamestnanec bol zmazaný.", "OK", JOptionPane.PLAIN_MESSAGE);
            IDZamestnancaTextField.setText("");
            overovaciaOtazkaLabel.setVisible(false);  
            jScrollPane2.setVisible(false);
            potvrditButton.setVisible(false);
            model.setHodnota(false);
        }else{
            JOptionPane.showMessageDialog(parentJForm, "Neoznačili ste zamestnanca!", "Upozornenie", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_potvrditButtonActionPerformed

    private void zamestnanecNaMazanieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zamestnanecNaMazanieTableMouseClicked
        model.setHodnota(!(boolean) zamestnanecNaMazanieTable.getValueAt(0, 3));
    }//GEN-LAST:event_zamestnanecNaMazanieTableMouseClicked

    private void IDZamestnancaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDZamestnancaTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            zmazatButtonActionPerformed(null);
        }
    }//GEN-LAST:event_IDZamestnancaTextFieldKeyReleased

    private void zamestnanecNaMazanieTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zamestnanecNaMazanieTableKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            potvrditButtonActionPerformed(null);
        }
    }//GEN-LAST:event_zamestnanecNaMazanieTableKeyReleased


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
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel1;
    // End of variables declaration//GEN-END:variables

    void nastavJazyk() {
    
    }
}
