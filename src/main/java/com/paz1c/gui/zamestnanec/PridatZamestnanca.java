package com.paz1c.gui.zamestnanec;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Zamestnanec;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class PridatZamestnanca extends javax.swing.JPanel {
    
    private SpravaZamestnancov parentJFrame;  
    private Map<String,String> mapaString = new HashMap<>();
   
    public PridatZamestnanca() {
        initComponents();
        nastavJazyk();
    }
    
    public void setParent(SpravaZamestnancov parent){
        this.parentJFrame = parent;
        zmenaJazykaPanel.setParentSpravaZamestnancov(parentJFrame);
    }
    
    void nastavJazyk() {
        initTexts(Nastavenia.jazyk);
        
        pridatZamestnancaTextLabel.setText(mapaString.get("uvod"));
        menoLabel.setText(mapaString.get("meno"));
        priezviskoLabel.setText(mapaString.get("priezvisko"));
        datumNastupuLabel.setText(mapaString.get("datumNastupu"));
        hodinyZaDenLabel.setText(mapaString.get("hodinyZaDen"));
        funkciaLabel.setText(mapaString.get("funkcia"));
        hodinovaMzdaLabel.setText(mapaString.get("hodinovaMzda"));
        pridatButton.setText(mapaString.get("pridat"));
        spatButton.setText(mapaString.get("spat"));
        
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod", "Pridať zamestnanca");
                    mapaString.put("meno", "Meno:");
                    mapaString.put("priezvisko", "Priezvisko:");
                    mapaString.put("datumNastupu", "Dátum nástupu:");
                    mapaString.put("hodinyZaDen", "Hodiny za deň:");
                    mapaString.put("funkcia", "Funkcia:");
                    mapaString.put("hodinovaMzda", "Hodinová mzda:");
                    mapaString.put("pridat", "Pridať");
                    mapaString.put("spat", "Späť");
                    mapaString.put("upozornenieText", "Všetky údaje musia byť zadané!");
                    mapaString.put("upozornenieNadpis", "Upozornenie");
                    mapaString.put("pridanyText", "Zamestnanec bol pridaný.");
                    mapaString.put("pridanyNadpis", "OK");
                    break;
                case "EN" :
                    mapaString.put("uvod", "Add employee");
                    mapaString.put("meno", "Name: ");
                    mapaString.put("priezvisko", "Surname: ");
                    mapaString.put("datumNastupu", "Date of start: ");
                    mapaString.put("hodinyZaDen", "Hours per day: ");
                    mapaString.put("funkcia", "Assignment: ");
                    mapaString.put("hodinovaMzda", "Hourly pay:");
                    mapaString.put("pridat", "Add");
                    mapaString.put("spat", "Back");
                    mapaString.put("upozornenieText", "You need to enter all information!");
                    mapaString.put("upozornenieNadpis", "Warning");
                    mapaString.put("pridanyText", "Employee was added.");
                    mapaString.put("pridanyNadpis", "OK");
                    break;
                
            }
            this.mapaString = mapaString;
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
        
        if(hodinovaMzdaTextField.getText().equals(""))
             return true;
        
        try{
            Integer.parseInt(hodinyZaDenTextField.getText());
            Double.parseDouble(hodinovaMzdaTextField.getText());
        }catch(NumberFormatException e){
            return true;
        }
        
        return false;
    }

    void vynulujHodnoty(){
        menoTextField.setText("");
        priezviskoTextField.setText("");
        datumNastupuJXDatePicker.setDate(null);
        hodinyZaDenTextField.setText("");
        funkciaTextField.setText("");
        hodinovaMzdaTextField.setText("");
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
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        hodinovaMzdaLabel = new javax.swing.JLabel();
        hodinovaMzdaTextField = new javax.swing.JTextField();

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

        hodinovaMzdaLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        hodinovaMzdaLabel.setText("hodinova mzda:");

        hodinovaMzdaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hodinovaMzdaTextFieldKeyReleased(evt);
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
                        .addComponent(pridatZamestnancaTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hodinovaMzdaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datumNastupuLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hodinyZaDenLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(funkciaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(funkciaTextField)
                            .addComponent(hodinyZaDenTextField)
                            .addComponent(priezviskoTextField)
                            .addComponent(menoTextField)
                            .addComponent(datumNastupuJXDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hodinovaMzdaTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pridatZamestnancaTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hodinovaMzdaLabel)
                    .addComponent(hodinovaMzdaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatButton)
                    .addComponent(spatButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        if(upozornit()){
            JOptionPane.showMessageDialog(parentJFrame, mapaString.get("upozornenieText"), mapaString.get("upozornenieNadpis"), JOptionPane.ERROR_MESSAGE);
        }else{
            Zamestnanec zamestnanec = new Zamestnanec();
            zamestnanec.setMeno(menoTextField.getText());
            zamestnanec.setPriezvisko(priezviskoTextField.getText());
            zamestnanec.setDatumNastupu(new Date(datumNastupuJXDatePicker.getDate().getTime()));
            zamestnanec.setPocetHodinNaDen(Integer.parseInt(hodinyZaDenTextField.getText()));
            zamestnanec.setZameranie(funkciaTextField.getText());
            zamestnanec.setHodMzda(Double.parseDouble(hodinovaMzdaTextField.getText()));
            zamestnanec.setIdFirma(Nastavenia.idFirma);
            parentJFrame.pridatZamestnanca(zamestnanec);
            JOptionPane.showMessageDialog(parentJFrame, mapaString.get("pridanyText"), mapaString.get("pridanyNadpis"), JOptionPane.INFORMATION_MESSAGE);
            
            vynulujHodnoty();
            parentJFrame.aktualizovatZamestnancov();
        }
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJFrame.otvorOkno("tableZamestnanci");
        vynulujHodnoty();
    }//GEN-LAST:event_spatButtonActionPerformed

    private void hodinovaMzdaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hodinovaMzdaTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            pridatButtonActionPerformed(null);
        }
    }//GEN-LAST:event_hodinovaMzdaTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datumNastupuJXDatePicker;
    private javax.swing.JLabel datumNastupuLabel;
    private javax.swing.JLabel funkciaLabel;
    private javax.swing.JTextField funkciaTextField;
    private javax.swing.JLabel hodinovaMzdaLabel;
    private javax.swing.JTextField hodinovaMzdaTextField;
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
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables

    
}
