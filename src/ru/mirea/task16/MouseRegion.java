package ru.mirea.task16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseRegion extends JFrame
{
    JLabel north = new JLabel("North");
    JLabel east = new JLabel("East");
    JLabel west = new JLabel("West");
    JLabel south = new JLabel("South");
    JLabel center = new JLabel("Center");

    public MouseRegion()
    {
        super("MouseRegion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        Container window = getContentPane();
        window.add(north, BorderLayout.NORTH);
        window.add(east, BorderLayout.EAST);
        window.add(west, BorderLayout.WEST);
        window.add(south, BorderLayout.SOUTH);
        window.add(center, BorderLayout.CENTER);


        north.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent one)
            {
                super.mouseEntered(one);
                north.setText("Welcome to North!");
                JOptionPane.showMessageDialog(null, "Welcome to North!");
            }
        });
        north.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseExited(MouseEvent one)
            {
                super.mouseExited(one);
                north.setText("North");
            }
        });

        east.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent one) {
                super.mouseEntered(one);
                east.setText("Welcome to East!");
                JOptionPane.showMessageDialog(null,"Welcome to East!");
            }
        });
        east.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseExited(MouseEvent one) {
                super.mouseExited(one);
                east.setText("East");
            }
        });

        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent one) {
                super.mouseEntered(one);
                west.setText("Welcome to West!");
                JOptionPane.showMessageDialog(null,"Welcome to West!");
            }
        });

        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent one) {
                super.mouseExited(one);
                west.setText("West");
            }
        });

        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent one) {
                super.mouseEntered(one);
                south.setText("Welcome to South!");
                JOptionPane.showMessageDialog(null,"Welcome to South!");
            }
        });

        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent one) {
                super.mouseExited(one);
                south.setText("South");
            }
        });

        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent one) {
                super.mouseEntered(one);
                center.setText("  Welcome to Center!");
                JOptionPane.showMessageDialog(null,"Welcome to Center!");
            }
        });

        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent one) {
                super.mouseExited(one);
                center.setText("Center");
            }
        });

    }

    public static void main (String[] args)
    {
        new MouseRegion().setVisible(true);
    }
}
