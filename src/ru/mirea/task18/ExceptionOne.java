package ru.mirea.task18;

import java.util.Scanner;

public class ExceptionOne {
    public static void exception1() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Attempted division by zero");
        }
    } // task 1

    public static void exception2() {
        System.out.println(2.0 / 0.0);
    }

    public static void exception3() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.err.println("Number format error. Int expected.");
        } catch (ArithmeticException e) {
            System.err.println("Attempted division by zero");
        }
    } // task 2

    public static void exception4() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.err.println("Number format error. Int expected.");
        } catch (ArithmeticException e) {
            System.err.println("Attempted division by zero");
        } catch (Exception e) {
            System.err.println("Some exception");
        }
    } // task 3

    public static void exception5() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.err.println("Number format error. Int expected.");
        } catch (ArithmeticException e) {
            System.err.println("Attempted division by zero");
        } finally {
            System.out.println("This code will appear anyway. It does not matter if exception was cached or was not.");
        }
    } // task 4


    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
    }
}