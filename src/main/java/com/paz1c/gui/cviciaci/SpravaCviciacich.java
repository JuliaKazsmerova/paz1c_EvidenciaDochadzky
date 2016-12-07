package com.paz1c.gui.cviciaci;

import com.paz1c.manager.CviciaciManager;
import com.paz1c.manager.DefaultCviciaciManager;
import com.paz1c.manager.DefaultZaznamDochadzkyManager;
import com.paz1c.manager.ZaznamDochadzkyManager;
import com.paz1c.other.Cviciaci;
import com.paz1c.other.Zamestnanec;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SpravaCviciacich extends javax.swing.JFrame {

    private final CardLayout cardlayout;
    private final CviciaciManager cviciaciManager = new DefaultCviciaciManager();
    private final ZaznamDochadzkyManager zaznamDochadzkyManager = new DefaultZaznamDochadzkyManager();
    
    public SpravaCviciacich() {
        initComponents();
        cardlayout = (CardLayout)getContentPane().getLayout();
        tableCviciaci.setParent(this);
        pridatCviciaceho.setParent(this);
        zmazatCviciaceho.setParent(this);
        
        cardlayout.show(getContentPane(),"tableCviciaci");
        Timer timer = new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               tableCviciaci.obnovZamestnancov();
            }
        });

        timer.setDelay(30000); // delay for 3 seconds
        timer.start();
    }
    
    public void otvorOkno(String meno){
        cardlayout.show(getContentPane(),meno);   
    }

    public void aktualizovatCviciacich() {
        tableCviciaci.aktualizovatVsetkychCviciacich();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pridatCviciaceho = new com.paz1c.gui.cviciaci.PridatCviciaceho();
        tableCviciaci = new com.paz1c.gui.cviciaci.TableCviciaci();
        zmazatCviciaceho = new com.paz1c.gui.cviciaci.ZmazatCviciaceho();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(pridatCviciaceho, "pridatCviciaceho");
        getContentPane().add(tableCviciaci, "tableCviciaci");
        getContentPane().add(zmazatCviciaceho, "zmazatCviciaceho");

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
            java.util.logging.Logger.getLogger(SpravaCviciacich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpravaCviciacich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpravaCviciacich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpravaCviciacich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpravaCviciacich().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.paz1c.gui.cviciaci.PridatCviciaceho pridatCviciaceho;
    private com.paz1c.gui.cviciaci.TableCviciaci tableCviciaci;
    private com.paz1c.gui.cviciaci.ZmazatCviciaceho zmazatCviciaceho;
    // End of variables declaration//GEN-END:variables

    void pridatCviciaceho(Cviciaci cviciaci) {
        cviciaciManager.vlozCvicaceho(cviciaci);
    }

    public Cviciaci getCviciacehoPodlaID(Long zadaneID) {
        return cviciaciManager.getCviciaceho(zadaneID);
    }

    void zmazCviciaceho(Cviciaci cviciaci) {
        zaznamDochadzkyManager.zmazVsetkyZaznamy(cviciaci.getIdOsoba());
        cviciaciManager.zmazCviciaceho(cviciaci);
    }

    public void nastavJazyk() {
        pridatCviciaceho.nastavJazyk();
        zmazatCviciaceho.nastavJazyk();
        tableCviciaci.nastavJazyk();
    }
}
