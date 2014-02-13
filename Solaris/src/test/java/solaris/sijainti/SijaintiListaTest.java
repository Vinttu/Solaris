package solaris.sijainti;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SijaintiListaTest {

    public SijaintiListaTest() {
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
    public void lisaaToimiiOikein() throws IOException {
        Sijainti sijainti = new Sijainti(60, "Helsinki");
        SijaintiLista.lisaa(sijainti);
        assertEquals(true, SijaintiLista.onkoListassaJo("Helsinki"));

    }

    @Test
    public void palauttaaOlemassaolevanSijainninOikein() throws IOException {

        Sijainti sijainti = new Sijainti(60, "Helsinki");
        Sijainti sijainti2 = new Sijainti(70, "Kerava");
        Sijainti sijainti3 = new Sijainti(66.6, "Turku");
        SijaintiLista.lisaa(sijainti);
        SijaintiLista.lisaa(sijainti2);
        SijaintiLista.lisaa(sijainti3);
        assertEquals(sijainti3, SijaintiLista.palautaOlemassaolevaSijainti("Turku"));

    }

    @Test
    public void palauttaaNullJosSijaintiaEiVielaListassa() throws IOException {

        Sijainti sijainti = new Sijainti(60, "Helsinki");
        SijaintiLista.lisaa(sijainti);
        assertEquals(null, SijaintiLista.palautaOlemassaolevaSijainti("Oulu"));

    }

    @Test
    public void tallettaaJaLukeeOikeinTiedostosta() throws IOException {
        FileReader Flukija = new FileReader("sijaintilista.txt");
        BufferedReader lukija = new BufferedReader(Flukija);
        Sijainti sijainti = new Sijainti(60.1, "Helsinki");
        SijaintiLista.lisaa(sijainti);

        String rivi = lukija.readLine();
        while (rivi != null) {
            if (rivi.contains("Helsinki")) {
                assertEquals(true, rivi.contains("Helsinki"));
            } rivi = lukija.readLine();
        }
        
    }

    @Test
    public void poistaaArrayLististaArvon() throws IOException {

        Sijainti tornio = new Sijainti(60, "Tornio");
        SijaintiLista.lisaa(tornio);
        SijaintiLista.poista(tornio);
        assertEquals(false, SijaintiLista.onkoListassaJo("Tornio"));

    }
    @Test
    public void toimiikoLataaTiedostot() throws IOException, FileNotFoundException, ClassNotFoundException {

        SijaintiLista.lataaTiedostot();
        assertEquals(true, SijaintiLista.onkoListassaJo("Hollola"));

    }
 

}
