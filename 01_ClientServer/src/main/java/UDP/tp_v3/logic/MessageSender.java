package UDP.tp_v3.logic;

import java.io.IOException;
import java.net.DatagramPacket;
import java.util.Scanner;

public class MessageSender extends Config implements Send, Runnable {

    private final String name;

    public MessageSender(String name) throws IOException {
        this.name = name;

        joinedMsg();
    }

    private void joinedMsg() throws IOException {
        String joinMsg = getName();
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for (int i = 0; i < joinMsg.length(); i++) {
            sb.append('-');
        }
        sb.append("+");
        String contour = sb.toString();
        sb.append(joinMsg);
        sb.append(contour);
        send(sb.toString());
    }

    private String getName() {
        return "\n| " + name + " joined |\n";
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                Thread.sleep(500);
                System.out.println("Enter your msg : ");
                sendFormatted(sc.nextLine());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void send(String message) throws IOException {
        byte[] tmessage = message.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(tmessage,
                tmessage.length, group, PORT);
        multicastSocket.send(datagramPacket);
    }

    @Override
    public void sendFormatted(String message) throws IOException {
        send(name + " : " + message);
    }
}
