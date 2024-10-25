package cz.gyarab.e2prg.s2;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Scanner;

public class Clovek {
    String jmeno;
    String prijmeni;

    public Clovek(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                '}';
    }

    public int porovnej(Clovek c) {
        /*
        if (jmeno.compareTo(c.jmeno) > 0) {
            return 1;
        } else if (jmeno.compareTo(c.jmeno) < 0) {
            return -1;
        } else
            return 0;
         */
        return prijmeni.compareTo(c.prijmeni);

    }

    public static void main(String[] args) {
        Clovek[] arr = inicializceRandom(); //new Clovek[5];
        bubbleSort(arr);
        //selectSort(arr);
        vypis(arr);
    }

    private static void vypis(Clovek[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static Clovek[] inicializceRandom() {
        Clovek[] arr = new Clovek[100];
        for (int i = 0; i < arr.length; i++) {
            String jmeno = RandomStringUtils.random(10, true, false);
            String prijmeni = RandomStringUtils.random(10, true, true);
            arr[i] = new Clovek(jmeno, prijmeni);
        }
        return arr;
    }


        private static Clovek[] inicializce() {
        return new Clovek[] {
                new Clovek("a", "A"),
                new Clovek("e", "E"),
                new Clovek("f", "F"),
                new Clovek("b", "B"),
                new Clovek("x", "X"),
                new Clovek("c", "C")
        };
    }

    private static void selectSort(Clovek[] arr) {
        for (int kolikJeSetrideno = 0; kolikJeSetrideno < arr.length; kolikJeSetrideno++) {
            int poziceNejmensihoPrvku = kolikJeSetrideno;
            // posun poziceNP na skutecne nejmesi
            Clovek nejmensi = arr[poziceNejmensihoPrvku];
            arr[poziceNejmensihoPrvku] = arr[kolikJeSetrideno];
            arr[kolikJeSetrideno] = nejmensi;

        }

    }


    private static void bubbleSort(Clovek[] arr) {
        int pocetProhozeni = 1;

        while (pocetProhozeni > 0) {
            pocetProhozeni = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].porovnej(arr[i + 1]) > 0) {
                    // arr[0] <-> arr[1]
                    Clovek c = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = c;

                    pocetProhozeni += 1;
                }
            }
        }
    }
}
