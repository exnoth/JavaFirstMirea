package ru.mirea.task6;

interface Movable
{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();


}

class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x =x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "x position is: " + this.x +
                "\n" + "y position is: " + this.y
                + "\n" + "xSpeed is: " + this.xSpeed +
                "\n" + "ySpeed is: " + this.ySpeed;
    }


    public void moveUp()
    {
        y+=ySpeed;
    }

    public void moveDown()
    {
        y-=ySpeed;
    }

    public void moveLeft()
    {
        x-=xSpeed;
    }

    public void moveRight()
    {
        x+=xSpeed;
    }
}

class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        super(x, y, xSpeed, ySpeed);
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public void moveLeft()
    {
        super.moveLeft();
    }

    public void moveRight()
    {
        super.moveRight();
    }

    public void moveUp()
    {
        super.moveUp();
    }

    public void moveDown()
    {
        super.moveDown();
    }

    public String toString()
    {
        return super.toString() + "\n" + "The radius is: " + this.radius;
    }
}
