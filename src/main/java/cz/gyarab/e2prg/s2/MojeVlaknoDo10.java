package cz.gyarab.e2prg.s2;

public class MojeVlaknoDo10 extends Thread {
    String vstup;

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Chyba");
            }
        }
    }
}
