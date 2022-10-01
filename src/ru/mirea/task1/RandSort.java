package ru.mirea.task1;
import java.util.Random;
import java.util.Scanner;
public class RandSort {
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("What way of filling an array you prefer? 'R' for Random class, 'M' for Math class");
        char ans = sc.next().charAt(0);
        if (ans == 'M')
        {
            for (int i = 0; i < 10; i++)
            {
                arr[i] = (int) (Math.random()*100);
            }
        }
        else if (ans == 'R')
        {
            int diff = 50;
            Random rand = new Random();
            for(int i = 0; i < 10; i++)
            {
                arr[i] = rand.nextInt(diff + 1);
            }
        }



        System.out.println("UNSORTED ARRAY: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }


        for (int i = 0; i < 10; i++)       //используем пузырьковую сортировку из-за маленького размера массива
        {
            for(int j = i; j < 10; j++)
            {
                if(arr[i] > arr[j])
                {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

            }

        }

        System.out.println("SORTED ARRAY: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(+ arr[i]);
        }

    }
}
