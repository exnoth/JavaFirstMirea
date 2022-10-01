package ru.mirea.task2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {
        this.x+=xDisp;
        this.y+=yDisp;
    }
    public Ball()
    {
        this.x = 0.0;
        this.y = 0.0;

    }

    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String ToString()
    {
        return " Ball (" + this.x +
                ", " + this.y +
                ")";
    }
}
