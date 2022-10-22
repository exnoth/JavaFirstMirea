package ru.mirea.task8;

import java.util.Scanner;

public class NumSum
{
    public static int rec(int n)
    {
        if(n < 10)
            return n;
        else
            return n%10 + rec(n/10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        System.out.println(rec(n));
    }
}
