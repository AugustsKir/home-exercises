package io.codelex.generics.practice.package3;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public <V> void add(V value, List<V> list) {
        list.add(value);
    }
    public static <V> void addAllX(List<V> v, List<? super V> l) {
        l.addAll(v);
    }
    public static <V> void addAllY(List<V> v, List<V> l) {
        l.addAll(v);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();


        addAllX(list, list2);
        addAllY(list, list2);
    }


}
