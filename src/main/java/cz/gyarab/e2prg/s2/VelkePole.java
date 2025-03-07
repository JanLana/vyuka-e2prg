package cz.gyarab.e2prg.s2;

public class VelkePole {
    private int[] pole;

    public VelkePole() {
        pole = new int[10_000_000];
    }

    public int delkaPole() {
        return pole.length;
    }

    public synchronized void prictiJedna(int index) {
        // pole[index]++;
        int x = pole[index];
        x = x + 1;
        pole[index] = x;
    }

    public int secti() {
        int result = 0;
        for(int i = 0; i < pole.length; i++) {
            result += pole[i];
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        VelkePole p = new VelkePole();
        System.out.println("Soucet: " + p.secti());

        Zvetsovac v1 = new Zvetsovac(p);
        Zvetsovac v2 = new Zvetsovac(p);
        Zvetsovac v3 = new Zvetsovac(p);

        long start = System.currentTimeMillis();

        v1.start();
        v2.start();
        v3.start();

        v1.join();
        v2.join();
        v3.join();

        long end = System.currentTimeMillis();
        long delka = end - start;

        System.out.println("Bezel " + delka + " ms");

        System.out.println("Soucet: " + p.secti());
    }

}
