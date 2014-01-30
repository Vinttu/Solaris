/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solaris.laskuri;

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

/**
 *
 * @author Johannes
 */
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
     public void KonstruktoriToimiiOikeinSijainti() throws ParseException {
     
     Laskuri laskuri = new Laskuri(new Sijainti(60, 24), "Helsinki", new Paivamaara("30.01.2014"));
     assertEquals("Helsinki", laskuri.getNimi());
     
     }
}
