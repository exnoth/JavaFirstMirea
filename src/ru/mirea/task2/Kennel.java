package ru.mirea.task2;

import java.util.Objects;
import java.util.Scanner;

public class Kennel {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("How many dogs are there?");
        n = sc.nextInt();
        Dog[] dogs = new Dog[n];
        String nam;
        int ag;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the name: ");
            nam = sc2.nextLine();

            System.out.println("Enter the age: ");
            ag = sc1.nextInt();
            dogs[i] = new Dog(nam, ag);
        }

        System.out.println("The kennel's dogs are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(dogs[i].toString());
        }

        System.out.println("Do you want to see how old is first dog in human years??? (yes/no)");
        Scanner sc3 = new Scanner(System.in);
        String ans = sc3.nextLine();
        if (Objects.equals(ans, "yes"))
        {
            System.out.println("Hooray!!! So the " + dogs[0].getName() + "'s age in human years is....");
            int ha = dogs[0].DAtoHA();
            System.out.println(ha + " years!!!!!!!!");
        }
        else if (ans!="yes")
            System.out.println("meh...ok");

    }

}
