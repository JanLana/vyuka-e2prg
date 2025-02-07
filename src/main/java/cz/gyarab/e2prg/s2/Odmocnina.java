package cz.gyarab.e2prg.s2;

import java.math.BigInteger;

public class Odmocnina {
    public static BigInteger spocitejOdmocninu(BigInteger vstup) {
        BigInteger odpoved = BigInteger.ONE;
        for(;;) {
            if (odpoved.multiply(odpoved).compareTo(vstup) >= 0) {
                return odpoved;
            }
            odpoved = odpoved.add(BigInteger.ONE);
        }
    }

    public static void main(String[] args) {
        System.out.println(spocitejOdmocninu(new BigInteger("404")));
        System.out.println(spocitejOdmocninu(new BigInteger("404000000")));
        System.out.println(spocitejOdmocninu(new BigInteger("10000000000000000")));
        System.out.println(spocitejOdmocninu(new BigInteger("100000000000000000001")));
    }
}
