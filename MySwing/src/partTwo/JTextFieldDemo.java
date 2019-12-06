package partTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo {
    public JTextFieldDemo() {
        JFrame jfrm = new JFrame("JTextFieldDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260, 120);

        JTextField jtf = new JTextField(15);
        jfrm.add(jtf);

        JLabel jlab = new JLabel();
        jfrm.add(jlab);

        jtf.addActionListener(e -> jlab.setText(jtf.getText()));

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTextFieldDemo::new);
    }
}
