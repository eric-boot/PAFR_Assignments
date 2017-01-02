package Assignment_2.src.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class MainGUI {
    private CommandInput commandInput;
    private Logs logs;
    private Output output;
    private JPanel rootPanel;

    public static void main(String[]args ) {
        JFrame frame = new JFrame("MainGUI");
        frame.setContentPane(new MainGUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridBagLayout());
        rootPanel.setMinimumSize(new Dimension(1600, 900));
        rootPanel.setPreferredSize(new Dimension(1600, 900));
        final Logs nestedForm1 = new Logs();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        rootPanel.add(nestedForm1.$$$getRootComponent$$$(), gbc);
        final Output nestedForm2 = new Output();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        rootPanel.add(nestedForm2.$$$getRootComponent$$$(), gbc);
        final CommandInput nestedForm3 = new CommandInput();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        rootPanel.add(nestedForm3.$$$getRootComponent$$$(), gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
