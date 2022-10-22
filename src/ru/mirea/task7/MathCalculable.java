package ru.mirea.task7;

public interface MathCalculable
{
    double pi = 3.14159;
    int exponentiation(int x, int n);
    double cabs(double r, double i);
    double clength(double rad);
}

class MathFunc implements MathCalculable
{
    public int exponentiation(int x, int n)
    {
        int res = 1;
        for(int i = 0; i < n; i++)
        {
            res*=x;
        }
        return res;
    }

    public double cabs(double r, double i)
    {
        double abs;
        abs = Math.sqrt(r*r + i*i);
        return abs;
    }

    public double clength(double rad)
    {
        return 2*pi*rad;
    }
}