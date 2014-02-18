package solaris.sijainti;

import solaris.sijainti.Sijainti;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SijaintiTest {

    public SijaintiTest() {
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
    public void konstruktoriToimiiOikein() {

        Sijainti sijainti = new Sijainti(60, "Helsinki");
        assertEquals(60, sijainti.getLeveyspiiri(), Double.MIN_NORMAL);

    }

    @Test
    public void koordinaattienVerifiointiAntaaTrueX() {

        double x = 70;
        assertEquals(true, Sijainti.onkoXHyvaLeveysasteeksi(x));
    }

    @Test
    public void koordinaattienVerifiointiAntaaFalseXLiianSuurella() {

        double x = 92;
        assertEquals(false, Sijainti.onkoXHyvaLeveysasteeksi(x));
    }

    @Test
    public void koordinaattienVerifiointiAntaaFalseXLiianPienella() {

        double x = -92;
        assertEquals(false, Sijainti.onkoXHyvaLeveysasteeksi(x));
    }

    @Test
    public void koordinaattienVerifiointiAntaaTrueXylarajalla() {

        double y = 90;
        assertEquals(true, Sijainti.onkoXHyvaLeveysasteeksi(y));
    }

    @Test
    public void koordinaattienVerifiointiAntaaTrueXalarajalla() {

        double y = -90;
        assertEquals(true, Sijainti.onkoXHyvaLeveysasteeksi(y));
    }

}
