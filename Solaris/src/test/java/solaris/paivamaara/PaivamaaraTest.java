

package solaris.paivamaara;

import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PaivamaaraTest {
    
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
    public void konstruktoriToimiiOikein() throws ParseException {

        Paivamaara pvm = new Paivamaara("12.04.1991");
        assertEquals("Antamasi päivä on: 12.04.1991", pvm.toGMTString());

    }
   
}
