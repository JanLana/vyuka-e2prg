package cz.gyarab.e2prg.s2;

public class Bezec extends Thread {
    double minutNaKm;

    public Bezec(String name, double minutNaKm) {
        super(name);
        this.minutNaKm = minutNaKm;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bezec " + getName() + " je na " + i + "km");
        }

    }
}
