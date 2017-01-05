package Assignment_2.src.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class MainGUI {
    private CommandInput commandInput;
    private Output output;
    private Output outputNew;
    public JPanel rootPanel;
    private Logs logs1;
    private JButton newWindowButton;
    private JLabel consoleLogLabel;


    public MainGUI() {
        GUIFacade guiFacade = GUIFacade.getInstance();
        logs1 = new Logs();
        output = new Output();
        outputNew = new Output();

        guiFacade.addObserver(logs1);
        guiFacade.addObserver(output);
        guiFacade.addObserver(outputNew);

        newWindowButton = new JButton();

        $$$setupUI$$$();


        newWindowButton.addActionListener(e -> {
            JFrame frame = new JFrame("Rich rails");
            frame.setContentPane(outputNew.rootPanel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }

    public void createUIComponents() {
    }


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridBagLayout());
        rootPanel.setMinimumSize(new Dimension(500, 400));
        rootPanel.setPreferredSize(new Dimension(1600, 900));
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        rootPanel.add(logs1.$$$getRootComponent$$$(), gbc);
        consoleLogLabel = new JLabel();
        consoleLogLabel.setText("Console Log");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        rootPanel.add(consoleLogLabel, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Text visualization");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        rootPanel.add(label1, gbc);
        final CommandInput nestedForm1 = new CommandInput();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        rootPanel.add(nestedForm1.$$$getRootComponent$$$(), gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        rootPanel.add(output.$$$getRootComponent$$$(), gbc);
        newWindowButton.setText("Open text visualization in new window");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        rootPanel.add(newWindowButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
