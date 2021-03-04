package UDP.tp_v2;

import java.io.IOException;
import java.net.DatagramPacket;

public class MessageReceiver extends Config implements Receive, Runnable {

    public MessageReceiver() throws IOException {
    }

    @Override
    public String receive() throws IOException {
        byte[] message = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(message, message.length);
        multicastSocket.receive(datagramPacket);
        return new String(message);
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(receive());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
