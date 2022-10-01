package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args)
    {
        Ball one = new Ball(0.9, 0.3);
        Ball two = new Ball(10, 2);
        Ball three = new Ball();
        three.setXY(0.34,34.2);
        System.out.println("First" + one.ToString());
        System.out.println("Second" + two.ToString());
        System.out.println("Third" + three.ToString());
        one.setY(13);
        two.setX(9.6);
        three.move(0.66, 0.8);
        System.out.println("First" + one.ToString());
        System.out.println("Second" + two.ToString());
        System.out.println("Third" + three.ToString());

    }
}
