package ru.mirea.task2;

import java.util.Scanner;

public class InverseStringArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the amount of elements:");
        int n = sc.nextInt();
        String[] arr =  new String[n];
        System.out.println("Enter the words");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc1.nextLine();
        }
        System.out.println("The og array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + ' ');
        }
        System.out.println();

        String temp;
        for(int i = 0; i < arr.length/2; i++)
        {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }

        System.out.println("The changed array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + ' ');
        }
    }
}
