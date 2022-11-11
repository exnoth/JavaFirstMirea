package ru.mirea.task14;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
    public static void splitting(String str, String delimeter)
    {
        StringTokenizer strtok = new StringTokenizer(str, delimeter);
        while(strtok.hasMoreTokens())
            System.out.println(strtok.nextToken());
    }

    public static boolean isthisaString(String str)
    {
        Pattern pattern = Pattern.compile("^(abcdefghijklmnopqrstuv18340)$");
        Matcher match = pattern.matcher(str);
        return match.find();
    }

    public static void currency(String str)
    {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher match = pattern.matcher(str);
        while (match.find())
        {
            int start = match.start();
            int end = match.end();
            System.out.println("The price is " + str.substring(start, end));
        }
    }

    public static boolean isthisaDate(String str)
    {
        Pattern pattern = Pattern.compile("(([012]\\d)|(3[01]))/((0[1-9])|(1[0-2]))/((19\\d{2})|([2-9]\\d{3}))");
        Matcher match = pattern.matcher(str);
        return match.find();
    }

    public static boolean isthisanenEmail(String string) {
        Pattern pattern = Pattern.compile("^([a-z0-9_.-]+)@([a-z0-9_.-]+)\\.([a-z.]{2,6})$");
        Matcher match = pattern.matcher(string);
        return match.find();
    }

    public static boolean isPasswordGood(String string) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])\\w{8,}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}

class RegexTest
{
    public static void main(String[] args)
    {
        System.out.println("The first task\n");
        String str = "wow how many words are there lool";
        System.out.println("the og str is - " + str + "\n" + "the splitted:");
        Regex.splitting(str, " ");


        System.out.println("\nThe second task");
        str = "abcdefghijklmnopqrstuv18340";
        System.out.println("\nThe string is " + Regex.isthisaString(str));

        System.out.println("\nThe third task");
        str = "143.45 USD, 9495 ERR, 34.097 RUB";
        Regex.currency(str);

        System.out.println("\nThe fourth task");
        String[] date = {"30/07/2000", "02/09/2003", "33/10/1999", "15/12/2020"};
        for (String dat: date) {
            if (Regex.isthisaDate(dat)) {
                System.out.println(dat + " is a correct date");
            } else {
                System.out.println(dat + " is an incorrect date");
            }
        }
        System.out.println();


        System.out.println("\nThe fifth task");
        String[] emails = {"whodatboi@gmail.com", "myhost@@@com.ru", "@my.ru", "Julia String", "hiihiihelohii@mail.ru"};
        for(String email: emails)
        {
            if (Regex.isthisanenEmail(email))
                System.out.println(email + " is a correct email");
            else
                System.out.println(email + " is an incorrect email");
        }
        System.out.println();

        System.out.println("\nThe sixth task");
        String[] passwords = {"F032_Password", "TrySpy17", "smart_pass", "A007"};
        for (String password : passwords)
        {
            if(Regex.isPasswordGood(password))
                System.out.println(password + " is a good password");
            else
                System.out.println(password + " isn`t a good password");
        }


    }
}