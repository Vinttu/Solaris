package solaris.laskuri;

import java.io.IOException;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import solaris.laskurit.Laskuri;
import solaris.paivamaara.Paivamaara;
import solaris.sijainti.Sijainti;

public class LaskuriTest {

    public LaskuriTest() {
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
    public void KonstruktoriToimiiOikeinSijainti() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(60, "Helsinki");
        Paivamaara paivamaara = new Paivamaara("30.01.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("Helsinki, 30.1.2014", laskuri.toString());

    }

    @Test
    public void paivanPituudenLaskuToimiiOikeinHelsingissä() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(60.170833, "Helsinki");
        Paivamaara paivamaara = new Paivamaara("06.02.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("8h 21min 42s", laskuri.laskePaivanPituus());

    }

    @Test
    public void paivanPituudenLaskuToimiiOikeinPariisissa() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(48.856667, "Pariisi");
        Paivamaara paivamaara = new Paivamaara("06.02.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("9h 41min 22s", laskuri.laskePaivanPituus());

    }
    @Test
    public void paivanPituudenLaskuToimiiOikeinKairossa() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(30.064722, "Kairo");
        Paivamaara paivamaara = new Paivamaara("06.02.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("10h 53min 23s", laskuri.laskePaivanPituus());

    }
    @Test
    public void paivanPituudenLaskuToimiiOikeinBangkokissa() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(13.723333, "Bangkok");
        Paivamaara paivamaara = new Paivamaara("07.02.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("11h 36min 20s", laskuri.laskePaivanPituus());

    }
    @Test
    public void paivanPituudenLaskuToimiiOikeinHelsingissäKesällä() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(60.170833, "Helsinki");
        Paivamaara paivamaara = new Paivamaara("06.07.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("18h 31min 33s", laskuri.laskePaivanPituus());

    }

    @Test
    public void paivanPituudenLaskuToimiiOikeinPariisissaKesällä() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(48.856667, "Pariisi");
        Paivamaara paivamaara = new Paivamaara("06.07.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("15h 58min 57s", laskuri.laskePaivanPituus());

    }
    @Test
    public void paivanPituudenLaskuToimiiOikeinKairossaKesällä() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(30.064722, "Kairo");
        Paivamaara paivamaara = new Paivamaara("06.07.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("13h 59min 34s", laskuri.laskePaivanPituus());

    }
    @Test
    public void paivanPituudenLaskuToimiiOikeinBangkokissaKesällä() throws ParseException, IOException {
        Sijainti sijainti = new Sijainti(13.723333, "Bangkok");
        Paivamaara paivamaara = new Paivamaara("07.07.2014");
        Laskuri laskuri = new Laskuri(sijainti, paivamaara);
        assertEquals("12h 53min 37s", laskuri.laskePaivanPituus());

    }

}
