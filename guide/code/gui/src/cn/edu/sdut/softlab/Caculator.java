package cn.edu.sdut.softlab;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by subaochen on 17-2-9.
 */
public class Caculator implements ActionListener {
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton devideBtn;
    private JTextField result;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multiplyBtn;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton substractBtn;
    private JButton a0Button;
    private JButton addBtn;
    private JPanel mainPanel;
    private JButton cButton;
    private JButton delButton;
    private JButton x2Button;
    private JButton equalBtn;
    private JButton pointBtn;
    private JButton percentBtn;

    private StringBuilder expression; // 需要计算的表达式

    public Caculator() {
        expression = new StringBuilder();
        a0Button.addActionListener(this);
        a1Button.addActionListener(this);
        a2Button.addActionListener(this);
        a3Button.addActionListener(this);
        a4Button.addActionListener(this);
        a5Button.addActionListener(this);
        a6Button.addActionListener(this);
        a7Button.addActionListener(this);
        a8Button.addActionListener(this);
        a9Button.addActionListener(this);
        pointBtn.addActionListener(this);
        percentBtn.addActionListener(this);
        equalBtn.addActionListener(this);
        addBtn.addActionListener(this);
        substractBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);
        devideBtn.addActionListener(this);
        delButton.addActionListener(this);
        x2Button.addActionListener(this);
        cButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = actionEvent.getActionCommand();
        switch (cmd) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "+":
            case "-":
            case "*":
            case "/":
            case ".":
            case "%":
                expression.append(cmd);
                break;
            case "=":
                // 计算结果
                expression.append("=" + caculate(expression));
                break;
            case "C":
                expression = new StringBuilder();
                break;
            case "x^2":
                expression.append("^2");
                break;
            case "del":
                expression.deleteCharAt(expression.length() - 1);
                break;
        }

        result.setText(expression.toString());
    }

    private String caculate(StringBuilder expression) {
        String result = "";
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            System.out.println("expression=" + expression);
            result = engine.eval(expression.toString()).toString();
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Caculator");
        frame.setContentPane(new Caculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
