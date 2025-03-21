package cz.gyarab.e2prg.s2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MujKlient {
    public static void main(String[] args) throws IOException {
            //System.out.println("krok 1");
            ServerSocket server = new ServerSocket(10000);


        Socket socket = new Socket("localhost", 10_000);

        OutputStream out = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(out);

        writer.println("Nazdar Honzo!");

        writer.close();
    }
}
