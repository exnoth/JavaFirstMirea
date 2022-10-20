package ru.mirea.task6;

import java.util.Scanner;
import java.util.SplittableRandom;

public class TestConvert
{
    public static void main(String[] args)
    {
        Convert one = new Convert();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in Celsius: ");
        int n = sc.nextInt();
        System.out.println("In Farenheit: " + one.convertFarenheit(n));
        System.out.println("In Kelvin: " + one.convertKelvin(n));
    }
}
