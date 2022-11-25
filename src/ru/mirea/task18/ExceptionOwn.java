package ru.mirea.task18;

public class ExceptionOwn {

    public static void getDetails1(String key) {
        try {
            System.out.println(key.length());
        } catch (NullPointerException e) {
            System.err.println("null key in getDetails1");
        }

    }

    public static String getDetails2(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails2");
        }
        return "data for " + key;
    }

    public static void printMessage(String key) {
        String message = getDetails2(key);
        System.out.println(message);
    }

    public static void main(String[] args) {
        getDetails1(null);
        printMessage("ethereal");
        try {
            printMessage(null);
        } catch (NullPointerException e) {
            System.err.println("null key in printMessage");
        }
        ThrowsDemo trowsDemo = new ThrowsDemo();

        trowsDemo.getKey2();
    }
}
