package cz.gyarab.e2prg.s2;

public class Zverinec {
    public static void main(String[] args) {
        ZvireOld[] z = new ZvireOld[3];
        z[0] = new ZvireOld();
        z[1] = new Pes();
        z[2] = new Klokan();

        for (int i = 0; i < 3; i++) {
            z[i].vypisSe();
        }



        // Dela zvuk: Hax
    }
}
