package cz.gyarab.e2prg.s1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NactiClovek3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream in = new FileInputStream("soubor.dat");
        ObjectInputStream ino = new ObjectInputStream(in);
        Object o = ino.readObject();
        System.out.println(o);
    }
}
