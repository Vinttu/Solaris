package solaris.solaris;
import java.io.IOException;
import java.text.ParseException;
import kayttoliittyma.KayttoliittymaFrame;
import solaris.sijainti.SijaintiLista;

public class App {

    public static void main(String[] args) throws ParseException, ClassNotFoundException, IOException {

        SijaintiLista.lataaTiedostot();
        KayttoliittymaFrame kayttoliittyma = new KayttoliittymaFrame();
        kayttoliittyma.setVisible(true);

    }
}
