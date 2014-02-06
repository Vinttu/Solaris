package kayttoliittyma;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import solaris.laskurit.Laskuri;
import solaris.paivamaara.Paivamaara;
import solaris.sijainti.SijaintiLista;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private SijaintiLista sijaintilista;
    private Laskuri laskuri;

    public Kayttoliittyma(SijaintiLista sijaintilista) {
        this.sijaintilista = sijaintilista;
    }

    @Override
    public void run() {
        frame = new JFrame("Solaris");
        frame.setPreferredSize(new Dimension(500, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
//
//        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
//        container.setLayout(layout);

        GridLayout layout = new GridLayout(6, 2);
        container.setLayout(layout);
        JLabel nimi = new JLabel("Hae paikannimi: ");
        JTextField nimiKentta = new JTextField();
        JButton haeNappi = new JButton("Hae");
        JLabel paivamaaraTeksti = new JLabel("Päivämäärä: ");
        JButton tanaanNappi = new JButton("Tänään");
        JTextField paivamaaraKentta = new JTextField();
        JLabel leveysaste = new JLabel("Leveysaste: ");
        JTextField leveysasteKentta = new JTextField();
        JButton laskuriNappi = new JButton("Laske päivän pituus");
        JTextField tulosKentta = new JTextField("0");
        tulosKentta.setEditable(false);

        SijaintiLisaysKuuntelija kuuntelija = new SijaintiLisaysKuuntelija(sijaintilista, nimiKentta, leveysasteKentta);
        haeNappi.addActionListener(kuuntelija);
        
        PaivamaaraKuuntelija pvmkuuntelija = new PaivamaaraKuuntelija(paivamaaraKentta);
        tanaanNappi.addActionListener(pvmkuuntelija);
        
        LaskuriKuuntelija laskKuuntelija = new LaskuriKuuntelija(laskuri, paivamaaraKentta, leveysasteKentta, tulosKentta, nimiKentta);
        laskuriNappi.addActionListener(laskKuuntelija);

        container.add(nimi);
        container.add(nimiKentta);
        container.add(leveysaste);
        container.add(leveysasteKentta);
        container.add(haeNappi);
        container.add(paivamaaraTeksti);
        container.add(paivamaaraKentta);
        container.add(tanaanNappi);
        container.add(laskuriNappi);
        container.add(tulosKentta);


    }

    public JFrame getFrame() {
        return frame;
    }
}
