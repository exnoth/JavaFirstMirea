package ru.mirea.task3;

import java.util.Random;
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        while(true)
        {
            if ((n = sc.nextInt()) > 0)
            {

                break;
            }
                System.out.println("Incorrect input. Try again");
        }


        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(n);
        }
        System.out.println("The array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        int[] even = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]%2 == 0)
            {
                even[c] = arr[i];
                c++;
            }
        }


        if(c>0)
        {
            System.out.println('\n' + "The array of even numbers: ");
            for(int i = 0; i < c; i++)
            {
                System.out.print(even[i] + " ");
            }
        }
        else
            System.out.println("There were no even numbers");
    }
}
