package ru.mirea.task25;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Brackets
{
    private static boolean Brackets(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("[\\d+/*-]*");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Brackets(str));
    }
}
