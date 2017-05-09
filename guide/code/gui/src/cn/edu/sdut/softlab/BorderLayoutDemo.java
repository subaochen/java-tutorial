package cn.edu.sdut.softlab;

import javax.swing.*;

/**
 * Created by subaochen on 17-2-7.
 */
public class BorderLayoutDemo {
    private JButton northButton;
    private JPanel panel1;
    private JButton westButton;
    private JButton eastButton;
    private JButton southButton;
    private JButton centerButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setContentPane(new BorderLayoutDemo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
