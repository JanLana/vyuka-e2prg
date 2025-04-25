package cz.gyarab.e2prg.s1;

public class SpojovySeznam {
    Prvek zacatek = null;
    Prvek posledni = null;

    public Prvek najdiPosledniPrvek() {
        Prvek p = zacatek;
        for(;;) {
            if (p.dalsi == null) {
                return p;
            } else {
                p = p.dalsi;
            }
        }
        //Prvek p;
        //for (p = zacatek; p.dalsi != null; p = p.dalsi) {};
        //return p;

    }

    public void pridejDoSeznamu(int x) {
        Prvek novy = new Prvek(x, null);
        if (zacatek == null) {
            zacatek = novy;
            posledni = novy;
        } else {
            //Prvek posledni = najdiPosledniPrvek();
            posledni.dalsi = novy;
            posledni = novy;
        }
    }

    public void vypisSeznam() {
        Prvek p = zacatek;
        for(;;) {
            System.out.println(p.hodnota);
            if (p.dalsi == null) {
                return;
            } else {
                p = p.dalsi;
            }
        }
    }

    public static void main(String[] args) {
        SpojovySeznam seznam = new SpojovySeznam();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            seznam.pridejDoSeznamu(i);
        }
        long end = System.currentTimeMillis();
        end -= start;

        System.out.println(end + " ms");


        //seznam.vypisSeznam();
    }
}
