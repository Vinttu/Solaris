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

        SijaintiLista.lataaTiedostot();
        KayttoliittymaFrame kayttoliittyma = new KayttoliittymaFrame();
        kayttoliittyma.setVisible(true);

    }
}
