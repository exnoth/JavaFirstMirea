package ru.mirea.task4;

public abstract class Vehicle {

    protected double AvgVelocity;
    protected double distance;
    protected int passengers;
    protected double weight;

    public Vehicle(){}
    public void getTime() {}

    public void CountPrice(){}
}

class Auto extends Vehicle
{
    int tariff = 30;
    public Auto(double avgvelocity, double distance, int passengers, double weight)
    {
        this.AvgVelocity = avgvelocity;
        this.distance = distance;
        this.passengers = passengers;
        this.weight = weight;
    }

    public void getTime()
    {
        System.out.format("%.2f hour(s)\n",(distance/AvgVelocity));

    }

    public void CountPrice()
    {
        int price = 40;
        System.out.format("%.2f c.u.\n", (distance*price+ passengers*tariff +(weight/10)*tariff));
    }
}

class Plane extends Vehicle
{
    int tariff = 80;
    public Plane(int avgvelocity, int distance, int passengers, int weight)
    {
        this.AvgVelocity = avgvelocity;
        this.distance = distance;
        this.passengers = passengers;
        this.weight = weight;
    }

    public void getTime()
    {
        System.out.format("%.2f hour(s)\n",(distance/AvgVelocity));

    }

    public void CountPrice()
    {
        int price = 360;
        System.out.format("%.2f c.u.\n", (distance*price+ passengers*tariff +(weight/10)*tariff));
    }

    }

class Train extends Vehicle
{
    int tariff = 50;
    public Train(int avgvelocity, int distance, int passengers, int weight)
    {
        this.AvgVelocity = avgvelocity;
        this.distance = distance;
        this.passengers = passengers;
        this.weight = weight;
    }

    public void getTime()
    {
        System.out.format("%.2f hour(s)\n",(distance/AvgVelocity));

    }

    public void CountPrice()
    {
        int price = 80;
        System.out.format("%.2f c.u.\n", (distance*price+ passengers*tariff +(weight/10)*tariff));
    }
}

class Ship extends Vehicle
{
    public Ship(int avgvelocity, int distance, int passengers, int weight)
    {
        this.AvgVelocity = avgvelocity;
        this.distance = distance;
        this.passengers = passengers;
        this.weight = weight;
    }

    int tariff = 60;

    public void getTime()
    {
        System.out.format("%.2f hour(s)\n",(distance/AvgVelocity));

    }

    public void CountPrice()
    {
        int price = 65;
        System.out.format("%.2f c.u.\n", (distance*price+ passengers*tariff +(weight/10)*tariff));
    }


}