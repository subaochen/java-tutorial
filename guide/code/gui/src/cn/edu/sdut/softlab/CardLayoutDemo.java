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
public class CardLayoutDemo {
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField textField1;
    private JPanel buttonPanel;
    private JPanel textFieldPanel;
    private JPanel cardPanel;


    public CardLayoutDemo() {

        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                CardLayout cl = (CardLayout)cardPanel.getLayout();
                cl.show(cardPanel,(String)itemEvent.getItem());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setContentPane(new CardLayoutDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
