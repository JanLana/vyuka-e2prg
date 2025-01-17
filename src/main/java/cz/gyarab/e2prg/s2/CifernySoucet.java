package cz.gyarab.e2prg.s2;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CifernySoucet {

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(new File("vstup.txt"));
        //soucetCifer();
        long ts = System.currentTimeMillis();
        int pocet = 1;
        for (int i = 3; i < 500000; i++) {
            if (jePrvocislo(i)) {
                //System.out.println(i);
                pocet += 1;
            }
        }
        long ts2 = System.currentTimeMillis();
        long tDiff = ts2 - ts;
        System.out.println(pocet);
        System.out.println(tDiff / 1000.0);
    }

    private static boolean jePrvocislo(int i) {
        boolean jePrvocislo = true;
        for (int j = 3; j <= i/2; j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return jePrvocislo;
    }

    private static void soucetCifer() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int soucetVsechCifer = 0;

        while (i != 0) {
            soucetVsechCifer += i % 10;
            i /= 10;
        }

        System.out.println(soucetVsechCifer);
    }
}
