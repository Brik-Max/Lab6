package code;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLocation(200,200);
        frame.setLayout(new GridLayout(0,2));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.setVisible(true);
        //Коммит новой ветки

        Ball ball1 = new Ball(panel1, 2, 10, 15, 15);
        Ball ball2 = new Ball(panel2, 2, 20, 15, 25);
        Ball ball3 = new Ball(panel3, 2, 40, 25, 35);
        Ball ball4 = new Ball(panel4, 2, 80, 35, 35);
        //новая строка
        ball1.start();
        ball2.start();
        ball3.start();
        ball4.start();
        //Опять коммит
    }
}