package kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import solaris.laskurit.Laskuri;
import solaris.sijainti.Sijainti;
import solaris.sijainti.SijaintiLista;

public class SijaintiLisaysKuuntelija implements ActionListener {

    private SijaintiLista sijaintilista;
    private JTextField nimi;
    private JTextField leveysaste;

    public SijaintiLisaysKuuntelija(SijaintiLista sijaintilista, JTextField nimi, JTextField leveysaste) {
        this.sijaintilista = sijaintilista;
        this.nimi = nimi;
        this.leveysaste = leveysaste;
    }

    /**
     * Metodi etsii onko annettu merkkijono jo jonkun Sijainti-olion attribuutti
     * ja palauttaa kyseisen Sijainti-olion leveysaste-attribuutin
     * käyttöliittymän leveysaste-kenttään.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (SijaintiLista.onkoListassaJo(nimi.getText()) == true) {
            String leveyspiiriTekstina = String.valueOf(SijaintiLista.palautaOlemassaolevaSijainti(nimi.getText()).getLeveyspiiri());
            this.leveysaste.setText(leveyspiiriTekstina);
        } else {
            this.leveysaste.setText("Ei löytynyt. Kirjoita tähän haluamasi x-koordinaatti");

        }

    }
}
