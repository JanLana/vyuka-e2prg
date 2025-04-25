package cz.gyarab.e2prg.s2;

public class PuleniIntervalu {
    public static void main(String[] args) {
        double cislo = 0.0;

        double zacatek = 5;
        double konec = 100;

        for(;;) {
            double x = (zacatek + konec) / 2.0;

            double hodnotaFunkce = 0.25 * x*x*x*x*x - 2 * x*x*x*x - 3 * x*x*x + 2 * x*x + 2 * x;

            System.out.println("x=" + x + "\t(" + zacatek + "," + konec + ")");

            if (Math.abs(hodnotaFunkce - cislo) < 0.00000001) {
                System.out.println("koren funkce z = " + x + " (" + hodnotaFunkce + ")");
                break;
            } else if (hodnotaFunkce < cislo) {
                zacatek = x;
            } else {
                konec = x;
            }
        }
    }
}
