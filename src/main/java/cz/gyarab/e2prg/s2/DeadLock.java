package cz.gyarab.e2prg.s2;

public class DeadLock {
    public static void main(String args[]) {
        TridaA a = new TridaA("vlakno A");
        TridaA b = new TridaA("vlakno B");

        a.kamarad = b;
        b.kamarad = a;

        a.start();

        b.start();
    }
}