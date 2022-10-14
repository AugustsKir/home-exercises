package advancedtest.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class App<T> {
    public  void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        double percent = partOf(integerList, (Integer n) -> n % 2 == 1;
    }
    public  double partOf(List<T> list, Function<T, Double> method) {
        double matches = list.stream().map(method).count();
        return matches / list.size();
    }



}
