package com.paz1c.gui.zamestnanec;

import com.paz1c.manager.DefaultZamestnanecManager;
import com.paz1c.manager.DefaultZaznamDochadzkyManager;
import com.paz1c.manager.ZamestnanecManager;
import com.paz1c.manager.ZaznamDochadzkyManager;
import com.paz1c.other.Zamestnanec;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SpravaZamestnancov extends javax.swing.JFrame {

    private final CardLayout cardlayout;
    private final ZamestnanecManager zamestnanecManager = new DefaultZamestnanecManager();
    private final ZaznamDochadzkyManager zaznamDochadzkyManager = new DefaultZaznamDochadzkyManager();
    
    public SpravaZamestnancov() {
        initComponents();
        cardlayout = (CardLayout)getContentPane().getLayout();
        tableZamestnanci.setParent(this);
        pridatZamestnanca.setParent(this);
        zmazatZamestnanca.setParent(this);
        
        cardlayout.show(getContentPane(),"tableZamestnanci");
        Timer timer = new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               tableZamestnanci.aktualizovatZamestnancov();
            }
        });

        timer.setDelay(3000); // delay for 30 seconds
        timer.start();
    }
    
    public void otvorOkno(String meno){
        cardlayout.show(getContentPane(),meno);   
    }

    public void aktualizovatZamestnancov() {
        tableZamestnanci.aktualizovatZamestnancov();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pridatZamestnanca = new com.paz1c.gui.zamestnanec.PridatZamestnanca();
        tableZamestnanci = new com.paz1c.gui.zamestnanec.TableZamestnanci();
        zmazatZamestnanca = new com.paz1c.gui.zamestnanec.ZmazatZamestnanca();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        pridatZamestnanca.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(pridatZamestnanca, "pridatZamestnanca");

        tableZamestnanci.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(tableZamestnanci, "tableZamestnanci");

        zmazatZamestnanca.setPreferredSize(new java.awt.Dimension(700, 700));
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

    public Zamestnanec getZamestnancaPodlaID(long zadaneID) {
        return zamestnanecManager.getZamestnanec(zadaneID);
    }

    void zmazZamestnanca(Zamestnanec zamestnanec) {
        zaznamDochadzkyManager.zmazVsetkyZaznamy(zamestnanec.getIdOsoba());
        zamestnanecManager.zmazZamestnanca(zamestnanec);
    }

    public void nastavJazyk() {
        pridatZamestnanca.nastavJazyk();
        zmazatZamestnanca.nastavJazyk();
        tableZamestnanci.nastavJazyk();
    }
}
