package ru.mirea.task6;
interface Printable
{
    public void decision();
    public void put();
    public void print();

    public void takeout();
}

class printin implements Printable
{
    public void decision()
    {
        System.out.println("You chose a picture you want to print.");
    }
    public void put()
    {
        System.out.println("You put some paper in the printer.");
    }
    public void print()
    {
        System.out.println("The pic is now printing.");
    }
    public void takeout()
    {
        System.out.println("Ypu took your printed pic from the printer. Hooray!");
    }
}
