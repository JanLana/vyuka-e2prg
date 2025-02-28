package cz.gyarab.e2prg.s1;

public class Bezec extends Thread {
    private double minutNaKm;

    public Bezec(String name, double minutNaKm) {
        super(name);
        this.minutNaKm = minutNaKm;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Bezec " + getName() + " je na " + i);
            System.out.printf("Bezec %s je na %i", getName(), i);
            try {
                Thread.sleep((long)(minutNaKm * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
