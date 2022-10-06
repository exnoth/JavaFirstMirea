package ru.mirea.task4;

public class Phone {
    int number;
    String model;
    int weight;

    Phone(int number, String model, int weight)
    {
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    Phone(int number, String model)
    {
        this.model = model;
        this.number = number;
    }

    Phone() {}

    public int getNumber()
    {
        return this.number;
    }
    public void receiveCall(String name)
    {
        System.out.println( name + " is calling.");
    }

    public void receiveCall(String name, int num)
    {
        System.out.println( name + " - the number - " + num + " is calling.");
    }

    public void sendMessage(String num)
    {
        System.out.println("The message was sent to " + num);
    }

    @Override
    public String toString()
    {
        return "The abonent: the number - " +
                number + ", " + "  the model - " + model + ", "+
                "  the weight - " + weight;

    }
}
