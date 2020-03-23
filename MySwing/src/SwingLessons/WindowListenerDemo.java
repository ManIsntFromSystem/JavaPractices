package SwingLessons;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerDemo {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton();
        jFrame.add(jButton);

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Really?");
            }
        });
    }

    public static JFrame getFrame() {
        JFrame jfrm = new JFrame("A Simple Swing Application ");

        jfrm.setSize(275,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        return jfrm;
    }
}
