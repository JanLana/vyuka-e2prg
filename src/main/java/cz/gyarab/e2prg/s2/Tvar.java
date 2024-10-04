package cz.gyarab.e2prg.s2;

public abstract class Tvar {
    public abstract double spocitejObvod();
    public abstract double spocitejPlochu();

    public String coJsemZac() {
        return "tvar";
    }

    public void vypisSe() {
        System.out.println(coJsemZac()
                + ", obvod=" + spocitejObvod()
                + " plocha=" + spocitejPlochu());
    }

    public static void main(String[] args) {
        Tvar arr[] = {
                new Ctverec(5),
                new Ctverec(0.1),
                new Obdelnik(1,2)
        };

        for (int i = 0; i < arr.length; i++) {
            arr[i].vypisSe();
        }
    }
}
