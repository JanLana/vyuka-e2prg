package cz.gyarab.e2prg.s2;

public class Zverinec {
    public static void main(String[] args) {
        Zvire[] z = new Zvire[3];
        z[0] = new Zvire();
        z[1] = new Pes();
        z[2] = new Klokan();

        for (int i = 0; i < 3; i++) {
            z[i].vypisSe();
        }



        // Dela zvuk: Hax
    }
}
