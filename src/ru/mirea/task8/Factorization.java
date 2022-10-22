package ru.mirea.task8;

import java.util.Scanner;

public class Factorization
{
    public static void rec(int n, int k)
    {
        if(k > n/2)
        {
            System.out.println(n);
            return;
        }
        if(n%k == 0)
        {
            System.out.println(k);
            rec(n/k, k);
        }
        else
            rec(n, ++k);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        rec(n,2);
    }
}
