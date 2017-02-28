package cn.edu.sdut.softlab;

import javax.swing.*;

/**
 * Created by subaochen on 17-2-3.
 */
public class JLabelDemo {
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabelDemo");
        frame.setContentPane(new JLabelDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
