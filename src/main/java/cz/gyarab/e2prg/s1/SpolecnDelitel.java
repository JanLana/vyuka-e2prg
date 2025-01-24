package cz.gyarab.e2prg.s1;

import java.math.BigInteger;
import java.util.Scanner;

//51473138136173163710832143728146372140314039217321372149327143217439187387321948372
//1132748321921943124313216741149321743921739474193719378214987379137194372

public class SpolecnDelitel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();

        BigInteger a = x;
        BigInteger b = y;

        while (!x.equals(y)) { // while (x != y) {
            System.out.println(x);
            if (x.compareTo(y) > 0 ) { //if (x > y) {
                x = x.mod(y);
            } else {
                y = y.mod(x);
            }
        }

        System.out.println(a.divide(x));
        System.out.println("-----------");
        System.out.println(b.divide(y));
    }
}
