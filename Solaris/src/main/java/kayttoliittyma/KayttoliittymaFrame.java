
package kayttoliittyma;

import java.text.ParseException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import solaris.laskurit.KuuLaskuri;
import solaris.laskurit.Laskuri;
import solaris.paivamaara.Paivamaara;
import solaris.sijainti.Sijainti;
import solaris.sijainti.SijaintiLista;

public class KayttoliittymaFrame extends javax.swing.JFrame {

    public KayttoliittymaFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nimiKentta = new javax.swing.JTextField();
        leveysasteKentta = new javax.swing.JTextField();
        haeNappi = new javax.swing.JButton();
        paivamaaraKentta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        laskeNappi = new javax.swing.JButton();
        tulosKentta = new javax.swing.JTextField();
        tanaanNappi = new javax.swing.JButton();
        paivaProsenttiKentta = new javax.swing.JTextField();
        kuunVaiheKentta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lyheneePiteneeKentta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paikannimi");

        jLabel2.setText("Leveysaste");

        nimiKentta.setName("nimi"); // NOI18N
        nimiKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimiKenttaActionPerformed(evt);
            }
        });

        leveysasteKentta.setName("leveysaste"); // NOI18N
        leveysasteKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leveysasteKenttaActionPerformed(evt);
            }
        });

        haeNappi.setText("Hae");
        haeNappi.setName("haeNappi"); // NOI18N
        haeNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haeNappiActionPerformed(evt);
            }
        });

        paivamaaraKentta.setName("paivamaara"); // NOI18N
        paivamaaraKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paivamaaraKenttaActionPerformed(evt);
            }
        });

        jLabel3.setText("Päivämäärä");

        laskeNappi.setText("Laske päivän pituus");
        laskeNappi.setName("laskeNappi"); // NOI18N
        laskeNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laskeNappiActionPerformed(evt);
            }
        });

        tulosKentta.setEditable(false);
        tulosKentta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tulosKentta.setBorder(null);
        tulosKentta.setName("tulos"); // NOI18N

        tanaanNappi.setText("Tänään");
        tanaanNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanaanNappiActionPerformed(evt);
            }
        });

        paivaProsenttiKentta.setEditable(false);
        paivaProsenttiKentta.setBorder(null);
        paivaProsenttiKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paivaProsenttiKenttaActionPerformed(evt);
            }
        });

        kuunVaiheKentta.setEditable(false);
        kuunVaiheKentta.setBorder(null);

        lyheneePiteneeKentta.setEditable(false);
        lyheneePiteneeKentta.setBorder(null);
        lyheneePiteneeKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lyheneePiteneeKenttaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(leveysasteKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nimiKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(haeNappi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(paivaProsenttiKentta)
                                            .addComponent(lyheneePiteneeKentta, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                            .addComponent(kuunVaiheKentta))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(laskeNappi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tulosKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(paivamaaraKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tanaanNappi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(0, 58, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimiKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(haeNappi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(leveysasteKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paivamaaraKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanaanNappi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laskeNappi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tulosKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(paivaProsenttiKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lyheneePiteneeKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kuunVaiheKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimiKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimiKenttaActionPerformed

    }//GEN-LAST:event_nimiKenttaActionPerformed

    private void leveysasteKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leveysasteKenttaActionPerformed
        
    }//GEN-LAST:event_leveysasteKenttaActionPerformed
    /**
     * Metodi etsii tekstitiedostosta onko siellä tekstikentässä olevan
     * paikkakunnan koordinaatteja. Jos on, se asettaa ne leveysastekenttään.
     *
     * @param evt
     */
    private void haeNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haeNappiActionPerformed
        if (SijaintiLista.onkoListassaJo(nimiKentta.getText()) == true) {
            String leveyspiiriTekstina = String.valueOf(SijaintiLista.palautaOlemassaolevaSijainti(nimiKentta.getText()).getLeveyspiiri());
            this.leveysasteKentta.setText(leveyspiiriTekstina);
        } else {
            this.leveysasteKentta.setText("Ei löytynyt. Kirjoita tähän haluamasi x-koordinaatti");
        }
    }//GEN-LAST:event_haeNappiActionPerformed

    private void paivamaaraKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paivamaaraKenttaActionPerformed
        
    }//GEN-LAST:event_paivamaaraKenttaActionPerformed
    /**
     * Metodi tarkistaa onko annettu päivämäärä ja leveysaste mahdollisia
     * kutsumalla sen tekeviä metodeja, jonka jälkeen se kutsuu päivän pituuden, kuun vaiheen arvoja 
     * laskevia metodeja ja asettaa niiden palauttamat arvot tekstikenttiin.
     *
     * @param evt
     */
    private void laskeNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laskeNappiActionPerformed

        if (Paivamaara.onkoPaivaHyva(this.paivamaaraKentta.getText(), "dd.MM.yyyy") == false) {
            this.paivamaaraKentta.setText("Päivämäärä ei ollut mahdollinen");
        }

        if (Sijainti.onkoXHyvaLeveysasteeksi(Double.parseDouble(this.leveysasteKentta.getText())) == false) {
            this.leveysasteKentta.setText("Leveysaste ei ollut mahdollinen");

        }

        Paivamaara pvm = null;
        Sijainti sijainti = null;
        Laskuri laskuri = null;
        KuuLaskuri kuunVaihe = null;

        try {
            pvm = new Paivamaara(this.paivamaaraKentta.getText());
            kuunVaihe = new KuuLaskuri(pvm);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Virheellinen päivämäärä", "Virhe", JOptionPane.ERROR_MESSAGE);
        }
        try {
            sijainti = new Sijainti(Double.parseDouble(this.leveysasteKentta.getText()), this.nimiKentta.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Virheellinen leveysaste", "Virhe", JOptionPane.ERROR_MESSAGE);
        }

        try {
            laskuri = new Laskuri(sijainti, pvm);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Virheelliset arvot", "Virhe", JOptionPane.ERROR_MESSAGE);
        }

        this.tulosKentta.setText(laskuri.laskePaivanPituus());

        if (pvm.lyheneeVaiPitenee(pvm) == true) {
            this.lyheneePiteneeKentta.setText("Päivä pitenee vielä " + String.valueOf(pvm.getPaiviaSeuraavaanSeisaukseen()) + " päivää");
        } else {
            this.lyheneePiteneeKentta.setText("Päivä lyhenee vielä " + String.valueOf(pvm.getPaiviaSeuraavaanSeisaukseen()) + " päivää");
        }
        try {
            this.paivaProsenttiKentta.setText("Päivän pituus on " + laskuri.getProsenttiMaksimista() + " prosenttia maksimista");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Virheelliset arvot", "Virhe", JOptionPane.ERROR_MESSAGE);
        }

        this.kuunVaiheKentta.setText("Kuunvaihe on " + kuunVaihe.kuunVaihe());


    }//GEN-LAST:event_laskeNappiActionPerformed
    /**
     * Metodi asettaa päivämäärä-kenttään nykyisen päivämäärän.
     *
     * @param evt
     */
    private void tanaanNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanaanNappiActionPerformed
        String pvm = Calendar.getInstance().get(Calendar.DATE) + "." + (Calendar.getInstance().get(Calendar.MONTH) + 1) + "." + Calendar.getInstance().get(Calendar.YEAR);
        this.paivamaaraKentta.setText(pvm);


    }//GEN-LAST:event_tanaanNappiActionPerformed

    private void lyheneePiteneeKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lyheneePiteneeKenttaActionPerformed
        
    }//GEN-LAST:event_lyheneePiteneeKenttaActionPerformed

    private void paivaProsenttiKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paivaProsenttiKenttaActionPerformed
       
    }//GEN-LAST:event_paivaProsenttiKenttaActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KayttoliittymaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayttoliittymaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayttoliittymaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayttoliittymaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayttoliittymaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton haeNappi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kuunVaiheKentta;
    private javax.swing.JButton laskeNappi;
    private javax.swing.JTextField leveysasteKentta;
    private javax.swing.JTextField lyheneePiteneeKentta;
    private javax.swing.JTextField nimiKentta;
    private javax.swing.JTextField paivaProsenttiKentta;
    private javax.swing.JTextField paivamaaraKentta;
    private javax.swing.JButton tanaanNappi;
    private javax.swing.JTextField tulosKentta;
    // End of variables declaration//GEN-END:variables
}
