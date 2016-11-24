package com.paz1c.gui.zamestnanec;

import com.paz1c.manager.DefaultZamestnanecManager;
import com.paz1c.manager.ZamestnanecManager;
import com.paz1c.other.Zamestnanec;
import java.awt.CardLayout;

public class SpravaZamestnancov extends javax.swing.JFrame {

    private final CardLayout cardlayout;
    private ZamestnanecManager zamestnanecManager = new DefaultZamestnanecManager();
    
    public SpravaZamestnancov() {
        initComponents();
        cardlayout = (CardLayout)getContentPane().getLayout();
        tableZamestnanci.setParent(this);
        pridatZamestnanca.setParent(this);
        zmazatZamestnanca.setParent(this);
        
        cardlayout.show(getContentPane(),"tableZamestnanci");
    }
    
    public void otvorOkno(String meno){
        cardlayout.show(getContentPane(),meno);   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pridatZamestnanca = new com.paz1c.gui.zamestnanec.PridatZamestnanca();
        tableZamestnanci = new com.paz1c.gui.zamestnanec.TableZamestnanci();
        zmazatZamestnanca = new com.paz1c.gui.zamestnanec.ZmazatZamestnanca();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(pridatZamestnanca, "pridatZamestnanca");
        getContentPane().add(tableZamestnanci, "tableZamestnanci");
        getContentPane().add(zmazatZamestnanca, "zmazatZamestnanca");

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
            java.util.logging.Logger.getLogger(SpravaZamestnancov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpravaZamestnancov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpravaZamestnancov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpravaZamestnancov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpravaZamestnancov().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.paz1c.gui.zamestnanec.PridatZamestnanca pridatZamestnanca;
    private com.paz1c.gui.zamestnanec.TableZamestnanci tableZamestnanci;
    private com.paz1c.gui.zamestnanec.ZmazatZamestnanca zmazatZamestnanca;
    // End of variables declaration//GEN-END:variables

    void pridatZamestnanca(Zamestnanec zamestnanec) {
        zamestnanecManager.vlozZamestnanca(zamestnanec);
    }

    public Zamestnanec najdiZamestnancaPodlaID(long zadaneID) {
        return zamestnanecManager.getZamestnanec(zadaneID);
    }
}
