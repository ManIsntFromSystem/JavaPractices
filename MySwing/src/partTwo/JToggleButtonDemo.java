package partTwo;

import javax.swing.*;
import java.awt.*;

public class JToggleButtonDemo {
    public JToggleButtonDemo() {
        JFrame jfrm = new JFrame("JToggleButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 100);


        JLabel jlab = new JLabel("Button is off");

        JToggleButton jtb = new JToggleButton("On/Off");

        jtb.addItemListener(e -> {
            if(jtb.isSelected())
                jlab.setText("Button is on.");
            else
                jlab.setText("Button is off.");
        });
        jfrm.add(jtb);

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(JToggleButtonDemo::new);
    }
}
