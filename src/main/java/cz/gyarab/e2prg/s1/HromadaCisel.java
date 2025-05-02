package cz.gyarab.e2prg.s1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HromadaCisel {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i+1; j < arr.length; j++) {
                    arr[j-1] = arr[j];
                }
                arr[arr.length-1] = 0;

            }

        }
    }
}
