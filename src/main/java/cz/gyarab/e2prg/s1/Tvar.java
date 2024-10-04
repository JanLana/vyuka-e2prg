package cz.gyarab.e2prg.s1;

public abstract class Tvar {
    public String tvar; // = "tvar";

    public Tvar() {
        tvar = "tvar";
    }

    public abstract double spocitejPlochu();
    public abstract double spocitejObvod();

    public void vypisSe() {
        System.out.print("Muj tvar=" + tvar);
        System.out.print(" plocha=" + spocitejPlochu());
        System.out.println(" obvod=" + spocitejObvod());
    }

    public static void main(String[] args) {
        Kruh k = new Kruh(1);
        System.out.println(k.tvar);

        Tvar[] arr = {
                new Ctverec(1),
                new Kruh(1),
                new Ctverec(10)
        };
        System.out.print("Nejmensi je: ");

        if (arr[0].spocitejPlochu() <= arr[1].spocitejPlochu()
                && arr[0].spocitejPlochu() <= arr[2].spocitejPlochu()) {
            arr[0].vypisSe();
        } else if (arr[1].spocitejPlochu() <= arr[0].spocitejPlochu()
                && arr[1].spocitejPlochu() <= arr[2].spocitejPlochu()) {
            arr[1].vypisSe();
        } else if (arr[2].spocitejPlochu() <= arr[0].spocitejPlochu()
                && arr[2].spocitejPlochu() <= arr[1].spocitejPlochu()) {
            arr[2].vypisSe();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].vypisSe();
        }
    }
}
