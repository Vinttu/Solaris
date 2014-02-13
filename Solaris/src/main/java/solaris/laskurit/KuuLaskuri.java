package solaris.laskurit;

import java.util.Calendar;
import solaris.paivamaara.Paivamaara;

public class KuuLaskuri {

    private static final String moon_phase_name[] = {"New",
        "kasvava kuunsirppi",
        "puolikuu",
        "kasvava puolikuu",
        "täysikuu",
        "vaheneva täysikuu",
        "puolikuu",
        "vähenevä puolikuu"};
    private Paivamaara paivamaara;

    public KuuLaskuri(Paivamaara paivamaara) {
        this.paivamaara = paivamaara;
    }

    public String kuunVaihe(Paivamaara paivamaara) {

        int paiva = this.paivamaara.getPaiva().get(Calendar.DATE);
        int kuukausi = this.paivamaara.getPaiva().get(Calendar.MONTH);
        int vuosi = this.paivamaara.getPaiva().get(Calendar.YEAR);

        int vaihe;         
        int vuosisata;         
        int vuodenAlussa;          
        int paivaVuodessa;           
        int kuunNumero;         

        if (kuukausi < 0 || kuukausi > 12) {
            kuukausi = 0;
        }
        paivaVuodessa = paivamaara.getPaiva().get(Calendar.DAY_OF_YEAR);            
        if ((kuukausi > 2) && Paivamaara.onkoKarkausvuosi(vuosi)) {
            paivaVuodessa++;                                  
        }
        vuosisata = (vuosi / 100) + 1;                   
        kuunNumero = (vuosi % 19) + 1;                   
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

        return moon_phase_name[vaihe];
    }

 
}
