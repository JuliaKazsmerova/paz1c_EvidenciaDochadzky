package com.paz1c.gui.PrihlasenieRegistracia;

import com.paz1c.constants.Nastavenia;
import com.paz1c.gui.spravcovia.Spravcovia;
import javax.swing.JPanel;


public class zmenaJazykaPanel extends javax.swing.JPanel {

    private RegistraciaPrihlasenie parentRegistraciaPrihlasenie;
    private Spravcovia parentSpravcovia;
   
    public zmenaJazykaPanel() {
        initComponents();
    }

    public void setParentRegistraciaPrihlasenie(RegistraciaPrihlasenie parent){
        this.parentRegistraciaPrihlasenie = parent;
    }
    
    public void setParentSpravcovia(Spravcovia parent){
        this.parentSpravcovia = parent;
    }
    
    void nastavJazyk(){
        if(parentRegistraciaPrihlasenie!=null)
            parentRegistraciaPrihlasenie.nastavJazyk();
        if(parentSpravcovia!=null)
            parentSpravcovia.nastavJazyk();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        anglictina = new javax.swing.JToggleButton();
        slovencina = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 250, 226));
        setMaximumSize(new java.awt.Dimension(60, 30));
        setPreferredSize(new java.awt.Dimension(90, 40));

        buttonGroup.add(anglictina);
        anglictina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/paz1c/images/United-States-Flag-icon.png"))); // NOI18N
        anglictina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anglictinaActionPerformed(evt);
            }
        });

        buttonGroup.add(slovencina);
        slovencina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/paz1c/images/Slovakia-Flag-icon.png"))); // NOI18N
        slovencina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slovencinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(slovencina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anglictina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anglictina, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)
            .addComponent(slovencina, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void anglictinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anglictinaActionPerformed
        if(anglictina.isSelected())
            Nastavenia.jazyk = "EN";
        nastavJazyk();
        
    }//GEN-LAST:event_anglictinaActionPerformed

    private void slovencinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slovencinaActionPerformed
        if(slovencina.isSelected())
            Nastavenia.jazyk = "SK";
        nastavJazyk();
    }//GEN-LAST:event_slovencinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton anglictina;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JToggleButton slovencina;
    // End of variables declaration//GEN-END:variables
}
