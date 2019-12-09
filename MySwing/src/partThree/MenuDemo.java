package partThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo implements ActionListener {

    JLabel jlab;

    JToolBar jtb;

    JMenuBar jmb;

    JPopupMenu jpopm;

    DebugAction1 setAct;
    DebugAction1 clearAct;
    DebugAction1 resumeAct;

    public MenuDemo() {

        JFrame jfrm = new JFrame("MenuDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(360, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jmb = new JMenuBar();

        JMenu jmFile = new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F);

        JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
        jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.add(jmiExit);

        jmb.add(jmFile);

        JMenu jmOptions = new JMenu("Options");

        JMenu jmColors = new JMenu("Colors");
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");

       /* JMenuItem jmiRed = new JMenuItem("Red");
        JMenuItem jmiGreen = new JMenuItem("Green");
        JMenuItem jmiBlue = new JMenuItem("Blue");*/

        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        JMenu jmPrior = new JMenu("Priority");

        JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High", true);
        JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");
//        JMenuItem jmiHigh = new JMenuItem("High");
//        JMenuItem jmiLow = new JMenuItem("Low");

        jmPrior.add(jmiHigh);
        jmPrior.add(jmiLow);
        jmOptions.add(jmPrior);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        jmb.add(jmOptions);

        JMenu jmHelp = new JMenu("Help");

        ImageIcon icon = new ImageIcon("creative.png");
        JMenuItem jmiAbout = new JMenuItem("About", icon);
        jmiAbout.setToolTipText("Info about the MenuDemo program.");

        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);

        jfrm.setJMenuBar(jmb);

        jpopm = new JPopupMenu("Edit");

        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");
        jpopm.add(jmiCut);
        jpopm.add(jmiCopy);
        jpopm.add(jmiPaste);
        jfrm.add(jpopm);

        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);

        jfrm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger())
                    jpopm.show(e.getComponent(), e.getX(), e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger())
                    jpopm.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        jtb = new JToolBar("Debug");

        ImageIcon set = new ImageIcon("setting.png");
        ImageIcon clear = new ImageIcon("trash.png");
        ImageIcon resume = new ImageIcon("setting.png");

        JButton jbtnSet = new JButton(set);
        jbtnSet.setActionCommand("Set Breakpoint");
        jbtnSet.setToolTipText("Set Breakpoint");

        JButton jbtnClear = new JButton(clear);
        jbtnClear.setActionCommand("Clear Breakpoint");
        jbtnClear.setToolTipText("Clear Breakpoint");

        JButton jbtnResume = new JButton(resume);
        jbtnResume.setActionCommand("Resume");
        jbtnResume.setToolTipText("Resume");

        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);
        jfrm.add(jtb, BorderLayout.NORTH);

        jbtnSet.addActionListener(this);
        jbtnClear.addActionListener(this);
        jbtnResume.addActionListener(this);

        ImageIcon setIcon = new ImageIcon("setting.png");
        ImageIcon clearIcon = new ImageIcon("trash.png");
        ImageIcon resumeIcon = new ImageIcon("setting.png");

        setAct = new DebugAction1("Set Breakpoint", setIcon,KeyEvent.VK_S, KeyEvent.VK_B, "Set break" );

        clearAct = new DebugAction1("Clear Breakpoint", clearIcon, KeyEvent.VK_C, KeyEvent.VK_L, "Clear break point.");

        resumeAct = new DebugAction1("Resume Breakpoint", resumeIcon, KeyEvent.VK_R, KeyEvent.VK_R, "Resume execution after breakpoint.");

        clearAct.setEnabled(false);

        JButton jbtnSet1 = new JButton(setAct);
        JButton jbtnClear1 = new JButton(clearAct);
        JButton jbtnResume1 = new JButton(resumeAct);

        JToolBar jtb = new JToolBar("Breakpoints");

        jtb.add(jbtnSet1);
        jtb.add(jbtnClear1);
        jtb.add(jbtnResume1);

        jfrm.add(jtb, BorderLayout.NORTH);

        JMenu jmDebug = new JMenu ("Debug");
        JMenuItem jmiSetBP = new JMenuItem(setAct);
        JMenuItem jmiClearBP = new JMenuItem(clearAct);
        JMenuItem jmiResume = new JMenuItem(resumeAct);

        jmDebug.add(jmiSetBP);
        jmDebug.add(jmiClearBP);
        jmDebug. add ( jmiResume);
        jmOptions.add(jmDebug);

        jfrm.add(jlab, BorderLayout.CENTER);

        jfrm.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String comStr = e.getActionCommand();

        if (comStr.equals("Exit"))
            System.exit(0);
        jlab.setText(comStr + " Selected");
    }

    class DebugAction1 extends AbstractAction {

        public DebugAction1(String name, Icon image,
                           int mnem, int accel, String tTip) {
            super(name, image);

            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, new Integer(mnem));
            putValue(SHORT_DESCRIPTION, tTip);
        }

        public void actionPerformed(ActionEvent ae) {

            String comStr = ae.getActionCommand();

            jlab.setText(comStr + " Selected");

            if (comStr.equals("Set Breakpoint")) {
                clearAct.setEnabled(true);
                setAct.setEnabled(false);
            } else if (comStr.equals("Clear Breakpoint")) {
                clearAct.setEnabled(false);
                setAct.setEnabled(true);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuDemo::new);
    }
}

