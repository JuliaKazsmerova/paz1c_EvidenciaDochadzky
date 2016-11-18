package com.paz1c.gui.PrihlasenieRegistracia;

import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;
import com.paz1c.constants.Nastavenia;
import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.FirmaDao;
import com.paz1c.other.Firma;
import com.paz1c.other.GoogleMail;
import com.paz1c.other.Spravca;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Registracia extends javax.swing.JPanel {

    private RegistraciaPrihlasenie parentJFrame; 
    private Pattern patternEmail;
  
    Zxcvbn zxcvbn = new Zxcvbn();
    
    private boolean firma;
    private boolean meno;
    private boolean priezvisko;
    private boolean email;
    private boolean heslo;
    private boolean zopakovaneHeslo;
    private boolean ico;
    private boolean dic;
    private boolean sidlo;
    
    //pouzite stringy v roznych jazykoch
    private String ok = "\u2713";
    private Map<String,String> mapaString = new HashMap<>();

    

    public Registracia() {
        patternCompile();
        initComponents();
        nastavJazyk();
    }
    
    void patternCompile(){
        patternEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    
    public boolean validateEmail(String email) {
	return patternEmail.matcher(email).matches();
    }
    
    void initTexts(String jazyk){
        Map<String,String> mapaString = new HashMap<>();
            switch(jazyk) {
                case "SK" :
                    mapaString.put("uvod1", "Pre registráciu zapíšte údaje. ");
                    mapaString.put("uvod2", "Na e-mail Vám príde registračný kód.");
                    
                    mapaString.put("firma", "Názov firmy:");
                    mapaString.put("firmaExistuje", "firma s danym nazvom uz je registrovana");
                    mapaString.put("firmaPrazdna", "nie je zadana ziadna firma");
                    
                    mapaString.put("sidlo", "Sídlo:");
                    mapaString.put("sidloPrazdne", "zadajte sidlo");
                    
                    mapaString.put("ico", "Ičo:");
                    mapaString.put("icoExistuje", "firma s danym ico uz je registrovana");
                    mapaString.put("icoPrazdne", "zadajte ico");
                    
                    mapaString.put("dic", "Dič:");
                    mapaString.put("dicPrazdne", "zadajte dic");
                    
                    mapaString.put("meno", "Meno:");
                    mapaString.put("menoPrazdne", "zadajte prosim meno");
                    
                    mapaString.put("priezvisko", "Priezvisko:");
                    mapaString.put("priezviskoPrazdne", "zadajte prosim priezvisko");
                   
                    mapaString.put("email", "E-mail:");
                    mapaString.put("emailNeexistuje", "zadany mail neexistuje");
                    mapaString.put("emailPrazdny", "zadajte email");
                    mapaString.put("emailPredmet", "Overenie mailu");
                    mapaString.put("emailSprava", "Dakujeme za registraciu. \nVase udaje vo firme: @firma \nMeno: @meno \nPriezvisko: @priezvisko \n"
                    + "Heslo: @heslo \nVas registracny kod je: @kod");
                   
                    mapaString.put("heslo", "Heslo:");
                    mapaString.put("zopakovatHeslo", "Zopakovať heslo:");
                    mapaString.put("zopakovatHesloPrazdne", "zadajte znova heslo");
                    mapaString.put("zopakovatHesloNezhodne", "zadane hesla sa nezhoduju");
                    
                    mapaString.put("spat", "Späť");
                    mapaString.put("registruj", "Registruj");  
                    
                    mapaString.put("firmaUpozornenie", "Skontrolujte nazov firmy.");
                    mapaString.put("sidloUpozornenie", "Skontrolujte sidlo firmy.");
                    mapaString.put("icoUpozornenie", "Skontrolujte ico firmy.");
                    mapaString.put("dicUpozornenie", "Skontrolujte dic firmy.");
                    mapaString.put("menoUpozornenie", "Skontrolujte vase meno.");
                    mapaString.put("priezviskoUpozornenie", "Skontrolujte vase priezvisko.");
                    mapaString.put("emailUpozornenie", "Skontrolujte vas email.");
                    mapaString.put("hesloUpozornenie", "Zadane heslo nie je dostatocne silne.");
                    mapaString.put("zopakovatHesloUpozornenie", "Hesla sa nezhoduju.");
                    mapaString.put("nadpisUpozornenie", "Registracia");
                    
                    break;
                case "EN" :
                    mapaString.put("uvod1", "");
                    mapaString.put("uvod2", "");
                    
                    mapaString.put("firma", "");
                    mapaString.put("firmaExistuje", "");
                    mapaString.put("firmaPrazdna", "");
                    
                    mapaString.put("sidlo", "");
                    mapaString.put("sidloPrazdne", "");
                    
                    mapaString.put("ico", "");
                    mapaString.put("icoExistuje", "");
                    mapaString.put("icoPrazdne", "");
                    
                    mapaString.put("dic", "");
                    mapaString.put("dicPrazdne", "");
                    
                    mapaString.put("meno", "");
                    mapaString.put("menoPrazdne", "");
                    
                    mapaString.put("priezvisko", "");
                    mapaString.put("priezviskoPrazdne", "");
                    
                    mapaString.put("email", "");
                    mapaString.put("emailNeexistuje", "");
                    mapaString.put("emailPrazdny", "");
                    mapaString.put("emailPredmet", "");
                    mapaString.put("emailSprava", "");
                    
                    mapaString.put("heslo", "");
                    mapaString.put("zopakovatHeslo", "");
                    mapaString.put("zopakovatHesloPrazdne", "");
                    mapaString.put("zopakovatHesloNezhodne", "");
                    
                    mapaString.put("spat", "");
                    mapaString.put("registruj", "");  
                    
                    mapaString.put("firmaUpozornenie", "");
                    mapaString.put("sidloUpozornenie", "");
                    mapaString.put("icoUpozornenie", "");
                    mapaString.put("dicUpozornenie", "");
                    mapaString.put("menoUpozornenie", "");
                    mapaString.put("priezviskoUpozornenie", "");
                    mapaString.put("emailUpozornenie", "");
                    mapaString.put("hesloUpozornenie", "");
                    mapaString.put("zopakovatHesloUpozornenie", "");
                    mapaString.put("nadpisUpozornenie", "");
                break;
                
            }
            this.mapaString = mapaString;
    }
    
    public void setParent(RegistraciaPrihlasenie parent){
        parentJFrame = parent; 
        zmenaJazykaPanel.setParent(parentJFrame);
    }
    
    int silaHesla(String heslo){
        Strength strength = zxcvbn.measure(heslo);
        return strength.getScore();
    }
    
    String generujKod(){
        String kod = "";
        Random r = new Random();
        Random type = new Random();
        for(int i = 0;i < 8;i++){
            int a = type.nextInt(3);
            if(a == 0)
                kod += (char) (48 + r.nextInt(10));
            else if(a == 1)
                kod += (char) (65 + r.nextInt(25));
            else
                kod += (char) (97 + r.nextInt(25));
                    
            
        }
        return kod;
    }
    
    private boolean moznaRegistracia(){
        String upozornenie = "";
        if(!firma)
            upozornenie += mapaString.get("firmaUpozornenie")+" \n";
        if(!sidlo)
            upozornenie += mapaString.get("sidloUpozornenie")+" \n";
        if(!ico)
            upozornenie += mapaString.get("icoUpozornenie")+" \n";
        if(!dic)
            upozornenie += mapaString.get("dicUpozornenie")+" \n";
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
            JOptionPane.showMessageDialog(parentJFrame,upozornenie,mapaString.get("nadpisUpozornenie"),JOptionPane.ERROR_MESSAGE);
        return upozornenie.equals("");
    }
    
    public void nastavJazyk(){
        initTexts(Nastavenia.jazyk);
        
        registraciaTextLabel.setText(mapaString.get("uvod1"));
        eMailTextLabel.setText(mapaString.get("uvod2"));
        nazovFirmyLabel.setText(mapaString.get("firma"));
        menoLabel.setText(mapaString.get("meno"));
        priezviskoLabel.setText(mapaString.get("priezvisko"));
        eMailLabel.setText(mapaString.get("email"));
        hesloLabel.setText(mapaString.get("heslo"));
        zopakovatHesloLabel.setText(mapaString.get("zopakovatHeslo"));
        registraciaButton.setText(mapaString.get("registruj"));
        spatButton.setText(mapaString.get("spat"));
        sidloLabel.setText(mapaString.get("sidlo"));
        icoLabel.setText(mapaString.get("ico"));
        dicLabel.setText(mapaString.get("dic"));
        
        
        hesloPasswordFieldKeyReleased(null);
        nazovFirmyTextFieldKeyReleased(null);
        menoTextFieldKeyReleased(null);
        priezviskoTextFieldKeyReleased(null);
        emailTextFieldKeyReleased(null);
        zopakovatHesloPasswordFieldKeyReleased(null);
        sidloTextFieldKeyReleased(null);
        icoTextFieldKeyReleased(null);
        dicTextFieldKeyReleased(null);
    }
    
    private Firma novaFirma(){
        Firma firma = new Firma();
        firma.setNazov(nazovFirmyTextField.getText());
        firma.setIco(icoTextField.getText());
        firma.setDic(dicTextField.getText());
        firma.setSidlo(sidloTextField.getText());
        firma.setVybratyMod(Nastavenia.vybranyMod);
        return firma;
    }
    
    private Spravca novySpravca(){
        Spravca spravca = new Spravca();
        spravca.setMeno(menoTextField.getText());
        spravca.setPriezvisko(priezviskoTextField.getText());
        spravca.setEmail(emailTextField.getText());
        spravca.setPassword(new String(hesloPasswordField.getPassword()));
        return spravca;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registraciaTextLabel = new javax.swing.JLabel();
        eMailTextLabel = new javax.swing.JLabel();
        nazovFirmyLabel = new javax.swing.JLabel();
        menoLabel = new javax.swing.JLabel();
        priezviskoLabel = new javax.swing.JLabel();
        eMailLabel = new javax.swing.JLabel();
        hesloLabel = new javax.swing.JLabel();
        zopakovatHesloLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        priezviskoTextField = new javax.swing.JTextField();
        menoTextField = new javax.swing.JTextField();
        nazovFirmyTextField = new javax.swing.JTextField();
        registraciaButton = new javax.swing.JButton();
        zmenaJazykaPanel = new com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel();
        spatButton = new javax.swing.JButton();
        hesloPasswordField = new javax.swing.JPasswordField();
        zopakovatHesloPasswordField = new javax.swing.JPasswordField();
        nazovFirmyVypisLabel = new javax.swing.JLabel();
        menoVypisLabel = new javax.swing.JLabel();
        priezviskoVypisLabel = new javax.swing.JLabel();
        emailVypisLabel = new javax.swing.JLabel();
        hesloProgressBar = new javax.swing.JProgressBar();
        zopakovatHesloVypisLabel = new javax.swing.JLabel();
        sidloLabel = new javax.swing.JLabel();
        sidloTextField = new javax.swing.JTextField();
        sidloVypisLabel = new javax.swing.JLabel();
        icoLabel = new javax.swing.JLabel();
        icoTextField = new javax.swing.JTextField();
        icoVypisLabel = new javax.swing.JLabel();
        dicLabel = new javax.swing.JLabel();
        dicTextField = new javax.swing.JTextField();
        dicVypisLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 226));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));

        registraciaTextLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        registraciaTextLabel.setText("Pre registráciu zapíšte údaje. ");

        eMailTextLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        eMailTextLabel.setText("Na e-mail Vám príde registračný kód.");

        nazovFirmyLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        nazovFirmyLabel.setText("Názov firmy:");

        menoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        menoLabel.setText("Meno:");

        priezviskoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        priezviskoLabel.setText("Priezvisko: ");

        eMailLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        eMailLabel.setText("E-mail: ");

        hesloLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        hesloLabel.setText("Heslo: ");

        zopakovatHesloLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        zopakovatHesloLabel.setText("Zopakovať heslo: ");

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        priezviskoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priezviskoTextFieldKeyReleased(evt);
            }
        });

        menoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                menoTextFieldKeyReleased(evt);
            }
        });

        nazovFirmyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nazovFirmyTextFieldKeyReleased(evt);
            }
        });

        registraciaButton.setText("Registruj");
        registraciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraciaButtonActionPerformed(evt);
            }
        });

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
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

        nazovFirmyVypisLabel.setText("jLabel");

        menoVypisLabel.setText("jLabel");

        priezviskoVypisLabel.setText("jLabel");

        emailVypisLabel.setText("jLabel");

        hesloProgressBar.setBackground(new java.awt.Color(255, 250, 226));
        hesloProgressBar.setForeground(new java.awt.Color(255, 0, 0));
        hesloProgressBar.setMaximum(4);
        hesloProgressBar.setString("");
        hesloProgressBar.setStringPainted(true);

        zopakovatHesloVypisLabel.setText("jLabel");

        sidloLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sidloLabel.setText("Sídlo:");

        sidloTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sidloTextFieldKeyReleased(evt);
            }
        });

        sidloVypisLabel.setText("jLabel");

        icoLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        icoLabel.setText("Ičo:");

        icoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                icoTextFieldKeyReleased(evt);
            }
        });

        icoVypisLabel.setText("jLabel");

        dicLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dicLabel.setText("Dič:");

        dicTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dicTextFieldKeyReleased(evt);
            }
        });

        dicVypisLabel.setText("jLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registraciaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nazovFirmyLabel)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nazovFirmyVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nazovFirmyTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hesloLabel)
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hesloPasswordField)
                            .addComponent(hesloProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zopakovatHesloLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zopakovatHesloVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zopakovatHesloPasswordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registraciaTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eMailLabel)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField)
                            .addComponent(emailVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sidloLabel)
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sidloTextField)
                            .addComponent(sidloVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icoLabel)
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icoTextField)
                            .addComponent(icoVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dicLabel)
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dicTextField)
                            .addComponent(dicVypisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eMailTextLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menoLabel)
                            .addComponent(priezviskoLabel))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priezviskoVypisLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoTextField)
                            .addComponent(menoVypisLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menoTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(registraciaTextLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(zmenaJazykaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(eMailTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazovFirmyLabel)
                    .addComponent(nazovFirmyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nazovFirmyVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sidloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidloLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidloVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icoVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dicLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dicVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menoVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priezviskoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priezviskoVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hesloLabel)
                    .addComponent(hesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hesloProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zopakovatHesloLabel)
                    .addComponent(zopakovatHesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zopakovatHesloVypisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatButton)
                    .addComponent(registraciaButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registraciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraciaButtonActionPerformed
        if(moznaRegistracia()){
            parentJFrame.otvorOkno("overenie");
            String sprava = mapaString.get("emailSprava");
            sprava = sprava.replace("@firma",nazovFirmyTextField.getText());
            sprava = sprava.replaceAll("@meno", menoTextField.getText());
            sprava = sprava.replace("@priezvisko", priezviskoTextField.getText());
            sprava = sprava.replace("@heslo", new String(hesloPasswordField.getPassword()));
            String generovanyKod = generujKod();
            parentJFrame.setVygenerovanyKod(generovanyKod);
            sprava = sprava.replace("@kod", generovanyKod);
            GoogleMail.Send(emailTextField.getText(), mapaString.get("emailPredmet"), sprava);
    
            parentJFrame.setNovaFirma(novaFirma());
            parentJFrame.setNovySpravca(novySpravca());
        }
        
    }//GEN-LAST:event_registraciaButtonActionPerformed

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        parentJFrame.otvorOkno("vyberModu");
    }//GEN-LAST:event_spatButtonActionPerformed

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

    private void nazovFirmyTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nazovFirmyTextFieldKeyReleased

        if(nazovFirmyTextField.getText().equals("")){
            nazovFirmyVypisLabel.setText(mapaString.get("firmaPrazdna"));
            firma = false;
        }else{
            firma = !parentJFrame.existsFirmaNazov(nazovFirmyTextField.getText());
            if(firma)
                nazovFirmyVypisLabel.setText(ok);
            else
                nazovFirmyVypisLabel.setText(mapaString.get("firmaExistuje"));
        }
    }//GEN-LAST:event_nazovFirmyTextFieldKeyReleased

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
        if(emailTextField.getText().equals("")){
            emailVypisLabel.setText(mapaString.get("emailPrazdny"));
            email = false;
        }else{
            email = validateEmail(emailTextField.getText());
            if(email)
                emailVypisLabel.setText(ok);  
             else 
                emailVypisLabel.setText(mapaString.get("emailNeexistuje"));
            
        }
        
    }//GEN-LAST:event_emailTextFieldKeyReleased

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
            registraciaButtonActionPerformed(null);
    }//GEN-LAST:event_zopakovatHesloPasswordFieldKeyReleased

    private void sidloTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidloTextFieldKeyReleased
        sidlo = !sidloTextField.getText().equals("");
        if(sidlo)
            sidloVypisLabel.setText(ok);
        else
            sidloVypisLabel.setText(mapaString.get("sidloPrazdne"));
    }//GEN-LAST:event_sidloTextFieldKeyReleased

    private void icoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_icoTextFieldKeyReleased
        
        if(icoTextField.getText().equals("")){
            icoVypisLabel.setText(mapaString.get("icoPrazdne"));
            ico = false;
        }else{
            ico = !parentJFrame.existsFirmaIco(icoTextField.getText());
            if(ico)
                icoVypisLabel.setText(ok);
            else
                icoVypisLabel.setText(mapaString.get("icoExistuje"));
        }
        
    }//GEN-LAST:event_icoTextFieldKeyReleased

    private void dicTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dicTextFieldKeyReleased
        dic = !dicTextField.getText().equals("");
        if(dic)
            dicVypisLabel.setText(ok);
        else
            dicVypisLabel.setText(mapaString.get("dicPrazdne"));
    }//GEN-LAST:event_dicTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dicLabel;
    private javax.swing.JTextField dicTextField;
    private javax.swing.JLabel dicVypisLabel;
    private javax.swing.JLabel eMailLabel;
    private javax.swing.JLabel eMailTextLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailVypisLabel;
    private javax.swing.JLabel hesloLabel;
    private javax.swing.JPasswordField hesloPasswordField;
    private javax.swing.JProgressBar hesloProgressBar;
    private javax.swing.JLabel icoLabel;
    private javax.swing.JTextField icoTextField;
    private javax.swing.JLabel icoVypisLabel;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JLabel menoVypisLabel;
    private javax.swing.JLabel nazovFirmyLabel;
    private javax.swing.JTextField nazovFirmyTextField;
    private javax.swing.JLabel nazovFirmyVypisLabel;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JLabel priezviskoVypisLabel;
    private javax.swing.JButton registraciaButton;
    private javax.swing.JLabel registraciaTextLabel;
    private javax.swing.JLabel sidloLabel;
    private javax.swing.JTextField sidloTextField;
    private javax.swing.JLabel sidloVypisLabel;
    private javax.swing.JButton spatButton;
    private com.paz1c.gui.PrihlasenieRegistracia.zmenaJazykaPanel zmenaJazykaPanel;
    private javax.swing.JLabel zopakovatHesloLabel;
    private javax.swing.JPasswordField zopakovatHesloPasswordField;
    private javax.swing.JLabel zopakovatHesloVypisLabel;
    // End of variables declaration//GEN-END:variables
}
