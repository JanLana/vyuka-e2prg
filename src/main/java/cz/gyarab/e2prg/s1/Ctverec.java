package cz.gyarab.e2prg.s1;

public class Ctverec extends Tvar {
    public double delkaHrany;
    //public String tvar = "Ctverec";

    public Ctverec(double x) {
        tvar = "ctverec";
        if (x <= 0) {
            System.out.println("Spatny rozemer !!!!!!!!!!!!!!!!!!!");
            delkaHrany = 0.0;
        } else {
            delkaHrany = x;
        }
    }

    public double spocitejPlochu() {
        return delkaHrany * delkaHrany;
    }

    public double spocitejObvod() {
        return 4.0 * delkaHrany;
    }
}
