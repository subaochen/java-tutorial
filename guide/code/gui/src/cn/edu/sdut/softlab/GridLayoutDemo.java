package cn.edu.sdut.softlab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by subaochen on 17-2-7.
 */
public class GridLayoutDemo {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel buttonPanel;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayoutDemo");
        frame.setContentPane(new GridLayoutDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
