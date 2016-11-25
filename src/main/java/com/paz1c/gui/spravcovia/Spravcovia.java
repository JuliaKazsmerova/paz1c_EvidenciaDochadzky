package com.paz1c.gui.spravcovia;

import com.paz1c.manager.DefaultSpravcaManager;
import com.paz1c.manager.SpravcaManager;
import java.awt.CardLayout;

public class Spravcovia extends javax.swing.JDialog {

    private CardLayout cardLayout;
    private SpravcaManager spravcaDao = new DefaultSpravcaManager();
    
    public Spravcovia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cardLayout = (CardLayout)getContentPane().getLayout();
        mazanieSpravcu.setParent(this);
        prehladSpravcov.setParent(this);
        pridavanieSpravcu.setParent(this);
        
        cardLayout.show(getContentPane(), "prehladSpravcov");
    }
    
    public void otvorOkno(String okno){
        System.out.println(okno);
        cardLayout.show(getContentPane(), okno);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mazanieSpravcu = new com.paz1c.gui.spravcovia.MazanieSpravcu();
        prehladSpravcov = new com.paz1c.gui.spravcovia.PrehladSpravcov();
        pridavanieSpravcu = new com.paz1c.gui.spravcovia.PridavanieSpravcu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout mazanieSpravcuLayout = new javax.swing.GroupLayout(mazanieSpravcu);
        mazanieSpravcu.setLayout(mazanieSpravcuLayout);
        mazanieSpravcuLayout.setHorizontalGroup(
            mazanieSpravcuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        mazanieSpravcuLayout.setVerticalGroup(
            mazanieSpravcuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        getContentPane().add(mazanieSpravcu, "mazanieSpravcu");
        getContentPane().add(prehladSpravcov, "prehladSpravcov");
        getContentPane().add(pridavanieSpravcu, "pridavanieSpravcu");

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
}
