package ru.mirea.task8;

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
        recur(10,5);
    }
}
