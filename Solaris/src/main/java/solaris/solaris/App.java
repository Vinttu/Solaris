package solaris.solaris;

import Paivamaara.Paivamaara;
import Laskurit.Laskuri;
import Sijainti.Sijainti;
import Sijainti.SijaintiLista;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna haluamasi päivämärää muodossa dd.mm.yyyy");
        Paivamaara pvm = new Paivamaara(lukija.nextLine());
        System.out.println("Sijaintisi nimi?");
        String nimi = lukija.nextLine();

        double x = 666;
        while (Sijainti.onkoHyvaX(x) == false) {
            System.out.println("Anna X-koordinaatti  kokonaislukuna tai desimaalimuodossa väliltä -90 - 90");
            x = lukija.nextDouble();
        }

        double y = 666;
        while (Sijainti.onkoHyvaY(y) == false) {
            System.out.println("Anna Y-koordinaatti kokonaislukuna tai desimaalimuodossa väliltä 0-360");
            y = lukija.nextDouble();
        }
        Laskuri laskuri = new Laskuri(new Sijainti(x, y), nimi, pvm);

    }

}
