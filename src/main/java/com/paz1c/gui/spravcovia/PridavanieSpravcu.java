package com.paz1c.gui.spravcovia;

import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;
import com.paz1c.constants.Nastavenia;
import com.paz1c.other.Spravca;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class PridavanieSpravcu extends javax.swing.JPanel {

    private Spravcovia parentJDialog;
    private Pattern patternEmail;
    private Zxcvbn zxcvbn = new Zxcvbn();
    
    
    private boolean meno;
    private boolean priezvisko;
    private boolean email;
    private boolean heslo;
    private boolean zopakovaneHeslo;

    
    private String ok = "\u2713";
    private Map<String,String> mapaString = new HashMap<>();
    
    public PridavanieSpravcu() {
        patternCompile();
        initComponents();
        nastavJazyk();
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("meno", "Meno:");
                    mapaString.put("menoPrazdne", "Zadajte meno.");
                    
                    mapaString.put("priezvisko", "Priezvisko:");
                    mapaString.put("priezviskoPrazdne", "Zadajte priezvisko.");
                   
                    mapaString.put("email", "E-mail:");
                    mapaString.put("emailExistuje", "Zadaný e-mail už je registrovaný.");
                    mapaString.put("emailNeexistuje", "Zadaný e-mail neexistuje.");
                    mapaString.put("emailPrazdny", "Zadajte e-mail.");
                    
                    mapaString.put("heslo", "Heslo:");
                    mapaString.put("zopakovatHeslo", "Zopakovať heslo:");
                    mapaString.put("zopakovatHesloPrazdne", "Zadajte znova heslo.");
                    mapaString.put("zopakovatHesloNezhodne", "Zadané heslá sa nezhodujú.");
                    
                    mapaString.put("spat", "Späť");
                    mapaString.put("pridat", "Pridať");  
                    mapaString.put("pridanySpravcaText", "Spravca bol pridaný.");
                    mapaString.put("pridanySpravcaNadpis", "OK");
                    
                    mapaString.put("menoUpozornenie", "Skontrolujte meno.");
                    mapaString.put("priezviskoUpozornenie", "Skontrolujte priezvisko.");
                    mapaString.put("emailUpozornenie", "Skontrolujte e-mail.");
                    mapaString.put("hesloUpozornenie", "Zadané heslo nie je dostatočne silné.");
                    mapaString.put("zopakovatHesloUpozornenie", "Heslá sa nezhodujú.");
                     break;
                case "EN" :
                    mapaString.put("meno", "");
                    mapaString.put("menoPrazdne", "");
                    
                    mapaString.put("priezvisko", "");
                    mapaString.put("priezviskoPrazdne", "");
                   
                    mapaString.put("email", "");
                    mapaString.put("emailExistuje", "");
                    mapaString.put("emailNeexistuje", "");
                    mapaString.put("emailPrazdny", "");
                    
                    mapaString.put("heslo", "");
                    mapaString.put("zopakovatHeslo", "");
                    mapaString.put("zopakovatHesloPrazdne", "");
                    mapaString.put("zopakovatHesloNezhodne", "");
                    
                    mapaString.put("spat", "");
                    mapaString.put("pridat", "");
                    
                    mapaString.put("pridanySpravcaText", "");
                    mapaString.put("pridanySpravcaNadpis", "");
                   
                    mapaString.put("menoUpozornenie", "");
                    mapaString.put("priezviskoUpozornenie", "");
                    mapaString.put("emailUpozornenie", "");
                    mapaString.put("hesloUpozornenie", "");
                    mapaString.put("zopakovatHesloUpozornenie", "");
                    
                 break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void setParent(Spravcovia parent){
        parentJDialog = parent;
        zmenaJazykaPanel.setParentSpravcovia(parentJDialog);
    }

    void patternCompile(){
        patternEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    
    public boolean validateEmail(String email) {
	return patternEmail.matcher(email).matches();
    }
    
    int silaHesla(String heslo){
        Strength strength = zxcvbn.measure(heslo);
        return strength.getScore();
    }
    
    private boolean moznaRegistracia(){
        String upozornenie = "";
        if(!meno)
            upozornenie += mapaString.get("menoUpozornenie")+" \n";
        if(!priezvisko)
            upozornenie += mapaString.get("priezviskoUpozornenie")+" \n";
        if(!email)
            upozornenie += mapaString.get("emailUpozornenie")+" \n";
        if(!heslo)
            upozornenie += mapaString.get("hesloUpozornenie")+" \n";
        if(!zopakovaneHeslo)
            upozornenie += mapaString.get("zopakovatHesloUpozornenie");
        
        
        
        
        if(!upozornenie.equals(""))
            JOptionPane.showMessageDialog(parentJDialog,upozornenie,mapaString.get("nadpisUpozornenie"),JOptionPane.ERROR_MESSAGE);
        return upozornenie.equals("");
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        menoLabel.setText(mapaString.get("meno"));
        priezviskoLabel.setText(mapaString.get("priezvisko"));
        emailLabel.setText(mapaString.get("email"));
        hesloLabel.setText(mapaString.get("heslo"));
        zopakovathesloLabel.setText(mapaString.get("zopakovatHeslo"));
        pridatButton.setText(mapaString.get("pridat"));
        spatButton.setText(mapaString.get("spat"));
        
        
        
        menoTextFieldKeyReleased(null);
        priezviskoTextFieldKeyReleased(null);
        emailTextFieldKeyReleased(null);
        hesloPasswordFieldKeyReleased(null);
        zopakovatHesloPasswordFieldKeyReleased(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menoLabel = new javax.swing.JLabel();
        priezviskoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        hesloLabel = new javax.swing.JLabel();
        hesloProgressBar = new javax.swing.JProgressBar();
        zopakovathesloLabel = new javax.swing.JLabel();
        menoTextField = new javax.swing.JTextField();
        priezviskoTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        hesloPasswordField = new javax.swing.JPasswordField();
        zopakovatHesloPasswordField = new javax.swing.JPasswordField();
        pridatButton = new javax.swing.JButton();
        spatButton = new javax.swing.JButton();
        menoVypisLabel = new javax.swing.JLabel();
        priezviskoVypisLabel = new javax.swing.JLabel();
        emailVypisLabel = new javax.swing.JLabel();
        zopakovatHesloVypisLabel = new javax.swing.JLabel();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();

        menoLabel.setText("meno");

        priezviskoLabel.setText("priezvisko");

        emailLabel.setText("email");

        hesloLabel.setText("heslo");

        hesloProgressBar.setBackground(new java.awt.Color(255, 250, 226));
        hesloProgressBar.setForeground(new java.awt.Color(255, 0, 0));
        hesloProgressBar.setMaximum(4);
        hesloProgressBar.setString("");
        hesloProgressBar.setStringPainted(true);

        zopakovathesloLabel.setText("zopakovat heslo");

        menoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                menoTextFieldKeyReleased(evt);
            }
        });

        priezviskoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priezviskoTextFieldKeyReleased(evt);
            }
        });

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        hesloPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hesloPasswordFieldKeyReleased(evt);
            }
        });

        zopakovatHesloPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                zopakovatHesloPasswordFieldKeyReleased(evt);
            }
        });

        pridatButton.setText("Pridať");
        pridatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatButtonActionPerformed(evt);
            }
        });

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        menoVypisLabel.setText("jLabel1");

        priezviskoVypisLabel.setText("jLabel2");

        emailVypisLabel.setText("jLabel1");

        zopakovatHesloVypisLabel.setText("jLabel1");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hesloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zopakovathesloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hesloProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(menoTextField)
                            .addComponent(priezviskoTextField)
                            .addComponent(emailTextField)
                            .addComponent(hesloPasswordField)
                            .addComponent(zopakovatHesloPasswordField)
                            .addComponent(menoVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zopakovatHesloVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menoLabel)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menoVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priezviskoLabel)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priezviskoVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hesloLabel)
                    .addComponent(hesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hesloProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zopakovathesloLabel)
                    .addComponent(zopakovatHesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zopakovatHesloVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatButton)
                    .addComponent(spatButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJDialog.otvorOkno("prehladSpravcov");
    }//GEN-LAST:event_spatButtonActionPerformed

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        if(moznaRegistracia()){
            Spravca spravca = new Spravca();
            spravca.setMeno(menoTextField.getText());
            spravca.setPriezvisko(priezviskoTextField.getText());
            spravca.setEmail(emailTextField.getText());
            spravca.setPassword(new String(hesloPasswordField.getPassword()));
            spravca.setIdFirma(Nastavenia.idFirma);
            parentJDialog.pridatSpravcu(spravca);
            JOptionPane.showMessageDialog(parentJDialog, mapaString.get("pridanySpravcaText"), mapaString.get("pridanySpravcaNadpis"), JOptionPane.INFORMATION_MESSAGE);
            
            menoTextField.setText("");
            priezviskoTextField.setText("");
            emailTextField.setText("");
            hesloPasswordField.setText("");
            zopakovatHesloPasswordField.setText("");
            parentJDialog.aktualizovatSpravcov();
        }
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void menoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menoTextFieldKeyReleased
        meno = !menoTextField.getText().equals("");
        if(meno)
            menoVypisLabel.setText(ok);
         else 
            menoVypisLabel.setText(mapaString.get("menoPrazdne"));
        
    }//GEN-LAST:event_menoTextFieldKeyReleased

    private void priezviskoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priezviskoTextFieldKeyReleased
        priezvisko = !priezviskoTextField.getText().equals("");
        if(priezvisko)
            priezviskoVypisLabel.setText(ok);
        else
            priezviskoVypisLabel.setText(mapaString.get("priezviskoPrazdne"));
        
    }//GEN-LAST:event_priezviskoTextFieldKeyReleased

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        email = false;
        if(emailTextField.getText().equals("")){
            emailVypisLabel.setText(mapaString.get("emailPrazdny"));
        }else{
            if(!validateEmail(emailTextField.getText()))
                 emailVypisLabel.setText(mapaString.get("emailNeexistuje"));
            else if(parentJDialog.existsEmail(emailTextField.getText()))
                    emailVypisLabel.setText(mapaString.get("emailExistuje"));
            else{
                emailVypisLabel.setText(ok); 
                email = true;
            }  
        }
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void hesloPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hesloPasswordFieldKeyReleased
        int sila = silaHesla(new String(hesloPasswordField.getPassword()));
        if(sila == 0)
            hesloProgressBar.setForeground(Color.red);
        else if(sila == 1)
            hesloProgressBar.setForeground(Color.orange);
        else if(sila == 2)
            hesloProgressBar.setForeground(Color.yellow);
        else 
            hesloProgressBar.setForeground(Color.green);
        heslo = sila >= 2;
        hesloProgressBar.setValue(sila);
    }//GEN-LAST:event_hesloPasswordFieldKeyReleased

    private void zopakovatHesloPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zopakovatHesloPasswordFieldKeyReleased
        String opakovaneHeslo = new String(zopakovatHesloPasswordField.getPassword());
        if(opakovaneHeslo.equals("")){
            zopakovatHesloVypisLabel.setText(mapaString.get("zopakovatHesloPrazdne"));
            zopakovaneHeslo = false;
        } else {
            String heslo = new String(hesloPasswordField.getPassword());
            zopakovaneHeslo = heslo.equals(opakovaneHeslo);
            if(zopakovaneHeslo)
                zopakovatHesloVypisLabel.setText(ok);
            else
                zopakovatHesloVypisLabel.setText(mapaString.get("zopakovatHesloNezhodne"));   
        }
        if(evt!= null && evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            pridatButtonActionPerformed(null);
    }//GEN-LAST:event_zopakovatHesloPasswordFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailVypisLabel;
    private javax.swing.JLabel hesloLabel;
    private javax.swing.JPasswordField hesloPasswordField;
    private javax.swing.JProgressBar hesloProgressBar;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JLabel menoVypisLabel;
    private javax.swing.JButton pridatButton;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JLabel priezviskoVypisLabel;
    private javax.swing.JButton spatButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    private javax.swing.JPasswordField zopakovatHesloPasswordField;
    private javax.swing.JLabel zopakovatHesloVypisLabel;
    private javax.swing.JLabel zopakovathesloLabel;
    // End of variables declaration//GEN-END:variables
}
