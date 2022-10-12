package ru.mirea.task5;

import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;

public abstract class RandomShape
{
    private Color color;
    private int x;
    private int y;
    public RandomShape()
    {
        Random rnd = new Random();
        int R = rnd.nextInt(255);
        int G = rnd.nextInt(255);
        int B = rnd.nextInt(255);
        this.color = new Color(R,G,B);
        this.x = rnd.nextInt(1000);
        this.y = rnd.nextInt(500);
    }

    public Color getColor()
    {
        return color;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}

class RandomCirc extends RandomShape
{
    int rad;

    public RandomCirc()
    {
        super();
        Random rnd = new Random();
        this.rad = rnd.nextInt(250);
    }

    public int getRad()
    {
        return rad;
    }
}

class RandomRec extends RandomShape
{
    int h;
    int w;

    public RandomRec()
    {
        super();
        Random rnd = new Random();
        this.h = rnd.nextInt(250);
        this.w = rnd.nextInt(250);
    }

    public int getH()
    {
        return h;
    }

    public int getW()
    {
        return w;
    }
}


