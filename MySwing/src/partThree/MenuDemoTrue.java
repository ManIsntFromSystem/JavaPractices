package partThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemoTrue implements ActionListener {
    JLabel jlab;

    JToolBar jtb;

    JMenuBar jmb;

    JPopupMenu jpopm;

    DebugAction setAct;
    DebugAction clearAct;
    DebugAction resumeAct;

    public MenuDemoTrue() {

        JFrame jfrm = new JFrame("MenuDemoTrue");
        jfrm.setSize(360, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlab = new JLabel();

        jmb = new JMenuBar();

        makeFileMenu();

        makeActions();

        makeToolBar();

        makeOptionsMenu();

        makeHelpMenu();

        makeEditPopMenu();

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

        jfrm.add(jlab, SwingConstants.CENTER);
        jfrm.add(jmb, BorderLayout.NORTH);
        jfrm.setJMenuBar(jmb);
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comStr = e.getActionCommand();

        if (comStr.equals("Exit"))
            System.exit(0);
        jlab.setText(comStr + " Selected");
    }

    class DebugAction extends AbstractAction {

        public DebugAction(String name, Icon image,
                           int mnem, int accel, String tTip) {
            super(name, image);

            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, mnem);
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

    private void makeFileMenu() {

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

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
    }


    private void makeOptionsMenu() {
        JMenu jmOptions = new JMenu("Options");

        JMenu jmColors = new JMenu("Colors");
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");

        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        JMenu jmPrior = new JMenu("Priority ");

        JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High", true);
        JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");

        jmPrior.add(jmiHigh);
        jmPrior.add(jmiLow);
        jmOptions.add(jmPrior);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

        JMenu jmDebug = new JMenu("Debug");

        JMenuItem jmiSetBP = new JMenuItem(setAct);
        JMenuItem jmiClearBP = new JMenuItem(clearAct);
        JMenuItem jmiResumeBP = new JMenuItem(resumeAct);

        jmDebug.add(jmiSetBP);
        jmDebug.add(jmiClearBP);
        jmDebug.add(jmiResumeBP);
        jmOptions.add(jmDebug);

        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        jmb.add(jmOptions);

        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
    }

    private void makeHelpMenu() {
        JMenu jmHelp = new JMenu("Help");

        ImageIcon icon = new ImageIcon("creative.png");
        JMenuItem jmiAbout = new JMenuItem("About", icon);
        jmiAbout.setToolTipText("Info about the MenuDemo program.");

        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        jmiAbout.addActionListener(this);
    }

    public void makeActions() {
        ImageIcon setIcon = new ImageIcon("setting.png");
        ImageIcon clearIcon = new ImageIcon("trash.png");
        ImageIcon resumeIcon = new ImageIcon("setting.png");

        setAct = new DebugAction("Set Breakpoint", setIcon,KeyEvent.VK_S, KeyEvent.VK_B, "Set break" );

        clearAct = new DebugAction("Clear Breakpoint", clearIcon, KeyEvent.VK_C, KeyEvent.VK_L, "Clear break point.");

        resumeAct = new DebugAction("Resume Breakpoint", resumeIcon, KeyEvent.VK_R, KeyEvent.VK_R, "Resume execution after breakpoint.");

        clearAct.setEnabled(false);
    }

    private void makeToolBar() {

        JButton jbtnSet = new JButton(setAct);
        JButton jbtnClear = new JButton(clearAct);
        JButton jbtnResume = new JButton(resumeAct);

        jtb = new JToolBar("Breakpoints");

        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);
    }

    private void makeEditPopMenu() {

        jpopm = new JPopupMenu();

        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");

        jpopm.add(jmiCut);
        jpopm.add(jmiCopy);
        jpopm.add(jmiPaste);

        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuDemoTrue::new);
    }
}
