package cz.gyarab.e2prg.s2;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class CteckaSouboru {
    public static void main(String[] args) throws IOException {
        //prectiSoubor();

        File file = new File("cisla.txt");
        FileWriter out = new FileWriter(file);

        for (int i = 0; i < 1000000; i++) {
            Integer randomNum = ThreadLocalRandom.current().nextInt();
            String cislo = randomNum.toString() + "\n";
            out.write(cislo);
        }
        out.close();
    }

    private static void prectiSoubor() throws IOException {
        File file = new File(".gitignore"); // napr. soubor.txt
        FileReader reader = new FileReader(file);

        while(true) {
            int x = reader.read();
            if (x == -1)
                break;

            char ch = (char) x;
            System.out.print(ch);
        }
    }
}
