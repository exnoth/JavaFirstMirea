package ru.mirea.task8;

import java.util.Scanner;

public class FromAtoB
{
    public static int recur(int A, int B)
    {
       if (A > B)
       {
               System.out.println(A);
               recur(A-1, B);
       }

       else if (A < B)
       {
           System.out.println(A);
           recur(A+1, B);
       }

       else if(A==B)
           System.out.println(A);

       return -2;


    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nums: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        recur(n,m);
    }
}
