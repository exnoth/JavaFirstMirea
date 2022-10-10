package ru.mirea.task5;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation extends JPanel
{
    private JFrame frame;
    private java.util.Timer timer;
    private Image image;
    private int count;
    public Animation() {
        count = 0;
        frame = new JFrame("what da cat doin");
        frame.setSize(721,496);
        frame.getContentPane().setBackground(Color.RED);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        timer = new Timer();
        timer.schedule(play, 1,180);
    }
    TimerTask play = new TimerTask() {
        public void run() {
            switch (count) {
                case 0:
                    image = new ImageIcon("C:\\Users\\алина\\Downloads\\first.png").getImage();
                    break;
                case 1:
                    image = new ImageIcon("C:\\Users\\алина\\Downloads\\second.png").getImage();
                    break;
                case 2:
                    image = new ImageIcon("C:\\Users\\алина\\Downloads\\third.png").getImage();
                    break;
                case 3:
                    image = new ImageIcon("C:\\Users\\алина\\Downloads\\last.png").getImage();
                    break;
                default:
                    break;
            }
            count++;
            if (count == 10) {
                count = 0;
            }
            repaint();
        }
    };

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
}
