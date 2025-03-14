package cz.gyarab.e2prg.s1;

public class TridaA extends Thread {
    TridaA kamarad;

    public void run() {
        prvni(kamarad);
    }

    static synchronized void prvni(TridaA a) {
        System.out.println("prvni");
        a.druha();
    }

    synchronized void druha() {
        System.out.println("druha");
    }
}
