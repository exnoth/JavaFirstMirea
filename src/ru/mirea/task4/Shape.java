package ru.mirea.task4;

import static java.lang.Math.sqrt;

public abstract class Shape
{

    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public Shape() {}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public boolean isFilled() {return filled;}

    public void setFilled(boolean filled) {this.filled = filled;}

    public String toString()
    {
        return ("The color is: " + color +
                "\nThe fact that the shape is filled is " + filled + ".");
    }


    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends Shape
{
    protected double radius;

    public Circle( double radius)
    {
        this.radius = radius;
    }

    public Circle( double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    public double getArea()
    {
        return 2*3.14*radius*radius;
    }

    public double getPerimeter()
    {
        return 2*3.14*radius;
    }

    public String toString()
    {
        return (super.toString() + "\nthe radius: " + radius);
    }
}

class Rectangle extends Shape
{
    protected double length;
    protected double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled)
    {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public Rectangle() {}

    public double getWidth(){return width;}

    public void setWidth(double width){this.width = width;}

    public double getLength(){return length;}

    public void setLength(double length){this.length = length;}

    public double getArea()
    {
        return length*width;
    }

    public double getPerimeter()
    {
        return 2*(length + width);
    }
    public String toString()
    {
        return (super.toString() + "\nthe length: " + length +
                 "\nthe width: " +  width);
    }
}

class Square extends Rectangle
{

    public Square( double side)
    {
        this.length = side;
        this.width = side;
    }

    public Square( double side, String color, boolean filled)
    {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }

    public double getSide() {return length;}

    public String toString()
    {
        return (super.toString() + "\nthe side : " + length);
    }

}

