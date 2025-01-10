package cz.gyarab.e2prg.s2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class VypisTelSeznam {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("soubor.dat");
        ObjectInputStream in = new ObjectInputStream(f);

        ArrayList<TelCislo> arr = (ArrayList<TelCislo>)in.readObject();

        System.out.println(arr);
    }
}
