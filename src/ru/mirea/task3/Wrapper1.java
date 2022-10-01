package ru.mirea.task3;

public class Wrapper1 {

    public static void main(String[] args)
    {
        //1 задание + вывод на консоль(4)
        Double x = Double.valueOf('c');
        Double y = Double.valueOf(0.11);
        System.out.println(x);
        System.out.println(y);

        //2 задание
        Double b = Double.parseDouble("90");
        System.out.println(b);

        //3 задание
        Double a = Double.valueOf(88);
        double b0 = a;
        int b1 = a.intValue();
        byte b2 = a.byteValue();
        short b3 = a.shortValue();
        long b4 = a.longValue();
        float b5 = a.floatValue();
        boolean b6 = a!=0;
        char b7 = (char) a.doubleValue();

        //5 задание
        String d = Double.toString(3.14);
        System.out.println(d);


    }
}
