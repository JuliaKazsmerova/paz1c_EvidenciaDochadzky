package com.paz1c.gui.PrihlasenieRegistracia;

import javax.swing.JPanel;

public class RegistraciaPrihlasenie extends javax.swing.JFrame {

    public RegistraciaPrihlasenie() {
        overenie = new com.paz1c.gui.PrihlasenieRegistracia.Overenie();
        registracia = new com.paz1c.gui.PrihlasenieRegistracia.Registracia();
        prihlasenie = new com.paz1c.gui.PrihlasenieRegistracia.Prihlasenie();
        initPanel(overenie);
        initPanel(registracia);
        initPanel(prihlasenie);
        overenie.setVisible(false);
        registracia.setVisible(false);
        prihlasenie.setVisible(false);
        initComponents();
        prihlasenie.setParent(this);
        registracia.setParent(this);
        overenie.setParent(this);
        vyberModu.setParent(this);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vyberModu = new com.paz1c.gui.PrihlasenieRegistracia.VyberModu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(vyberModu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vyberModu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraciaPrihlasenie().setVisible(true);
            }
        });
    }
    
    void initPanel(JPanel okno){
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(okno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(okno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }
    
    public void registraciaButton() {                                                  
        vyberModu.setVisible(false);
        registracia.setVisible(true);
    } 
    
    public void prihlasenieButton(){
        vyberModu.setVisible(false);
        prihlasenie.setVisible(true);
    }
    
    public void registrujButton(){
        registracia.setVisible(false);
        overenie.setVisible(true);
    }
    
    public void spatZRegistracieButton() {
        registracia.setVisible(false);
        vyberModu.setVisible(true);
    }
    
    public void spatZPrihlaseniaButton() {
        prihlasenie.setVisible(false);
        vyberModu.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.paz1c.gui.PrihlasenieRegistracia.VyberModu vyberModu;
    // End of variables declaration//GEN-END:variables
    private com.paz1c.gui.PrihlasenieRegistracia.Overenie overenie;
    private com.paz1c.gui.PrihlasenieRegistracia.Registracia registracia;
    private com.paz1c.gui.PrihlasenieRegistracia.Prihlasenie prihlasenie;

    
    

}
