package solaris.sijainti;

import java.math.BigDecimal;

public class Sijainti {

    

    private BigDecimal leveyspiiri;
    private BigDecimal pituuspiiri;

    public Sijainti(double leveyspiiri, double pituuspiiri) {

        this.leveyspiiri = new BigDecimal(leveyspiiri);
        this.pituuspiiri = new BigDecimal(pituuspiiri);

    }

    public BigDecimal getLeveyspiiri() {
        return this.leveyspiiri;
    }

    public BigDecimal getPituuspiiri() {
        return this.pituuspiiri;
    }

    public static boolean onkoHyvaX(double x) {

        if (x >= -90 && x <= 90) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean onkoHyvaY(double y) {
        if (y >= 0 && y <= 360) {
            return true;
        } else {
            return false;
        }
    }

    public String toPlainString() {
        return this.leveyspiiri.toString() + " " + this.pituuspiiri.toString();
    }

}
