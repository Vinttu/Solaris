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
        assertEquals("60 70", sijainti.toPlainString());

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
    public void koordinaattienVerifiointiAntaaFalseX() {

        double x = 92;
        assertEquals(false, Sijainti.onkoHyvaX(x));
    }

    @Test
    public void koordinaattienVerifiointiAntaaFalseY() {

        double y = -30;
        assertEquals(false, Sijainti.onkoHyvaY(y));
    }

    @Test
    public void getLeveyspiiriToimii() {

        Sijainti sijainti = new Sijainti(60, 70);
        assertEquals("60", sijainti.getLeveyspiiri().toString());
    }

    @Test
    public void getPituuspiiriToimii() {

        Sijainti sijainti = new Sijainti(60, 70);
        assertEquals("70", sijainti.getPituuspiiri().toString());
    }

}
