package cz.gyarab.e2prg.s1;

import java.nio.file.attribute.UserPrincipal;

public class UzelStromu {
    int hodnota;
    UzelStromu levy;
    UzelStromu pravy;

    public UzelStromu(int hodnota, UzelStromu levy, UzelStromu pravy) {
        this.hodnota = hodnota;
        this.levy = levy;
        this.pravy = pravy;
    }


    @Override
    public String toString() {
        String output = "" + hodnota;

        if (levy != null) {
            output += " " + levy.toString();
        }

        output += " " + (pravy == null ? "" : pravy.toString());

        return output;
    }

    public static void main(String[] args) {
        UzelStromu koren = new UzelStromu(2,
                new UzelStromu(7,
                        new UzelStromu(2, null, null),
                        new UzelStromu(6,
                                new UzelStromu(5, null, null),
                                new UzelStromu(11, null, null))),
                new UzelStromu(5, null,
                        new UzelStromu(9,
                                new UzelStromu(4, null, null),
                                null)));

        System.out.println(koren);
    }

}
