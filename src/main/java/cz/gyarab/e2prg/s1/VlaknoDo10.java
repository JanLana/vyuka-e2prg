package cz.gyarab.e2prg.s1;

public class VlaknoDo10 extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("VlaknoDo10:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Chyba!!!");
            }
        }
    }
}
