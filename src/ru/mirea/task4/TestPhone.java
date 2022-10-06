package ru.mirea.task4;

import java.util.Scanner;

public class TestPhone
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the model: ");
        String mod = sc1.nextLine();
        System.out.println("Enter the weight: ");
        int weight = sc.nextInt();
        Phone one = new Phone(num, mod, weight);
        System.out.println(one.toString());
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Enter the model: ");
        mod = sc1.nextLine();
        Phone two = new Phone(num, mod);
        System.out.println(two.toString());
        Phone three = new Phone();
        one.receiveCall("girrrl");
        two.receiveCall("dude", 1234567);
        String msg = "12345678";
        String msg1 = "79154567239";
        one.sendMessage(msg + "  " + msg1);
    }
}
