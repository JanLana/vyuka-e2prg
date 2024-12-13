package cz.gyarab.e2prg.s1;

import java.io.*;
import java.util.ArrayList;

public class Clovek3 implements Serializable {
        public String krestni;
        public String prijmeni;
        public int rokNarozeni;

    public Clovek3(String krestni, String prijmeni, int rokNarozeni) {
        this.krestni = krestni;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }

    @Override
    public String toString() {
        return "Clovek3{" +
                "krestni='" + krestni + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", rokNarozeni=" + rokNarozeni +
                '}';
    }

    public static void main(String[] args) throws IOException {
        Clovek3 a = new Clovek3("pepa", "zdepa", 2000);
        Clovek3 b = new Clovek3("jara", "cimrman", 1800);
        Clovek3 c = new Clovek3("jan", "hus", 1370);
        Integer pocet = 3;

        ArrayList<Clovek3> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);



        FileOutputStream f = new FileOutputStream("soubor.dat");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(arr);
        System.out.println(a);

    }
}
