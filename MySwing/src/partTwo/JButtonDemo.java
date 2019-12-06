package partTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo implements ActionListener{
    JLabel jlab;
    public JButtonDemo() {
        JFrame jfrm = new JFrame("JButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(650, 650);

        ImageIcon hourglass = new ImageIcon("hourglass.png");
        JButton jb = new JButton(hourglass);
        jb.setActionCommand("Analog clock");
        jb.addActionListener((ActionListener) this);
        jfrm.add(jb);

        ImageIcon digital = new ImageIcon("time.png");
        jb = new JButton(digital);
        jb.setActionCommand("Digital clock");
        jb.addActionListener((ActionListener) this);
        jfrm.add(jb);

        ImageIcon stopwatch = new ImageIcon("time2.png");
        jb = new JButton(stopwatch);
        jb.setActionCommand("StopWatch clock");
        jb.addActionListener((ActionListener) this);
        jfrm.add(jb);

        ImageIcon digital2 = new ImageIcon("time3.png");
        jb = new JButton(digital2);
        jb.setActionCommand("Digital2 clock");
        jb.addActionListener((ActionListener) this);
        jfrm.add(jb);

        jlab = new JLabel("Choice a Timepiece");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(JButtonDemo::new);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jlab.setText("You selected: " + e.getActionCommand());
    }
}
