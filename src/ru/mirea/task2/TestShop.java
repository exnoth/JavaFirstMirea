package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestShop {

    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the amount of computers: ");
        n = sc.nextInt();
        Shop[] shops = new Shop[n];
        String nam;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the brand: ");
            nam = sc1.nextLine();
            shops[i] = new Shop(nam);
        }

        System.out.println("The computers' brands are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(shops[i].toString());
        }

        System.out.println("Enter the brand of computer you want to add: ");
        nam = sc1.nextLine();
        shops = shops[1].addComp(shops, nam);

        System.out.println("The computers' brands are: ");
        for (int i = 0; i < shops.length; i++)
        {
            System.out.println(shops[i].toString());
        }

        System.out.println("Enter the brand of computer you want to find: ");
        nam = sc1.nextLine();
        int r = shops[1].find(shops, nam);
        if (r == 0)
            System.out.println("There ARE computers of this brand");
        else
            System.out.println("There ARE NOT computers of this brand");

        System.out.println("Enter the index of brand you want to delete: ");
        int k = sc.nextInt();
        shops = shops[k].delComp(shops, k);

        System.out.println("The computers' brands are: ");
        for (int i = 0; i < shops.length; i++)
        {
            System.out.println(shops[i].toString());
        }

    }

}
