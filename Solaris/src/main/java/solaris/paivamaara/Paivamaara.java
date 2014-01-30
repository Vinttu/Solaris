package solaris.paivamaara;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Paivamaara {

    private Calendar paivamaara;
    DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public Paivamaara(String pvm) throws ParseException {

        this.paivamaara = paivamaara.getInstance();
        this.paivamaara.setTime(df.parse(pvm));

    }

    public Calendar getPaiva() {

        return this.paivamaara;

    }

    public double getPaiviaTalvipaivanSeisauksesta() {
        int monesPaivaVuodesta = this.paivamaara.get(Calendar.DAY_OF_YEAR);
        double paivia = 365 - (356 - monesPaivaVuodesta);
        if (monesPaivaVuodesta > 356) {
            paivia = monesPaivaVuodesta - 356;
        }
        return paivia;

    }

//    public static boolean onkoPaivamaaraHyva(String pvm) {
//        
//        return true;
//    }

    public String toString() {

        return this.paivamaara.get(Calendar.DATE)+ "." + (this.paivamaara.get(Calendar.MONTH)+1) + "." + this.paivamaara.get(Calendar.YEAR);
    }
}
