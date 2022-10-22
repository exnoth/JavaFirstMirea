package ru.mirea.task8;

public class FromAtoB
{
    public static int recursion(int A, int B)
    {
       if (A > B)
       {
               System.out.println(A);
               recursion(A-1, B);
       }

       else if (A < B)
       {
           System.out.println(A);
           recursion(A+1, B);
       }

       else if(A==B)
           System.out.println(A);

       return -2;


    }


    public static void main(String[] args)
    {
        recursion(10,5);
    }
}
