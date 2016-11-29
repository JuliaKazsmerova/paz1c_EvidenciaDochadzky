package com.paz1c.gui.zamestnanec;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Zamestnanec;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ZmazatZamestnanca extends javax.swing.JPanel {

    private SpravaZamestnancov parentJForm;
    private boolean potvrdene;
    private MazanyZamestnanecTableModel model;
    private Zamestnanec zamestnanec;
    private Map<String,String> mapaString = new HashMap<>();
   
    
    public ZmazatZamestnanca() {
        initComponents();
        nastavJazyk();
        model = (MazanyZamestnanecTableModel) zamestnanecNaMazanieTable.getModel(); 
        zamestnanecNaMazanieTable.getTableHeader().setUI(null);
        overovaciaOtazkaLabel.setVisible(false);
        jScrollPane2.setVisible(false);
        potvrditButton.setVisible(false);
    }
    

    public void setParent(SpravaZamestnancov parent){
        this.parentJForm = parent;
        zmenaJazykaPanel1.setParentSpravaZamestnancov(parentJForm);
    }
    
     void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod1", "Prihlásenie");
                    mapaString.put("uvod2", "E-mail:");
                    mapaString.put("otazka", "Heslo:");
                    mapaString.put("zmazat", "Prihlasiť");
                    mapaString.put("spat", "Späť");
                    mapaString.put("potvrdit", "Upozornenie");
                    mapaString.put("idPrazdneText", "Nezadali ste ID zamestnanca!");
                    mapaString.put("idPrazdneNadpis", "Upozornenie");
                    mapaString.put("idNeexistujuceText", "Zamestnanec s daným ID neexistuje!");
                    mapaString.put("idNeexistujuceNadpis", "Upozornenie");
                    mapaString.put("zmazanyUpozornenieText", "Zamestnanec bol zmazaný.");
                    mapaString.put("zmazanyUpozornenieNadpis", "OK");
                    mapaString.put("neoznacenyUpozornenieText", "Neoznačili ste zamestnanca!");
                    mapaString.put("neoznacenyUpozornenieNadpis", "Upozornenie");
                    break;
                case "EN" :
                    mapaString.put("uvod1", "Sign in");
                    mapaString.put("uvod2", "E-mail:");
                    mapaString.put("otazka", "Password:");
                    mapaString.put("zmazat", "Sign in:");
                    mapaString.put("spat", "Back");
                    mapaString.put("potvrdit", "Warning");
                    mapaString.put("idPrazdneText", "Enter ID of employee!");
                    mapaString.put("idPrazdneNadpis", "Warning");
                    mapaString.put("idNeexistujuceText", "Employee with entered ID does not exist!");
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
        
        zmazatZamestnancaLabel.setText(mapaString.get("uvod1"));
        zadatIDZamestnancaLabel.setText(mapaString.get("uvod2"));
        overovaciaOtazkaLabel.setText(mapaString.get("otazka"));
        zmazatButton.setText(mapaString.get("zmazat"));
        spatButton.setText(mapaString.get("spat"));
        potvrditButton.setText(mapaString.get("potvrdit"));
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zmazatZamestnancaLabel = new javax.swing.JLabel();
        zadatIDZamestnancaLabel = new javax.swing.JLabel();
        IDZamestnancaTextField = new javax.swing.JTextField();
        zmazatButton = new javax.swing.JButton();
        overovaciaOtazkaLabel = new javax.swing.JLabel();
        potvrditButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        zamestnanecNaMazanieTable = new javax.swing.JTable();
        spatButton = new javax.swing.JButton();
        zmenaJazykaPanel1 = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        setBackground(new java.awt.Color(255, 250, 226));

        zmazatZamestnancaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zmazatZamestnancaLabel.setText("Zmazať zamestnanca");

        zadatIDZamestnancaLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        zadatIDZamestnancaLabel.setText("Zadajte ID zamestnanca:");

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
                            .addComponent(zmazatZamestnancaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zadatIDZamestnancaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(zmazatZamestnancaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zadatIDZamestnancaLabel)
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
            JOptionPane.showMessageDialog(parentJForm, mapaString.get("idPrazdneText"), mapaString.get("idPrazdneNadpis"), JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(parentJForm, mapaString.get("idNeexistujuceText"), mapaString.get("idNeexistujuceNadpis"), JOptionPane.ERROR_MESSAGE);    
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
    }//GEN-LAST:event_spatButtonActionPerformed

    private void potvrditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrditButtonActionPerformed
        if((boolean)zamestnanecNaMazanieTable.getValueAt(0, 3)){
            parentJForm.zmazZamestnanca(zamestnanec);
            JOptionPane.showMessageDialog(parentJForm, mapaString.get("zmazanyUpozornenieText"), mapaString.get("zmazanyUpozornenieNaspis"), JOptionPane.PLAIN_MESSAGE);
            IDZamestnancaTextField.setText("");
            overovaciaOtazkaLabel.setVisible(false);  
            jScrollPane2.setVisible(false);
            potvrditButton.setVisible(false);
            model.setHodnota(false);
        }else{
            JOptionPane.showMessageDialog(parentJForm, mapaString.get("neoznacenyUpozornenieText"), mapaString.get("neoznacenyUpozornenieNadpis"), JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel overovaciaOtazkaLabel;
    private javax.swing.JButton potvrditButton;
    private javax.swing.JButton spatButton;
    private javax.swing.JLabel zadatIDZamestnancaLabel;
    private javax.swing.JTable zamestnanecNaMazanieTable;
    private javax.swing.JButton zmazatButton;
    private javax.swing.JLabel zmazatZamestnancaLabel;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel1;
    // End of variables declaration//GEN-END:variables

    
}
