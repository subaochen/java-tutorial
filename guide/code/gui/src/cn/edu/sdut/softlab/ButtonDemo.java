package cn.edu.sdut.softlab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by subaochen on 17-2-4.
 */
public class ButtonDemo {
    private JPanel mainPanel;
    private JButton emegencyCallButton;
    private JButton searchButton;
    private JButton disabledButton;

    public ButtonDemo() {
        emegencyCallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // 使用JOptionPane工具类弹出一个消息提示框
                JOptionPane.showMessageDialog(null,"按下了紧急呼叫按钮");
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"按下了查找按钮");
            }
        });
        disabledButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"按下了被禁止的按钮？");
            }
        });
        // 响应右键单击事件
        emegencyCallButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(SwingUtilities.isRightMouseButton(mouseEvent) && mouseEvent.getClickCount() == 1) {
                    JOptionPane.showMessageDialog(null,"右键单击急呼叫按钮");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonDemo");
        frame.setContentPane(new ButtonDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
