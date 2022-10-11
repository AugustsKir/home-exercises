package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Class<?> boost = Boost.class;
        Lexus lexus = new Lexus();
        Bmw bmw = new Bmw();
        Audi audi = new Audi();
        Opel opel = new Opel();
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();
        List<Car> carList = new ArrayList<>();
        carList.add(lexus);
        carList.add(bmw);
        carList.add(audi);
        carList.add(opel);
        carList.add(tesla);
        carList.add(toyota);
        int count = 0;
        while (count < 10) {
            for (int i = 0; i < carList.size(); i++) {
                if (i == 2 && boost.isAssignableFrom(carList.get(i).getClass())) {
                    carList.get(i).useNitrousOxideEngine();
                    carList.get(i).speedUp();
                } else {
                    carList.get(i).speedUp();
                }
            }
            count++;
        }
        Integer topSpeed = 0;
        String topSpeedName = "";
        for (int i = 0; i < carList.size(); i++) {
            if (Integer.parseInt(carList.get(i).showCurrentSpeed()) > topSpeed) {
                topSpeed = Integer.parseInt(carList.get(i).showCurrentSpeed());
                topSpeedName = carList.get(i).getName();
            }
        }
        System.out.println(topSpeedName + " " + topSpeed);


    }
}
