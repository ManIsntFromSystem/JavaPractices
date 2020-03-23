package SwingLessons;

import javax.swing.*;
import java.awt.*;

public class MyCustomDialogSw {

    static JFrame jfrm = getFrame();

    static JPanel jpan = new JPanel();

    public static void main(String[] args) {

        jfrm.add(jpan);
        var jButton = new Button("Show dialog.");
        jpan.add(jButton);
        jButton.addActionListener(ae -> {
            MyOwnDialog myOwnDialog = new MyOwnDialog();
            myOwnDialog.setVisible(true);
        });
    }

    static class MyOwnDialog extends JDialog{
        public MyOwnDialog() {
            super(jfrm, "Title", true);
            add(new JTextField(), BorderLayout.NORTH);
            add(new JButton("button"), BorderLayout.SOUTH);
            setBounds(650,350,250,250);
        }
    }


        public static JFrame getFrame() {
            JFrame jfrm = new JFrame("A Simple Swing Application ");

            jfrm.setBounds(800,400,300,400);
            jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jfrm.setVisible(true);
            return jfrm;
        }
}
