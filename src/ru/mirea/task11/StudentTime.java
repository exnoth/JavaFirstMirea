package ru.mirea.task11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Scanner;

public class StudentTime
{
    int id;
    double gpa;
    String name;

    int year, month, dayOfMonth;
    Calendar DOB = new GregorianCalendar(year, month, dayOfMonth);

    public StudentTime(int id, double gpa, String name)
    {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("The date of birth - ");
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        DOB.set(Calendar.YEAR,year);
        System.out.println("Enter the month in number: ");
        year = sc.nextInt();
        DOB.set(Calendar.MONTH,year - 1);
        int day;
        System.out.println("Enter the day: ");
        day = sc.nextInt();
        DOB.set(Calendar.DAY_OF_MONTH,day);
    }

    public String toString(String format)
    {
        SimpleDateFormat full = new SimpleDateFormat("EEEEE, MMMMM d yyyy"); //Saturday, March 4 2017
        SimpleDateFormat med = new SimpleDateFormat( "MMMM dd yyyy"); //March 04 2017
        SimpleDateFormat sh = new SimpleDateFormat("yyyy.MM.dd"); //2017.03.04
        if (Objects.equals(format, "full"))
            return "The student's id: " + this.id + "\n" + "The gpa: "
                    + this.gpa + "\n" + "The name: " + this.name + "\n"
                    + "The date of birth: " + full.format(DOB.getTime());
        if (Objects.equals(format, "medium"))
            return "The student's id: " + this.id + "\n" + "The gpa: "
                    + this.gpa + "\n" + "The name: " + this.name + "\n"
                    + "The date of birth: " + med.format(DOB.getTime());
        if(Objects.equals(format, "short"))
            return "The student's id: " + this.id + "\n" + "The gpa: "
                    + this.gpa + "\n" + "The name: " + this.name + "\n"
                    + "The date of birth: " + sh.format(DOB.getTime());
        return "not correct";
    }
}
