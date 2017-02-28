package cn.edu.sdut.softlab;

import javax.swing.*;

/**
 * Created by subaochen on 17-2-7.
 */
public class BorderLayoutDemo {
    private JButton button1Button;
    private JPanel panel1;
    private JButton button2Button;
    private JButton button4Button;
    private JButton button5Button;
    private JButton button3Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setContentPane(new BorderLayoutDemo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
