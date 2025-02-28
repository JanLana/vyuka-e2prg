package cz.gyarab.e2prg.s1;

public class VlaknoSlovo extends Thread {
    String str;

    public VlaknoSlovo(String str) {
        this.str = str;
    }

    public void run() {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Chyba!!!");
            }
        }
    }
}
