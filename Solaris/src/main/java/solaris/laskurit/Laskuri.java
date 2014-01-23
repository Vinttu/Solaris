

package solaris.laskurit;

import solaris.paivamaara.Paivamaara;
import solaris.sijainti.Sijainti;
import java.math.BigDecimal;



public class Laskuri {
    private Sijainti sijainti;
    private String nimi;
    private Paivamaara paivamaara;

    public Laskuri(Sijainti sijainti, String nimi, Paivamaara pvm) {
        
        this.sijainti = sijainti;
        this.nimi = nimi;
        this.paivamaara = pvm;
        
    }
    
    public double laskePaivanPituus(){
          
        return 0;
}
    
    
    public String toString(){
    return "Sijainti: " + this.sijainti + "\n" + "Paikka: " + this.nimi;
    
    }
    
    
    
}
