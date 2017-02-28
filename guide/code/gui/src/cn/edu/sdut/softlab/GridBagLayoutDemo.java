package cn.edu.sdut.softlab;

import javax.swing.*;

/**
 * Created by subaochen on 17-2-7.
 */
public class GridBagLayoutDemo {
    private JPanel mainPanel;
    private JButton buttonAButton;
    private JButton buttonBButton;
    private JButton anotherButtonButton;
    private JButton aLongNameButtonButton;
    private JButton lastButtonButton;
    private JButton buttonCButton;
    private JButton buttonDButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setContentPane(new GridBagLayoutDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
