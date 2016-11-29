package com.paz1c.gui.zamestnanec;

import com.paz1c.constants.Nastavenia;
import com.paz1c.gui.PrihlasenieRegistracia.RegistraciaPrihlasenie;
import com.paz1c.gui.spravcovia.Spravcovia;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableColumnModel;


public class TableZamestnanci extends javax.swing.JPanel {

    private SpravaZamestnancov parentJForm;
    private Map<String,String> mapaString = new HashMap<>();
   
    
    public TableZamestnanci() {
        initComponents();
        aktualizovatZamestnancov();
        nastavJazyk();
        for (int i = 0; i < zamestnanciTabulka.getColumnModel().getColumnCount(); i++) {
            zamestnanciTabulka.getColumnModel().getColumn(i).setMinWidth(50);
            zamestnanciTabulka.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        
    }

    public void setParent(SpravaZamestnancov parentJForm){
        this.parentJForm = parentJForm;
        zmenaJazykaPanel.setParentSpravaZamestnancov(parentJForm);
    }
    
    public void aktualizovatZamestnancov() {
        // ziskaj model
        ZamestnanecTableModel model = (ZamestnanecTableModel) zamestnanciTabulka.getModel();        
        // aktualizuj ho
        model.aktualizovat();
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("vsetci", "Všetci");
                    mapaString.put("aktivny", "Aktívny");
                    mapaString.put("neaktivny", "Neaktívny");
                    mapaString.put("pridatZamestnanca", "Pridať Zamestnanca");
                    mapaString.put("zmazatZamestnanca", "Zmazať Zamestnanca");
                    mapaString.put("odhlasitSa", "Odhlásiť sa");
                    mapaString.put("spravcovia", "Správcovia");
                    mapaString.put("obnov", "Načítaj údaje");
                    mapaString.put("prihlasenaFirma", "Prihlásená firma : ");
                    mapaString.put("sidloFirmy", ". Sídlo firmy: ");
                    mapaString.put("prihlasenySpravca", "Prihlásený správca: ");
                    break;
                case "EN" :
                    mapaString.put("vsetci", "");
                    mapaString.put("aktivny", "");
                    mapaString.put("neaktivny", "");
                    mapaString.put("pridatZamestnanca", "");
                    mapaString.put("zmazatZamestnanca", "");
                    mapaString.put("odhlasitSa", "");
                    mapaString.put("spravcovia", "");
                    mapaString.put("obnov", "");
                    mapaString.put("prihlasenaFirma", "");
                    mapaString.put("sidloFirmy", "");
                    mapaString.put("prihlasenySpravca", "");
                    break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        vsetciFilter.setText(mapaString.get("vsetci"));
        aktivnyFilter.setText(mapaString.get("aktivny"));
        neaktivnyFilter.setText(mapaString.get("neaktivny"));
        pridatZamestnancaButton.setText(mapaString.get("pridatZamestnanca"));
        zmazatZamestnancaButton.setText(mapaString.get("zmazatZamestnanca"));
        odhlasitSaButton.setText(mapaString.get("odhlasitSa"));
        spravcoviaButton.setText(mapaString.get("spravcovia"));
        obnovButton.setText(mapaString.get("obnov"));
        firmaInfoLabel.setText(mapaString.get("prihlasenaFirma") + Nastavenia.nazovFirmy + mapaString.get("sidloFirmy") + Nastavenia.sidloFirmy + ".");
        spravcaInfoLabel.setText(mapaString.get("prihlasenySpravca")+ Nastavenia.menoSpravcu + " " + Nastavenia.priezviskoSpravcu + "." );
        
        ZamestnanecTableModel model = (ZamestnanecTableModel) zamestnanciTabulka.getModel();        
        model.zmenaJazyka();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spravcoviaButton = new javax.swing.JButton();
        zmazatZamestnancaButton = new javax.swing.JButton();
        pridatZamestnancaButton = new javax.swing.JButton();
        vsetciFilter = new javax.swing.JToggleButton();
        aktivnyFilter = new javax.swing.JToggleButton();
        neaktivnyFilter = new javax.swing.JToggleButton();
        spravcaInfoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        zamestnanciTabulka = new javax.swing.JTable();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        firmaInfoLabel = new javax.swing.JLabel();
        odhlasitSaButton = new javax.swing.JButton();
        obnovButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 250, 226));

        spravcoviaButton.setText("Správcovia");
        spravcoviaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spravcoviaButtonActionPerformed(evt);
            }
        });

        zmazatZamestnancaButton.setText("Zmazať zamestnanca");
        zmazatZamestnancaButton.setMaximumSize(new java.awt.Dimension(170, 25));
        zmazatZamestnancaButton.setMinimumSize(new java.awt.Dimension(170, 25));
        zmazatZamestnancaButton.setPreferredSize(new java.awt.Dimension(170, 25));
        zmazatZamestnancaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatZamestnancaButtonActionPerformed(evt);
            }
        });

        pridatZamestnancaButton.setText("Pridať zamestnanca");
        pridatZamestnancaButton.setMaximumSize(new java.awt.Dimension(170, 25));
        pridatZamestnancaButton.setMinimumSize(new java.awt.Dimension(170, 25));
        pridatZamestnancaButton.setPreferredSize(new java.awt.Dimension(170, 25));
        pridatZamestnancaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatZamestnancaButtonActionPerformed(evt);
            }
        });

        vsetciFilter.setText("Všetci");
        vsetciFilter.setMaximumSize(new java.awt.Dimension(170, 25));
        vsetciFilter.setMinimumSize(new java.awt.Dimension(170, 25));
        vsetciFilter.setPreferredSize(new java.awt.Dimension(170, 25));

        aktivnyFilter.setText("Aktívny");
        aktivnyFilter.setMaximumSize(new java.awt.Dimension(170, 25));
        aktivnyFilter.setMinimumSize(new java.awt.Dimension(170, 25));
        aktivnyFilter.setPreferredSize(new java.awt.Dimension(170, 25));

        neaktivnyFilter.setText("Neaktívny");
        neaktivnyFilter.setMaximumSize(new java.awt.Dimension(170, 25));
        neaktivnyFilter.setMinimumSize(new java.awt.Dimension(170, 25));
        neaktivnyFilter.setPreferredSize(new java.awt.Dimension(170, 25));

        spravcaInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        zamestnanciTabulka.setModel(new ZamestnanecTableModel());
        zamestnanciTabulka.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(zamestnanciTabulka);

        firmaInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        odhlasitSaButton.setText("Odhlásiť sa");
        odhlasitSaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odhlasitSaButtonActionPerformed(evt);
            }
        });

        obnovButton.setText("nacitaj udaje");
        obnovButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obnovButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zmazatZamestnancaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pridatZamestnancaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(neaktivnyFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aktivnyFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vsetciFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odhlasitSaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firmaInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spravcaInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obnovButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spravcoviaButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(firmaInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spravcoviaButton)
                    .addComponent(spravcaInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obnovButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vsetciFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neaktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatZamestnancaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatZamestnancaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odhlasitSaButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pridatZamestnancaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatZamestnancaButtonActionPerformed
         parentJForm.otvorOkno("pridatZamestnanca");
    }//GEN-LAST:event_pridatZamestnancaButtonActionPerformed

    private void zmazatZamestnancaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatZamestnancaButtonActionPerformed
        parentJForm.otvorOkno("zmazatZamestnanca");
    }//GEN-LAST:event_zmazatZamestnancaButtonActionPerformed

    private void spravcoviaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spravcoviaButtonActionPerformed
        Spravcovia spravcoviaDialog = new Spravcovia(parentJForm, true);
        spravcoviaDialog.setVisible(true);
    }//GEN-LAST:event_spravcoviaButtonActionPerformed

    private void odhlasitSaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odhlasitSaButtonActionPerformed
        parentJForm.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraciaPrihlasenie().setVisible(true);
            }
        });
    }//GEN-LAST:event_odhlasitSaButtonActionPerformed

    private void obnovButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obnovButtonActionPerformed
        aktualizovatZamestnancov();
    }//GEN-LAST:event_obnovButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aktivnyFilter;
    private javax.swing.JLabel firmaInfoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton neaktivnyFilter;
    private javax.swing.JButton obnovButton;
    private javax.swing.JButton odhlasitSaButton;
    private javax.swing.JButton pridatZamestnancaButton;
    private javax.swing.JLabel spravcaInfoLabel;
    private javax.swing.JButton spravcoviaButton;
    private javax.swing.JToggleButton vsetciFilter;
    private javax.swing.JTable zamestnanciTabulka;
    private javax.swing.JButton zmazatZamestnancaButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables

}
