package ru.mirea.task21;
import java.util.Scanner;

public class AnyTypeArrayTasks extends AnyTypeArray
{
    public static <E> void  sid  (String s, E [] arr)
    {
        E [] a = arr;
        AnyTypeArray <E> sid = new AnyTypeArray <E> ();
        sid.setArr(a);
        System.out.print(s + "  ");
        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");
        System.out.println();
        System.out.println("Введите индекс элемента:");
        Scanner myScanner = new Scanner( System.in);
        int indexx=myScanner.nextInt();
        System.out.println(sid.getArrIndex(indexx));
    }
    public static void main(String [] args){
        String [] s = {"woww", "wwow","heyy"};
        sid("String" , s);
        Integer [] intr = { 1,2,3,4,5,6,7,8};
        sid("Integer" , intr);
        Double [] ad = {1.2,3.4};
        sid("Double" , ad);
    }
}
