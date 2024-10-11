package cz.gyarab.e2prg.s2;

public abstract class ElSpotrebic implements DelaZvuk {

    public boolean jeNaElektrinu() {
        return true;
    }

    public abstract String delaZvuk();

    @Override
    public String toString() {
        return "ElSpotrebic: " + jeNaElektrinu() + " zvuk: " + delaZvuk();
    }

    public static void main(String[] args) {
        ElSpotrebic e = new Vrtacka();
        DelaZvuk arr[];

        arr = new DelaZvuk[3];
        arr[0] = new Pes();
        arr[1] = new Pes();
        arr[2] = new Vrtacka();
/*
        for (DelaZvuk x : arr) {
            System.out.println(x.delaZvuk());
        }
  */
        for (int i = 0; i < arr.length; i++) {
            DelaZvuk x = arr[i];
            System.out.println(x.hlasitost());
        }



    }
}
