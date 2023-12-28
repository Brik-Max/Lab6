package code;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Ball extends Thread {
    private final Direction direction = new Direction(); // Направление движения мяча
    private final JPanel panel;
    private final int step;
    private final int size;
    private final int x0;
    private final int y0;

    public Ball(JPanel panel, int step, int size, int x0, int y0) {
        this.panel = panel;
        this.step = step;
        this.size = size;
        this.x0 = x0;
        this.y0 = y0;
        direction.dir1 = Direction.Right;
        direction.dir2 = Direction.Down;
    }

    @Override
    public void run() {
        int x = x0;
        int y = y0;
        int x_dir = 1;
        int y_dir = 1;

        panel.setBackground(Color.GRAY);
        Graphics gr = panel.getGraphics();

        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (x < 0) {
                if (Objects.equals(direction.dir1, Direction.Left)) {
                    x_dir = 1;
                    direction.dir1 = Direction.Right;
                }
            }

            if (x > panel.getWidth() - size) {
                if (Objects.equals(direction.dir1, Direction.Right)) {
                    x_dir = -1;
                    direction.dir1 = Direction.Left;
                }
            }

            if (y < 0) {
                if (Objects.equals(direction.dir2, Direction.Up)) {
                    y_dir = 1;
                    direction.dir2 = Direction.Down;
                }
            }

            if (y > panel.getHeight() - size) {
                if (Objects.equals(direction.dir2, Direction.Down)) {
                    y_dir = -1;
                    direction.dir2 = Direction.Up;
                }
            }

            x += x_dir * step;
            y += y_dir * step;

            paint(gr, x, y);
        }
    }

    public void paint(Graphics g, int x, int y) {
        Image img = createImageOval(x, y);
        g.drawImage(img, 0, 0, null);
    }

    private Image createImageOval(int x, int y) { // Создание изображения с помощью двойной буферизации
        BufferedImage bufferedImage = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        g.setColor(Color.GRAY);
        g.fillRect(1, 1, panel.getWidth() - 1, panel.getHeight() - 1);
        g.setColor(Color.WHITE);
        g.drawOval(x, y, size, size);

        return bufferedImage;
    }
}
