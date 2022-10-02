package ru.mirea.task3;

import java.util.Scanner;

import static ru.mirea.task3.Report.generateReport;

public class TestEmpRep {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the amount of employees: ");
        n = sc.nextInt();
        Employee[] employees = new Employee[n];
        String nam;
        float s;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the name: ");
            nam = sc1.nextLine();
            System.out.println("Enter the salary: ");
            s = sc.nextFloat();
            employees[i] = new Employee(nam, s);
        }


        System.out.println("Do you want to see the list of employees? y/n");
        char a = sc2.next().charAt(0);
        if (a == 'y')
        {
            System.out.println("The employees are: ");
            for (int i = 0; i < n; i++)
            {
                System.out.println(employees[i].toString());
            }
        }


        generateReport(employees);
    }
}
