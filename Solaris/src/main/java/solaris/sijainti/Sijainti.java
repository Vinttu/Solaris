package solaris.sijainti;

public class Sijainti {

    /**
     * Sijainti-olion attribuutti leveyspiiri
     */
    private double leveyspiiri;
    /**
     * Sijainti-olion attribuutti nimi
     */
    private String nimi;

    /**
     * Sijainti-olion konstruktori, joka asettaaa olion leveyspiiri ja nimi
     * -ominaisuuksiin parametrina annetut arvot.
     *
     * @param leveyspiiri Käyttäjän antama, ja onkoHyvaX-metodin tarkastama
     * syöte.
     *
     * @param nimi Käyttäjän antama syöte sijainnin nimelle.
     */
    public Sijainti(double leveyspiiri, String nimi) {

        this.leveyspiiri = leveyspiiri;
        this.nimi = nimi;

    }

    public double getLeveyspiiri() {
        return this.leveyspiiri;
    }

    public String getNimi() {
        return this.nimi;
    }

    /**
     * Metodi tarkistaa käyttäjän antaman leveyspiiri-arvon. Metodi palauttaa
     * true, jos arvo on mahdollinen.
     *
     * @param x Käyttäjän antama syöte
     *
     * @return Totuusarvo leveyspiirin oikeellisuudesta.
     */
    public static boolean onkoXHyvaLeveysasteeksi(double x) {
//
        if (x >= -90 && x <= 90) {
            return true;
        } else {
            return false;
        }
    }

}
