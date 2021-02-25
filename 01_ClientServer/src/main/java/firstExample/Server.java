package firstExample;

import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket sc;

        try {
            ss = new ServerSocket(5000, 5);

            while (true) {
                sc = ss.accept();
                String msg = "Message de la part du serveur";
                OutputStream out = sc.getOutputStream();
                for (int i = 0; i < msg.length(); i++) {
                    out.write((int) msg.charAt(i));
                }
                sc.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
