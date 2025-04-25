package cz.gyarab.e2prg.s2;

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
        PolozkaSeznamu polozka = prvniPolozka;

        for(;;) {
            System.out.println(polozka.hodnota);
            if (polozka.dalsi == null) {
                return;
            } else {
                polozka = polozka.dalsi;
            }
        }
    }

    public static void main(String[] args) {
        SpojovySeznam s = new SpojovySeznam();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            s.pridejPolozku(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("bezel: " + (end-start) + " ms");

        //s.vypis();

    }
}
