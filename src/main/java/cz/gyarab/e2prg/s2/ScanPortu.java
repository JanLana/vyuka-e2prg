package cz.gyarab.e2prg.s2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ScanPortu {
    public static void main(String[] args) throws IOException {
        ServerSocket sc = new ServerSocket(10000);

        for(;;) {
            Socket socket = sc.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            zpracujPozadavek(in, out);

            socket.close();
        }
    }

    private static void zpracujPozadavek(BufferedReader in, PrintWriter out) throws IOException {
        for(String r = in.readLine();! r.isEmpty(); r = in.readLine()) {
            System.out.println(r);
        }
        System.out.println("konec hlavicky");

        out.println("HTTP/1.1 200 OK");
        out.println("Connection: close");
        out.println("Content-Type: image/png");
        out.println();
        out.println("<html><body><h1>Nazdar</h1></body></html>");

        System.out.println("konec pozadavku =============================");
    }
}
