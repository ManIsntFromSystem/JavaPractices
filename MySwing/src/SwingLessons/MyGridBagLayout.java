package SwingLessons;

import javax.swing.*;
import java.awt.*;

public class MyGridBagLayout {

    static JFrame jfrm = getFrame();

    static JPanel jpan = new JPanel();

    public static void main(String[] args) {

        jfrm.add(jpan);
        GridBagLayout gbagl = new GridBagLayout();
        jpan.setLayout(gbagl);

        GridBagConstraints constr = new GridBagConstraints();
        constr.weightx = 0;
        constr.weighty = 0;
        constr.gridx = 0;
        constr.gridy = 0;
        constr.gridheight = 2;
        constr.gridwidth = 2;

        var jtextArea = new JTextArea(5,20);
        jpan.add(new JScrollPane(jtextArea), constr);

        GridBagConstraints constr2 = new GridBagConstraints();
        constr.weightx = 0;
        constr.weighty = 0;
        constr.gridx = 2;
        constr.gridy = 0;
        constr.gridheight = 5;
        constr.gridwidth = 2;

        jpan.add(new JButton("Pick me"), constr2);

        jpan.revalidate();
    }
    public static JFrame getFrame() {
        JFrame jfrm = new JFrame("A Simple Swing Application ");

        jfrm.setSize(350,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        return jfrm;
    }
}
