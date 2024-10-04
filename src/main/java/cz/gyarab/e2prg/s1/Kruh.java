package cz.gyarab.e2prg.s1;

public class Kruh extends Tvar {
    public double polomer;

    public Kruh(double prumer) {
        polomer = prumer / 2.0;
        tvar = "kruh";
    }

    public double spocitejPlochu() {
        return Math.PI * polomer * polomer;
    }

    public double spocitejObvod() {
        return Math.PI * 2.0 * polomer;
    }
}
