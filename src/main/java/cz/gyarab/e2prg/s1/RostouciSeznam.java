package cz.gyarab.e2prg.s1;

import java.util.Scanner;

public class RostouciSeznam {
    public static void main(String[] args) {
        Prvek zacatek = null;

        Scanner sc = new Scanner(System.in);

        for(;;) {
            zacatek = new Prvek(sc.nextInt(), zacatek);

            for(Prvek curr = zacatek; curr != null; curr=curr.dalsi) {
                System.out.print(curr.hodnota + " ");
            }
            System.out.println();
        }

    }
}
