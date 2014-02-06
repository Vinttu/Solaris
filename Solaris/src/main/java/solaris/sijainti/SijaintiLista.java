package solaris.sijainti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SijaintiLista {
/**
 * ArrayList, johon kaikki Sijainti-oliot talletetaan.
 */
    private static ArrayList<Sijainti> paikat = new ArrayList<>();

    /**
     * Metodi lisää annetun Sijainti-olion Arraylistiin nimeltä paikat ja kutsuu
     * metodia tallennaTiedostoon annetulla oliolla.
     *
     * @param lisattava Annettu Sijainti-olio
     * @throws IOException
     */
    public static void lisaa(Sijainti lisattava) throws IOException {
        paikat.add(lisattava);
        tallennaTiedostoon(lisattava);

    }

    /**
     * Metodi palauttaa Sijainti-olion, jonka nimi on sama kuin parametrina
     * annettu teksti.
     *
     * @param nimi String-muodossa oleva haluttu nimi.
     * @return Sijainti-olio, jonka nimi-attribuutti vastaa parametrina annettua
     * tekstiä. Palauttaa null, jos oliota ei löydy.
     */
    public static Sijainti palautaOlemassaolevaSijainti(String nimi) {
        for (int i = 0; i < paikat.size(); i++) {
            if (paikat.get(i).getNimi().equals(nimi)) {
                return paikat.get(i);
            }
        }
        return null;
    }

    /**
     * Metodi tallentaa tiedostoon sijaintilista.txt annetun Sijainti-olion
     * nimi- ja leveysaste -attribuutit, ellei nimi -attribuuttia ole jo
     * tiedostossa.
     *
     * @param sijainti Tallennettavaksi annettu Sijainti-olio
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void tallennaTiedostoon(Sijainti sijainti) throws FileNotFoundException, IOException {
        FileWriter Fkirjoittaja = new FileWriter("sijaintilista.txt", true);
        BufferedWriter kirjoittaja = new BufferedWriter(Fkirjoittaja);
        FileReader Flukija = new FileReader("sijaintilista.txt");
        BufferedReader lukija = new BufferedReader(Flukija);

        String rivi = lukija.readLine();
        while (rivi != null) {

            if (rivi.contains(sijainti.getNimi()) || rivi == null) {
                return;
            }
            rivi = lukija.readLine();
        }
        kirjoittaja.write(sijainti.getNimi() + " " + sijainti.getLeveyspiiri() + System.getProperty("line.separator"));
        kirjoittaja.close();
    }

    /**
     * Metodi lukee sijaintilista.txt -tiedoston ja lisää kaikki sieltä löytyvät
     * paikannimet ja leveysasteet ArrayListiin nimeltä paikat
     *
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void lataaTiedostot() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileReader Flukija = new FileReader("sijaintilista.txt");
        BufferedReader lukija = new BufferedReader(Flukija);

        String rivi = lukija.readLine();
        while (rivi != null) {
            String valilyonti = " ";
            String[] sanat = rivi.split(valilyonti);
            double leveyspiiri = Double.parseDouble(sanat[1]);
            paikat.add(new Sijainti(leveyspiiri, sanat[0]));
            rivi = lukija.readLine();
        }
    }

    /**
     * Metodi poistaa ArrayListista paikat annetun Sijainnin
     *
     * @param poistettava Listalta poistettavaksi haluttu Sijainti-olio
     */
    public static void poista(Sijainti poistettava) {
        paikat.remove(poistettava);
    }

    public static ArrayList<Sijainti> getLista() {
        return paikat;
    }

    /**
     * Metodi tarkistaa onko ArrayListissa paikat annettu String-merkkijono
     * jonkun olion nimi-attribuuttina.
     *
     * @param nimi Annettu merkkijono halutusta nimestä
     * @return Totuusarvo onko merkkijono jonkun olion nimi-attribuutti.
     */
    public static boolean onkoListassaJo(String nimi) {
        for (int i = 0; i < paikat.size(); i++) {
            if (paikat.get(i).getNimi().equals(nimi)) {
                return true;
            }
        }
        return false;
    }

}
