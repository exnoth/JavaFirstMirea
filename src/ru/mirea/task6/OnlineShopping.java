package ru.mirea.task6;

import ru.mirea.task2.Shop;
import ru.mirea.task4.Season;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public interface OnlineShopping
{
    OnlineShop[] addProduct(OnlineShop[] shops, OnlineShop one);
    OnlineShop[] deleteProduct(OnlineShop[] shops, int index);
    int findProduct(OnlineShop[] shops, String compName);
}

class Computer
{
    Memory memory;
    Processor processor;
    Monitor monitor;

    Computer(Memory memory, Processor processor, Monitor monitor)
    {
        System.out.println();
        this.memory = memory;
        this.processor = processor;
        this.monitor = monitor;
    }


    public void print()
    {
        System.out.println("The memory: ");
        this.memory.print();
        System.out.println("The processor: ");
        this.processor.print();
        System.out.println("The monitor: ");
        this.monitor.print();
        System.out.println();
    }

}

class Memory
{
    int pins;
    String type;

    public Memory(int pins, String type)
    {
        System.out.println();
        this.pins = pins;
        this.type = type;
    }

    public void print()
    {
        System.out.println("The amount of pins: " + this.pins +
                ", the type: " + this.type);
    }

}

class Processor
{
    int clock;
    String type;

    public Processor(int clock, String type)
    {
        this.clock = clock;
        this.type = type;
    }

    public void print()
    {
        System.out.println("The clock: " + this.clock +
                ", the type: " + this.type);
    }
}

class Monitor
{
    int diagonal;
    String resolution;

    public Monitor(int diagonal, String resolution)
    {
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    public void print()
    {
        System.out.println("The diagonal: " + this.diagonal +
                ", the resolution: " + this.resolution);
    }
}

enum Brand
{
    ASUS,
    HP,
    APPLE,
    HONOR;

    public String toString()
    {
        return name();
    }
}


class OnlineShop implements OnlineShopping
{
    Computer computer;
    Brand brand;
    String name;


    public OnlineShop(Computer computer, Brand brand, String name)
    {
        this.computer = computer;
        this.brand = brand;
        this.name = name;
    }

    public int findProduct(OnlineShop[] shops, String compName)
    {
        for (int i = 0; i < shops.length; i++)
        {
            if(Objects.equals(compName, shops[i].name))
            {
                return 0;
            }

        }
        return 1;
    }

    public OnlineShop[] deleteProduct(OnlineShop[] shops, int index)
    {
        ArrayList<OnlineShop> list = new ArrayList<OnlineShop>(Arrays.asList(shops));
        list.remove(index);
        shops = list.toArray(new OnlineShop[list.size()]);
        return shops;
    }

    public OnlineShop[] addProduct(OnlineShop[] shops, OnlineShop one)
    {
        ArrayList<OnlineShop> list = new ArrayList<OnlineShop>(Arrays.asList(shops));
        OnlineShop ncomp = new OnlineShop(one.computer, one.brand, one.name);
        list.add(ncomp);
        shops = list.toArray(new OnlineShop[list.size()]);
        return shops;
    }


    public void print()
    {
        System.out.println("The name of computer: " + this.name + "\n"
                            + "The brand of computer: " + this.brand + "\n"
                            + "The characteristics of computer: ");
        this.computer.print();
        System.out.println();
    }
}