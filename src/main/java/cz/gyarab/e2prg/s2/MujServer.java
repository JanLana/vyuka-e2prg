package cz.gyarab.e2prg.s2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MujServer {
    public static void main(String[] args) throws IOException {
        //System.out.println("krok 1");
        ServerSocket server = new ServerSocket(10000);

        for(;;) {
            try {
                Socket socket = server.accept();

                InputStream in = socket.getInputStream();
                Reader reader = new InputStreamReader(in);
                Scanner scIn = new Scanner(reader);

                OutputStream out = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(out);


                for(;;) {
                    System.out.println(scIn.nextLine());
                    writer.println("dekuju");
                }

                //socket.close();
            } catch (Exception e) {
                System.out.println("nekdo me trapi!!!");
            }
        }
    }
}
