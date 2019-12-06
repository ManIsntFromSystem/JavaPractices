package partTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonDemo implements ActionListener {
    JLabel jlab;

    public JRadioButtonDemo() {
        JFrame jfrm = new JFrame("JRadioButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(250, 100);

        JRadioButton cb = new JRadioButton("C");
        cb.addActionListener(this);
        jfrm.add(cb);

        JRadioButton cb2 = new JRadioButton("C++");
        cb2.addActionListener(this);
        jfrm.add(cb2);

        JRadioButton cb3 = new JRadioButton("Java");
        cb3.addActionListener(this);
        jfrm.add(cb3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(cb);
        bg.add(cb2);
        bg.add(cb3);

        jlab = new JLabel("Selected One");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jlab.setText("You selected " + e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JRadioButtonDemo::new);
    }
}
