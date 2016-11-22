package com.paz1c.gui.zamestnanec;

import com.paz1c.other.Zamestnanec;
import java.sql.Date;
import javax.swing.JOptionPane;

public class PridatZamestnanca extends javax.swing.JPanel {
    
    private SpravaZamestnancov parentJFrame;
    private String meno;
    private String priezvisko;
    private Date datumNastupu;
    private int hodinyZaDen;
    private String funkcia;
   
    

    public PridatZamestnanca() {
        initComponents();
        /*UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,new JFormattedTextField.AbstractFormatter() {
            private String datePattern = "yyyy-MM-dd";
            private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

            @Override
            public Object stringToValue(String text) throws ParseException {
                return dateFormatter.parseObject(text);
            }

            @Override
            public String valueToString(Object value) throws ParseException {
                if (value != null) {
                    Calendar cal = (Calendar) value;
                    return dateFormatter.format(cal.getTime());
                }

                return "";
            }
        } );

        add(datePicker);
        System.out.println(datumNastupuTextField.getPreferredSize());
        System.out.println(datumNastupuTextField.getBounds());
        datePicker.setSize(datumNastupuTextField.getPreferredSize());
        datePicker.setBounds(datumNastupuTextField.getBounds());
        datumNastupuTextField.setVisible(false);*/
    }
    
    public void setParent(SpravaZamestnancov parent){
        parentJFrame = parent;
    }
    
    public boolean upozornit(){
        boolean upozornenie = false;
        if(menoTextField.getText().equals("")){
            upozornenie = true;
            meno = menoTextField.getText();
        }
        if(priezviskoTextField.getText().equals("")){
            upozornenie = true;
            priezvisko = priezviskoTextField.getText();
        }
        if(datumNastupuTextField.getText().equals("")){
            upozornenie = true;
            String datum = datumNastupuTextField.getText();
            
            datumNastupu = java.sql.Date.valueOf(datum);
        }
        if(hodinyZaDenTextField.getText().equals("")){
            upozornenie = true;
            hodinyZaDen = Integer.parseInt(hodinyZaDenTextField.getText()) ;
        }
        if(funkciaTextField.getText().equals("")){
            upozornenie = true;
            funkcia = funkciaTextField.getText();
        }
        
        return upozornenie;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
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
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();

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

        jXDatePicker2.setTimeZone(java.util.TimeZone.getTimeZone("Europe/Bratislava"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatZamestnancaTextLabel)
                        .addGap(0, 193, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatButton))
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
                            .addComponent(datumNastupuTextField)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datumNastupuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if(upozornit()){
            JOptionPane.showMessageDialog(parentJFrame, "Všetky údaje musia byť zadané.", "Upozornenie", JOptionPane.ERROR_MESSAGE);
        }else{
            Zamestnanec zamestnanec = new Zamestnanec();
            zamestnanec.setMeno(meno);
            zamestnanec.setPriezvisko(priezvisko);
            zamestnanec.setDatumNastupu(datumNastupu);
            zamestnanec.setPocetHodinNaDen(hodinyZaDen);
            zamestnanec.setZameranie(funkcia);
            
        }
    }//GEN-LAST:event_pridatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datumNastupuLabel;
    private javax.swing.JTextField datumNastupuTextField;
    private javax.swing.JLabel funkciaLabel;
    private javax.swing.JTextField funkciaTextField;
    private javax.swing.JLabel hodinyZaDenLabel;
    private javax.swing.JTextField hodinyZaDenTextField;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JButton pridatButton;
    private javax.swing.JLabel pridatZamestnancaTextLabel;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JButton spatButton;
    // End of variables declaration//GEN-END:variables
}
