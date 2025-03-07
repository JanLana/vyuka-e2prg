package cz.gyarab.e2prg.s1;

public class PrictiJedanKeVsemu extends Thread {
    VelkePole p;

    public PrictiJedanKeVsemu(VelkePole p) {
        this.p = p;
    }

    public void run() {
        for(int i = 0; i < p.delkaPole(); i++) {
            p.prictiJenda(i);
        }
    }
}
