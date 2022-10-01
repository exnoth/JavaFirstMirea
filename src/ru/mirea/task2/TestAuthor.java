package ru.mirea.task2;
import java.lang.*;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args)
    {
        String n;
        char g;
        Author one = new Author("Just Anybody", "justanybody@gmail.com", 'X');
        Scanner sc = new Scanner(System.in);
        System.out.println("The name of the author: " + one.getName());
        System.out.println("Enter the email of the author: ");
        n = sc.nextLine();
        one.setEmail(n);
        System.out.println("The set email of the author: " + one.getEmail());
        System.out.println("The gender of the author: " + one.getGender());

    }
}
