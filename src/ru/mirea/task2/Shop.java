package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Arrays;

//Разработайте класс Shop для, реализуйте методы добавления и
//удаления компьютеров в магазине, добавьте метод поиска в магазине
//компьютера, нужного пользователю. Протестируйте работу созданных
//классов. Данные для заполнения массива компьютеров вводятся с
//клавиатуры пользователем. Для этого реализуйте интерфейс.
public class Shop {
    private String CompName;

    public Shop(String name)
    {
        this.CompName = name;
    }
    public int find(Shop[] shops, String compName)
    {
        for (int i = 0; i < shops.length; i++)
        {
            if(compName == shops[i].CompName)
            {
                return 0;
            }

        }
        return 1;
    }

    public Shop[] delComp(Shop[] shops, int index)
    {
        ArrayList<Shop> list = new ArrayList<Shop>(Arrays.asList(shops));
        list.remove(index);
        shops = list.toArray(new Shop[list.size()]);
        return shops;
    }

    public Shop[] addComp(Shop[] shops, String name)
    {
        ArrayList<Shop> list = new ArrayList<Shop>(Arrays.asList(shops));
        Shop ncomp = new Shop(name);
        list.add(ncomp);
        shops = list.toArray(new Shop[list.size()]);
        return shops;
    }


    public String toString()
    {
        return "Computer{" +
                "brand = " + CompName +
                '}';
    }
}
