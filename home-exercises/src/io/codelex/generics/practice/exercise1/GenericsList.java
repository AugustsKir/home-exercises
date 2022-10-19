package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class  GenericsList<T> {
    List<T> list = new ArrayList<>();

    public void add(int i, T el) {
        list.add(el);
    }

    public T get(int i) {
        return list.get(i);
    }
}
