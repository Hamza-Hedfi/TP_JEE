package UDP.tp_v3.logic;

import UDP.tp_v3.UI.MainWindow;

import javax.swing.*;
import java.io.IOException;

public class MainV2 {
    public static void main(String[] args) throws IOException {
/*

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
*/
        SwingUtilities.invokeLater(() -> {
            try {
                new MainWindow();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
