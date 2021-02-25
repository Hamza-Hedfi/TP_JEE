package secondExample;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss;
            Socket sc;
            ss = new ServerSocket(5000, 5);
            while (true) {
                sc = ss.accept();
                String message = "Message de la part du serveur";

                OutputStream out = sc.getOutputStream();

                PrintWriter fout = new PrintWriter(new OutputStreamWriter(out));

                fout.println(message);

                sc.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

