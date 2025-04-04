package cz.gyarab.e2prg.s1;

public class PuleniIntervalu {
    public static double mujPolynom(double x) {
        return .25 * x*x*x*x*x - 2* x*x*x*x - 3 * x*x*x + 2 * x * x + 2 * x;
    }

    public static void main(String[] args) {
        System.out.println(mujPolynom(0.5));
        double start = 8.0;
        double end = 10.0;

        for (; ; ) {
            double mez = (end + start) / 2;

            System.out.println("Interval:\t" + mez + "\t("+ start + "\t,\t" + end + ")");

            double hodnotaFunkce = mujPolynom(mez);

            if (Math.abs(hodnotaFunkce) < 0.000000001 ) {
                System.out.println("koren polynomu = " + mez + " (" + hodnotaFunkce + ")");
                break;
            } else if (hodnotaFunkce < 0) {
                start = mez;
            } else {
                end = mez;
            }
        }
    }
}
