package com.paz1c.gui.PrihlasenieRegistracia;

import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Spravca;
import java.util.HashMap;
import java.util.Map;


public class Prihlasenie extends javax.swing.JPanel {

    private RegistraciaPrihlasenie parentJFrame;
    private Map<String,String> mapaString = new HashMap<>();
   
    public Prihlasenie() {
        initComponents();
        nastavJazyk();
    }
    
    public void setParent(RegistraciaPrihlasenie parent){
        parentJFrame = parent; 
        zmenaJazykaPanel.setParent(parentJFrame);
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod1", "Prihlásenie");
                    mapaString.put("email", "E-mail:");
                    mapaString.put("heslo", "Heslo:");
                    mapaString.put("prihlasit", "Prihlasiť");
                    mapaString.put("spat", "Späť");
                    break;
                case "EN" :
                    mapaString.put("uvod1", "Sign in");
                    mapaString.put("email", "E-mail:");
                    mapaString.put("heslo", "Password:");
                    mapaString.put("prihlasit", "Sign in");
                    mapaString.put("spat", "Back");
                break;
                
            }
            this.mapaString = mapaString;
    }
    
     public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        prihlasenieTextLabel.setText(mapaString.get("uvod1"));
        emailLabel.setText(mapaString.get("email"));
        hesloLabel.setText(mapaString.get("heslo"));
        prihlasenieButton.setText(mapaString.get("prihlasit"));
        spatButton.setText(mapaString.get("spat"));
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailLabel = new javax.swing.JLabel();
        hesloLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        prihlasenieTextLabel = new javax.swing.JLabel();
        prihlasenieButton = new javax.swing.JButton();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        spatButton = new javax.swing.JButton();
        hesloPasswordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 250, 226));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        emailLabel.setText("E-mail:");

        hesloLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        hesloLabel.setText("Heslo:");

        prihlasenieTextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prihlasenieTextLabel.setText("Prihlásenie");

        prihlasenieButton.setText("Prihlásiť sa");
        prihlasenieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihlasenieButtonActionPerformed(evt);
            }
        });

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
                        .addComponent(prihlasenieTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prihlasenieButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hesloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                            .addComponent(hesloPasswordField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prihlasenieTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hesloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prihlasenieButton)
                    .addComponent(spatButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prihlasenieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihlasenieButtonActionPerformed
        Spravca spravca = parentJFrame.getSpravcuEmail(emailTextField.getText());
        if(spravca != null){
            if(spravca.checkPassword(new String(hesloPasswordField.getPassword()))){
                //vytvori sa nove okno
                parentJFrame.dispose();
            }
        }
    }//GEN-LAST:event_prihlasenieButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJFrame.otvorOkno("vyberModu");
    }//GEN-LAST:event_spatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel hesloLabel;
    private javax.swing.JPasswordField hesloPasswordField;
    private javax.swing.JButton prihlasenieButton;
    private javax.swing.JLabel prihlasenieTextLabel;
    private javax.swing.JButton spatButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables
}
