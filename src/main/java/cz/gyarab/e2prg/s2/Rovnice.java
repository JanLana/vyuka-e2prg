package cz.gyarab.e2prg.s2;

import java.util.Scanner;

public class Rovnice {
    public static double spocitejPolynom(double x, double[] koeficienty) {
        for (int i = 0; i < koeficienty.length; i++) {
            x += koeficienty[i] * Math.pow(x, i);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double[] a = {0, 2.0, 2.0, 3.0, 2.0, .25};
        System.out.println(spocitejPolynom(x, a));

    }
}
