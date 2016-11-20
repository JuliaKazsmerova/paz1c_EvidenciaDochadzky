package com.paz1c.gui.zamestnanec;


public class ZamestnanciTable extends javax.swing.JPanel {

    private SpravaZamestnancov parentJForm;
    
    public ZamestnanciTable() {
        initComponents();
        aktualizovatZoznamUloh();
    }

    public void setParent(SpravaZamestnancov parentJForm){
        this.parentJForm = parentJForm;
    }
    
    private void aktualizovatZoznamUloh() {
        // ziskaj model
        ZamestnanecTableModel model = (ZamestnanecTableModel) zamestnanciTable.getModel();        
        // aktualizuj ho
        model.aktualizovat();
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
        infoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        zamestnanciTable = new javax.swing.JTable();

        spravcoviaButton.setText("Správcovia");

        zmazatZamestnancaButton.setText("Zmazať zamestnanca");
        zmazatZamestnancaButton.setMaximumSize(new java.awt.Dimension(170, 25));
        zmazatZamestnancaButton.setMinimumSize(new java.awt.Dimension(170, 25));
        zmazatZamestnancaButton.setPreferredSize(new java.awt.Dimension(170, 25));

        pridatZamestnancaButton.setText("Pridať zamestnanca");
        pridatZamestnancaButton.setMaximumSize(new java.awt.Dimension(170, 25));
        pridatZamestnancaButton.setMinimumSize(new java.awt.Dimension(170, 25));
        pridatZamestnancaButton.setPreferredSize(new java.awt.Dimension(170, 25));

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

        infoLabel.setText("info o prihlasenom spravcovi");

        zamestnanciTable.setModel(new ZamestnanecTableModel());
        jScrollPane1.setViewportView(zamestnanciTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spravcoviaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zmazatZamestnancaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pridatZamestnancaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vsetciFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neaktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vsetciFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neaktivnyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(pridatZamestnancaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zmazatZamestnancaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spravcoviaButton)
                    .addComponent(infoLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aktivnyFilter;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton neaktivnyFilter;
    private javax.swing.JButton pridatZamestnancaButton;
    private javax.swing.JButton spravcoviaButton;
    private javax.swing.JToggleButton vsetciFilter;
    private javax.swing.JTable zamestnanciTable;
    private javax.swing.JButton zmazatZamestnancaButton;
    // End of variables declaration//GEN-END:variables
}
