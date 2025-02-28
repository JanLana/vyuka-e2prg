package cz.gyarab.e2prg.s1;

public class VlaknoSude extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i+= 2) {
            System.out.println(i);
        }
    }
}
