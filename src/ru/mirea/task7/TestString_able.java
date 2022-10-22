package ru.mirea.task7;

import java.util.Scanner;

public class TestString_able
{
    public static void main(String[] args)
    {
        String_able str = new ProcessStrings();
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        System.out.println("The length is: " + str.slength(ans));
        System.out.println("The string of odd-positioned chars is: " + str.oddpos(ans));
        System.out.println("The inverted string is: " + str.inverse(ans));
    }
}
