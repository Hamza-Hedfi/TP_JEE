package exercice;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static String msg;

    public static void main(String[] args) {
        try {
            Socket sc;

            sc = new Socket(InetAddress.getLocalHost(), 5000);

            msg = readMsg(sc);
            System.out.println(msg);
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readMsg(Socket sc) throws IOException {
        InputStream in = sc.getInputStream();

        StringBuilder sb = new StringBuilder();

        int c;
        while ((c = in.read()) != -1) {
            sb.append((char)c);
//            System.out.print((char) c);
        }
        return sb.toString();
    }
}
