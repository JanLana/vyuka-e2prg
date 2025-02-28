package cz.gyarab.e2prg.s1;

public class VlaknoLiche implements Runnable {
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new VlaknoSude();
        t1.start();
        t1.join();

        /*
        Runnable r1 = () -> {
            for (int i = 0; i <= 100; i+= 2) {
                System.out.println(i);
            }
        };
        Thread tr1 = new Thread(r1);
        tr1.start();
         */
        final String jmeno = "Lichy thread:";
        Thread tr1 = new Thread(
                () -> {
                    for (int i = 0; i <= 100; i += 2) {
                        System.out.println(jmeno + i);
                    }
                });
        tr1.start();

        VlaknoLiche v = new VlaknoLiche();
        Thread tr = new Thread(v);
        tr.start();
    }
}
