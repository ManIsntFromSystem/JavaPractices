package SwingLessons;

import javax.swing.*;
import java.awt.*;

public class MyFocus {
    static JFrame jfrm = getFrame();

    static JPanel jpan = new JPanel();

    public static void main(String[] args) {

        jfrm.add(jpan);
        jpan.add(new Button("submit1"));
        jpan.add(new Button("submit2")).setFocusable(false);
        jpan.add(new Button("submit3")).requestFocusInWindow();
    }
    public static JFrame getFrame() {
        JFrame jfrm = new JFrame("A Simple Swing Application ");

        jfrm.setSize(350,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        return jfrm;
    }
}
