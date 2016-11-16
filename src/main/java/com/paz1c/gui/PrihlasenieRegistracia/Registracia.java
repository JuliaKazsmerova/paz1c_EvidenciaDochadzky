package com.paz1c.gui.PrihlasenieRegistracia;

public class Registracia extends javax.swing.JPanel {

    private RegistraciaPrihlasenie parentJFrame; 
    
    public Registracia() {
        initComponents();
    }
    
    public void setParent(RegistraciaPrihlasenie parent){
        parentJFrame = parent;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registraciaTextLabel = new javax.swing.JLabel();
        eMailTextLabel = new javax.swing.JLabel();
        nazovFirmyLabel = new javax.swing.JLabel();
        menoLabel = new javax.swing.JLabel();
        priezviskoLabel = new javax.swing.JLabel();
        eMailLabel = new javax.swing.JLabel();
        hesloLabel = new javax.swing.JLabel();
        zopakovatHesloLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        priezviskoTextField = new javax.swing.JTextField();
        menoTextField = new javax.swing.JTextField();
        nazovFirmyTextField = new javax.swing.JTextField();
        registraciaButton = new javax.swing.JButton();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        spatButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        againPasswordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 250, 226));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));

        registraciaTextLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        registraciaTextLabel.setText("Pre registráciu zapíšte údaje. ");

        eMailTextLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        eMailTextLabel.setText("Na e-mail Vám príde registračný kód.");

        nazovFirmyLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        nazovFirmyLabel.setText("Názov firmy:");

        menoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        menoLabel.setText("Meno:");

        priezviskoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        priezviskoLabel.setText("Priezvisko: ");

        eMailLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        eMailLabel.setText("E-mail: ");

        hesloLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        hesloLabel.setText("Heslo: ");

        zopakovatHesloLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        zopakovatHesloLabel.setText("Zopakovať heslo: ");

        registraciaButton.setText("Registruj");
        registraciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraciaButtonActionPerformed(evt);
            }
        });

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
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
                        .addComponent(registraciaTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priezviskoLabel)
                        .addGap(64, 64, 64)
                        .addComponent(priezviskoTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menoLabel)
                        .addGap(107, 107, 107)
                        .addComponent(menoTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nazovFirmyLabel)
                        .addGap(56, 56, 56)
                        .addComponent(nazovFirmyTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eMailLabel)
                            .addComponent(hesloLabel))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(zopakovatHesloLabel)
                        .addGap(18, 18, 18)
                        .addComponent(againPasswordField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eMailTextLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registraciaButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(registraciaTextLabel))
                    .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eMailTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazovFirmyLabel)
                    .addComponent(nazovFirmyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priezviskoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hesloLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zopakovatHesloLabel)
                    .addComponent(againPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatButton)
                    .addComponent(registraciaButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registraciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraciaButtonActionPerformed
        parentJFrame.otvorOkno("overenie");
    }//GEN-LAST:event_registraciaButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJFrame.otvorOkno("vyberModu");
    }//GEN-LAST:event_spatButtonActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        
    }//GEN-LAST:event_passwordFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField againPasswordField;
    private javax.swing.JLabel eMailLabel;
    private javax.swing.JLabel eMailTextLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel hesloLabel;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JLabel nazovFirmyLabel;
    private javax.swing.JTextField nazovFirmyTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JButton registraciaButton;
    private javax.swing.JLabel registraciaTextLabel;
    private javax.swing.JButton spatButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    private javax.swing.JLabel zopakovatHesloLabel;
    // End of variables declaration//GEN-END:variables
}
