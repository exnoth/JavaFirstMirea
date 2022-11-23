package ru.mirea.task17;

public class EmployeeView
{
    public void printEmployeeDetails(String name, double salary, double extra) {
        System.out.println("Employee details:");
        System.out.println("Employee`s name: " + name);
        System.out.println("Money they get:  " + (salary + extra));

    }
}
