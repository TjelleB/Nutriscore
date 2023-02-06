package schule.nutriscore;

public abstract class Nahrung {
    public int energie;
    public double zucker;
    public double gesaettigte_fette;
    public double salz;
    public double natrium;
    public double eiweis;
    public double ballast;
    public double gemuese;

    public Nahrung(int energie, double zucker, double gesaettigte_fette, double salz, double natrium, double eiweis, double ballast, double gemuese) {

    }

    public abstract String calculateNutriscore();
}
