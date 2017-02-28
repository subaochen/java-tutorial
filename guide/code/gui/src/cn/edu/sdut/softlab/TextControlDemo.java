package cn.edu.sdut.softlab;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Created by subaochen on 17-2-3.
 */
public class TextControlDemo {
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JPasswordField passwordField1;
    private JLabel typedContent;
    private JPanel mainPanel;


    public TextControlDemo() {
        // 这里只是监听了失去焦点的事件：当失去焦点时，在最下面的Label区域显示该输入框的当前内容
        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent focusEvent) {
                super.focusLost(focusEvent);
                typedContent.setText("输入的内容为：" + textField1.getText());
            }
        });
        formattedTextField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent focusEvent) {
                super.focusLost(focusEvent);
                // @TODO 没有验证输入内容的格式是否合法
                typedContent.setText("输入的内容为：" + formattedTextField1.getText());
            }
        });
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent focusEvent) {
                super.focusLost(focusEvent);
                // @TODO getText为过时的方法
                typedContent.setText("输入的内容为：" + passwordField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextControlDemo");
        frame.setContentPane(new TextControlDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
