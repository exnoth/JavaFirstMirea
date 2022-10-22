package ru.mirea.task7;

public class TestMathCalculable
{
    public static void main(String[] args)
    {
        MathCalculable one = new MathFunc();
        MathCalculable two = new MathFunc();
        MathCalculable three = new MathFunc();
        MathCalculable four = new MathFunc();
        int o = one.exponentiation(2,3);
        double t = two.cabs(5,4);
        double pi = three.pi;
        double f = four.clength(10);

        System.out.println("The result of exponentiation is: " + o + "\n"
                + "The abs of a complex number is: " + t + "\n" +
                "The PI: " + pi + "\n" +
                "The length of a circle: " + f);
    }
}
