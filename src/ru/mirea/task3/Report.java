package ru.mirea.task3;
import java.util.Formatter;
public class Report {
//Используйте форматирование строк. Пусть salary будет
//выровнено по правому краю, десятичное значение имеет 2 знака
//после запятой и можете добавить что-нибудь свое
    public static void generateReport(Employee[] employees)
    {
        String divider = "----------------------------------------------------------";
        System.out.println(divider);
        for (int i = 0; i < employees.length; i++)
        {
            System.out.format("%10s 's %10s   %.2f\n",employees[i].getName(), "salary - ",employees[i].getSalary());;
        }
        System.out.println(divider);
    }
}
