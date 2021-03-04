package UDP;

import java.io.IOException;
import java.net.*;

public class EnvoiMessage {
    public static void main(String[] args) {
        try {

            String message = "Bonjour tout le monde ";

            byte[] tmessage = message.getBytes();

            for (int i = 0; i < 11; i++) {
                DatagramPacket d = new DatagramPacket(tmessage, tmessage.length, InetAddress.getLocalHost(), 5000);

                DatagramSocket s = new DatagramSocket();

                s.send(d);
                s.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
