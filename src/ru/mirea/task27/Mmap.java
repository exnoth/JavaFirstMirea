package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mmap
{
    public static HashMap createmap()
    {
        HashMap<String, String> one = new HashMap<>();
        one.put("Maclachlan", "Kyle");
        one.put("Kohane", "Rikka");
        one.put("Azusawa", "Kohane");
        one.put("Richman", "Kyle");
        one.put("Hinomori", "Shiho");
        one.put("Hanasato", "Minori");
        one.put("Ena", "Shinonome");
        one.put("Akito", "Shinonome");
        one.put("Otori", "Emu");
        one.put("Kusanagi", "Nene");
        return (HashMap) one;
    }
    public static void getSameNameCount(Map<String, String> one)
    {
        int count = 0;
        ArrayList<String> valuesL = new ArrayList<String>();
        for(Map.Entry<String, String> pair: one.entrySet())
        {
            if(valuesL.contains(pair.getValue()))
                count++;
            else
                valuesL.add(pair.getValue());
        }

        System.out.println("The amount of the same names: " + count);


    }
    public static void main(String[] args)
    {
        HashMap og = createmap();
        System.out.println(og);
        getSameNameCount(og);
        //вывести количество однофамильцев невозможно, т.к. это Map
    }
}
