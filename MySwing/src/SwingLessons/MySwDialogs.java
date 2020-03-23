package SwingLessons;

import javax.swing.*;
import java.awt.*;

public class MySwDialogs {
    static JFrame jfrm = getFrame();

    static JPanel jpan = new JPanel();

    public static void main(String[] args) {

        jfrm.add(jpan);
        var jButton = new Button("Show dialog.");
        jpan.add(jButton);
        jButton.addActionListener(ae -> {
            //JOptionPane.showMessageDialog(jpan, "This is my Dialog", "title", JOptionPane.INFORMATION_MESSAGE);
            //System.out.println(JOptionPane.showConfirmDialog(jpan, "This is ConfirmDialog", "title", JOptionPane.OK_CANCEL_OPTION));
//            JOptionPane.showOptionDialog(jpan, "This is a Option dialog", "title", JOptionPane.OK_CANCEL_OPTION,
//                    JOptionPane.INFORMATION_MESSAGE,  null, new Object[]{"one", "two", "three"}, "two");
            System.out.println(JOptionPane.showInputDialog(jpan, "Message"));
        });
        jpan.revalidate();
    }
    public static JFrame getFrame() {
        JFrame jfrm = new JFrame("A Simple Swing Application ");

        jfrm.setBounds(800,400,300,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        return jfrm;
    }
}
