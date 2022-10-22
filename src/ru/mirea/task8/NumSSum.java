package ru.mirea.task8;

import java.util.Scanner;

public class NumSSum
{
    public static int rec(int len, int sum, int k , int s)
    {
        if(len == k)
        {
            if(sum == s)
                return 1;
            else
                return 0;
        }
        int c = (len == 0 ? 1:0);
        int res = 0;
        for(int i = c; i < 10; i++)
        {
            res+=rec(len+1, sum+i, k, s);
        }
        return res;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nums: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(rec(0,0,n,m));
    }
}


