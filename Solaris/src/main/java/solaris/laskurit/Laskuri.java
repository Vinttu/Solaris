package solaris.laskurit;

import java.io.IOException;
import solaris.paivamaara.Paivamaara;
import solaris.sijainti.Sijainti;
import java.util.Calendar;
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
    public Laskuri(Sijainti sijainti, Paivamaara pvm) throws IOException {

        this.sijainti = sijainti;
        this.paivamaara = pvm;
        SijaintiLista.lisaa(this.sijainti);
        SijaintiLista.tallennaTiedostoon(this.sijainti);
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
    public String laskePaivanPituus() { // Nyt toimii! Karkausvuodetkin otettu huomioon. Virhe on enää minuutti tai pari! Jos sitä edes virheeksi enää voi kutsua. Puuh!
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
        double declinationAngleRad = Math.asin(Math.sin(Math.toRadians(23.349)) * Math.sin(Math.toRadians(360 / 365.0 * (D - 81))));
        double hourAngleRad = Math.acos(((-0.0144857) - Math.sin(Math.toRadians(leveyspiiri)) * Math.sin(declinationAngleRad))
                / (Math.cos(Math.toRadians(leveyspiiri)) * Math.cos(declinationAngleRad)));
        double dayLength = 2 * Math.toDegrees(hourAngleRad) / 15.0;
        String paivanPituus = muutaDesimaaleistaPois(dayLength);
        return paivanPituus;

    }

//    private double lisaaHamaraMukaan(double m, double leveyspiiri, double paiviaSeisauksesta) {   // Tätä turha testata ennen kuin paivanpituus-metodi on 100% kunnossa.
//
//        double t = 6;
//        double h = Math.tan(Math.toRadians(t));
////        System.out.println("h: "+ h);
//        double v = leveyspiiri;
////        System.out.println("v:" + v);
//        double h2 = Math.toDegrees(Math.cos(v));
////        double h2 = 0.210208470532;
////        System.out.println("h2: "+h2);
//        double i = (Math.toDegrees(h) / h2);
////        System.out.println("i: " + i);
////        System.out.println(m);
//        double n = m + i;
////        System.out.println("n: "+n);
//        double b2e = acos((1 - n)) / Math.toRadians(180);
////        System.out.println("b2e: " +b2e );
//        double yhteensa = b2e *24;
//
//        return yhteensa;
//
//    }
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
    
    public String toString(){
    
    return this.sijainti.getNimi() + ", " + this.paivamaara.toString();
    }

}
