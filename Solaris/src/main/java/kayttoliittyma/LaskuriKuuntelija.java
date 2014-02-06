package kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import solaris.laskurit.Laskuri;
import solaris.paivamaara.Paivamaara;
import solaris.sijainti.Sijainti;

public class LaskuriKuuntelija implements ActionListener {

    private Laskuri laskuri;
    private JTextField leveysaste;
    private JTextField paivamaara;
    private JTextField tulos;
    private JTextField nimi;

    public LaskuriKuuntelija(Laskuri annettuLaskuri, JTextField leveysaste, JTextField paivamaara, JTextField tulos, JTextField nimi) {
        this.laskuri = annettuLaskuri;
        this.leveysaste = leveysaste;
        this.paivamaara = paivamaara;
        this.tulos = tulos;
        this.nimi = nimi;

    }

    /**
     * Metodi suorittaa laskePaivanPituus-metodin käyttöliittymän päivämäärä ja
     * leveysaste -kenttiin syötetyille parametreille.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        double leveysasteNumerona = Double.parseDouble(leveysaste.getText());

        if (Paivamaara.onkoPaivaHyva(this.paivamaara.getText(), "dd.MM.yyyy") == false) {
            this.paivamaara.setText("Päivämäärä ei ollut mahdollinen");
        }

        Paivamaara pvm = null;
        Laskuri uusiLaskuri = null;
        try {
            pvm = new Paivamaara(this.paivamaara.getText());
        } catch (ParseException ex) {
            Logger.getLogger(LaskuriKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            uusiLaskuri = new Laskuri(new Sijainti(leveysasteNumerona, nimi.getText()), pvm);
        } catch (IOException ex) {
            Logger.getLogger(LaskuriKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.tulos.setText(uusiLaskuri.laskePaivanPituus());

    }
}
