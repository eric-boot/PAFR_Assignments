package Assignment_2.src.gui;

import javax.swing.*;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class CommandInput extends JFrame {
    private JPanel rootPanel;
    private JTextField commandTextField;
    private JLabel command;
    private JButton executeButton;

    private void createUIComponents() {

        setContentPane(rootPanel);
        pack();

        executeButton.addActionListener( e -> {
            //TODO perform action onclick
            if(commandTextField.getText() != null){

            } else {

            }
        });

        setVisible(true);

    }
}
