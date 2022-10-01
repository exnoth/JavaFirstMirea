package ru.mirea.task1;

import java.util.Scanner;

public class LoopSum {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        System.out.print("What loop do you want to use? 'f' for FOR, 'w' for WHILE, 'd' for DO WHILE");
        char ans = sc.next().charAt(0);
        if (ans == 'f')
        {
            for(int i = 0; i < 5;  i++)
            {
                sum+=array[i];
            }
            System.out.print(sum);
        }
        else if(ans == 'w')
        {
            int i = 4;
            while(i >= 0)
            {
                sum+=array[i];
                i--;
            }
            System.out.print(sum);
        }
        else if (ans == 'd')
        {
            int i = 0;
            do {
                sum+=array[i];
                i++;
            }while(i!=5);
            System.out.print(sum);
        }

    }
}
