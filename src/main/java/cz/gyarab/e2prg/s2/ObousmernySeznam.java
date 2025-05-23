package cz.gyarab.e2prg.s2;

import com.fasterxml.jackson.core.JsonToken;

public class ObousmernySeznam {
    ObousmernaPolozka prvniPolozka = null;
    ObousmernaPolozka posledniPolozka = null;

    public void pridejPolozku(int x) {
        ObousmernaPolozka nova = new ObousmernaPolozka(x, null, null);

        if (prvniPolozka == null) {
            prvniPolozka = nova;
            posledniPolozka = nova;
        } else {
            //PolozkaSeznamu posledni = najdiPosledni();
            posledniPolozka.dalsi = nova;
            nova.predchozi = posledniPolozka;

            posledniPolozka = nova;
        }
    }

    public void vypis() {
        for(ObousmernaPolozka o = prvniPolozka; o != null; o = o.dalsi) {
            System.out.print(o.hodnota + " ");
        }
        System.out.println();
        for(ObousmernaPolozka o = posledniPolozka; o != null; o = o.predchozi) {
            System.out.print(o.hodnota + " ");
        }
        System.out.println();


    }

    public void vyhodSuda() {
        ObousmernaPolozka aktualni = prvniPolozka;

        while(aktualni != null) {
            if (aktualni.hodnota % 2 == 0) {
                ObousmernaPolozka pred = aktualni.predchozi;
                ObousmernaPolozka za = aktualni.dalsi;

                pred.dalsi = za;
                za.predchozi = pred;
            }
            aktualni = aktualni.dalsi;
        }
    }

    public static void main(String[] args) {
        ObousmernySeznam s = new ObousmernySeznam();

        s.pridejPolozku(2);
        s.pridejPolozku(13);
        s.pridejPolozku(10);
            s.pridejPolozku(11);
            s.pridejPolozku(8);
        s.pridejPolozku(7);

        s.vypis();
            System.out.println("vyhod suda");
        s.vyhodSuda();
        s.vypis();
    }
}

