package cz.gyarab.e2prg.s2;

import java.util.Arrays;

public class Clovek2 implements Comparable<Clovek2> {
    String krestni;
    String prijmeni;

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
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Clovek2[] arr = {
                new Clovek2("a", "A"),
                new Clovek2("e", "E"),
                new Clovek2("f", "F"),
                new Clovek2("b", "B"),
                new Clovek2("x", "X"),
                new Clovek2("c", "C")
        };


        Arrays.sort(arr);
        vypis(arr);
    }

    @Override
    public int compareTo(Clovek2 x) {
        //Clovek2 x = (Clovek2)o;

        return krestni.compareTo(x.krestni);
        /*
        //if (prijmeni < x.prijmeni) {
        if (prijmeni.compareTo(x.prijmeni) < 0) {
            return -1;
        } else if (prijmeni.compareTo(x.prijmeni) > 0) { // if (prijmeni > x.prijmeni) {
            return 1;
        } else {
            return 0;
        }
        */

        //return 0;
    }
}

