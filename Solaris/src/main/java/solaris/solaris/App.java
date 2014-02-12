package solaris.solaris;
import java.io.IOException;
import solaris.laskurit.Laskuri;
import java.text.ParseException;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import kayttoliittyma.KayttoliittymaFrame;
import solaris.sijainti.SijaintiLista;

public class App {

    public static void main(String[] args) throws ParseException, ClassNotFoundException, IOException {

        Scanner lukija = new Scanner(System.in);
        SijaintiLista.lataaTiedostot();
        SijaintiLista sijaintilista = new SijaintiLista();
        Laskuri laskuri = new Laskuri();
        KayttoliittymaFrame kayttoliittyma = new KayttoliittymaFrame();
        kayttoliittyma.setVisible(true);
//        SwingUtilities.invokeLater(kayttoliittyma);
        // Tekstimuotoinen käyttöliittymä:
//        while (true) {
//            while (true) {
//                System.out.println("Anna haluamasi päivämärää muodossa dd.mm.yyyy tai lopeta ohjelma antamalla komento 'lopeta'");
//                luettu = lukija.nextLine();
//                if (luettu.equals("lopeta")) {
//                    return;
//                }
//
//                if (Paivamaara.onkoPaivaHyva(luettu, "dd.MM.yyyy") == true) {
//                    break;
//                }
//                if (Paivamaara.onkoPaivaHyva(luettu, "dd.MM.yyyy") == false) {
//                    System.out.println("Päivämäärä ei ollut oikeassa muodossa.");
//                }
//            }
//
//            Paivamaara pvm = new Paivamaara(luettu);
//
//            System.out.println("Sijaintisi nimi?");
//            String nimi = lukija.nextLine();
//            double x = 666;
//            Sijainti kaytettavaSijainti = null;
//            if (SijaintiLista.onkoListassaJo(nimi) == true) {
//                kaytettavaSijainti = SijaintiLista.palautaOlemassaolevaSijainti(nimi);
//            } else {
//                while (true) {
//                    System.out.println("Sijaintiasi ei ole tallennettu. Anna sijaintisi X-koordinaatti kokonaislukuna tai desimaalimuodossa väliltä [-90, 90]");
//                    String luettuX = lukija.nextLine();
//                    luettuX = luettuX.replaceAll(",", ".");
//                    x = Double.parseDouble(luettuX);
//
//                    if (Sijainti.onkoHyvaX(x) == true) {
//                        break;
//                    }
//                    if (Sijainti.onkoHyvaX(x) == false) {
//                        System.out.println("Päivämäärä ei ollut oikeassa muodossa.");
//
//                    }
//                }
//                kaytettavaSijainti = new Sijainti(x, nimi);
//            }
//
//            Laskuri laskuri = new Laskuri(kaytettavaSijainti, pvm);
//            String pituus = laskuri.laskePaivanPituus();
//
//            System.out.println(pituus);
//        }
    }
}
