package ru.mirea.task9;

import java.util.Scanner;

public class TestStudent
{
    public static void main(String[] args)
    {

        //first task
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of students: ");
        int n = sc.nextInt();
        StudentClass studs = new StudentClass(n);
        studs.sortId();
        System.out.println("The IDs: \n");
        studs.printId();
        System.out.println();
        System.out.println("Students: \n");
        studs.printall();


        //second task
        System.out.println("Enter the amount of students: ");
        n = sc.nextInt();
        SortingStudentsByGPA sort = new SortingStudentsByGPA(n);
        System.out.println("Which sort do you want to use? 1 - MerrgeSort, 0 - QuickSort");
        if(sc.nextInt() == 1)
            sort.sortGPAMerge();
        else
            sort.sortGPAQuick();
        sort.printstud();
    }
}
