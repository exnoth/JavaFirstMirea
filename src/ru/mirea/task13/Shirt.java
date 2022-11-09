package ru.mirea.task13;

public class Shirt
{
    String partnum;
    String type;
    String colour;
    String size;


    public Shirt(String fullinfo)
    {
        String[] info = fullinfo.split(",");
        this.partnum = info[0];
        this.type = info[1];
        this.colour = info[2];
        this.size = info[3];
    }


    @Override
    public String toString()
    {
        return "THE SHIRT: the part number is " + this.partnum
                + ", the type is " + this.type +
                ", the colour is " +this.colour +
                ", the size is " + this.size + ".";
    }

}


class ShirtTest
{
    public static void main(String[] args)
    {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10]= "S011,Maroon Polo Shirt,Maroon,S";

        for (int i = 0; i < 11; i++)
        {
            Shirt one = new Shirt(shirts[i]);
            System.out.println(one.toString());
        }
    }
}
