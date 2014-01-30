package solaris.laskurit;

import static java.lang.Math.acos;
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
    
    public String getNimi(){
    
    return this.nimi;
    }
   

    // Taistelen tämän metodin kanssa tosissaan enkä oikein voi tehdä mitään muuta ennen kuin saan tämän toimimaan. Toimii tällä hetkellä siinä mielessä, 
    // että talvipäivänseisaus on lyhin päivä ja kesäpäivänseisaus on pisin päivä. Heittää kuitenkin oikeista arvoisa n. puolisen tuntia jostain ihmeen syystä.
    // Kaava löytyy täältä. http://www.gandraxa.com/length_of_day.xml Tällä hetkellä virhe kasvaa poistuessa päiväntasaajalta. Jatkan asian selvittämistä.
    
    public double laskePaivanPituus() { 
        double leveyspiiri = Math.toRadians(this.sijainti.getLeveyspiiri().intValue());
        double paiviaSeisauksesta = this.paivamaara.getPaiviaTalvipaivanSeisauksesta();

        double a = (90 - Math.cos(Math.PI * paiviaSeisauksesta / 182.625) * 23.439);
        double m = 1 + (Math.tan(-leveyspiiri) * Math.cos(Math.toRadians(a)) / Math.sin(Math.toRadians(a)));
//        System.out.println("m: " + m);

        double b = Math.toDegrees(Math.acos((1 - m)));
        double c = (b / 180) * 24;
//        lisaaHamaraMukaan(c);
//        c = muutaDesimaaleistaPois(c);
        return c;

    }

//    public double laskePaivanPituus3() { // Lyhyemmin sanottuna sama, mutta ei toimi
//
//        double leveyspiiri = Math.toRadians(this.sijainti.getLeveyspiiri().intValue());
//        double paiviaSeisauksesta = this.paivamaara.getPaiviaTalvipaivanSeisauksesta();
//
//        double m = 1 - (Math.tan(leveyspiiri)) * (Math.tan((23.349 * Math.cos(0.0172 * paiviaSeisauksesta))));
//        System.out.println("m: " + m);
//        double b = (Math.toDegrees(acos(1 - m))) / 180;
//        System.out.println("päivän pituus: " + b * 24);
//
//        return 0;
//    }

//    public double laskePaivanPituus2() { // Pidemmin sanottuna sama, mutta ei toimi
//
//        double leveyspiiri = this.sijainti.getLeveyspiiri().intValue();
//        double paiviaSeisauksesta = this.paivamaara.getPaiviaTalvipaivanSeisauksesta();
//
//        double z = 90 - leveyspiiri - Math.cos(Math.toRadians(Math.PI * (paiviaSeisauksesta / 182.625))) * 23.439;
//        System.out.println("z: " + z);
//        double c = -leveyspiiri;
//        System.out.println("c: " + c);
//        double a = z - c;
//        System.out.println("a: " + a);
//        double d = 1 / Math.sin(Math.toRadians(a));
//        System.out.println("d: " + d);
//        double t = Math.cos(Math.toRadians(a)) * d;
//        System.out.println("t: " + t);
//        double m = 1 + Math.tan(Math.toRadians(c)) * t;
//        System.out.println("m: " + m);
//        double f = Math.toDegrees(Math.acos(1 - m));
//        System.out.println("f: " + f);
//        double b = f / 180;
//        System.out.println("b: " + b);
//        b = b * 24;
//
//        return b;
//    }
//    private double lisaaHamaraMukaan(double m, double leveyspiiri, double paiviaSeisauksesta) {   // Tätä turha testata ennen kuin paivanpituus-metodi on 100% kunnossa.
//
//        double t = 6;
//        double h = Math.tan(Math.toRadians(t));
////        System.out.println("h: "+ h);
//        double v = leveyspiiri;
////        System.out.println("v:" + v);
//        double h2 = Math.cos(Math.toRadians(v));
////        double h2 = 0.210208470532;
////        System.out.println("h2: "+h2);
//        double i = (h / h2);
////        System.out.println("i: " + i);
//        double n = m + i;
////        System.out.println("n: "+n);
//        double b2e = Math.toDegrees(acos((1 - n))) / 180;
////        System.out.println("b2e: " +b2e );
//        double yhteensa = b2e;
//
//        return yhteensa;
//
//    }
    public String toString() {
        return " ";

    }

}
