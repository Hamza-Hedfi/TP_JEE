package thirdExample;

import java.io.IOException;
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

//                Connection c = new Connection(sc);
//                c.start();

            }
//            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
