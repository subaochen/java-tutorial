package cn.edu.sdut.softlab;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by subaochen on 17-2-6.
 */
public class JSliderDemo {
    private JSlider slider;
    private JPanel mainPanel;
    private JLabel picture;

    public JSliderDemo() {
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                JSlider slider = (JSlider) changeEvent.getSource();
                int scale = slider.getValue();
                ImageIcon image = new ImageIcon(JSliderDemo.class.getResource("/images/duke.gif"));
                int width = image.getIconWidth();
                int height = image.getIconHeight();
                // 最大放大2倍
                picture.setIcon(new ImageIcon(
                        image.getImage().getScaledInstance(width * scale / 50, height * scale / 50, Image.SCALE_DEFAULT)));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JSliderDemo");
        frame.setContentPane(new JSliderDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
