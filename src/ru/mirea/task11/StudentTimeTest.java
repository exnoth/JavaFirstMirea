package ru.mirea.task11;

import java.util.Scanner;

public class StudentTimeTest
{
    public static void main(String[] args)
    {
        int id;
        double gpa;
        String name;

        System.out.println("Enter the id");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        System.out.println("Enter the gpa");
        gpa = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc1.nextLine();

        StudentTime one = new StudentTime(id, gpa, name);
        System.out.println("How do you want to print the date of birth: full/medium/short");
        String format = sc1.nextLine();
        System.out.println(one.toString(format));
    }


}
