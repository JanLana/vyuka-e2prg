package cz.gyarab.e2prg.s1;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    public static void main(String[] args) throws IOException {
        File file = new File("nahodna.txt"); // napr. soubor.txt
        FileWriter out = new FileWriter(file);

        Integer x = ThreadLocalRandom.current().nextInt();
        String str = x.toString() + "\n";
        out.write(str);


/*
        for(int x = reader.read(); x != -1; x = reader.read()) {
            char ch = (char) x;
            System.out.println(ch);
        }

        reader.close();

 */
    }
}
