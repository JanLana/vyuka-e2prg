package cz.gyarab.e2prg.s1;

import java.math.BigInteger;

public class DruhaOdmocnina {
    public static BigInteger druhaOdmocnina(BigInteger vstup) {
        BigInteger i = BigInteger.ONE;
        for (;;) {
            if (i.multiply(i).compareTo(vstup) >= 0)
                return i;
            i = i.add(BigInteger.ONE);
        }
    }

    public static void main(String[] args) {
        System.out.println(druhaOdmocnina(new BigInteger("10000000000000000000")));
    }
}
