package cz.gyarab.e2prg.s1;

public class NejvetsiPrvocislo {
    public static boolean jePrvocislo(long i) {
        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int pocet = 0;

        long ts = System.currentTimeMillis();

        for (long i = 2; i < 1000000; i++) {
            if (jePrvocislo(i)) {
                pocet++;
                //System.out.println(i);
            }
        }

        long ts2 = System.currentTimeMillis();

        System.out.println(pocet);

        long tsDiff = ts2 - ts;

        System.out.println(1.0*tsDiff / 1000.0 );
    }
}
