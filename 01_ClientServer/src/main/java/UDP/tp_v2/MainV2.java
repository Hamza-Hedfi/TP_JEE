package UDP.tp_v2;

import java.io.IOException;
import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws IOException {

        Helper.welcomMsg();

        Scanner sc = new Scanner(System.in);
        System.out.print("To join the chat enter you name: ");

        String name = sc.nextLine();

        MessageSender sender = new MessageSender(name);
        MessageReceiver receiver = new MessageReceiver();

        Thread threadSender = new Thread(sender);
        Thread threadReceiver = new Thread(receiver);

        threadReceiver.start();
        threadSender.start();

    }
}
