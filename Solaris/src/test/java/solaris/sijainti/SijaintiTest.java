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

        Sijainti sijainti = new Sijainti(60, 70);
        assertEquals(60, sijainti.getLeveyspiiri().intValue());
        assertEquals(70, sijainti.getPituuspiiri().intValue());

    }
    @Test
    public void toSTringToimiiOikein() {

        Sijainti sijainti = new Sijainti(60, 70);
        assertEquals("60 70", sijainti.toString());

    }

    @Test
    public void koordinaattienVerifiointiAntaaTrueX() {

        double x = 70;
        assertEquals(true, Sijainti.onkoHyvaX(x));
    }

    @Test
    public void koordinaattienVerifiointiAntaaTrueY() {

        double y = 70;
        assertEquals(true, Sijainti.onkoHyvaX(y));
    }

    @Test
    public void koordinaattienVerifiointiAntaaFalseXLiianSuurella() {

        double x = 92;
        assertEquals(false, Sijainti.onkoHyvaX(x));
    }
    @Test
    public void koordinaattienVerifiointiAntaaFalseXLiianPienella() {

        double x = -92;
        assertEquals(false, Sijainti.onkoHyvaX(x));
    }

    @Test
    public void koordinaattienVerifiointiAntaaFalseYLiianPienella() {

        double y = -30;
        assertEquals(false, Sijainti.onkoHyvaY(y));
    }
    @Test
    public void koordinaattienVerifiointiAntaaFalseYLiianIsolla() {

        double y = 380;
        assertEquals(false, Sijainti.onkoHyvaY(y));
    }
    @Test
    public void koordinaattienVerifiointiAntaaTrueYylarajalla() {

        double y = 360;
        assertEquals(true, Sijainti.onkoHyvaY(y));
    }
    @Test
    public void koordinaattienVerifiointiAntaaTrueYalarajalla() {

        double y = 0;
        assertEquals(true, Sijainti.onkoHyvaY(y));
    }
    @Test
    public void koordinaattienVerifiointiAntaaTrueXylarajalla() {

        double y = 90;
        assertEquals(true, Sijainti.onkoHyvaX(y));
    }
    @Test
    public void koordinaattienVerifiointiAntaaTrueXalarajalla() {

        double y = -90;
        assertEquals(true, Sijainti.onkoHyvaX(y));
    }


}
