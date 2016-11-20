
package com.paz1c.gui.Terminal;

import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.ZaznamDochadzkyDao;
import com.paz1c.other.ZaznamDochadzky;
import java.sql.Date;
import java.util.concurrent.TimeUnit;


public class Terminal extends javax.swing.JFrame {

    private boolean prichod = true; 
    private ZaznamDochadzkyDao zaznamDochadzkyDao = DaoFactory.INSTANCE.getZaznamDochadzkyDao();
    
    public Terminal() {
        initComponents();
        prichodToggleButton.setSelected(prichod);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        prichodToggleButton = new javax.swing.JToggleButton();
        odchodToggleButton = new javax.swing.JToggleButton();
        idTextField = new javax.swing.JTextField();
        potvrditButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(prichodToggleButton)
                .addGap(31, 31, 31)
                .addComponent(odchodToggleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(potvrditButton)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prichodToggleButton)
                    .addComponent(odchodToggleButton))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potvrditButton))
                .addContainerGap(135, Short.MAX_VALUE))
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
            novyZaznam.setIdOsoba(Long.parseLong(idTextField.getText()));
            novyZaznam.setPrichod(new Date(System.currentTimeMillis()));
            
            zaznamDochadzkyDao.vlozZaznam(novyZaznam);
        }else{
            //zapise sa do databazy odchod
            ZaznamDochadzky existujuciZaznam = zaznamDochadzkyDao.getPoslednyZaznam(Long.parseLong(idTextField.getText()));
            existujuciZaznam.setOdchod(new Date(System.currentTimeMillis()));
            long rozdiel = existujuciZaznam.getOdchod().getTime() - existujuciZaznam.getPrichod().getTime();
            int hodiny = (int)TimeUnit.HOURS.convert(rozdiel, TimeUnit.MILLISECONDS);
            existujuciZaznam.setOdrobeneHodiny(hodiny);
            
            zaznamDochadzkyDao.upravZaznam(existujuciZaznam);
        }
        idTextField.setText("");
    }//GEN-LAST:event_potvrditButtonActionPerformed

    
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
    private javax.swing.JTextField idTextField;
    private javax.swing.JToggleButton odchodToggleButton;
    private javax.swing.JButton potvrditButton;
    private javax.swing.JToggleButton prichodToggleButton;
    // End of variables declaration//GEN-END:variables
}
