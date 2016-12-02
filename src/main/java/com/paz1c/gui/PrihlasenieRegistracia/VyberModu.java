package com.paz1c.gui.PrihlasenieRegistracia;

import com.paz1c.constants.Nastavenia;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VyberModu extends javax.swing.JPanel {

    private RegistraciaPrihlasenie parentJFrame;
    private Map<String,String> mapaString = new HashMap<>();
    
    public VyberModu() {
        initComponents();
        nastavJazyk();
    }
    
    public void setParent(RegistraciaPrihlasenie parent){
        parentJFrame = parent; 
        zmenaJazykaPanel.setParentRegistraciaPrihlasenie(parentJFrame);
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod1", "Vítame Vás!");
                    mapaString.put("uvod2", "Vyberte mód a zaregistrujte sa alebo sa prihláste ak už máte účet.");
                    mapaString.put("zamestnanie", "Zamestnanie");
                    mapaString.put("sportoveZariadenie", "Športové zariadenie");
                    mapaString.put("prihlasit", "Prihlásiť");
                    mapaString.put("registracia", "Registrácia");
                    mapaString.put("upozornenieText", "Nie je vybratý mód!");
                    mapaString.put("upozornenieNadpis", "Výber modu");
                    break;
                case "EN" :
                    mapaString.put("uvod1", "Welcome!");
                    mapaString.put("uvod2", "Choose a mode and create a new account or sign in if you have an account");
                    mapaString.put("zamestnanie", "Employment");
                    mapaString.put("sportoveZariadenie", "Sport facility");
                    mapaString.put("prihlasit", "Sign in");
                    mapaString.put("registracia", "Create a new account");
                    mapaString.put("upozornenieText", "You haven´t choose any mode!");
                    mapaString.put("upozornenieNadpis", "Choose mode");
                break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        uvitaciTextLabel.setText(mapaString.get("uvod1"));
        popisTextLabel.setText(mapaString.get("potvrdit"));
        cviciaciToggle.setText(mapaString.get("sportoveZariadenie"));
        zamestnanecToggle.setText(mapaString.get("zamestnanie"));
        prihlasenieButton.setText(mapaString.get("prihlasit"));
        registraciaButton.setText(mapaString.get("registracia"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        zamestnanecToggle = new javax.swing.JToggleButton();
        prihlasenieButton = new javax.swing.JButton();
        cviciaciToggle = new javax.swing.JToggleButton();
        registraciaButton = new javax.swing.JButton();
        uvitaciTextLabel = new javax.swing.JLabel();
        popisTextLabel = new javax.swing.JLabel();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        setBackground(new java.awt.Color(255, 250, 226));
        setForeground(new java.awt.Color(153, 153, 255));
        setMaximumSize(new java.awt.Dimension(2000, 2000));
        setMinimumSize(new java.awt.Dimension(0, 0));

        buttonGroup.add(zamestnanecToggle);
        zamestnanecToggle.setText("Zamestnanie");
        zamestnanecToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zamestnanecToggle.setMaximumSize(new java.awt.Dimension(147, 25));
        zamestnanecToggle.setMinimumSize(new java.awt.Dimension(147, 25));
        zamestnanecToggle.setPreferredSize(new java.awt.Dimension(147, 25));
        zamestnanecToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamestnanecToggleActionPerformed(evt);
            }
        });

        prihlasenieButton.setText("Prihlásiť sa");
        prihlasenieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihlasenieButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(cviciaciToggle);
        cviciaciToggle.setText("Športové zariadenie");
        cviciaciToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cviciaciToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cviciaciToggleActionPerformed(evt);
            }
        });

        registraciaButton.setText("Registrácia");
        registraciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraciaButtonActionPerformed(evt);
            }
        });

        uvitaciTextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uvitaciTextLabel.setText("Vítame Vás!");

        popisTextLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        popisTextLabel.setText("Vyberte si mód a zaregistrujte sa alebo sa prihláste ak už máte účet.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(zamestnanecToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cviciaciToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prihlasenieButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registraciaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uvitaciTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(popisTextLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uvitaciTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popisTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zamestnanecToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cviciaciToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registraciaButton)
                    .addComponent(prihlasenieButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prihlasenieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihlasenieButtonActionPerformed
       parentJFrame.otvorOkno("prihlasenie");
    }//GEN-LAST:event_prihlasenieButtonActionPerformed

    private void registraciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraciaButtonActionPerformed
        if(Nastavenia.vybranyMod != null){
            parentJFrame.otvorOkno("registracia");
        }else{
            JOptionPane.showMessageDialog(parentJFrame,mapaString.get("upozornenieText"),mapaString.get("upozornenieNadpis"),JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registraciaButtonActionPerformed

    private void zamestnanecToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamestnanecToggleActionPerformed
        if(zamestnanecToggle.isSelected())
            Nastavenia.vybranyMod = "Zamestnanec";
    }//GEN-LAST:event_zamestnanecToggleActionPerformed

    private void cviciaciToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cviciaciToggleActionPerformed
        if(cviciaciToggle.isSelected())
            Nastavenia.vybranyMod = "Cviciaci";
    }//GEN-LAST:event_cviciaciToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JToggleButton cviciaciToggle;
    private javax.swing.JLabel popisTextLabel;
    private javax.swing.JButton prihlasenieButton;
    private javax.swing.JButton registraciaButton;
    private javax.swing.JLabel uvitaciTextLabel;
    private javax.swing.JToggleButton zamestnanecToggle;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables
}
