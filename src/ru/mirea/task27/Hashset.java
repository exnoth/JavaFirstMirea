package ru.mirea.task27;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Hashset
{
    public static <T> Set<T> getInstance(Set<T> hashset)
    {
        Set<T> treeset = hashset.stream().collect(Collectors.toCollection(TreeSet::new));
        return treeset;
    }
    public static void main(String[] args)
    {
        System.out.println("First task");
        //Hashtable<String, String> st= new Hashtable<String, String>();
        Set<String> ts = new HashSet<>();
        ts.add("musedash");
        ts.add("osu!");
        ts.add("pr.sekai");
        ts.add("phigros");
        ts.add("arcaea");

        Set <String> treeset = getInstance(ts);
        System.out.println(treeset);
    }
}
