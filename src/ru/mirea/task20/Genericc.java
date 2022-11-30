package ru.mirea.task20;
import java.io.Serializable;

public class Genericc <T extends Comparable<T>, V extends Animal & Serializable, K>
{
    T tVar;
    V vVar;
    K kVar;

    public Genericc(T tVar, V vVar, K kVar) {
        this.tVar = tVar;
        this.vVar = vVar;
        this.kVar = kVar;
    }

    public T gettVar() {
        return tVar;
    }

    public V getvVar() {
        return vVar;
    }

    public K getkVar() {
        return kVar;
    }

    public void printAllVars() {
        System.out.println(gettVar().toString());
        System.out.println(getvVar().toString());
        System.out.println(getkVar().toString());
    }
}
