package cz.gyarab.e2prg.s1;

import java.util.Arrays;

public class Clovek2 implements Comparable<Clovek2> {
    public String krestni;
    public String prijmeni;

    public Clovek2(String krestni, String prijmeni) {
        this.krestni = krestni;
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return "Clovek2{" +
                "krestni='" + krestni + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                '}';
    }
    private static void vypis(Clovek2[] arr) {
        for (Clovek2 c: arr) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Clovek2 arr[] = {new Clovek2("A", "a"),
                new Clovek2("C", "c"),
                new Clovek2("B", "b")
        };

        //vypis(arr);

        Arrays.sort(arr);

        vypis(arr);



    }

    @Override
    public int compareTo(Clovek2 o) {
        return krestni.compareTo(o.krestni);
        /*
        if (krestni.compareTo(o.krestni) > 0) {
            return 1;
        } else (krestni.compareTo(o.krestni) < 0) {
            return -1;
        } else {
            return 0;
        }
         */

        //return 0;
    }
}
