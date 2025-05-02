package cz.gyarab.e2prg.s2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HromadaCisel {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1000);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  % 2 == 0) {

            }

        }
    }
}
