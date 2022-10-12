package ru.mirea.task6;

public class TestMovable
{
    public static void main(String args[])
    {
        Movable one = new MovablePoint(3,4,10,12);
        System.out.println("OG POINT");
        System.out.println(one.toString());
        System.out.println();
        System.out.println("MOVING DOWN");
        one.moveDown();
        System.out.println(one.toString());
        System.out.println();
        System.out.println("MOVING LEFT");
        System.out.println(one.toString());
        System.out.println();
        Movable two = new MovableCircle(5,6,11,13,4);
        System.out.println();
        System.out.println("OG CIRCLE");
        System.out.println(two.toString());
        System.out.println();
        System.out.println("MOVING RIGHT");
        two.moveRight();
        System.out.println(two.toString());
        System.out.println();
        System.out.println("MOVING UP");
        two.moveUp();
        System.out.println(two.toString());
        System.out.println();
    }
}
