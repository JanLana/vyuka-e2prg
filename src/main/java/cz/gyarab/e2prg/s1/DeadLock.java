package cz.gyarab.e2prg.s1;

public class DeadLock {
    public static void main(String args[]) {
        TridaA a = new TridaA();
        TridaA b = new TridaA();

        a.kamarad = b;
        b.kamarad = a;

        a.start();
        //System.out.println("ahoj");
        b.start();
    }
}
