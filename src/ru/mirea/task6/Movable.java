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

    public boolean SpeedTest(MovablePoint point)
    {
        return (xSpeed == point.xSpeed && ySpeed == point.ySpeed) ? true : false;
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


class MovableRectangle implements Movable
{
    MovablePoint topLeft;
    MovablePoint bottomRight;


    public MovableRectangle(int x0, int y0, int x1, int y1, int xSpeed, int ySpeed)
    {
        this.topLeft = new MovablePoint(x0,y0,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x1,y1,xSpeed,ySpeed);

        if(!topLeft.SpeedTest(bottomRight))
        {
            System.out.println("The speed parameters are not equal!");
        }
    }

    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public String toString()
    {
        return "THe top left point: " + topLeft.toString() + "\n" +
                "The bottom right point: " + bottomRight.toString();
    }
}
