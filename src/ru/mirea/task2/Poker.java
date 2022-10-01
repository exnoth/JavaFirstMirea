package ru.mirea.task2;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args)
    {
        int cards = 5;
        int dudes;

        String[] suits = {"Hearts", "Clovers", "Pikes", "Tiles"};
        String[] rank = {"2", "3", "4","5", "6", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int allcards = suits.length * rank.length;

        for(;;)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of players: ");
            if(sc.hasNextInt())
            {
                dudes = sc.nextInt();
                if(cards * dudes <= allcards)
                    break;
                else if (dudes <= 0)
                {
                    System.out.println("The game can't start");
                    break;
                }
                else
                {
                    System.out.println("The game can't start");
                    break;
                }
            }
            else
            {
                System.out.println("You typed something wrong");
            }
        }

        String[] deck = new String[allcards];
        for (int i = 0; i < rank.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
        }

        for (int i = 0; i < allcards; i++)
        {
            int ran = i + (int) (Math.random() * (allcards - i));
            String temp = deck[ran];
            deck[ran] = deck[i];
            deck[i] = temp;
        }


        for(int i = 0; i < dudes * cards; i++)
        {
            System.out.println(deck[i]);
            if (i % cards == cards - 1)
            {
                System.out.println();
            }

        }
    }
}
