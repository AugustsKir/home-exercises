package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListOneClass {
    List<Object> objectList = new ArrayList<>();
    public static void main(String[] args) {

    }
    public void add(int i, Object el) {
        objectList.add(i, el);
    }

    public Object get(int i) {
        return objectList.get(i);
    }
}
