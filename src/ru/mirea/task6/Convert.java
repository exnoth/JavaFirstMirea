package ru.mirea.task6;

public class Convert implements Convertable {
    public double convertKelvin(int n) {
        return n + 273.15;
    }

    public double convertFarenheit(int n) {
        return n * 1.8 + 32;
    }
}
