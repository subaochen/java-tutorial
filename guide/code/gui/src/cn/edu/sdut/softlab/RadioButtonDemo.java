package cn.edu.sdut.softlab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by subaochen on 17-2-6.
 */
public class RadioButtonDemo implements ActionListener {
    private JRadioButton swimming;
    private JRadioButton tennis;
    private JRadioButton basketball;
    private JRadioButton football;
    private JPanel mainPanel;
    private JLabel sportLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButtonDemo");
        frame.setContentPane(new RadioButtonDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public RadioButtonDemo() {
        swimming.setActionCommand("swimming");
        swimming.addActionListener(this);
        tennis.setActionCommand("tennis");
        tennis.addActionListener(this);
        basketball.setActionCommand("basketball");
        basketball.addActionListener(this);
        football.setActionCommand("football");
        football.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        sportLabel.setIcon(new ImageIcon(RadioButtonDemo.class.getResource("/images/"
                + actionEvent.getActionCommand() + ".png")));
    }
}
