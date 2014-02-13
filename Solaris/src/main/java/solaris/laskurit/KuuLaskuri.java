package solaris.laskurit;

import java.util.Calendar;
import solaris.paivamaara.Paivamaara;

public class KuuLaskuri {

    private int paiva;
    private int kuukausi;
    private int vuosi;
    
    private static final String kuunVaiheNimi[] = {
        "uusikuu",
        "kasvava kuunsirppi",
        "puolikuu",
        "kasvava puolikuu",
        "täysikuu",
        "vähenevä täysikuu",
        "puolikuu",
        "vähenevä puolikuu"};
    
    private Paivamaara paivamaara;

    public KuuLaskuri(Paivamaara paivamaara) {
        this.paivamaara = paivamaara;
        this.paiva = this.paivamaara.getPaiva().get(Calendar.DATE);
        this.kuukausi = this.paivamaara.getPaiva().get(Calendar.MONTH);
        this.vuosi = this.paivamaara.getPaiva().get(Calendar.YEAR);
    }

    public String kuunVaihe(Paivamaara paivamaara) {

        int vaihe;
        int vuosisata;
        int vuodenAlussa;
        int paivaVuodessa;
        int kuunNumero;

        paivaVuodessa = paivamaara.getPaiva().get(Calendar.DAY_OF_YEAR);
        
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

        return this.kuunVaiheNimi[vaihe];
    }

}
