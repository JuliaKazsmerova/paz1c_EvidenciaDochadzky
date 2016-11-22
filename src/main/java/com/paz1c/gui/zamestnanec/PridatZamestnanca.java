package com.paz1c.gui.zamestnanec;

public class PridatZamestnanca extends javax.swing.JPanel {
    
    private SpravaZamestnancov parentJFrame;

    public PridatZamestnanca() {
        initComponents();
    }
    
    public void setParent(SpravaZamestnancov parent){
        parentJFrame = parent;
    }
    
    public boolean overenie(){
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menoLabel = new javax.swing.JLabel();
        priezviskoLabel = new javax.swing.JLabel();
        datumNastupuLabel = new javax.swing.JLabel();
        hodinyZaDenLabel = new javax.swing.JLabel();
        funkciaLabel = new javax.swing.JLabel();
        menoTextField = new javax.swing.JTextField();
        priezviskoTextField = new javax.swing.JTextField();
        datumNastupuTextField = new javax.swing.JTextField();
        hodinyZaDenTextField = new javax.swing.JTextField();
        funkciaTextField = new javax.swing.JTextField();
        pridatButton = new javax.swing.JButton();
        spatButton = new javax.swing.JButton();
        pridatZamestnancaTextLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 226));

        menoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        menoLabel.setText("Meno:");

        priezviskoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        priezviskoLabel.setText("Priezvisko: ");

        datumNastupuLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        datumNastupuLabel.setText("Dátum nástupu:");

        hodinyZaDenLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        hodinyZaDenLabel.setText("Hodiny za deň:");

        funkciaLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        funkciaLabel.setText("Funkcia:");

        pridatButton.setText("Pridať");
        pridatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatButtonActionPerformed(evt);
            }
        });

        spatButton.setText("Späť");

        pridatZamestnancaTextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pridatZamestnancaTextLabel.setText("Pridať zamestnanca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatZamestnancaTextLabel)
                        .addGap(0, 193, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datumNastupuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hodinyZaDenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(funkciaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(funkciaTextField)
                            .addComponent(hodinyZaDenTextField)
                            .addComponent(priezviskoTextField)
                            .addComponent(menoTextField)
                            .addComponent(datumNastupuTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pridatZamestnancaTextLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priezviskoLabel)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datumNastupuLabel)
                    .addComponent(datumNastupuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hodinyZaDenLabel)
                    .addComponent(hodinyZaDenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funkciaLabel)
                    .addComponent(funkciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatButton)
                    .addComponent(spatButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        if(overenie()){
            
        }else{
            
        }
    }//GEN-LAST:event_pridatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datumNastupuLabel;
    private javax.swing.JTextField datumNastupuTextField;
    private javax.swing.JLabel funkciaLabel;
    private javax.swing.JTextField funkciaTextField;
    private javax.swing.JLabel hodinyZaDenLabel;
    private javax.swing.JTextField hodinyZaDenTextField;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JButton pridatButton;
    private javax.swing.JLabel pridatZamestnancaTextLabel;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JButton spatButton;
    // End of variables declaration//GEN-END:variables
}