

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
    public void toStringToimii() throws ParseException {

        Paivamaara pvm = new Paivamaara("22.06.2014");
        assertEquals("22.6.2014", pvm.toString());

    }
    
   
}
