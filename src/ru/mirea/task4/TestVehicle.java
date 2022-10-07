package ru.mirea.task4;

public class TestVehicle
{
    public static void main(String[] args)
    {
        System.out.println("An auto:");
        Vehicle one = new Auto(50, 300, 4, 50);
        one.getTime();
        one.CountPrice();
        System.out.println();

        System.out.println("A plane:");
        Vehicle two = new Plane(900, 4000, 100, 400);
        two.getTime();
        two.CountPrice();
        System.out.println();

        System.out.println("A train:");
        Vehicle three = new Train(70, 600, 70, 200);
        three.getTime();
        three.CountPrice();
        System.out.println();

        System.out.println("A ship:");
        Vehicle four = new Ship(30, 1000, 20, 2000);
        four.getTime();
        four.CountPrice();
        System.out.println();
    }


}
