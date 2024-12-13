package cz.gyarab.e2prg.s1;

import java.util.Arrays;

public class TrideniSlevanim {
    static int pocitadlo;

    public static void main(String[] args) {
        int[] arr = { 5,2,13,1,8,7,3,4 };
        arr = new int[128];


        pocitadlo = 0;
        int[] vysledek = mergeSort(arr);

        System.out.println("velikost: " + arr.length);
        System.out.println("merge volan: " + pocitadlo);

        Arrays.toString(vysledek);
    }

    public static int[] mergeSort(int[] vstup) {
        if (vstup.length == 1) {
            return vstup;
        }
        int pul = vstup.length / 2;
        int[] leva = new int[pul];
        int[] prava = new int[pul];
        // 1/2 vstup -> leva, 2/2 -> prava;

        for (int i = 0; i < pul; i++) {
            leva[i] = vstup[i];
        }


        for (int i = pul; i < vstup.length; i++) {
            prava[i-pul] = vstup[i];
        }

       // System.out.println("vstup: " + Arrays.toString(vstup));
        //System.out.println("leva " + Arrays.toString(leva));
        //System.out.println("prava: " + Arrays.toString(prava));

        int[] levaSetridena = mergeSort(leva);
        int[] pravaSetridena = mergeSort(prava);

        int[] vysledek = merge(leva, prava);

        return vysledek;
    }

    public static int[] merge(int[] leva, int[] prava) {
        pocitadlo = pocitadlo + 1;

        int i = 0, j = 0, k = 0;
        int[] vysledek = new int[leva.length + prava.length];

        while (i < leva.length && j < prava.length) {
            System.out.println("i=" + i + " j=" + j + " k=" + k);
            System.out.println("vstup: " + Arrays.toString(vysledek));
            System.out.println("leva " + Arrays.toString(leva));
            System.out.println("prava: " + Arrays.toString(prava));

            if (leva[i] < prava[j]) {
                vysledek[k] = leva[i];
                k += 1;
                i += 1;
            } else {
                vysledek[k] = prava[j];
                k += 1;
                j += 1;
            }
        }

        return vysledek;
    }
}
