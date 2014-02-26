package solaris.laskurit;

import java.util.Calendar;
import solaris.paivamaara.Paivamaara;

public class KuuLaskuri {

    /**
     * Integer-luokan päivää kuvaava kokonaisluku.
     */
    private int paiva;
    /**
     * Integer-luokan kuukautta kuvaava kokonaisluku.
     */
    private int kuukausi;
    /**
     * Integer-luokan vuotta kuvaava kokonaisluku.
     */
    private int vuosi;
    /**
     * String-muotoiset kuun vaiheet taulukossa.
     */
    private static final String kuunVaiheNimi[] = {
        "uusikuu",
        "kasvava kuunsirppi",
        "puolikuu",
        "kasvava puolikuu",
        "täysikuu",
        "vähenevä täysikuu",
        "puolikuu",
        "vähenevä puolikuu"};
    /**
     * Päivämäärä-muotoinen olio paivamaara.
     */
    private Paivamaara paivamaara;

    /**
     * KuuLaskuri-luokan konstruktori, joka purkaa Päivämäärä-olion ominaisuudet erillisiksi
     * Integer-olioiksi.
     *
     * @param paivamaara Metodia kutsuttaessa annettu Paivamaara-muotoinen olio.
     */
    public KuuLaskuri(Paivamaara paivamaara) {
        this.paivamaara = paivamaara;
        this.paiva = this.paivamaara.getPaiva().get(Calendar.DATE);
        this.kuukausi = this.paivamaara.getPaiva().get(Calendar.MONTH);
        this.vuosi = this.paivamaara.getPaiva().get(Calendar.YEAR);
    }

    /**
     * Metodi laskee olion päivämäärä-attribuutista kuun vaiheen kahdeksasta
     * vaihtoehdosta ja palauttaa sen String-muotoisena merkkijonona.
     *
     * @return kuunVaiheTekstina String-muotoinen merkkijono kuun vaiheesta.
     */
    public String kuunVaihe() {

        int vaihe;
        int vuosisata;
        int vuodenAlussa;
        int paivaVuodessa;
        int kuunNumero;

        paivaVuodessa = this.paivamaara.getPaiva().get(Calendar.DAY_OF_YEAR);

        if ((this.kuukausi > 2) && Paivamaara.onkoKarkausvuosi(this.vuosi) == true) {
            paivaVuodessa++;
        }
        vuosisata = (this.vuosi / 100) + 1;
        kuunNumero = (this.vuosi % 19) + 1;
        vuodenAlussa = ((11 * kuunNumero) + 20
                + (((8 * vuosisata) + 5) / 25) - 5
                - (((3 * vuosisata) / 4) - 12)) % 30;
        if (vuodenAlussa <= 0) {
            vuodenAlussa += 30;
        }
        if ((vuodenAlussa == 25 && kuunNumero > 11)
                || vuodenAlussa == 24) {
            vuodenAlussa++;
        }
        vaihe = (((((paivaVuodessa + vuodenAlussa) * 6) + 11) % 177) / 22) & 7;
        String kuunVaiheTekstina = this.kuunVaiheNimi[vaihe];
        return kuunVaiheTekstina;
    }

}
