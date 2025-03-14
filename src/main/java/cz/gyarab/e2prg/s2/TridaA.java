package cz.gyarab.e2prg.s2;

public class TridaA extends Thread {
    TridaA kamarad;

    public TridaA(String name) {
        super(name);
    }

    public void run() {
        prvni();
    }

     void prvni() {
        System.out.println(getName() + ": prvni");
        kamarad.druha();
    }

    synchronized void druha() {
        System.out.println(getName() + ": druha");
    }
}