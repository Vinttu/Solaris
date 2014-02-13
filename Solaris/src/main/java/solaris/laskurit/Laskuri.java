package solaris.laskurit;

import java.io.IOException;
import java.text.ParseException;
import solaris.paivamaara.Paivamaara;
import solaris.sijainti.Sijainti;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import solaris.sijainti.SijaintiLista;

public class Laskuri {

    /**
     * Sijainti-olio Laskuri-olion sisällä.
     */
    private Sijainti sijainti;
    /**
     * Paivamaara-olio Laskuri-olion sisällä
     */
    private Paivamaara paivamaara;

    /**
     * Konstruktori Laskuri-oliolle. Asettaa olion arvoiksi annetut parametrit,
     * lisää Sijainti-olion ArrayListiin paikat ja tallentaa sen
     * tekstitiedostoon.
     *
     * @see sijainti.SijaintiLista#lisaa(Sijainti)
     * @see sijainti.SijaintiLista#tallennaTiedostoon(Sijainti)
     * @param sijainti annettu Sijainti-olio
     * @param pvm annettu Paivamaara-olio
     * @throws IOException
     */
    public Laskuri(Sijainti sijainti, Paivamaara pvm) {

        this.sijainti = sijainti;
        this.paivamaara = pvm;
        try {
            SijaintiLista.lisaa(this.sijainti);
        } catch (IOException ex) {
            Logger.getLogger(Laskuri.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            SijaintiLista.tallennaTiedostoon(this.sijainti);
        } catch (IOException ex) {
            Logger.getLogger(Laskuri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Laskuri() {

    }

    /**
     * Metodi laskee annetun Laskuri-olion attribuuteista sijainti ja paivamaara
     * kyseisen päivän ja sijainnin päivän pituuden. Metodi ottaa huomioon
     * karkausvuodet kutsumalla onkoKarkausvuosi-metodia ja muuttaa lopullisen
     * tuntidesimaalimuodon luettavampaan muotoon kutsumalla
     * muutaDesimaaleistaPois-metodia.
     *
     * @see solaris.paivamaara.Paivamaara#onkoKarkausvuosi(int)
     * @see solaris.laskurit.Laskuri#muutaDesimaaleistaPois(double)
     * @return String-muotoinen merkkijono päivän pituudesta sekunnin
     * tarkkuudella
     */
    public String laskePaivanPituus() {
        double leveyspiiri = this.sijainti.getLeveyspiiri();

        double D = this.paivamaara.getPaiva().get(Calendar.DAY_OF_YEAR);
        int vuosi = this.paivamaara.getPaiva().get(Calendar.YEAR);
        boolean onkoKarkausVuosi = Paivamaara.onkoKarkausvuosi(vuosi);
        double lisattava = 0;
        if (onkoKarkausVuosi == false) {
            while (Paivamaara.onkoKarkausvuosi(vuosi) == false) {
                lisattava = lisattava + 0.25;
                vuosi = vuosi - 1;
            }
        }
        D = D + lisattava;
        double deklinaatioKulmaRad = Math.asin(Math.sin(Math.toRadians(23.349)) * Math.sin(Math.toRadians(360 / 365.0 * (D - 81))));
        double tuntikulmaRad = Math.acos(((-0.0144857) - Math.sin(Math.toRadians(leveyspiiri)) * Math.sin(deklinaatioKulmaRad))
                / (Math.cos(Math.toRadians(leveyspiiri)) * Math.cos(deklinaatioKulmaRad)));
        double paivaPituus = 2 * Math.toDegrees(tuntikulmaRad) / 15.0;
        String paivanPituus = muutaDesimaaleistaPois(paivaPituus);
        return paivanPituus;

    }

    /**
     * Metodi laskee päivän pituuden ja palauttaa sen desimaalimuodossa.
     *
     * @return Double-muotoinen tuntien desimaaliluku.
     */
    public double laskePaivanPituusDesimaalina() {
        double leveyspiiri = this.sijainti.getLeveyspiiri();

        double D = this.paivamaara.getPaiva().get(Calendar.DAY_OF_YEAR); // vuoden alusta 
        int vuosi = this.paivamaara.getPaiva().get(Calendar.YEAR);
        boolean onkoKarkausVuosi = Paivamaara.onkoKarkausvuosi(vuosi);
        double lisattava = 0;
        if (onkoKarkausVuosi == false) {
            while (Paivamaara.onkoKarkausvuosi(vuosi) == false) {
                lisattava = lisattava + 0.25;
                vuosi = vuosi - 1;
            }
        }
        D = D + lisattava;
        double deklinaatioKulmaRad = Math.asin(Math.sin(Math.toRadians(23.349)) * Math.sin(Math.toRadians(360 / 365.0 * (D - 81))));
        double tuntikulmaRad = Math.acos(((-0.0144857) - Math.sin(Math.toRadians(leveyspiiri)) * Math.sin(deklinaatioKulmaRad))
                / (Math.cos(Math.toRadians(leveyspiiri)) * Math.cos(deklinaatioKulmaRad)));
        double paivaPituus = 2 * Math.toDegrees(tuntikulmaRad) / 15.0;
        return paivaPituus;
    }

    /**
     * Metodi muuttaa annetun desimaalimuotoisen tuntiarvon String-muotoiseksi
     * merkkijonoksi, joka kertoo tunnit, minuutit ja sekunnit.
     *
     * @param desimaalimuoto Annettu desimaalimuotoinen tuntiarvo.
     * @return Merkkijonoesitys tunneista, minuuteista ja sekunneista
     */
    private String muutaDesimaaleistaPois(double desimaalimuoto) {

        double desimaalit = desimaalimuoto % 1;
        int tunnit = (int) (desimaalimuoto - desimaalit);
        double minuutit = desimaalit * 60;
        double minuuttiDesimaalit = minuutit % 1;
        minuutit = minuutit - minuuttiDesimaalit;
        double sekunnit = minuuttiDesimaalit * 60;
        double ylimaaraisetDesimaalit = sekunnit % 1;
        sekunnit = sekunnit - ylimaaraisetDesimaalit;

        return tunnit + "h " + (int) (minuutit) + "min " + (int) (sekunnit) + "s";

    }

    public String toString() {

        return this.sijainti.getNimi() + ", " + this.paivamaara.toString();
    }

    /**
     * Metodi laskee kuinka monta prosenttia kutsuvan Laskuri-olion
     * Paivamaara-olion päivän pituus on kyseiselle sijainnille olevasta maksimi
     * päivän pituudesta.
     *
     * @return Double-muotoinen kahteen desimaaliin pyöristetty prosenttiluku
     * @throws ParseException
     */
    public double getProsenttiMaksimista() throws ParseException {
        Paivamaara kesapaivanSeisaus = new Paivamaara(("21.06." + String.valueOf(this.paivamaara.getPaiva().get(Calendar.YEAR))));
        Laskuri maksimiLaskuri = new Laskuri(this.sijainti, kesapaivanSeisaus);
        Laskuri nykyinenLaskuri = new Laskuri(this.sijainti, this.paivamaara);
        double maksimi = maksimiLaskuri.laskePaivanPituusDesimaalina();
        double nykyinen = nykyinenLaskuri.laskePaivanPituusDesimaalina();
        double prosentti = (nykyinen / maksimi) * 100;
        prosentti = (double) Math.round(prosentti * 100) / 100;
        return prosentti;
    }

}
