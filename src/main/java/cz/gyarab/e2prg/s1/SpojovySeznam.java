package cz.gyarab.e2prg.s1;

import java.util.concurrent.ThreadLocalRandom;

public class SpojovySeznam {
    Prvek zacatek = null;
    Prvek posledni = null;

    public SpojovySeznam() {
        this.zacatek = new Prvek(0);
    }

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
            System.out.print(p.hodnota + " ");
            if (p.dalsi == null) {
                return;
            } else {
                p = p.dalsi;
            }
        }
    }

    public void vyhazejSude() {
        Prvek aktualni = zacatek;

        for(;;) {
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
        SpojovySeznam seznam = new SpojovySeznam();
        seznam.vypisSeznam();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            seznam.pridejDoSeznamu(ThreadLocalRandom.current().nextInt());
        }
        long end = System.currentTimeMillis();
        end -= start;

        seznam.vypisSeznam();

        System.out.println("------");

        seznam.vyhazejSude();

        seznam.vypisSeznam();


        //System.out.println(end + " ms");


    }
}
