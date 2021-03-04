package UDP.tp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Base {

    private static final String GROUP_ADDR = "224.0.0.1";
    private static final short PORT = 5000;
    private InetAddress group;
    private MulticastSocket multicastSocket;
    private String name;

    public Base() throws IOException {
        this("Server");
    }

    public Base(String name) throws IOException {
        this.name = name;

        group = InetAddress.getByName(GROUP_ADDR);
        multicastSocket = new MulticastSocket(PORT);
        multicastSocket.joinGroup(group);

        WelcomeMsg();
    }

    private void WelcomeMsg() throws IOException {
        if (!name.equals("Server")) {
            send(name + " just joined the chat group");
        } else {

            StringBuilder stringBuilder = new StringBuilder();
            String wlcMsg = "Session started at " + Date.from(Instant.now());
            stringBuilder.append('\n');
            for (int i = 0; i < wlcMsg.length(); i++) {
                stringBuilder.append('-');
            }
            String dashedLine = stringBuilder.append('\n').toString();
            stringBuilder.append(wlcMsg).append(dashedLine);

            send(stringBuilder.toString());
        }
    }

    void sendFormatted(String message) throws IOException {
        send(name + " : " + message);
    }

    private void send(String message) throws IOException {
        byte[] tmessage = message.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(tmessage,
                tmessage.length, group, PORT);
        multicastSocket.send(datagramPacket);
    }

    String receive() throws IOException {
        byte[] message = new byte[512];
        DatagramPacket datagramPacket = new DatagramPacket(message, message.length);
        multicastSocket.receive(datagramPacket);
        return new String(message);
    }
}
