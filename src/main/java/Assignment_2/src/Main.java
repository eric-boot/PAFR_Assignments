package Assignment_2.src;

import Assignment_2.src.gui.GUIFacade;
import Assignment_2.src.gui.MainGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Boot on 02-01-17.
 */
public class Main {
    public static void main(String[] args){
        Image icon = Toolkit.getDefaultToolkit().getImage("Assignment_2/src/images/bullet_train.png");

        JFrame frame = new JFrame("Rich rails");
        MainGUI mainGui = new MainGUI();

        frame.setContentPane(mainGui.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon);
        frame.pack();
        frame.setVisible(true);

        GUIFacade.getInstance().addLogline("Welcome to RichRails!");
    }
}
