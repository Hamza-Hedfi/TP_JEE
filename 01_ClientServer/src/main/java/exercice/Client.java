package exercice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sc = new Socket("localhost", 5000);

            send(sc,"Hello Server");

            String msg = read(sc);
            System.out.println(msg);

            send(sc, "transform this to upper case plz");

            msg = read(sc);
            System.out.println(msg);

//            sc.close();
        } catch (Exception e) {
            System.out.println(e);
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
