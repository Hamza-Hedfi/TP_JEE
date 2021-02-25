package exercice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket sc;

        try {
            ss = new ServerSocket(5000, 5);

            while (true) {
                sc = ss.accept();
                String msg = "Message de la part du serveur";
                sendMsg(sc, msg);
                sc.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendMsg(Socket sc, String msg) throws IOException {
        OutputStream out = sc.getOutputStream();
        for (int i = 0; i < msg.length(); i++) {
            out.write((int) msg.charAt(i));
        }
    }
}
