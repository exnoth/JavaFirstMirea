package ru.mirea.task9;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClass
{
    public Student[] students;
    private int[] iDNumber;

    public StudentClass(int n)
    {
        this.students = new Student[n];
        this.iDNumber = new int[n];
        int id;
        double gpa;
        String name;

        for(int i = 0; i < n; i++)
        {
            System.out.println("Student №" + (i+1));
            System.out.println("Enter the id: " );
            Scanner sc = new Scanner(System.in);
            id = sc.nextInt();
            System.out.println("Enter the gpa: " );
            gpa = sc.nextDouble();
            System.out.println("Enter the name: ");
            Scanner sc1 = new Scanner(System.in);
            name = sc1.nextLine();
            students[i] = new Student(id, gpa, name);
            iDNumber[i] = id;

        }
    }

    public void sortId()
    {
        Arrays.sort(iDNumber);
    }

    public void printId()
    {
        for(int i:iDNumber)
            System.out.println(i+ "; ");
    }

    public void printall()
    {
        for(Student i:students)
        {
            System.out.println("The studs ID:" + i.id + "\n"
                    + "The studs GPA: " + i.gpa + "\n"
                    + "the studs name: " + i.name) ;
            System.out.println();
        }

    }
}
