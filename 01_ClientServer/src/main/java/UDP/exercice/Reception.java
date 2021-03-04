package UDP.exercice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Reception {
    public static void main(String[] args) {
        try {
            while (true) {
                byte[] tmessage = new byte[100];
                DatagramPacket d = new DatagramPacket(tmessage, tmessage.length);

                DatagramSocket s = new DatagramSocket(5000);

                s.receive(d);

                String m = new String(tmessage);
                System.out.println("J'ai reçu le message suivant : " + m);
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
