package cz.gyarab.e2prg.s2;

import java.util.Arrays;

public class TrideniSlevanim {
    public static void main(String[] args) {
        int[] arr = { 1, 13, 8, 2, 5, 6, 3, 4};

        int[] vysledek = mergeSort(arr);

        System.out.println(Arrays.toString(vysledek));
    }

    public static int[] mergeSort(int[] vstup) {
        if (vstup.length == 1) {
            return vstup;
        }
        int pul = vstup.length/2
        int[] leva = new int[pul];
        int[] prava = new int[pul];

        for (int i = 0; i < pul; i++) {
            leva[i] = vstup[i];
        }
        for (int i = 0; i < pul; i++) {
            prava[i] = vstup[i+pul];
        }

        int[] setridenaLeva = mergeSort(leva);
        int[] setridenaPrava = mergeSort(prava);

        int[] vysledek = merge(setridenaLeva, setridenaPrava);

        return vysledek;
    }

    public static int[] merge(int[] leva, int[] prava) {
        int[] vystup = new int[leva.length + prava.length];
        int i = 0, j = 0, k = 0;

        while (i < leva.length && j < prava.length) {
            if (leva[i] < prava[j]) {
                vystup[k++] = leva[i++];
            } else {
                vystup[k++] = prava[j++];
            }
        }
    }
}
