package thirdExample;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sc;

            sc = new Socket(InetAddress.getLocalHost(), 5000);

            InputStream in = sc.getInputStream();
            BufferedReader fin = new BufferedReader(new InputStreamReader(in));

            String ligne;
            ligne = fin.readLine();
            System.out.println(ligne);

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
