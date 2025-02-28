package cz.gyarab.e2prg.s2;

public class VypisSuda implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
