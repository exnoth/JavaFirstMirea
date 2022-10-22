package ru.mirea.task8;

import java.util.Scanner;

public class PrimeNum
{
    public static boolean rec(int n, int i)
    {
        if(n < 2)
            return false;
        else if(n == 2)
            return true;
        else if (n%i == 0)
            return false;
        else if(i < n/2)
            return rec(n, i+1);
        else
            return true;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        if(rec(n, 2))
            System.out.println("It is prime");
        else
            System.out.println("It is NOT prime");
    }
}
