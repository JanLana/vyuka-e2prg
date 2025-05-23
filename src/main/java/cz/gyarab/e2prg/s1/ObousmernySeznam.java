package cz.gyarab.e2prg.s1;

public class ObousmernySeznam {
    ObousmernyPrvek zacatek = null;
    ObousmernyPrvek posledni = null;

    public void pridejDoSeznamu(int x) {
        ObousmernyPrvek novy = new ObousmernyPrvek(x, null, null);
        if (zacatek == null) {
            zacatek = novy;
            posledni = novy;
        } else {
            posledni.dalsi = novy;
            novy.predchozi = posledni;
            posledni = novy;
        }
    }

    public void vypisSeznam() {
        /*ObousmernyPrvek p;
        for(;;) {
            System.out.print(p.hodnota + " ");
            if (p.dalsi == null) {
                break;
            } else {
                p = p.dalsi;
            }
        }*/
        for(ObousmernyPrvek p = zacatek; p != null; p = p.dalsi) {
            System.out.print(p.hodnota + " ");
        }
        System.out.println();
        for(ObousmernyPrvek p = posledni; p != null; p = p.predchozi) {
            System.out.print(p.hodnota + " ");
        }
        System.out.println();
    }

    public void vyhazejSude() {
        for(ObousmernyPrvek aktualni = zacatek; aktualni != null; aktualni = aktualni.dalsi) {
            if (aktualni.hodnota % 2 == 0) {
                aktualni.predchozi.dalsi = aktualni.dalsi;
                aktualni.dalsi.predchozi = aktualni.predchozi;
            }
        }
    }

    public static void main(String[] args) {
        ObousmernySeznam seznam = new ObousmernySeznam();
        seznam.pridejDoSeznamu(10);
        seznam.pridejDoSeznamu(13);
        seznam.pridejDoSeznamu(6);
        seznam.pridejDoSeznamu(7);

        seznam.vypisSeznam();

        System.out.println("vyhazej sude");
        seznam.vyhazejSude();

        seznam.vypisSeznam();


    }

}
