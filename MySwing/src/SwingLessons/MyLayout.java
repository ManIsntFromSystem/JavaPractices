package SwingLessons;

import javax.swing.*;
import java.awt.*;

public class MyLayout  {

    static JFrame jfrm = getFrame();

    static JPanel jpan = new JPanel();

    public static void main(String[] args) {
        jfrm.add(jpan);
        jpan.setLayout(new MyOwnLayout());
        jpan.add(new Button("submit1"));
        jpan.add(new Button("submit2"));
        jpan.add(new Button("submit3"));
    }

    public static JFrame getFrame() {
        JFrame jfrm = new JFrame("A Simple Swing Application ");

        jfrm.setSize(350,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        return jfrm;
    }

   static class MyOwnLayout implements LayoutManager {
       @Override
       public void addLayoutComponent(String name, Component comp) {

       }

       @Override
       public void removeLayoutComponent(Component comp) {

       }

       @Override
       public Dimension preferredLayoutSize(Container parent) {
           return null;
       }

       @Override
       public Dimension minimumLayoutSize(Container parent) {
           return null;
       }

       @Override
       public void layoutContainer(Container parent) {
           for (int i = 0; i < parent.getComponentCount(); i++) {
               Component component = parent.getComponent(i);
               component.setBounds(i * 100, i * 40, 100, 40);
           }
       }
   }
}
