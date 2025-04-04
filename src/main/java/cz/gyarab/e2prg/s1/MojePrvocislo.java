package cz.gyarab.e2prg.s1;

import java.math.BigInteger;
import java.util.Scanner;

public class MojePrvocislo {
    public static boolean jePrvocislo(BigInteger n) {
        for(BigInteger i = BigInteger.valueOf(2); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            if (n.mod(i).compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();

        n = n.add(BigInteger.ONE);
        while(!jePrvocislo(n)) {
            n = n.add(BigInteger.ONE);
        }

        System.out.println(n);
    }
}
