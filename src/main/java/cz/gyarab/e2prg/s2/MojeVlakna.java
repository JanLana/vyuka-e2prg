package cz.gyarab.e2prg.s2;

public class MojeVlakna {
    public void vypisMinus10() {
        for (int i = -10; i <= -1; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Chyba");
            }
        }
    }

    public static void main(String[] args) {
        MojeVlakna m = new MojeVlakna();
        MojeVlaknoDo10 do10 = new MojeVlaknoDo10();
        do10.vstup = "Programovani je nej!";

        System.out.println("start do 10");
        do10.start();
        System.out.println("do 10 bezi");

        System.out.println("start do -10");
        m.vypisMinus10();
        System.out.println("do -10 dobehlo");
    }

    private void run() {
    }
}
