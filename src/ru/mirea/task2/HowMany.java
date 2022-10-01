package ru.mirea.task2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int count = 0;
        if(!str.isEmpty())
        {
            count = 1;
            for (int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == ' ')
                    count++;
            }
        }
        else
            System.out.println("Incorrect input");


        System.out.println("The amount of words is: " + count);

    }
}
