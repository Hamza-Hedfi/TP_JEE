package firstExample;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sc;

            sc = new Socket(InetAddress.getLocalHost(), 5000);

            InputStream in = sc.getInputStream();

            int c;
            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
