package ru.mirea.task1;
public class Harmonic {
    public static void main(String[] args)
    {
        double cs = 0;
        System.out.println("The harmonic series first 10 terms are: ");
        for (int i = 0; i < 10; i++)
        {
            cs= 1./(i+1);
            String res = String.format("%.3f", cs);
            System.out.println(res);
        }
    }
}
