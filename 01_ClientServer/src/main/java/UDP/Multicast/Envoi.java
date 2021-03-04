package UDP.Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Envoi {
    public static void main(String[] args) {
        try {

            String message = "bonjour tout le monde";
            byte[] tmessage = message.getBytes();

            InetAddress group =
                    InetAddress.getByName("224.0.0.1");
            DatagramPacket d = new DatagramPacket(tmessage,
                    tmessage.length, group, 5000);

            MulticastSocket s = new MulticastSocket();
            s.send(d);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
