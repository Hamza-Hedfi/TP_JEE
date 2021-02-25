package exercice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);

            Socket sc = ss.accept();

            System.out.println(ss);
            System.out.println(sc);

            String msg = read(sc);
            System.out.println(msg);

            send(sc, "Hello Client");

            msg = read(sc);
            System.out.println(msg);

            send(sc, msg.toUpperCase());

//            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void send(Socket sc, String msg) throws IOException {
        DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
        dout.writeUTF(msg);
        dout.flush();
//        dout.close();
    }

    private static String read(Socket sc) throws IOException {
        DataInputStream dis = new DataInputStream(sc.getInputStream());
        String msg = dis.readUTF();
        return msg;
    }
}
