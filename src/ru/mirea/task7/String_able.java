package ru.mirea.task7;

interface String_able
{
    int slength(String str);
    String oddpos(String str);
    String inverse(String str);
}

class ProcessStrings implements String_able
{
    public int slength(String str)
    {
        return str.length();
    }

    public String oddpos(String str)
    {
        char[] temp = str.toCharArray();
        StringBuilder res = new StringBuilder();

        for (int i = temp.length - 1; i > 0; i--)
        {
            if((i+1)%2 == 1)
            {
                res.insert(0,temp[i]);
            }
        }
        return temp[0] + res.toString();
    }

    public String inverse(String str)
    {
        String s = "";
        for(int i = slength(str) - 1; i >= 0; i--)
        {
            s+=str.charAt(i);
        }

        return s;
    }
}