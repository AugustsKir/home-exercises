package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListInteger implements ListInterface {

    static List<Integer> list = new ArrayList<>();

    public static void add(int i, Object el) {
        list.add(i, (Integer) el);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }

}
