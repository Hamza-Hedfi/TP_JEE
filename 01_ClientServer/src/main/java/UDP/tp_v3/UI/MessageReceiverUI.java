package UDP.tp_v3.UI;

import javax.swing.*;
import java.awt.*;

public class MessageReceiverUI extends JPanel{
    private JTextArea msgArea;

    public MessageReceiverUI() {
        msgArea = new JTextArea(20,20);
        msgArea.setEditable(false);



        setLayout(new BorderLayout());
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Messages"), BorderFactory.createEmptyBorder(2,2,2,2)));

        add(msgArea, BorderLayout.CENTER);
    }

    public JTextArea getMsgArea() {
        return msgArea;
    }
}
