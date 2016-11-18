package com.paz1c.gui.PrihlasenieRegistracia;

import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.FirmaDao;
import com.paz1c.dao.SpravcaDao;
import com.paz1c.other.Firma;
import com.paz1c.other.Spravca;
import java.awt.CardLayout;

public class RegistraciaPrihlasenie extends javax.swing.JFrame {
    
    private final CardLayout cardlayout;
    private String vygenerovanyKod;
    private final FirmaDao firmaDao;
    private final SpravcaDao spravcaDao;
    private Firma novaFirma;
    private Spravca novySpravca;
    
    public RegistraciaPrihlasenie()  {
        firmaDao = DaoFactory.INSTANCE.getFirmaDao();
        spravcaDao = DaoFactory.INSTANCE.getSpravcaDao();
        initComponents();
        cardlayout = (CardLayout)getContentPane().getLayout();
        overenie.setParent(this);
        prihlasenie.setParent(this);
        registracia.setParent(this);
        vyberModu.setParent(this);
        
        cardlayout.show(getContentPane(),"vyberModu");
    }
    
    
    public void otvorOkno(String meno){
        cardlayout.show(getContentPane(),meno);
        
    }
    
    public void nastavJazyk(){
        vyberModu.nastavJazyk();
        overenie.nastavJazyk();
        registracia.nastavJazyk();
        prihlasenie.nastavJazyk();
    }

    public void setVygenerovanyKod(String vygenerovanyKod) {
        this.vygenerovanyKod = vygenerovanyKod;
    }

    public String getVygenerovanyKod() {
        return vygenerovanyKod;
    }
    
    public Long vlozFirmu(){
        firmaDao.vlozFirmu(novaFirma);
        return firmaDao.getFirma(novaFirma.getNazov(), novaFirma.getIco()).getIdFirma();
    }
    
    public Spravca getSpravcuEmail(String email){
        return spravcaDao.getSpravcuEmail(email);
    }
    
    public void vlozSpravcu(Long id_firma){
        novySpravca.setIdFirma(id_firma);
        spravcaDao.vlozSpravcu(novySpravca);
    }

    public void setNovaFirma(Firma novaFirma) {
        this.novaFirma = novaFirma;
    }
    
    public void setNovySpravca(Spravca novySpravca) {
        this.novySpravca = novySpravca;
    }
    
    boolean existsFirmaNazov(String nazov){
        return firmaDao.existsFirmaNazov(nazov);
    }
    
    boolean existsFirmaIco(String ico){
        return firmaDao.existsFirmaIco(ico);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vyberModu = new com.paz1c.gui.PrihlasenieRegistracia.VyberModu();
        prihlasenie = new com.paz1c.gui.PrihlasenieRegistracia.Prihlasenie();
        registracia = new com.paz1c.gui.PrihlasenieRegistracia.Registracia();
        overenie = new com.paz1c.gui.PrihlasenieRegistracia.Overenie();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(vyberModu, "vyberModu");
        getContentPane().add(prihlasenie, "prihlasenie");
        getContentPane().add(registracia, "registracia");
        getContentPane().add(overenie, "overenie");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraciaPrihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraciaPrihlasenie().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.paz1c.gui.PrihlasenieRegistracia.Overenie overenie;
    private com.paz1c.gui.PrihlasenieRegistracia.Prihlasenie prihlasenie;
    private com.paz1c.gui.PrihlasenieRegistracia.Registracia registracia;
    private com.paz1c.gui.PrihlasenieRegistracia.VyberModu vyberModu;
    // End of variables declaration//GEN-END:variables


    
    

}
