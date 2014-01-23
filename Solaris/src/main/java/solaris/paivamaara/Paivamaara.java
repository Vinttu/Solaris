package solaris.paivamaara;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Paivamaara {

    private Date paivamaara;
    DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public Paivamaara(String paivamaara) throws ParseException {

        this.paivamaara = df.parse(paivamaara);
    }

    public Date getPaiva() {

        return this.paivamaara;

    }

    public void setPaiva(String paiva) throws ParseException {

        this.paivamaara = df.parse(paiva);

    }

    public String toGMTString(){
    
    return "Antamasi päivä on: " + this.paivamaara.toGMTString();
    }
}
