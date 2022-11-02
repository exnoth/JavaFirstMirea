package ru.mirea.task11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class TaskTime
{
    public static void main(String[] args)
    {
        System.out.println("The dev's name");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,1);
        cal.set(Calendar.HOUR, 10);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        System.out.println("The date of tasks' assignment: " + sdf.format(cal.getTime()));

        Date Dated = new Date();
        System.out.println("The date of task's completion: " + sdf.format(Dated));


    }
}
