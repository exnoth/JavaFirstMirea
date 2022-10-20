package ru.mirea.task6;

import ru.mirea.task2.Shop;

import java.util.Scanner;

public class TestOnlineShop
{

    static public OnlineShop enter()
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the memory info: pins and type");
        Memory memory = new Memory(sc.nextInt(), sc1.nextLine());
        System.out.println("Enter the CPU info: clock and type");
        Processor processor = new Processor(sc.nextInt(), sc1.nextLine());
        System.out.println("Enter the monitor info: diagonal and resolution");
        Monitor monitor = new Monitor(sc.nextInt(), sc1.nextLine());
        String name;
        Brand brand;
        System.out.println("Enter the name of computer");
        name = sc1.nextLine();
        System.out.println("Enter the brand of computer");
        String brandname = sc1.next();
        switch(brandname)
        {
            case "ASUS":
                brand = Brand.ASUS;
                break;
            case "HP":
                brand = Brand.HP;
                break;
            case "APPLE":
                brand = Brand.APPLE;
                break;
            default:
                brand = Brand.HONOR;
                break;
        }

        Computer computer = new Computer(memory, processor, monitor);
        OnlineShop onlineShop = new OnlineShop(computer, brand,name);
        return onlineShop;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the amount of computers: ");
        n = sc.nextInt();
        OnlineShop[] shops = new OnlineShop[n];
        for (int i = 0; i < n; i++)
        {
            shops[i] = enter();
        }

        System.out.println("The computers are: ");
        for (int i = 0; i < n; i++)
        {
            shops[i].print();
        }

        System.out.println("Enter the info of computer you want to add: ");
        shops = shops[0].addProduct(shops, enter());

        System.out.println("The computers are: ");
        for (int i = 0; i < shops.length; i++)
        {
            shops[i].print();
        }

        System.out.println("Enter the name of computer you want to find: ");
        String name = sc1.nextLine();
        int r = shops[0].findProduct(shops, name);
        if (r == 0)
            System.out.println("There ARE computers of this name");
        else
            System.out.println("There ARE NOT computers of this name");

        System.out.println("Enter the index of computer you want to delete: ");
        int k = sc.nextInt();
        shops = shops[k].deleteProduct(shops, k);

        System.out.println("The computers are: ");
        for (int i = 0; i < shops.length; i++)
        {
            shops[i].print();
        }
    }
}
