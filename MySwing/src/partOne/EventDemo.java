package partOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo {

    JLabel jlab;
    public EventDemo() {
        JFrame jfrm = new JFrame("An Event Example");

        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");

        jbtnAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha was pressed");
                System.out.println("Alpha was pressed");
            }
        });

        jbtnAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta was pressed");
                System.out.println("Beta was pressed");
            }
        });

        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);

        jlab = new JLabel("Press a button");

        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
