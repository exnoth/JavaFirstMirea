package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel
{
    private JFrame frame;
    private Image image;

    public Picture()
    {
        frame = new JFrame("WHO'S THAT");
        frame.setSize(563, 764);
        //frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        image = new ImageIcon("C:\\Users\\алина\\OneDrive\\Рабочий стол\\поис\\OIxmYki-GOQ.jpg").getImage();
    }
    public void paint(Graphics ex)
    {
        ex.drawImage(image, 0, 0, null);
    }
}
