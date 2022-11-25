package ru.mirea.task18;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try {
            printDetails("");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("empty")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public void getKey2() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.next();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                continue;
            }
        }
    }
}