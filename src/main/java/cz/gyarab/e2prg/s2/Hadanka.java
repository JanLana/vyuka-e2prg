package cz.gyarab.e2prg.s2;

public class Hadanka {
    public static void main(String[] args) {
        for (int d = 0; d < 10; d++) {
            for (int e = 0; e < 10; e++) {
                for (int y = 0; y < 10; y++) {
                    if (d + e == y) {
                        System.out.println("d:" + d + " e:" + e + " y:" + y);
                    }
                }
            }

        }
    }
}
