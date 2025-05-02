package cz.gyarab.e2prg.s2;

import java.util.concurrent.ThreadLocalRandom;

public class SpojovySeznam {
    PolozkaSeznamu prvniPolozka = null;
    PolozkaSeznamu posledniPolozka = null;

    public void pridejPolozku(int x) {
        PolozkaSeznamu nova = new PolozkaSeznamu(x, null);

        if (prvniPolozka == null) {
            prvniPolozka = nova;
            posledniPolozka = nova;
        } else {
            //PolozkaSeznamu posledni = najdiPosledni();
            posledniPolozka.dalsi = nova;
            posledniPolozka = nova;
        }
    }

    public PolozkaSeznamu najdiPosledni() {
        PolozkaSeznamu posledni = prvniPolozka;

        for(;;) {
            if (posledni.dalsi == null) {
                return posledni;
            } else {
                posledni = posledni.dalsi;
            }
        }
    }

    public void vypis() {
        if (prvniPolozka == null) {
            return;
        }

        PolozkaSeznamu polozka = prvniPolozka;

        for(;;) {
            System.out.print(polozka.hodnota + " ");
            if (polozka.dalsi == null) {
                System.out.println();
                return;
            } else {
                polozka = polozka.dalsi;
            }
        }

    }

    public void vyhodSuda() {
        if (prvniPolozka == null)
            return;

        while(prvniPolozka.hodnota % 2 == 0) {
            prvniPolozka = prvniPolozka.dalsi;
        }

        PolozkaSeznamu aktualni = prvniPolozka;

        while(true) {
            if (aktualni.dalsi.hodnota % 2 == 0) {
                aktualni.dalsi = aktualni.dalsi.dalsi;
            } else {
                aktualni = aktualni.dalsi;
            }
            if (aktualni.dalsi == null) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        SpojovySeznam s = new SpojovySeznam();

        long start = System.currentTimeMillis();

//        for (int i = 0; i < 10; i++) {
//            s.pridejPolozku(ThreadLocalRandom.current().nextInt(1000));
//        }

        s.vypis();
        s.vyhodSuda();
        s.vypis();


        long end = System.currentTimeMillis();

        //System.out.println("bezel: " + (end-start) + " ms");



    }
}
