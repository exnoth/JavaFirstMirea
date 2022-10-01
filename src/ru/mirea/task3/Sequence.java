package ru.mirea.task3;

import java.util.Random;
public class Sequence {

    public static void main(String[] args)
    {
        int n = 4;
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
        {
            int diff = 89;
            arr[i] = rand.nextInt(diff + 10);
        }

        System.out.println("ARRAY: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        if (arr[1] > arr[0] && arr[2] > arr[1] && arr[3] > arr[2])
            System.out.println('\n' + "This IS a progression");
        else
            System.out.println('\n' + "NOT a progression");
    }
}
