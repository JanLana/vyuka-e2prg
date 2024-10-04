package cz.gyarab.e2prg.s2;

public class Ctverec extends Tvar {
    public double delkaHrany;

    public Ctverec(double delkaHrany) {
        this.delkaHrany = delkaHrany;
    }

    public double spocitejPlochu() {
        return delkaHrany * delkaHrany;
    }
    public double spocitejObvod() {
        return delkaHrany * 4.0;
    }
}
