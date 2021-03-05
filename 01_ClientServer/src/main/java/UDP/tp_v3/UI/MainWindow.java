package UDP.tp_v3.UI;

import UDP.tp_v3.logic.Helper;
import UDP.tp_v3.logic.MessageReceiver;
import UDP.tp_v3.logic.MessageSender;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainWindow extends JFrame {
    MessageReceiverUI messageReceiverUI;
    MessageSenderUI messageSenderUI;
    String name;

    MessageReceiver receiver;
    MessageSender sender;

    public MainWindow() throws IOException {
        name = JOptionPane.showInputDialog(this, "Enter you name to join", "Name?", JOptionPane.QUESTION_MESSAGE);
        if (name == null) {
            System.exit(0);
        } else if (name.isEmpty()) {
            name = "Anonymous user";
        }
//        System.out.println("name : " + name);

        setTitle(name);



        setLayout(new BorderLayout());

        sender = new MessageSender(name);

        messageReceiverUI = new MessageReceiverUI();
        messageReceiverUI.getMsgArea().append(Helper.welcomMsg());
        receiver = new MessageReceiver(messageReceiverUI);

        messageSenderUI = new MessageSenderUI(sender);

        add(messageReceiverUI, BorderLayout.CENTER);
        add(messageSenderUI, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



//        Thread threadSender = new Thread(sender);
        Thread threadReceiver = new Thread(receiver);

        threadReceiver.start();
//        threadSender.start();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
