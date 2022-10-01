package ru.mirea.task1;
import java.util.Scanner;
public class Factorial {
    static int Factorial(int x)
    {
        for (int i = x-1; i > 0; i--)
        {
            x= x*i;
        }
        return x;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("The factorial of this number is: " + Factorial(a));
    }
}
