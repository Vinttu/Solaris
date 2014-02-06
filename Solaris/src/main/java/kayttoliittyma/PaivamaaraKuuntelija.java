

package kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JTextField;
import solaris.paivamaara.Paivamaara;



public class PaivamaaraKuuntelija implements ActionListener{
    
    private JTextField paivamaaraKentta;

    public PaivamaaraKuuntelija(JTextField paivamaaraKentta) {

        this.paivamaaraKentta = paivamaaraKentta;
    }
    /**
     * Metodi palauttaa Käyttöliittymän päivämäärä-kenttään nykyisen päivämäärän
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String pvm = Calendar.getInstance().get(Calendar.DATE) + "." + Calendar.getInstance().get(Calendar.MONTH) + "." + Calendar.getInstance().get(Calendar.YEAR);
        this.paivamaaraKentta.setText(pvm);
        
    }
    
}
