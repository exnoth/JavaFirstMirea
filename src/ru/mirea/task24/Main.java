package ru.mirea.task24;

public class Main
{
    public static void main(String[] args) {
        FactoryChairs myFactory = new FactoryChairs();
        Chair victorian = myFactory.createChair(ChairType.VICTORIAN, "Pink", 5);
        Chair multifunctional = myFactory.createChair(ChairType.MULTIFUNCTIONAL, "Neon Green", 10);
        Chair magic = myFactory.createChair(ChairType.MAGIC, "Red", 7);
        Client client = new Client("Art-pop-chick", 22);
        client.sit(multifunctional);
        client.sit(magic);
        client.sit(victorian);
    }
}
