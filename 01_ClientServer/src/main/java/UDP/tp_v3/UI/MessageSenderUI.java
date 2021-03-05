package UDP.tp_v3.UI;

import UDP.tp_v3.logic.MessageSender;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MessageSenderUI extends JPanel {

    private JButton sendBtn;
    private JTextField msgTf;
    private MessageSender sender;

    public MessageSenderUI(MessageSender sender) throws IOException {
        msgTf = new JTextField(32);
//        msgTf.setPreferredSize(msgTf.getPreferredSize());
        sendBtn = new JButton("Send");

        this.sender = sender;
        sendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sender.sendFormatted(msgTf.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        setBorder(BorderFactory.createEmptyBorder());

        add(msgTf);
        add(sendBtn);
    }
}
