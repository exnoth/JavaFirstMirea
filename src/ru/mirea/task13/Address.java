package ru.mirea.task13;
import java.util.StringTokenizer;
public class Address
{
    String country;
    String region;
    String town;
    String st;
    String house;
    String corpus;
    String apt;

    public Address(String fulladd)
    {
        String[] addarr = fulladd.split(",");
        this.country = addarr[0];
        this.region = addarr[1];
        this.town = addarr[2];
        this.st = addarr[3];
        this.house = addarr[4];
        this.corpus = addarr[5];
        this.apt = addarr[6];
    }

    public Address(String fulladd, String delimeter)
    {
        StringTokenizer st = new StringTokenizer(fulladd, delimeter);
        this.country = st.nextToken();
        this.region = st.nextToken();
        this.town = st.nextToken();
        this.st = st.nextToken();
        this.house = st.nextToken();
        this.corpus = st.nextToken();
        this.apt = st.nextToken();
    }

    @Override
    public String toString()
    {
        return "THE ADDRESS: the country is " + this.country
                + ", the region is " + this.region +
                ", the town is " + this.town +
                ", the street is " + this.st +
                ", the house is " + this.house +
                ", the corpus is " + this.corpus +
                ", the apartment is " + this.apt +
                ".";
    }
}


class AddressTester
{
    public static void main(String[] args)
    {
        Address one = new Address("France,Saint-Bonnet-le-Courreau,Grandris,Grandris,42940,1,2");
        Address two = new Address("Belgium,Braine-I'Alleud,Goumont,Cimetiere,51,1,1");
        Address three = new Address("UK;Weald;Bampton;Clanfield;2;1;3", ";");
        Address four = new Address("UK.Sheffield.Sheffield.Maltravers.14.4.13", ".");

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
    }
}