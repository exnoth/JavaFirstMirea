package ru.mirea.task5;

import javax.swing.*;

public class TestMilanVsMadrid
{
    public static void main(String[] args)
    {
        MilanVsMadrid match = new MilanVsMadrid("The new match");
        match.setVisible(true);
        match.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        match.setSize(220,200);
        match.setLocationRelativeTo(null);
    }
}
