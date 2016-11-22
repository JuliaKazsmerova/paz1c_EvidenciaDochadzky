package com.paz1c.gui.zamestnanec;

public class SpravaZamestnancov extends javax.swing.JFrame {

    
    public SpravaZamestnancov() {
        initComponents();
        tableZamestnanci.setParent(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pridatZamestnanca = new com.paz1c.gui.zamestnanec.PridatZamestnanca();
        tableZamestnanci = new com.paz1c.gui.zamestnanec.TableZamestnanci();
        zmazatZamestnanca = new com.paz1c.gui.zamestnanec.ZmazatZamestnanca();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(pridatZamestnanca, "card4");
        getContentPane().add(tableZamestnanci, "card4");

        javax.swing.GroupLayout zmazatZamestnancaLayout = new javax.swing.GroupLayout(zmazatZamestnanca);
        zmazatZamestnanca.setLayout(zmazatZamestnancaLayout);
        zmazatZamestnancaLayout.setHorizontalGroup(
            zmazatZamestnancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        zmazatZamestnancaLayout.setVerticalGroup(
            zmazatZamestnancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(zmazatZamestnanca, "card3");

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
}
