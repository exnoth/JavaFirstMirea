package ru.mirea.task17;

public class Employee
{
    private String name;
    private double salary;
    private double extra;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getExtra() {
        return extra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExtra(double extraMoney) {
        this.extra = extraMoney;
    }
}
