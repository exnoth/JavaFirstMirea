package ru.mirea.task6;

import java.util.Scanner;

public class TestPrintable
{
    public static void main(String args[])
    {
        Printable[] bnm = new Book[3];
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String a, t;
        int c;
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter the code of the book: ");
            c = sc1.nextInt();
            System.out.println("Enter the author of the book: ");
            a = sc.nextLine();
            System.out.println("Enter the title of the book: ");
            t = sc.nextLine();
            bnm[i] = new Book(c,a,t);
        }
        System.out.println();
        System.out.println("The collection includes: ");
        System.out.println();
        for (int i = 0; i < 3; i++)
        {
            bnm[i].print();
            System.out.println();
        }
    }
}
