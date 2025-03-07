package cz.gyarab.e2prg.s2;

public class Zvetsovac extends Thread {
    private VelkePole p;

    public Zvetsovac(VelkePole p) {
        this.p = p;
    }

    public void run() {
        for(int i = 0; i < p.delkaPole(); i++) {
            p.prictiJedna(i);
        }
    }
}
