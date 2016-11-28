package com.paz1c.gui.PrihlasenieRegistracia;

import com.paz1c.constants.Nastavenia;
import com.paz1c.dao.FirmaDao;
import com.paz1c.gui.zamestnanec.SpravaZamestnancov;
import com.paz1c.other.Firma;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class Overenie extends javax.swing.JPanel {

    private RegistraciaPrihlasenie parentJFrame;
    private String ok = "\u2713";
    private String bad = "\u2717";
    private Map<String,String> mapaString = new HashMap<>();
   
    public Overenie() {
        initComponents();
        nastavJazyk();
    }
    
    public void focusOverenie() {
        kodTextField.requestFocusInWindow();
    }
    
    public void setParent(RegistraciaPrihlasenie parent){
        parentJFrame = parent; 
        zmenaJazykaPanel.setParent(parentJFrame);
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod1", "Pre zaregistrovanie firmy zadajte registračný kód z e-mailu: ");
                    mapaString.put("nadpisUpozornenie", "Zly kod");
                    mapaString.put("textUpozornenie", "Zadali ste zlý kód.\nChodte na Váš e-mail a skontrolujte kód.");
                    mapaString.put("potvrdit", "Potvrdiť");
                    break;
                case "EN" :
                    mapaString.put("uvod1", "For registration of the company enter the verification code: ");
                    mapaString.put("nadpisUpozornenie", "Wrong verification code");
                    mapaString.put("textUpozornenie", " You entered wrong verification code.\nGo to your e-mail and check verification code.");
                    mapaString.put("potvrdit", "Confirm");
                break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        registracnyKodTextLabel.setText(mapaString.get("uvod1"));
        potvrditButton.setText(mapaString.get("potvrdit"));
    }
    
    boolean kontrolaKodu(){
        return parentJFrame.getVygenerovanyKod().equals(kodTextField.getText());
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registracnyKodTextLabel = new javax.swing.JLabel();
        kodTextField = new javax.swing.JTextField();
        potvrditButton = new javax.swing.JButton();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        kodVypisLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 226));

        registracnyKodTextLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        registracnyKodTextLabel.setText("Pre zaregistrovanie firmy zadajte registračný kód z e-mailu: ");

        kodTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kodTextFieldKeyReleased(evt);
            }
        });

        potvrditButton.setText("Potvrdiť");
        potvrditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registracnyKodTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addComponent(kodVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kodTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potvrditButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registracnyKodTextLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potvrditButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodVypisLabel)
                .addContainerGap(561, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void potvrditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrditButtonActionPerformed
        if(kontrolaKodu()){
            Long id_firma = parentJFrame.vlozFirmu();
            parentJFrame.vlozSpravcu(id_firma);
            parentJFrame.zapamatajUdaje(parentJFrame.getNovySpravca());
            if(Nastavenia.vybranyMod.equals("Zamestnanec")){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new SpravaZamestnancov().setVisible(true);
                    }
                });
                System.out.println("otvaram sprava zamestnancov");
                
            }else if(Nastavenia.vybranyMod.equals("Cviciaci")){
                //pracuje sa na tom
            }
            
            Nastavenia.idFirma = id_firma;
            
            parentJFrame.dispose();
        } else
            JOptionPane.showMessageDialog(parentJFrame,mapaString.get("textUpozornenie"),mapaString.get("nadpisUpozornenie"),JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_potvrditButtonActionPerformed

    private void kodTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodTextFieldKeyReleased
        if(kontrolaKodu())
            kodVypisLabel.setText(ok);
        else
            kodVypisLabel.setText(bad);
    }//GEN-LAST:event_kodTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField kodTextField;
    private javax.swing.JLabel kodVypisLabel;
    private javax.swing.JButton potvrditButton;
    private javax.swing.JLabel registracnyKodTextLabel;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables
}
