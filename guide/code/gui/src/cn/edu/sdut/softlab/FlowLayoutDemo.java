package cn.edu.sdut.softlab;

import javax.swing.*;

/**
 * Created by subaochen on 17-2-7.
 */
public class FlowLayoutDemo {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton longNameButtonButton;
    private JRadioButton radioButton2;
    private JButton button6;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayoutDemo");
        frame.setContentPane(new FlowLayoutDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
