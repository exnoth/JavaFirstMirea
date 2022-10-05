package ru.mirea.task4;
public enum Season
{
    SPRING(15),
    SUMMER(25)
            {
                public String getDescription()
                {
                    return "The hot season.";
                }
            },
    AUTUMN(5),
    WINTER(-10);

    private int temp;

    Season (int temp)
    {
        this.temp = temp;
    }

    public int getTemp()
    {
        return temp;
    }

    public String getDescription()
    {
        return "The cold season.";
    }


}







