package solaris.paivamaara;

import java.text.ParseException;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaivamaaraTest {

    private static final double DELTA = 1e-15;

    public PaivamaaraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriToimiiOikeinPaivanKohdalta() throws ParseException {

        Paivamaara pvm = new Paivamaara("12.04.1991");
        assertEquals(12, pvm.getPaiva().get(Calendar.DATE));

    }

    @Test
    public void konstruktoriToimiiOikeinKuukaudenKohdalta() throws ParseException {

        Paivamaara pvm = new Paivamaara("12.04.1991");
        assertEquals(3, pvm.getPaiva().get(Calendar.MONTH));

    }

    @Test
    public void konstruktoriToimiiOikeinVuodenKohdalta() throws ParseException {

        Paivamaara pvm = new Paivamaara("12.04.1991");
        assertEquals(1991, pvm.getPaiva().get(Calendar.YEAR));

    }

    @Test
    public void PaiviaTalvipaivanSeisauksestaToimiiTalvipaivanSeisauksenaOikein() throws ParseException {

        Paivamaara pvm = new Paivamaara("22.12.2013");
        assertEquals(365, pvm.getPaiviaTalvipaivanSeisauksesta(), DELTA);

    }

    @Test
    public void PaiviaTalvipaivanSeisauksestaToimiiOikeinTalvella() throws ParseException {

        Paivamaara pvm = new Paivamaara("30.01.2014");
        assertEquals(39, pvm.getPaiviaTalvipaivanSeisauksesta(), DELTA);

    }

    @Test
    public void PaiviaTalvipaivanSeisauksestaToimiiOikeinKesalla() throws ParseException {

        Paivamaara pvm = new Paivamaara("30.07.2014");
        assertEquals(220, pvm.getPaiviaTalvipaivanSeisauksesta(), DELTA);

    }

    @Test
    public void PaiviaTalvipaivanSeisauksestaToimiiOikeinSyksylla() throws ParseException {

        Paivamaara pvm = new Paivamaara("20.12.2014");
        assertEquals(363, pvm.getPaiviaTalvipaivanSeisauksesta(), DELTA);

    }

    @Test
    public void PaiviaTalvipaivanSeisauksestaToimiiOikeinHetiSenJalkeen() throws ParseException {

        Paivamaara pvm = new Paivamaara("28.12.2014");
        assertEquals(6, pvm.getPaiviaTalvipaivanSeisauksesta(), DELTA);

    }

    @Test
    public void onkoKarkausvuosiToimiiKunOn() throws ParseException {
        int vuosi = 2012;
        assertEquals(true, Paivamaara.onkoKarkausvuosi(vuosi));
    }

    @Test
    public void onkoKarkausvuosiToimiiKunEiOle() throws ParseException {

        int vuosi = 2014;
        assertEquals(false, Paivamaara.onkoKarkausvuosi(vuosi));

    }
    @Test
    public void onkoKarkausvuosiToimiiKunEiOle2() throws ParseException {

        int vuosi = 2000;
        assertEquals(true, Paivamaara.onkoKarkausvuosi(vuosi));

    }
    @Test
    public void onkoKarkausvuosiToimiiKunEiOle3() throws ParseException {

        int vuosi = 2100;
        assertEquals(false, Paivamaara.onkoKarkausvuosi(vuosi));

    }
    @Test
    public void onkoPaivaHyvaToimiiKunArvoNull() throws ParseException {

        String pvm = null;
        assertEquals(false, Paivamaara.onkoPaivaHyva(pvm, "dd.MM.yyyy"));

    }
  

    @Test
    public void onkoPaivaHyvaToimiiKunOn() throws ParseException {

        String pvm = "28.12.2014";
        assertEquals(true, Paivamaara.onkoPaivaHyva(pvm, "dd.MM.yyyy"));

    }
    @Test
    public void toimiikoLyheneeVaiPiteneeKunPitenee() throws ParseException {

        Paivamaara pvm = new Paivamaara ("20.05.2014");
        assertEquals(true, Paivamaara.lyheneeVaiPitenee(pvm));

    }
    @Test
    public void toimiikoLyheneeVaiPiteneeKunLyhenee() throws ParseException {

        Paivamaara pvm = new Paivamaara ("20.09.2014");
        assertEquals(false, Paivamaara.lyheneeVaiPitenee(pvm));

    }
    @Test
    public void toimiikoLyheneeVaiPiteneeKunKarkausVuosi() throws ParseException {

        Paivamaara pvm = new Paivamaara ("22.05.2012");
        assertEquals(true, Paivamaara.lyheneeVaiPitenee(pvm));

    }
    @Test
    public void toimiikoLyheneeVaiPiteneeTalvellaKunKarkausVuosi() throws ParseException {

        Paivamaara pvm = new Paivamaara ("22.12.2012");
        assertEquals(true, Paivamaara.lyheneeVaiPitenee(pvm));

    }
    @Test
    public void toimiikoPaiviaSeuraavaanSeisaukseenKevaalla() throws ParseException {

        Paivamaara pvm = new Paivamaara ("22.05.2013");
        assertEquals(30, pvm.getPaiviaSeuraavaanSeisaukseen());

    }
    @Test
    public void toimiikoPaiviaSeuraavaanSeisaukseenSyksylla() throws ParseException {

        Paivamaara pvm = new Paivamaara ("22.08.2012");
        assertEquals(120, pvm.getPaiviaSeuraavaanSeisaukseen());

    }
  

}
