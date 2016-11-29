package com.paz1c.gui.spravcovia;

public class PrehladSpravcov extends javax.swing.JPanel {
    
    private Spravcovia parentJDialog;
    
    public PrehladSpravcov() {
        initComponents();
    }
    
    void aktualizujSpravcov(){
        // ziskaj model
        SpravcaTableModel model = (SpravcaTableModel) spravcoviaTable.getModel();        
        // aktualizuj ho
        model.aktualizovat();
    }
    
    public void setParent(Spravcovia parent){
        parentJDialog = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        spravcoviaTable = new javax.swing.JTable();
        pridatSpravcuButton = new javax.swing.JButton();
        zmazatSpravcuButton = new javax.swing.JButton();
        zrusitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 250, 226));

        spravcoviaTable.setModel(new com.paz1c.gui.spravcovia.SpravcaTableModel());
        jScrollPane1.setViewportView(spravcoviaTable);

        pridatSpravcuButton.setText("Pridať spravcu");
        pridatSpravcuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatSpravcuButtonActionPerformed(evt);
            }
        });

        zmazatSpravcuButton.setText("Zmazať spravcu");
        zmazatSpravcuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatSpravcuButtonActionPerformed(evt);
            }
        });

        zrusitButton.setText("Zrušiť");
        zrusitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrusitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pridatSpravcuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(zmazatSpravcuButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zrusitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zmazatSpravcuButton)
                    .addComponent(pridatSpravcuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zrusitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pridatSpravcuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatSpravcuButtonActionPerformed
        parentJDialog.otvorOkno("pridavanieSpravcu");
    }//GEN-LAST:event_pridatSpravcuButtonActionPerformed

    private void zmazatSpravcuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatSpravcuButtonActionPerformed
        parentJDialog.otvorOkno("mazanieSpravcu");
    }//GEN-LAST:event_zmazatSpravcuButtonActionPerformed

    private void zrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrusitButtonActionPerformed
        parentJDialog.dispose();
    }//GEN-LAST:event_zrusitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pridatSpravcuButton;
    private javax.swing.JTable spravcoviaTable;
    private javax.swing.JButton zmazatSpravcuButton;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables

    void nastavJazyk() {
        
    }
}
