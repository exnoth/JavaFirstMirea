package ru.mirea.task11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class TimeComparison
{
    public static void main(String[] args)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        cal.set(Calendar.YEAR,year);
        System.out.println("Enter the month in number: ");
        year = sc.nextInt();
        cal.set(Calendar.MONTH,year - 1);
        int day;
        System.out.println("Enter the day: ");
        day = sc.nextInt();
        cal.set(Calendar.DAY_OF_MONTH,day);
        int hour;
        System.out.println("Enter the hour: ");
        hour = sc.nextInt();
        cal.set(Calendar.HOUR, hour);
        int minute;
        System.out.println("Enter the minute: ");
        minute = sc.nextInt();
        cal.set(Calendar.MINUTE, minute);
        int sec;
        System.out.println("Enter the second: ");
        sec = sc.nextInt();
        cal.set(Calendar.SECOND, sec);

        System.out.println("The custom date: " + sdf.format(cal.getTime()));


        Calendar cur = Calendar.getInstance();
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);
        cal.get(Calendar.DAY_OF_MONTH);
        cal.get(Calendar.HOUR);
        cal.get(Calendar.MINUTE);
        cal.get(Calendar.SECOND);

        System.out.println("The current date: " + sdf.format(cur.getTime()));


        if(cal.equals(cur))
            System.out.println("Calendars are equal");
        else if(cal.after(cur))
            System.out.println("The custom date " + sdf.format(cal.getTime()) + " comes after the current date " + sdf.format(cur.getTime()));
        else if(cal.before(cur))
            System.out.println("The custom date " + sdf.format(cal.getTime()) + " comes before the current date " + sdf.format(cur.getTime()));
    }

}
