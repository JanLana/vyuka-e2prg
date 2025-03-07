package cz.gyarab.e2prg.s1;

public class VelkePole {
    private int[] pole;

    public VelkePole() {
        this.pole = new int[10_000_000];
    }

    public synchronized int delkaPole() {
        return pole.length;
    }

    public synchronized void prictiJenda(int index) {
        int i = pole[index];
        i = i + 1;
        pole[index] = i;

        // pole[index]++
    }

    public long secti() {
        long vysledek = 0;
        for (int i = 0; i < pole.length; i++) {
            vysledek += pole[i];
        }
        return vysledek;
    }

    public long kolikrat(int x) {
        long vysledek = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] == x)
                vysledek++;
        }
        return vysledek;
    }

    public static void main(String[] args) throws InterruptedException {
        VelkePole p = new VelkePole();

        System.out.println("soucet pred: " + p.secti());

        PrictiJedanKeVsemu v1 = new PrictiJedanKeVsemu(p);
        PrictiJedanKeVsemu v2 = new PrictiJedanKeVsemu(p);

        long start = System.currentTimeMillis();
        v1.start();
        v2.start();

        v1.join();
        v2.join();

        long end = System.currentTimeMillis();
        long delka = end - start;

        System.out.println("program bezel "  +  delka + " miliseconds");

        System.out.println("soucet po: " + p.secti());
        System.out.println("0 je tam " + p.kolikrat(0));
        System.out.println("1 je tam " + p.kolikrat(1));
        System.out.println("2 je tam " + p.kolikrat(2));
        System.out.println("3 je tam " + p.kolikrat(3));

    }
}
