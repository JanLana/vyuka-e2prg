package cz.gyarab.e2prg.s2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class TrideniSlevanim {
    static int pocitadlo;

    public static void main(String[] args) {
        int[] arr = { 1, 13, 8, 2, 5, 6, 3, 4};
        //arr = new int[128];
        arr = IntStream.generate(() -> new Random().nextInt(128)).limit(128).toArray();

        pocitadlo = 0;
        int[] vysledek = mergeSort(arr);

        System.out.println(Arrays.toString(vysledek));
        System.out.println(pocitadlo);
    }

    public static int[] mergeSort(int[] vstup) {
        if (vstup.length == 1) {
            return vstup;
        }
        int pul = vstup.length/2;
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
            pocitadlo = pocitadlo + 1;

            if (leva[i] < prava[j]) {
                vystup[k++] = leva[i++];
            } else {
                vystup[k++] = prava[j++];
            }
        }

        /*
        for (int x = i; x < leva.length; x++) {
            vystup[k++] = leva[x];
        }
         */
        for (; i < leva.length; i++) {
            vystup[k++] = leva[i];
        }
        for (; j < prava.length; j++) {
            vystup[k++] = prava[j];
        }


        return vystup;
    }
}
