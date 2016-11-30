package com.paz1c.gui.spravcovia;

import com.paz1c.constants.Nastavenia;
import java.util.HashMap;
import java.util.Map;

public class PrehladSpravcov extends javax.swing.JPanel {
    
    private Spravcovia parentJDialog;
    private Map<String,String> mapaString = new HashMap<>();

    
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
        zmenaJazykaPanel.setParentSpravcovia(parentJDialog);
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("pridat", "Pridať");
                    mapaString.put("zmazat", "Zmazať");
                    mapaString.put("zrusit", "Zrušiť");
                    break;
                case "EN" :
                    mapaString.put("pridat", "Add");
                    mapaString.put("zmazat", "Delete");
                    mapaString.put("zrusit", "Cancel");
                    break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        pridatSpravcuButton.setText(mapaString.get("pridat"));
        zmazatSpravcuButton.setText(mapaString.get("zmazat"));
        zrusitButton.setText(mapaString.get("zrusit"));
        SpravcaTableModel model = (SpravcaTableModel) spravcoviaTable.getModel();        
        model.zmenaJazyka();
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        spravcoviaTable = new javax.swing.JTable();
        pridatSpravcuButton = new javax.swing.JButton();
        zmazatSpravcuButton = new javax.swing.JButton();
        zrusitButton = new javax.swing.JButton();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        setBackground(new java.awt.Color(255, 250, 226));

        spravcoviaTable.setModel(new com.paz1c.gui.spravcovia.SpravcaTableModel());
        jScrollPane1.setViewportView(spravcoviaTable);

        pridatSpravcuButton.setText("Pridať správcu");
        pridatSpravcuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatSpravcuButtonActionPerformed(evt);
            }
        });

        zmazatSpravcuButton.setText("Zmazať správcu");
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatSpravcuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatSpravcuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(zrusitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pridatSpravcuButton)
                        .addComponent(zmazatSpravcuButton))
                    .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zrusitButton)
                .addContainerGap(19, Short.MAX_VALUE))
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
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables

    
}
