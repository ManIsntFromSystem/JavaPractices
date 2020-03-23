package partTwo;

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneDemo  {
    public JTabbedPaneDemo() {
        JFrame jfrm = new JFrame("JTabbedPaneDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 500);

        ImageIcon icon = new ImageIcon("creative.png");

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", icon, new CitiesPanel());
        jtp.addTab("Colors", new ColorsPanel());
        jtp.addTab("Flavors", new FlavorsPanel());
        jfrm.add(jtp);

        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTabbedPaneDemo::new);
    }

    private static class CitiesPanel extends JPanel {
        public CitiesPanel(){
            JButton b1 = new JButton("New York");
            add(b1);
            JButton b2 = new JButton("London");
            add(b2);
            JButton b3 = new JButton("Tokyo");
            add(b3);
            JButton b4 = new JButton("Hong Kong");
            add(b4);
        }
    }

        private static class ColorsPanel extends JPanel {
            public ColorsPanel() {
                JCheckBox cb11 = new JCheckBox("Red");
                add(cb11);
                JCheckBox cb2 = new JCheckBox("Green");
                add(cb2);
                JCheckBox cb3 = new JCheckBox("Yellow");
                add(cb3);
            }
        }

    private static class FlavorsPanel extends JPanel {
        public FlavorsPanel() {
            JComboBox<String> jc = new JComboBox<>();
            jc.addItem("Vanilla");
            jc.addItem("Chocolate");
            jc.addItem("Strawberry");
            add(jc);
        }
    }
}
