package code;

import javax.swing.*;
import java.awt.*;

public class Main {
    // -amend
    public static void main(String[] args) {
        JFrame simFrame = new JFrame();
        simFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simFrame.setSize(800, 800);
        simFrame.setLocation(200, 200);
        simFrame.setLayout(new GridLayout(0, 2));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        simFrame.add(panel1);
        simFrame.add(panel2);
        simFrame.add(panel3);
        simFrame.add(panel4);
        simFrame.setVisible(true);
        //Коммит новой ветки

        Ball ball1 = new Ball(panel1, 1, 10, 15, 15);
        Ball ball2 = new Ball(panel2, 2, 20, 15, 25);
        Ball ball3 = new Ball(panel3, 3, 40, 25, 35);
        Ball ball4 = new Ball(panel4, 4, 80, 35, 35);
        //новая строка
        ball1.start();
        ball2.start();
        ball3.start();
        ball4.start();
        //Опять коммит
    }
}