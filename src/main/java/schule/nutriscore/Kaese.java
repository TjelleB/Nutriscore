package schule.nutriscore;

public class Kaese extends Nahrung{
    public Kaese(int energie, double zucker, double gesaettigte_fette, double salz, double natrium, double eiweis, double ballast, double gemuese) {
        super(energie,zucker,gesaettigte_fette,salz,natrium,eiweis,ballast,gemuese);
    }
    @Override
    public String calculateNutriscore() {
        return null;
    }
}
