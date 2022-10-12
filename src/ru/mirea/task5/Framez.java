package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Framez extends JFrame
{
    public Framez(String title)
    {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1000,800);
        setVisible(true);
    }
    class shapes extends JComponent
    {
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Random rnd = new Random();
            for (int i = 0; i < 20; i++)
            {
                boolean b = rnd.nextBoolean();
                if(b)
                {
                    RandomCirc one = new RandomCirc();
                    g.drawOval(one.getX(), one.getY(), one.getRad(), one.getRad());
                    g.setColor(one.getColor());
                }
                else
                {
                    RandomRec two = new RandomRec();
                    g.drawRect(two.getX(), two.getY(), two.getW(), two.getH());
                    g.setColor(two.getColor());
                }
            }
        }
    }
    public void DrawRandomShape()
    {
        shapes shapes = new shapes();
        add(shapes);
    }
}
