package solaris.solaris;

import static java.lang.Math.acos;
import solaris.paivamaara.Paivamaara;
import solaris.laskurit.Laskuri;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import java.util.Scanner;
import solaris.sijainti.Sijainti;

public class App {

    public static void main(String[] args) throws ParseException {

//        Scanner lukija = new Scanner(System.in);
//        System.out.println("Anna haluamasi päivämärää muodossa dd.mm.yyyy");
//        if (Paivamaara.onkoPaivamaaraHyva(lukija.nextLine()) == true){
//        Paivamaara pvm = new Paivamaara(lukija.nextLine());}
//        else System.out.println("Päivämäärä ei ollut mahdollinen.");
//        
//        System.out.println("Sijaintisi nimi?");
//        String nimi = lukija.nextLine();
////
//        double x = 666;
//        while (Sijainti.onkoHyvaX(x) == false) {
//            System.out.println("Anna X-koordinaatti  kokonaislukuna tai desimaalimuodossa väliltä -90 - 90");
//            x = lukija.nextDouble();
//        }
//
//        double y = 666;
//        while (Sijainti.onkoHyvaY(y) == false) {
//            System.out.println("Anna Y-koordinaatti kokonaislukuna tai desimaalimuodossa väliltä 0-360");
//            y = lukija.nextDouble();
//        }
//        Laskuri laskuri = new Laskuri(new Sijainti(x, y), nimi, pvm);
//        Laskuri laskuri = new Laskuri(new Sijainti(60.170833, 24.9375), "Helsinki", new Paivamaara("30.01.2014"));  //Virhe noin 30min    
//        Laskuri laskuri = new Laskuri(new Sijainti(41.895556, 12.482222), "Rooma", new Paivamaara("30.01.2014"));   // Virhe noin 15min
//        Laskuri laskuri = new Laskuri(new Sijainti(30.064722, 31.249444), "Kairo", new Paivamaara("30.01.2014"));  // Virhe noin 12min
//        Laskuri laskuri = new Laskuri(new Sijainti(13.723333, 100.476111), "Bangkok", new Paivamaara("30.01.2014"));  // Virhe noin 7min
//        double pituus = laskuri.laskePaivanPituus();
//        System.out.println(pituus);
    }

}
