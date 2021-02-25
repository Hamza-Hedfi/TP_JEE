package secondExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sc = new Socket(InetAddress.getLocalHost(), 5000);

            InputStream in = sc.getInputStream();

            BufferedReader fin = new BufferedReader(new InputStreamReader(in));

            String Ligne;
            Ligne = fin.readLine();

            System.out.println(Ligne);
            sc.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
