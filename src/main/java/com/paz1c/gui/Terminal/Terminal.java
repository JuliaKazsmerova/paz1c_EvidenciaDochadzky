
package com.paz1c.gui.Terminal;

import com.paz1c.constants.Nastavenia;
import com.paz1c.manager.DefaultZaznamDochadzkyManager;
import com.paz1c.manager.ZaznamDochadzkyManager;
import com.paz1c.other.ZaznamDochadzky;
import java.awt.Color;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;


public class Terminal extends javax.swing.JFrame {

    private boolean prichod = true; 
    private Terminal parentJForm;
    private ZaznamDochadzkyManager zaznamDochadzkyManager = new DefaultZaznamDochadzkyManager();
    private Map<String,String> mapaString = new HashMap<>();
    private String mod = "Zamestnanec";
    
    public Terminal() {
        initComponents();
        getContentPane().setBackground(new Color(255,250,226));
        zmenaJazykaPanel.setParentTerminal(this);
        prichodToggleButton.setSelected(prichod);
        
        nastavJazyk();
    }
    
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("prichod", "Príchod");
                    mapaString.put("odchod", "Odchod");
                    mapaString.put("potvrdit", "Potvrdiť");
                    
                    mapaString.put("zlaKartaNadpis", "Upozornenie");
                    mapaString.put("zlaKartaText", "Zlá karta");
                    mapaString.put("zaznamenanyOdchodNadpis", "Upozornenie");
                    mapaString.put("zaznamenanyOdchodText", "Odchod už bol zaznamenaný. ");
                    mapaString.put("chybaPrichodNadpis", "Upozornenie");
                    mapaString.put("chybaPrichodText", "Príchod nebol zaznamenaný.");
                    break;
                case "EN" :
                    mapaString.put("prichod", "");
                    mapaString.put("odchod", "");
                    mapaString.put("potvrdit", "");
                    
                    mapaString.put("zlaKartaNadpis", "");
                    mapaString.put("zlaKartaText", "");
                    mapaString.put("zaznamenanyOdchodNadpis", "Warning");
                    mapaString.put("zaznamenanyOdchodText", "Leave was entered.");
                    mapaString.put("chybaPrichodNadpis", "Warning");
                    mapaString.put("chybaPrichodText", "Arrival was not entered.");
                    break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        prichodToggleButton.setText(mapaString.get("prichod"));
        odchodToggleButton.setText(mapaString.get("odchod"));
        potvrditButton.setText(mapaString.get("potvrdit"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        prichodToggleButton = new javax.swing.JToggleButton();
        odchodToggleButton = new javax.swing.JToggleButton();
        idTextField = new javax.swing.JTextField();
        potvrditButton = new javax.swing.JButton();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        zamestnanieToggleButton = new javax.swing.JToggleButton();
        sportZarToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 250, 226));
        setForeground(new java.awt.Color(255, 250, 226));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 600, 150));
        setMinimumSize(new java.awt.Dimension(400, 150));
        setResizable(false);

        buttonGroup1.add(prichodToggleButton);
        prichodToggleButton.setText("Prichod");
        prichodToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prichodToggleButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(odchodToggleButton);
        odchodToggleButton.setText("Odchod");
        odchodToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odchodToggleButtonActionPerformed(evt);
            }
        });

        potvrditButton.setText("potvrdit");
        potvrditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrditButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(zamestnanieToggleButton);
        zamestnanieToggleButton.setText("Zamestnanie");
        zamestnanieToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamestnanieToggleButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(sportZarToggleButton);
        sportZarToggleButton.setText("Sportove zariadenie");
        sportZarToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportZarToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(potvrditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prichodToggleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(odchodToggleButton))
                            .addComponent(zamestnanieToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sportZarToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prichodToggleButton)
                    .addComponent(odchodToggleButton)
                    .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zamestnanieToggleButton)
                    .addComponent(sportZarToggleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potvrditButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prichodToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prichodToggleButtonActionPerformed
        prichod = true;
    }//GEN-LAST:event_prichodToggleButtonActionPerformed

    private void odchodToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odchodToggleButtonActionPerformed
        prichod = false;
    }//GEN-LAST:event_odchodToggleButtonActionPerformed

    private void potvrditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrditButtonActionPerformed
        if(prichod){
            //zapise sa do databazy prichod
            ZaznamDochadzky novyZaznam = new ZaznamDochadzky();
            try{
                System.out.println(Long.parseLong(idTextField.getText()));
                if(mod.equals("Zamestnanec"))
                    novyZaznam.setIdZamestnanec(Long.parseLong(idTextField.getText()));
                else if(mod.equals("Cviciaci"))
                    novyZaznam.setIdCviciaci(Long.parseLong(idTextField.getText()));
                novyZaznam.setPrichod(new Timestamp(System.currentTimeMillis()));
            
                zaznamDochadzkyManager.vlozZaznam(novyZaznam);
            }catch(Exception e){
                JOptionPane.showMessageDialog(parentJForm, mapaString.get("zlaKartaText"), mapaString.get("zlaKartaNadpis"), JOptionPane.ERROR_MESSAGE);
            }
        }else{
            //zapise sa do databazy odchod
            ZaznamDochadzky existujuciZaznam;
            try{
                existujuciZaznam = zaznamDochadzkyManager.getPoslednyZaznam(Long.parseLong(idTextField.getText()));
            }catch(Exception e){
                    JOptionPane.showMessageDialog(parentJForm, mapaString.get("zlaKartaText"), mapaString.get("zlaKartaNadpis"), JOptionPane.ERROR_MESSAGE);
            return;
                }
            
            if(existujuciZaznam==null){
                JOptionPane.showMessageDialog(parentJForm, mapaString.get("chybaPrichodText"), mapaString.get("chybaPrichodNadpis"), JOptionPane.ERROR_MESSAGE);
                return;
            }
                
            if(existujuciZaznam.getOdchod()==null){
                existujuciZaznam.setOdchod(new Timestamp(System.currentTimeMillis()));
                long rozdiel = existujuciZaznam.getOdchod().getTime() - existujuciZaznam.getPrichod().getTime();
                int hodiny = (int)TimeUnit.HOURS.convert(rozdiel, TimeUnit.MILLISECONDS);
                existujuciZaznam.setOdrobeneHodiny(hodiny);
                zaznamDochadzkyManager.upravZaznam(existujuciZaznam);
            }else{
                JOptionPane.showMessageDialog(parentJForm, mapaString.get("zaznamenanyOdchodText"), mapaString.get("zaznamenanyOdchodNadpis"), JOptionPane.ERROR_MESSAGE);
            }
        }
        idTextField.setText("");
    }//GEN-LAST:event_potvrditButtonActionPerformed

    private void zamestnanieToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamestnanieToggleButtonActionPerformed
        mod = "Zamestnanec";
        
    }//GEN-LAST:event_zamestnanieToggleButtonActionPerformed

    private void sportZarToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportZarToggleButtonActionPerformed
        mod = "Cviciaci";
    }//GEN-LAST:event_sportZarToggleButtonActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terminal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField idTextField;
    private javax.swing.JToggleButton odchodToggleButton;
    private javax.swing.JButton potvrditButton;
    private javax.swing.JToggleButton prichodToggleButton;
    private javax.swing.JToggleButton sportZarToggleButton;
    private javax.swing.JToggleButton zamestnanieToggleButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables
}
