package ru.mirea.task4;

public class Season1
{
    public static void main(String[] args)
    {
        Season favourite = Season.SUMMER;
        System.out.println(favourite);
        myfavour(favourite);
        for(Season s : Season.values())
        {
            System.out.println(s + " " + s.getTemp() + " " + s.getDescription());
        }
    }

    public static void myfavour(Season what)
    {
        switch (what)
        {
            case SPRING:
                System.out.println("I like spring.");
                break;
            case SUMMER:
                System.out.println("I like summer.");
                break;
            case AUTUMN:
                System.out.println("I like autumn.");
                break;
            case WINTER:
                System.out.println("I like winter.");
                break;
    }
    }

}

