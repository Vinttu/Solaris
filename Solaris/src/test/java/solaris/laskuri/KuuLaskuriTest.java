package solaris.laskuri;

import java.text.ParseException;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import solaris.laskurit.KuuLaskuri;
import solaris.paivamaara.Paivamaara;

/**
 *
 * @author Johannes
 */
public class KuuLaskuriTest {

    public KuuLaskuriTest() {
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
    public void toimiikoUusikuu() throws ParseException {
        Paivamaara pvm = new Paivamaara("04.11.2002");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("uusikuu", laskuri.kuunVaihe());
    }

    @Test
    public void toimiikoUusikuu2() throws ParseException {
        Paivamaara pvm = new Paivamaara("26.06.1976");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("uusikuu", laskuri.kuunVaihe());
    }

    @Test
    public void toimiikoKasvavaKuunsirppi() throws ParseException {
        Paivamaara pvm = new Paivamaara("17.04.1999");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("kasvava kuunsirppi", laskuri.kuunVaihe());

    }

    @Test
    public void toimiikoKasvavaKuunsirppi2() throws ParseException {
        Paivamaara pvm = new Paivamaara("13.04.2013");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("kasvava kuunsirppi", laskuri.kuunVaihe());
    }

    @Test
    public void toimiikoPuolikuu() throws ParseException {
        Paivamaara pvm = new Paivamaara("13.05.2012");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("puolikuu", laskuri.kuunVaihe());

    }

    @Test
    public void toimiikoPuolikuu2() throws ParseException {
        Paivamaara pvm = new Paivamaara("07.12.1997");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("puolikuu", laskuri.kuunVaihe());

    }

    @Test
    public void toimiikoTaysikuu() throws ParseException {
        Paivamaara pvm = new Paivamaara("29.10.2012");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("täysikuu", laskuri.kuunVaihe());

    }

    @Test
    public void toimiikoTaysikuu2() throws ParseException {
        Paivamaara pvm = new Paivamaara("22.03.1989");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("täysikuu", laskuri.kuunVaihe());

    }
    @Test
    public void toimiikoVahenevaTaysikuu() throws ParseException {
        Paivamaara pvm = new Paivamaara("7.10.2009");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("vähenevä täysikuu", laskuri.kuunVaihe());

    }
    @Test
    public void toimiikoVahenevaTaysikuu2() throws ParseException {
        Paivamaara pvm = new Paivamaara("27.02.2016");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("vähenevä täysikuu", laskuri.kuunVaihe());

    }
    @Test
    public void toimiikoVahenevaPuolikuu() throws ParseException {
        Paivamaara pvm = new Paivamaara("19.06.2017");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("vähenevä puolikuu", laskuri.kuunVaihe());

    }
    @Test
    public void toimiikoVahenevaPuolikuu2() throws ParseException {
        Paivamaara pvm = new Paivamaara("14.10.2009");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("vähenevä puolikuu", laskuri.kuunVaihe());

    }
    @Test
    public void toimiikoPuolikuu3() throws ParseException {
        Paivamaara pvm = new Paivamaara("24.03.2014");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("puolikuu", laskuri.kuunVaihe());

    }
    @Test
    public void toimiikoPuolikuu4() throws ParseException {
        Paivamaara pvm = new Paivamaara("9.9.2020");
        KuuLaskuri laskuri = new KuuLaskuri(pvm);
        assertEquals("puolikuu", laskuri.kuunVaihe());

    }



}
