package ru.mirea.task6;
interface Printable
{
    public void print();

}

class Book implements Printable
{
    int code;
    String author;
    String title;

    public Book(int code, String author, String title)
    {
        this.code = code;
        this.author = author;
        this.title = title;
    }

    public void print()
    {
        System.out.println("The code of the book: "
                            + this.code + "\n" + "The author of the book: "
                            + this.author + "\n" + "The title of the book: "
                            + this.title + "\n");
    }

}

class Shop implements Printable
{
    int vendor;
    int price;
    String product;

    public Shop(int vendor, int price, String product)
    {
        this.vendor = vendor;
        this.price = price;
        this.product = product;
    }

    public void print()
    {
        System.out.println("The vendor code of the product: "
                + this.vendor + "\n" + "The price of the product: "
                + this.product + "\n" + "The name of the product: "
                + this.product + "\n");
    }
}
