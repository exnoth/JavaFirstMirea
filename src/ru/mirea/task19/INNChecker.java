package ru.mirea.task19;

import java.math.BigInteger;
import java.util.Scanner;

public class INNChecker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the INN code");
            try
            {
                BigInteger inn = new BigInteger(sc.nextLine());
                checkINN(inn);
                break;
            }catch (INNNotValidException e)
            {
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("INN is valid.");
    }

    public static boolean checkINN(BigInteger inn) throws INNNotValidException
    {
        int i = 0;
        BigInteger ninn = new BigInteger(inn.toByteArray());
        while (!ninn.equals(new BigInteger("0")))
        {
            i++;
            ninn  = new BigInteger(ninn.divide(new BigInteger("10")).toByteArray());
        }
        if(i!=10 && i!=12)
            throw new INNNotValidException(inn);
        return true;
    }
}
