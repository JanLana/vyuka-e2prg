package cz.gyarab.e2prg.s2;

public class VypisLicha extends Thread {
    public void run() {
        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        /*
        VypisSuda r1 = new VypisSuda();
        Thread tr1 = new Thread(r1);
        tr1.start();
        Runnable r1 = () -> {
            for (int i = 0; i <= 100; i += 2) {
                System.out.println(i);
            }
        };
        */

        for (int n = 1; n < 10; n++) {
            final int parametr = n;

            Thread tr1 = new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    System.out.println(i * parametr);
                }
            });

            tr1.start();
        }
        System.out.println("HOTOVO");
    }
}
