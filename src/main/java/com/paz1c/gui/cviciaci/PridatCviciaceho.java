package com.paz1c.gui.cviciaci;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Cviciaci;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class PridatCviciaceho extends javax.swing.JPanel {
    
    private SpravaCviciacich parentJFrame;  
    private Map<String,String> mapaString = new HashMap<>();
   
    

    public PridatCviciaceho() {
        initComponents();
        nastavJazyk();
    }
    
    public void setParent(SpravaCviciacich parent){
        this.parentJFrame = parent;
        zmenaJazykaPanel.setParentSpravaCviciacich(parentJFrame);
    }
    
    void nastavJazyk() {
        initTexts(Nastavenia.jazyk);
        
        pridatCviciacehoTextLabel.setText(mapaString.get("uvod"));
        menoLabel.setText(mapaString.get("meno"));
        priezviskoLabel.setText(mapaString.get("priezvisko"));
        zaciatocnyKreditLabel.setText(mapaString.get("zaciatocnyKredit"));
        sumaLabel.setText(mapaString.get("suma"));
        pridatButton.setText(mapaString.get("pridat"));
        spatButton.setText(mapaString.get("spat"));
        
    }
    
     void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod", "Pridať cvičiaceho");
                    mapaString.put("meno", "Meno:");
                    mapaString.put("priezvisko", "Priezvisko:");
                    mapaString.put("zaciatocnyKredit", "Začiatočný kredit:");
                    mapaString.put("suma", "Suma za hodinu:");
                    mapaString.put("pridat", "Pridať");
                    mapaString.put("spat", "Späť");
                    mapaString.put("upozornenieText", "Všetky údaje musia byť zadané!");
                    mapaString.put("upozornenieNadpis", "Upozornenie");
                    mapaString.put("pridanyText", "Cvičiaci bol pridaný.");
                    mapaString.put("pridanyNadpis", "OK");
                    break;
                case "EN" :
                    mapaString.put("uvod", "Add employee");
                    mapaString.put("meno", "Name: ");
                    mapaString.put("priezvisko", "Surname: ");
                    mapaString.put("datumNastupu", "Date of start: ");
                    mapaString.put("hodinyZaDen", "Hours per day: ");
                    mapaString.put("funkcia", "Assignment: ");
                    mapaString.put("pridat", "Add");
                    mapaString.put("spat", "Back");
                    mapaString.put("upozornenieText", "");
                    mapaString.put("upozornenieNadpis", "");
                    mapaString.put("pridanyText", "");
                    mapaString.put("pridanyNadpis", "");
                    break;
                
            }
            this.mapaString = mapaString;
    }
   
    
    public boolean upozornit(){
       
        if(menoTextField.getText().equals(""))
            return true;
        
        if(priezviskoTextField.getText().equals(""))
            return true;
        
        if(sumaTextField.getText().equals(""))
             return true;
        
        if(kreditTextField.getText().equals(""))
             return true;
        
        try{
            Integer.parseInt(kreditTextField.getText());
        }catch(NumberFormatException e){
            return true;
        }
        
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        menoLabel = new javax.swing.JLabel();
        priezviskoLabel = new javax.swing.JLabel();
        zaciatocnyKreditLabel = new javax.swing.JLabel();
        sumaLabel = new javax.swing.JLabel();
        menoTextField = new javax.swing.JTextField();
        priezviskoTextField = new javax.swing.JTextField();
        sumaTextField = new javax.swing.JTextField();
        kreditTextField = new javax.swing.JTextField();
        pridatButton = new javax.swing.JButton();
        spatButton = new javax.swing.JButton();
        pridatCviciacehoTextLabel = new javax.swing.JLabel();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        setBackground(new java.awt.Color(255, 250, 226));

        menoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        menoLabel.setText("Meno:");

        priezviskoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        priezviskoLabel.setText("Priezvisko: ");

        zaciatocnyKreditLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        zaciatocnyKreditLabel.setText("Začiatočný kredit:");

        sumaLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sumaLabel.setText("Suma za hodinu:");

        kreditTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kreditTextFieldKeyReleased(evt);
            }
        });

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

        pridatCviciacehoTextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pridatCviciacehoTextLabel.setText("Pridať cviciaceho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatCviciacehoTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zaciatocnyKreditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kreditTextField)
                            .addComponent(sumaTextField)
                            .addComponent(priezviskoTextField)
                            .addComponent(menoTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pridatCviciacehoTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priezviskoLabel)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zaciatocnyKreditLabel)
                    .addComponent(kreditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumaLabel)
                    .addComponent(sumaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatButton)
                    .addComponent(spatButton))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        if(upozornit()){
            JOptionPane.showMessageDialog(parentJFrame, mapaString.get("upozornenieText"), mapaString.get("upozornenieNadpis"), JOptionPane.ERROR_MESSAGE);
        }else{
            Cviciaci cviciaci = new Cviciaci();
            cviciaci.setMeno(menoTextField.getText());
            cviciaci.setPriezvisko(priezviskoTextField.getText());
            cviciaci.setKredit(Integer.parseInt(kreditTextField.getText()));
            cviciaci.setIdFirma(Nastavenia.idFirma);
            parentJFrame.pridatCviciaceho(cviciaci);
            JOptionPane.showMessageDialog(parentJFrame, mapaString.get("pridanyText"), mapaString.get("pridanyNadpis"), JOptionPane.INFORMATION_MESSAGE);
            
            menoTextField.setText("");
            priezviskoTextField.setText("");
            sumaTextField.setText("");
            kreditTextField.setText("");
            
            parentJFrame.aktualizovatCviciacich();
        }
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJFrame.otvorOkno("tableCviciaci");
        menoTextField.setText("");
        priezviskoTextField.setText("");
        sumaTextField.setText("");
        kreditTextField.setText("");
    }//GEN-LAST:event_spatButtonActionPerformed

    private void kreditTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kreditTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            pridatButtonActionPerformed(null);
        }
    }//GEN-LAST:event_kreditTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField kreditTextField;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JButton pridatButton;
    private javax.swing.JLabel pridatCviciacehoTextLabel;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JButton spatButton;
    private javax.swing.JLabel sumaLabel;
    private javax.swing.JTextField sumaTextField;
    private javax.swing.JLabel zaciatocnyKreditLabel;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables

    
}
