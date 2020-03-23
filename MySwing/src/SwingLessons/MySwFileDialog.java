package SwingLessons;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.io.File;

public class MySwFileDialog {
    static JFrame jfrm = getFrame();

    static JPanel jpan = new JPanel();

    public static void main(String[] args) {

        jfrm.add(jpan);
        var jButton = new Button("Show file dialog.");
        jpan.add(jButton);
        jButton.addActionListener(ae ->{
            var color = JColorChooser.showDialog(jpan, "title", Color.BLUE);
            jpan.setBackground(color);
//            var jfileChooser = new JFileChooser();
//            int i = jfileChooser.showDialog(jpan, "Save As");
//            System.out.println(i);
//
//            File file = jfileChooser.getSelectedFile();
//            System.out.println(file.getName());
            /*jfileChooser.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    if (f.getName().endsWith("png"))
                        return true;
                    else return false;
                }

                @Override
                public String getDescription() {
                    return "Only PNG files";
                }
            });*/

//            TextField textField = new TextField();
//            jfileChooser.add(textField, BorderLayout.NORTH);
//            jfileChooser.addPropertyChangeListener(evt -> {
//                textField.setText(evt.getNewValue().toString());
//            });
            //jfileChooser.setMultiSelectionEnabled(true);

            //jfileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);



            //jfileChooser.setCurrentDirectory(new File("."));

            //jfileChooser.setSelectedFile(new File("."));
        });
        jpan.revalidate();
    }

    public static JFrame getFrame() {
        JFrame jfrm = new JFrame("A Simple Swing Application ");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jfrm.setBounds(dimension.width / 2 - 150, dimension.height / 2 - 200, 300,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        return jfrm;
    }
}
