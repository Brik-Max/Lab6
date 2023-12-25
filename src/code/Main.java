package code;

import javax.swing.*;
import java.awt.*;

public class Main {
    // А это основная ветка main
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

        Ball ball1 = new Ball(panel1,1,50,150,250);
        Ball ball2 = new Ball(panel2,2,10,120,320);
        Ball ball3 = new Ball(panel3,3,20,110,310);
        Ball ball4 = new Ball(panel4,4,20,110,210);

        ball1.start();
        ball2.start();
        ball3.start();
        ball4.start();
    }
}