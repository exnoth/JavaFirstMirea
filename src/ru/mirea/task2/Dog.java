package ru.mirea.task2;
public class Dog {
    private String name;
    private int age;


    public Dog(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int DAtoHA()
    {
        return this.age*7;
    }

    public String toString()
    {
        return "The dog{" +
                "name = " + name +
                ", age = " + age +
                   '}';
    }
}
