package cz.gyarab.e2prg.s1;

public abstract class ElSpotrebic {
    public boolean jeNaElektrinu() {
        return true;
    }

    public abstract String delaZvuk();

    @Override
    public String toString() {
        return "ElSpotrebic: " + jeNaElektrinu() + " zvuk: " + delaZvuk();
    }

    public static void main(String[] args) {
        IDelaZvuk arr[] = {
                new Pes(),
                new ZubniKartacek()
        };

        for (IDelaZvuk z: arr) {
            System.out.println(z.delaZvuk());
        }
        /*
        for (int i = 0; i < arr.length; i++) {
            IDelaZvuk z = arr[i];
            System.out.println(z.delaZvuk());
         }
         */


    }
}
