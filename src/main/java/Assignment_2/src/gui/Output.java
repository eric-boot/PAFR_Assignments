package Assignment_2.src.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class Output {
    private JTextArea TextArea;
    private JPanel rootPanel;


    public Output() {

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
        rootPanel.setLayout(new BorderLayout(0, 0));
        TextArea = new JTextArea();
        TextArea.setEditable(false);
        TextArea.setText("");
        rootPanel.add(TextArea, BorderLayout.CENTER);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
