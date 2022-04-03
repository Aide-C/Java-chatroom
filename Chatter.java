import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

import javax.swing.*;

public class Chatter extends JFrame implements IChatter, ActionListener {
    JPanel panel = new JPanel();
    JTextArea messageBoard = new JTextArea();
    JScrollPane bar = new JScrollPane(messageBoard);
    JButton send = new JButton("Send");
    JTextField message = new JTextField();
    JLabel title = new JLabel();
    IServer _server;

    public void newMessage(String from, String message){
        messageBoard.append(from + ": " + message + "\n");
    }

    public void actionPerformed(ActionEvent e){
        _server.newMessage(title.getText(), message.getText());
        message.setText("");
    }

    Chatter(String name, IServer server){
        super();
        _server = server;
        setSize(400, 400);
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        message.setMaximumSize(new Dimension(1000, 1000));
        bar.setSize(300, 300);
        messageBoard.setBounds(5, 5, 500, 500);
        messageBoard.setEditable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        title.setText(name);
        panel.add(title);
        panel.add(bar);
        panel.add(message);
        panel.add(send);
        send.addActionListener(this);
    }
}
