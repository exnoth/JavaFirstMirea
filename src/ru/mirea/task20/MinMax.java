package ru.mirea.task20;
import java.util.ArrayList;
import java.util.Comparator;

public class MinMax <T extends Comparable<T>>
{
    T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array.length == 0)
            return null;
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) < 0) {
                result = array[i];
            }
        }
        return result;
    }

    public T findMax() {
        if (array.length == 0)
            return null;
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) > 0) {
                result = array[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        MinMax<Integer> minMax = new MinMax<Integer>(new Integer[]{1, 3, 2, 5});
        MinMax<Double> minMax2 = new MinMax<Double>(new Double[]{0.88, 34.23, 90., 52.12});

        System.out.println(minMax.findMin() + " " + minMax.findMax());
        System.out.println(minMax2.findMin() + " " + minMax2.findMax());

    }
}
