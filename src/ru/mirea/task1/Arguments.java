package ru.mirea.task1;

public class Arguments {
    public static void main(String[] args)
    {
        System.out.println("The amount of arguments: " + args.length);
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("argument" + i + ": " + args[i]);
        }
    }
}
