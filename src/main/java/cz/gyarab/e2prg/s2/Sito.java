package cz.gyarab.e2prg.s2;

import java.math.BigInteger;

public class Sito {
    public static void main(String[] args) {
        boolean[] arr = new boolean[Integer.MAX_VALUE-1000];
        BigInteger soucet = BigInteger.ZERO;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == false) {
                //System.out.println(i);
                soucet.add(BigInteger.valueOf(i));
                for (long j = i; j < arr.length; j += i) {
                    arr[(int)j] = true;
                }
            }

        }
        System.out.println(soucet);
    }
}
