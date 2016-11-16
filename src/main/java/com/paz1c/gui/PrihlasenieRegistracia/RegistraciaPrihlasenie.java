package com.paz1c.gui.PrihlasenieRegistracia;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JPanel;

public class RegistraciaPrihlasenie extends javax.swing.JFrame {
    
    CardLayout cardlayout;

    public RegistraciaPrihlasenie()  {
       
        initComponents();
        cardlayout =  (CardLayout)getContentPane().getLayout();
        overenie.setParent(this);
        prihlasenie.setParent(this);
        registracia.setParent(this);
        vyberModu.setParent(this);
        
        cardlayout.show(getContentPane(),"vyberModu");
    }
    
    
    public void otvorOkno(String meno){
        cardlayout.show(getContentPane(),meno);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vyberModu = new com.paz1c.gui.PrihlasenieRegistracia.VyberModu();
        prihlasenie = new com.paz1c.gui.PrihlasenieRegistracia.Prihlasenie();
        registracia = new com.paz1c.gui.PrihlasenieRegistracia.Registracia();
        overenie = new com.paz1c.gui.PrihlasenieRegistracia.Overenie();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(vyberModu, "vyberModu");
        getContentPane().add(prihlasenie, "prihlasenie");
        getContentPane().add(registracia, "registracia");
        getContentPane().add(overenie, "overenie");

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
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.paz1c.gui.PrihlasenieRegistracia.Overenie overenie;
    private com.paz1c.gui.PrihlasenieRegistracia.Prihlasenie prihlasenie;
    private com.paz1c.gui.PrihlasenieRegistracia.Registracia registracia;
    private com.paz1c.gui.PrihlasenieRegistracia.VyberModu vyberModu;
    // End of variables declaration//GEN-END:variables


    
    

}
