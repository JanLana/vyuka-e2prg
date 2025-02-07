package cz.gyarab.e2prg.s2;

import java.math.BigInteger;
import java.util.Scanner;

public class NejvetsiSpolecnyDelitel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger prvniCislo = sc.nextBigInteger();
        BigInteger druheCislo = sc.nextBigInteger();

        BigInteger nejmensiSpolecnyDelitel = BigInteger.ZERO;
        BigInteger xxx = prvniCislo;
        BigInteger yyy = druheCislo;

        while (!prvniCislo.equals(druheCislo)) { //while (prvniCislo != druheCislo) {
            System.out.println(prvniCislo + " - " + druheCislo);
            if (prvniCislo.compareTo(druheCislo) > 0) {
                prvniCislo = prvniCislo.mod(druheCislo);
            } else {
                //int rozdil = druheCislo - prvniCislo;
                //druheCislo = rozdil;

                druheCislo = druheCislo.mod(prvniCislo);
            }
            nejmensiSpolecnyDelitel = prvniCislo;
        }

        System.out.println(xxx.divide(nejmensiSpolecnyDelitel));
        System.out.println("------------");
        System.out.println(yyy.divide(nejmensiSpolecnyDelitel));

    }
}
