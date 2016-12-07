package com.paz1c.gui.cviciaci;

import com.paz1c.constants.Nastavenia;
import com.paz1c.gui.PrihlasenieRegistracia.RegistraciaPrihlasenie;
import com.paz1c.gui.spravcovia.Spravcovia;
import java.util.HashMap;
import java.util.Map;


public class TableCviciaci extends javax.swing.JPanel {

    private SpravaCviciacich parentJForm;
    private Map<String,String> mapaString = new HashMap<>();
   
    
    public TableCviciaci() {
        initComponents();
        aktualizovatVsetkychCviciacich();
        nastavJazyk();
        vsetciFilter.setSelected(true);
        for (int i = 0; i < zamestnanciTabulka.getColumnModel().getColumnCount(); i++) {
            zamestnanciTabulka.getColumnModel().getColumn(i).setMinWidth(50);
            zamestnanciTabulka.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        
    }

    public void setParent(SpravaCviciacich parentJForm){
        this.parentJForm = parentJForm;
        zmenaJazykaPanel.setParentSpravaCviciacich(parentJForm);
    }
    
    public void aktualizovatVsetkychCviciacich() {
        // ziskaj model
        CviciaciTableModel model = (CviciaciTableModel) zamestnanciTabulka.getModel();        
        // aktualizuj ho
        model.aktualizovatVsetkych();
    }
    
    public void aktualizovatAktivnychCviciacich() {
        // ziskaj model
        CviciaciTableModel model = (CviciaciTableModel) zamestnanciTabulka.getModel();        
        // aktualizuj ho
        model.aktualizovatAktivnych();
    }
    
    public void aktualizovatNeaktivnychCviciacich() {
        // ziskaj model
        CviciaciTableModel model = (CviciaciTableModel) zamestnanciTabulka.getModel();        
        // aktualizuj ho
        model.aktualizovatNeaktivnych();
    }
    
    public void obnovZamestnancov(){
        if(vsetciFilter.isSelected()){
            aktualizovatVsetkychCviciacich();
        }
        if(aktivnyFilter.isSelected()){
            aktualizovatAktivnychCviciacich();
        }
        if(neaktivnyFilter.isSelected()){
            aktualizovatNeaktivnychCviciacich();
        }
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("vsetci", "Všetci");
                    mapaString.put("aktivny", "Aktívny");
                    mapaString.put("neaktivny", "Neaktívny");
                    mapaString.put("pridatCviciaceho", "Pridať cvičiaceho");
                    mapaString.put("zmazatCviciaceho", "Zmazať cvičiaceho");
                    mapaString.put("odhlasitSa", "Odhlásiť sa");
                    mapaString.put("spravcovia", "Správcovia");
                    mapaString.put("prihlasenaFirma", "Prihlásená firma : ");
                    mapaString.put("sidloFirmy", ". Sídlo firmy: ");
                    mapaString.put("prihlasenySpravca", "Prihlásený správca: ");
                    break;
                case "EN" :
                    mapaString.put("vsetci", "All");
                    mapaString.put("aktivny", "Active");
                    mapaString.put("neaktivny", "Not active");
                    mapaString.put("pridatCviciaceho", "Add member");
                    mapaString.put("zmazatCviciaceho", "Delete member");
                    mapaString.put("odhlasitSa", "Sign out");
                    mapaString.put("spravcovia", "Administrators");
                    mapaString.put("prihlasenaFirma", "Logged sport facility: ");
                    mapaString.put("sidloFirmy", " facility address: ");
                    mapaString.put("prihlasenySpravca", "Logged administrator: ");
                    break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        vsetciFilter.setText(mapaString.get("vsetci"));
        aktivnyFilter.setText(mapaString.get("aktivny"));
        neaktivnyFilter.setText(mapaString.get("neaktivny"));
        pridatCviciacehoButton.setText(mapaString.get("pridatCviciaceho"));
        zmazatCviciacehoButton.setText(mapaString.get("zmazatCviciaceho"));
        odhlasitSaButton.setText(mapaString.get("odhlasitSa"));
        spravcoviaButton.setText(mapaString.get("spravcovia"));
        firmaInfoLabel.setText(mapaString.get("prihlasenaFirma") + Nastavenia.nazovFirmy + mapaString.get("sidloFirmy") + Nastavenia.sidloFirmy + ".");
        spravcaInfoLabel.setText(mapaString.get("prihlasenySpravca")+ Nastavenia.menoSpravcu + " " + Nastavenia.priezviskoSpravcu + "." );
        
        CviciaciTableModel model = (CviciaciTableModel) zamestnanciTabulka.getModel();        
        model.zmenaJazyka();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterGroup = new javax.swing.ButtonGroup();
        spravcoviaButton = new javax.swing.JButton();
        zmazatCviciacehoButton = new javax.swing.JButton();
        pridatCviciacehoButton = new javax.swing.JButton();
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

        zmazatCviciacehoButton.setText("Zmazať cviciaceho");
        zmazatCviciacehoButton.setMaximumSize(new java.awt.Dimension(170, 25));
        zmazatCviciacehoButton.setMinimumSize(new java.awt.Dimension(170, 25));
        zmazatCviciacehoButton.setPreferredSize(new java.awt.Dimension(170, 25));
        zmazatCviciacehoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazatCviciacehoButtonActionPerformed(evt);
            }
        });

        pridatCviciacehoButton.setText("Pridať cviciaceho");
        pridatCviciacehoButton.setMaximumSize(new java.awt.Dimension(170, 25));
        pridatCviciacehoButton.setMinimumSize(new java.awt.Dimension(170, 25));
        pridatCviciacehoButton.setPreferredSize(new java.awt.Dimension(170, 25));
        pridatCviciacehoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatCviciacehoButtonActionPerformed(evt);
            }
        });

        filterGroup.add(vsetciFilter);
        vsetciFilter.setText("Všetci");
        vsetciFilter.setMaximumSize(new java.awt.Dimension(170, 25));
        vsetciFilter.setMinimumSize(new java.awt.Dimension(170, 25));
        vsetciFilter.setPreferredSize(new java.awt.Dimension(170, 25));
        vsetciFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsetciFilterActionPerformed(evt);
            }
        });

        filterGroup.add(aktivnyFilter);
        aktivnyFilter.setText("Aktívny");
        aktivnyFilter.setMaximumSize(new java.awt.Dimension(170, 25));
        aktivnyFilter.setMinimumSize(new java.awt.Dimension(170, 25));
        aktivnyFilter.setPreferredSize(new java.awt.Dimension(170, 25));
        aktivnyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktivnyFilterActionPerformed(evt);
            }
        });

        filterGroup.add(neaktivnyFilter);
        neaktivnyFilter.setText("Neaktívny");
        neaktivnyFilter.setMaximumSize(new java.awt.Dimension(170, 25));
        neaktivnyFilter.setMinimumSize(new java.awt.Dimension(170, 25));
        neaktivnyFilter.setPreferredSize(new java.awt.Dimension(170, 25));
        neaktivnyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neaktivnyFilterActionPerformed(evt);
            }
        });

        spravcaInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        zamestnanciTabulka.setModel(new com.paz1c.gui.cviciaci.CviciaciTableModel());
        zamestnanciTabulka.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(zamestnanciTabulka);

        firmaInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        odhlasitSaButton.setText("Odhlásiť sa");
        odhlasitSaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odhlasitSaButtonActionPerformed(evt);
            }
        });

        obnovButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/paz1c/images/Refresh-icon.png"))); // NOI18N
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
                            .addComponent(zmazatCviciacehoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pridatCviciacehoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(spravcaInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addGap(67, 67, 67)
                                .addComponent(obnovButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spravcoviaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spravcaInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(obnovButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vsetciFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neaktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatCviciacehoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatCviciacehoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odhlasitSaButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pridatCviciacehoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatCviciacehoButtonActionPerformed
         parentJForm.otvorOkno("pridatCviciaceho");
    }//GEN-LAST:event_pridatCviciacehoButtonActionPerformed

    private void zmazatCviciacehoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazatCviciacehoButtonActionPerformed
        parentJForm.otvorOkno("zmazatCviciaceho");
    }//GEN-LAST:event_zmazatCviciacehoButtonActionPerformed

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
        obnovZamestnancov();
    }//GEN-LAST:event_obnovButtonActionPerformed

    private void vsetciFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsetciFilterActionPerformed
        aktualizovatVsetkychCviciacich();
    }//GEN-LAST:event_vsetciFilterActionPerformed

    private void aktivnyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktivnyFilterActionPerformed
        aktualizovatAktivnychCviciacich();
    }//GEN-LAST:event_aktivnyFilterActionPerformed

    private void neaktivnyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neaktivnyFilterActionPerformed
        aktualizovatNeaktivnychCviciacich();
    }//GEN-LAST:event_neaktivnyFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aktivnyFilter;
    private javax.swing.ButtonGroup filterGroup;
    private javax.swing.JLabel firmaInfoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton neaktivnyFilter;
    private javax.swing.JButton obnovButton;
    private javax.swing.JButton odhlasitSaButton;
    private javax.swing.JButton pridatCviciacehoButton;
    private javax.swing.JLabel spravcaInfoLabel;
    private javax.swing.JButton spravcoviaButton;
    private javax.swing.JToggleButton vsetciFilter;
    private javax.swing.JTable zamestnanciTabulka;
    private javax.swing.JButton zmazatCviciacehoButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    // End of variables declaration//GEN-END:variables

}
