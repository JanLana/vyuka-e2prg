package cz.gyarab.e2prg.s2;

import java.io.*;
import java.util.ArrayList;

public class TelCislo implements Serializable {
    public String jmeno;
    public String telCislo;

    public TelCislo(String jmeno, String telCislo) {
        this.jmeno = jmeno;
        this.telCislo = telCislo;
    }

    @Override
    public String toString() {
        return "TelCislo{" +
                "jmeno='" + jmeno + '\'' +
                ", telCislo='" + telCislo + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {
        TelCislo a = new TelCislo("Jan", "+420604958263");
        System.out.println(a);

        ArrayList<TelCislo> arr = new ArrayList<>();
        arr.add(a);
        arr.add(new TelCislo("Pepa", "+42012345678"));
        arr.add(new TelCislo("Eliska", "+42011111111"));


        FileOutputStream f = new FileOutputStream("soubor.dat");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(arr);
        out.close(); //f.close();
    }
}
