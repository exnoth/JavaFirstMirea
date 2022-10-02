package ru.mirea.task3;

public class Employee {

    private String fullname;
    private float salary;

    public Employee(String name, float salary)
    {
        this.fullname = name;
        this.salary = salary;
    }

    public float getSalary()
    {
        return this.salary;
    }

    public String getName()
    {
        return this.fullname;
    }
    public String toString()
    {
        return "Employee{" +
                "fullname = " + fullname + ", " +
                "salary = " + salary +
                '}';
    }
}
