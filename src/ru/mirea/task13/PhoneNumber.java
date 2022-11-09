package ru.mirea.task13;

public class PhoneNumber
{
    static public String PhNumConvert(String PhoneNumber) {
        StringBuilder str = new StringBuilder(PhoneNumber);
        if (str.charAt(0) == '8')
            str.replace(0,1,"+7");
        str.insert(1, '<');
        str.insert(3, '>');
        str.insert(4, '<');
        str.insert(8, '>');
        str.insert(9, '-');
        str.insert(10, '<');
        str.insert(14, '>');
        str.insert(15, '-');
        str.insert(16, '<');
        str.insert(21, '>');

        return str.toString();
    }
}


class PhoneNumberTest
{
    public static void main(String[] args)
    {
        String one = "+79456859823";
        String two = "87956214532";
        System.out.println("The first number " + PhoneNumber.PhNumConvert(one));
        System.out.println("The second number " + PhoneNumber.PhNumConvert(two));
    }
}