package cz.gyarab.e2prg.s2;

import java.util.Scanner;

public class VypisRadu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolozkaSeznamu zacatek = null;

        for(;;) {
            int hodnota = sc.nextInt();
            //PolozkaSeznamu nova = new PolozkaSeznamu(hodnota, zacatek);
            //zacatek = nova;
            zacatek  = new PolozkaSeznamu(hodnota, zacatek);

            for(PolozkaSeznamu x = zacatek; x != null; x = x.dalsi) {
                System.out.println(x.hodnota);
            }
        }
    }
}
