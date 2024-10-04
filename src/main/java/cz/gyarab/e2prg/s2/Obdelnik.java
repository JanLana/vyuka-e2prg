package cz.gyarab.e2prg.s2;

public class Obdelnik extends Tvar {
    public double sirka;
    public double vyska;

    public Obdelnik(double sirka, double vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    @Override
    public double spocitejObvod() {
        return 2 * (sirka + vyska);
    }

    @Override
    public double spocitejPlochu() {
        return sirka * vyska;
    }
}
