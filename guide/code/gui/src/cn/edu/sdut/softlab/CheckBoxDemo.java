package cn.edu.sdut.softlab;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by subaochen on 17-2-5.
 */
public class CheckBoxDemo {
    private JCheckBox footballBox;
    private JCheckBox basketBallBox;
    private JCheckBox tennisBox;
    private JCheckBox swimmingBox;
    private JPanel mainPanel;
    private JLabel sportLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBoxDemo");
        frame.setContentPane(new CheckBoxDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CheckBoxDemo() {

        footballBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "选择了足球:" + footballBox.isSelected());
            }
        });
        footballBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/football.png")));
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/duke.gif")));
            }
        });
        swimmingBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "选择了游泳:" + swimmingBox.isSelected());
            }
        });
        swimmingBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/swimming.png")));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/duke.gif")));
            }
        });
        tennisBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "选择了网球:" + tennisBox.isSelected());

            }
        });
        tennisBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/tennis.png")));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/duke.gif")));
            }
        });
        basketBallBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "选择了篮球:" + basketBallBox.isSelected());
            }
        });
        basketBallBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/baseketball.png")));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/duke.gif")));
            }
        });
        footballBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
            }
        });
    }
}
