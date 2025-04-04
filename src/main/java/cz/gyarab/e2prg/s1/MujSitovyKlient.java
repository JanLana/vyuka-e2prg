package cz.gyarab.e2prg.s1;

import java.io.*;
import java.net.Socket;

public class MujSitovyKlient {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("192.168.81.5", 10000);

        OutputStream out = sc.getOutputStream();
        PrintWriter wr = new PrintWriter(out, true);
        wr.println("Nazdar");

        sc.close();
    }
}
