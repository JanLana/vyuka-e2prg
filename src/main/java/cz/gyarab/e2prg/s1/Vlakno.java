package cz.gyarab.e2prg.s1;

public class Vlakno {
    void cislaDo10() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Chyba!!!");
            }
        }
    }

    void cislaOd10() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Chyba!!!");
            }
        }
    }


    public static void main(String[] args) {
        //Vlakno v = new Vlakno();
        VlaknoDo10 v10 = new VlaknoDo10();
        //v10.start();
        //v.cislaOd10();
        //String str = ;

        VlaknoSlovo v1 = new VlaknoSlovo("Programovani je nej!");
        VlaknoSlovo v2 = new VlaknoSlovo("Dneks je hezky");

        v1.start();
        v1.start();
    }

}
