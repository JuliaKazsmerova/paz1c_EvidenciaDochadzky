package com.paz1c.gui.spravcovia;

import com.paz1c.manager.DefaultSpravcaManager;
import com.paz1c.manager.SpravcaManager;
import com.paz1c.other.Spravca;
import java.awt.CardLayout;

public class Spravcovia extends javax.swing.JDialog {

    private CardLayout cardLayout;
    private SpravcaManager spravcaManager = new DefaultSpravcaManager();
    
    public Spravcovia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cardLayout = (CardLayout)getContentPane().getLayout();
        mazanieSpravcu.setParent(this);
        prehladSpravcov.setParent(this);
        pridavanieSpravcu.setParent(this);
        
        aktualizovatSpravcov();
        cardLayout.show(getContentPane(), "prehladSpravcov");
        
    }
    
    public void otvorOkno(String okno){
        cardLayout.show(getContentPane(), okno);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prehladSpravcov = new com.paz1c.gui.spravcovia.PrehladSpravcov();
        pridavanieSpravcu = new com.paz1c.gui.spravcovia.PridavanieSpravcu();
        mazanieSpravcu = new com.paz1c.gui.spravcovia.MazanieSpravcu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(prehladSpravcov, "prehladSpravcov");
        getContentPane().add(pridavanieSpravcu, "pridavanieSpravcu");
        getContentPane().add(mazanieSpravcu, "mazanieSpravcu");

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
            java.util.logging.Logger.getLogger(Spravcovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spravcovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spravcovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spravcovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Spravcovia dialog = new Spravcovia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.paz1c.gui.spravcovia.MazanieSpravcu mazanieSpravcu;
    private com.paz1c.gui.spravcovia.PrehladSpravcov prehladSpravcov;
    private com.paz1c.gui.spravcovia.PridavanieSpravcu pridavanieSpravcu;
    // End of variables declaration//GEN-END:variables

    void pridatSpravcu(Spravca spravca) {
        spravcaManager.vlozSpravcu(spravca);
    }
    
    void zmazatSpravcu(Spravca spravca){
        spravcaManager.zmazSpravcu(spravca);
    }
    
    public Spravca getSpravcuPodlaId(Long zadaneID){
        return spravcaManager.getSpravcuId(zadaneID);
    }

    void aktualizovatSpravcov() {
        prehladSpravcov.aktualizujSpravcov();
    }
    
    boolean existsEmail(String email){
        return spravcaManager.existsEmail(email);
    }

    public void nastavJazyk() {
        pridavanieSpravcu.nastavJazyk();
        mazanieSpravcu.nastavJazyk();
        prehladSpravcov.nastavJazyk();
    }
}
