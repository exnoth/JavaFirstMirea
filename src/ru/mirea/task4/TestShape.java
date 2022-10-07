package ru.mirea.task4;

public class TestShape
{
    public static void main(String[] args)
    {

        System.out.println("THE CIRCLE: ");
        Shape one = new Circle(4, "black", true);
        System.out.println(one.toString());
        System.out.println("The area: " + one.getArea());
        System.out.println("The perimeter: " + one.getPerimeter());

        System.out.println();
        System.out.println("THE RECTANGLE: ");
        Shape two = new Rectangle(2,5, "magenta", false);
        System.out.println(two.toString());
        System.out.println("The area: " + two.getArea());
        System.out.println("The perimeter: " + two.getPerimeter());

        System.out.println();
        System.out.println("THE SQUARE: ");
        Shape three = new Square(2, "bluish grey", true);
        System.out.println(three.toString());
        System.out.println("The area: " + three.getArea());
        System.out.println("The perimeter: " + three.getPerimeter());

    }
}
