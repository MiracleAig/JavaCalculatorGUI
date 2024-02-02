package CalculatorGUI;
import javax.swing.*;

import java.awt.*;

import static java.awt.SystemColor.text;

public class CalculatorGUI {

    public CalculatorGUI(String windowName, int windowWidth, int windowHeight, boolean setVisible){
        JFrame jFrame = new JFrame(windowName);
        jFrame.setSize(windowWidth, windowHeight);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
        JLabel jLabel = new JLabel("Some basic text");
        jFrame.add(jLabel); // Add the label to the frame
        JButton button = new JButton("test");
        button.setSize(50,50);
        jFrame.add(button);

        jFrame.setVisible(setVisible); // Set the visibility after adding components
        jFrame.pack();
    }

    public JButton addButton(String text){
        JButton jButton = new JButton(text);
        return jButton;
    }




}
