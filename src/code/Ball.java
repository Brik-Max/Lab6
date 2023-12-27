package code;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Ball extends Thread {
    private JPanel panel;
    private int step;

    private Direction direction;

    private int size;
    private int x0;
    private int y0;

    public Ball(JPanel panel, int step, int size, int x0, int y0) {
        this.panel = panel;
        this.step = step;
        this.size = size;
        this.x0 = x0;
        this.y0 = y0;
        direction.dir1 = Direction.Up;
        direction.dir2 = Direction.Left;
    }

    @Override
    public void run(){
        int x = x0;
        int y = y0;
        int xdir = +1;
        int ydir = +1;

        panel.setBackground(Color.GRAY);
        Graphics gr = panel.getGraphics();
        while(true){
            gr.setColor(Color.WHITE);
            gr.drawOval(x, y, size, size);
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gr.setColor(Color.GRAY);
            gr.drawOval(x, y, size, size);
            if (x < 0 && Objects.equals(direction.dir1, Direction.Left)) {
                xdir = +1;
                direction.dir1 = Direction.Right;
            }
            if (x > panel.getWidth() - size && Objects.equals(direction.dir1, Direction.Right)) {
                xdir = -1;
                direction.dir1 = Direction.Left;
            }

            if (y < 0 && Objects.equals(direction.dir2, Direction.Up)) {
                ydir = +1;
                direction.dir2 = Direction.Down;
            }
            if (y > panel.getHeight() - size && Objects.equals(direction.dir2, Direction.Down)) {
                ydir = -1;
                direction.dir2 = Direction.Up;
            }

            x += xdir * step;
            y += ydir * step;
        }
    }

}
