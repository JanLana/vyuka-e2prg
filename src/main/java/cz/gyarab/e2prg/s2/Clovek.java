package cz.gyarab.e2prg.s2;

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
        Scanner sc = new Scanner(System.in);
        Clovek[] arr = new Clovek[5];

        for (int i = 0; i < arr.length; i++) {
            String jmeno = sc.next();
            String prijmeni = sc.next();
            arr[i] = new Clovek(jmeno, prijmeni);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=========");

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

        // vypis
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
