package com.paz1c.gui.zamestnanec;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Zamestnanec;
import java.sql.Date;
import javax.swing.JOptionPane;

public class PridatZamestnanca extends javax.swing.JPanel {
    
    private SpravaZamestnancov parentJFrame;  
    

    public PridatZamestnanca() {
        initComponents();
    }
    
    public void setParent(SpravaZamestnancov parent){
        parentJFrame = parent;
    }
    
    public boolean upozornit(){
       
        if(menoTextField.getText().equals(""))
            return true;
        
        if(priezviskoTextField.getText().equals(""))
            return true;
        
        if(datumNastupuJXDatePicker.getDate() == null)
             return true;
        
        if(hodinyZaDenTextField.getText().equals(""))
             return true;
        
        if(funkciaTextField.getText().equals(""))
             return true;
        
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        menoLabel = new javax.swing.JLabel();
        priezviskoLabel = new javax.swing.JLabel();
        datumNastupuLabel = new javax.swing.JLabel();
        hodinyZaDenLabel = new javax.swing.JLabel();
        funkciaLabel = new javax.swing.JLabel();
        menoTextField = new javax.swing.JTextField();
        priezviskoTextField = new javax.swing.JTextField();
        hodinyZaDenTextField = new javax.swing.JTextField();
        funkciaTextField = new javax.swing.JTextField();
        pridatButton = new javax.swing.JButton();
        spatButton = new javax.swing.JButton();
        pridatZamestnancaTextLabel = new javax.swing.JLabel();
        datumNastupuJXDatePicker = new org.jdesktop.swingx.JXDatePicker();
        zmenaJazykaPanel1 = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        setBackground(new java.awt.Color(255, 250, 226));

        menoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        menoLabel.setText("Meno:");

        priezviskoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        priezviskoLabel.setText("Priezvisko: ");

        datumNastupuLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        datumNastupuLabel.setText("Dátum nástupu:");

        hodinyZaDenLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        hodinyZaDenLabel.setText("Hodiny za deň:");

        funkciaLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        funkciaLabel.setText("Funkcia:");

        pridatButton.setText("Pridať");
        pridatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatButtonActionPerformed(evt);
            }
        });

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        pridatZamestnancaTextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pridatZamestnancaTextLabel.setText("Pridať zamestnanca");

        datumNastupuJXDatePicker.setTimeZone(java.util.TimeZone.getTimeZone("Europe/Bratislava"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatZamestnancaTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datumNastupuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hodinyZaDenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(funkciaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(funkciaTextField)
                            .addComponent(hodinyZaDenTextField)
                            .addComponent(priezviskoTextField)
                            .addComponent(menoTextField)
                            .addComponent(datumNastupuJXDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pridatZamestnancaTextLabel)
                    .addComponent(zmenaJazykaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priezviskoLabel)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datumNastupuLabel)
                    .addComponent(datumNastupuJXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hodinyZaDenLabel)
                    .addComponent(hodinyZaDenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funkciaLabel)
                    .addComponent(funkciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatButton)
                    .addComponent(spatButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        if(upozornit()){
            JOptionPane.showMessageDialog(parentJFrame, "Všetky údaje musia byť zadané!", "Upozornenie", JOptionPane.ERROR_MESSAGE);
        }else{
            Zamestnanec zamestnanec = new Zamestnanec();
            zamestnanec.setMeno(menoTextField.getText());
            zamestnanec.setPriezvisko(priezviskoTextField.getText());
            zamestnanec.setDatumNastupu(new Date(datumNastupuJXDatePicker.getDate().getTime()));
            zamestnanec.setPocetHodinNaDen(Integer.parseInt(hodinyZaDenTextField.getText()));
            zamestnanec.setZameranie(funkciaTextField.getText());
            zamestnanec.setIdFirma(Nastavenia.idFirma);
            parentJFrame.pridatZamestnanca(zamestnanec);
            JOptionPane.showMessageDialog(parentJFrame, "Zamestnanec bol pridaný.", "OK", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJFrame.otvorOkno("tableZamestnanci");
    }//GEN-LAST:event_spatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datumNastupuJXDatePicker;
    private javax.swing.JLabel datumNastupuLabel;
    private javax.swing.JLabel funkciaLabel;
    private javax.swing.JTextField funkciaTextField;
    private javax.swing.JLabel hodinyZaDenLabel;
    private javax.swing.JTextField hodinyZaDenTextField;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JButton pridatButton;
    private javax.swing.JLabel pridatZamestnancaTextLabel;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JButton spatButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel1;
    // End of variables declaration//GEN-END:variables
}
