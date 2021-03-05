package UDP.tp_v3.logic;

import UDP.tp_v3.UI.MessageReceiverUI;

import java.io.IOException;
import java.net.DatagramPacket;

public class MessageReceiver extends Config implements Receive, Runnable {
    MessageReceiverUI messageReceiverUI;

    public MessageReceiver(MessageReceiverUI receiverUI) throws IOException {
        this.messageReceiverUI = receiverUI;
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
//                System.out.println(receive());
                messageReceiverUI.getMsgArea().append(receive() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
