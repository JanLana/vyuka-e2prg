package cz.gyarab.e2prg.s1;

//import org.apache.commons.lang3.RandomStringUtils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Clovek {
    private final String jmeno;
    private final String prijmeni;

    private static final int POCET_POLOZEK = 5;

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

    public static void prohod(Clovek[] arr, int i, int j) {
        Clovek c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    public int compareTo(Clovek c) {
        if (jmeno.compareTo(c.jmeno) > 0) {
            return 1;
        } else if (jmeno.compareTo(c.jmeno) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //new Clovek[POCET_POLOZEK];

        /*
        for (int i = 0; i < POCET_POLOZEK; i++) {
            arr[i] = new Clovek(sc.next(), sc.next());
        }
        */


        Clovek arr[] = inicializaceRandom();
        bubbleSort(arr);
        vypis(arr);
    }

    private static Clovek[] inicializace() {
        return new Clovek[]{
                new Clovek("a", "A"),
                new Clovek("e", "E"),
                new Clovek("f", "F"),
                new Clovek("b", "B"),
                new Clovek("x", "X"),
                new Clovek("c", "C")
        };
    }


    private static Clovek[] inicializaceRandom() {
        Clovek arr[] = new Clovek[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Clovek(
                    RandomStringUtils.random(10, true, false),
                    RandomStringUtils.random(10, true, false)
            );

        }
        return arr;
    }


    private static void vypis(Clovek[] arr) {
        for (Clovek c: arr) {
            System.out.println(c);
        }
    }

    private static void bubbleSort(Clovek[] arr) {
        boolean potrebujiTridit = true;

        while(potrebujiTridit) {
            potrebujiTridit = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1].compareTo(arr[0]) > 0) {
                    prohod(arr, i - 1, i);
                    potrebujiTridit = true;
                }
            }
        }
    }
}
