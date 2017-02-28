package cn.edu.sdut.softlab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by subaochen on 17-2-6.
 */
public class JComboBoxDemo {
    private JComboBox sports;
    private JLabel picture;
    private JPanel mainPanel;

    private Map<String,String> map = new HashMap<>();
    {
        map.put("足球","football");
        map.put("篮球","basketball");
        map.put("游泳","swimming");
        map.put("网球","tennis");
    }

    public JComboBoxDemo() {

        sports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JComboBox cb = (JComboBox)actionEvent.getSource();
                String sport = (String)cb.getSelectedItem();
                picture.setIcon(new ImageIcon(JComboBoxDemo.class.getResource("/images/"
                        + map.get(sport) + ".png")));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBoxDemo");
        frame.setContentPane(new JComboBoxDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
