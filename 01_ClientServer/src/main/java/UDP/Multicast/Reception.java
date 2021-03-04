package UDP.Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Reception {
    public static void main(String[] args) {
        try {
            while (true) {
                byte[] tmessage = new byte[100];
                DatagramPacket d = new
                        DatagramPacket(tmessage, tmessage.length);
                MulticastSocket s = new MulticastSocket(5000);
                InetAddress group =
                        InetAddress.getByName("224.0.0.1");
                s.joinGroup(group);
                s.receive(d);
                String m = new String(tmessage);
                System.out.println("J'ai recu le message suivant : " + m);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
