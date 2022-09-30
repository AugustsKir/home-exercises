package io.codelex.oop.Exercise3Cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {
    static List<Car> carList = new ArrayList<>();

    public static void addCar(Car o) {
        carList.add(o);
    }
    public static void removeCar(Car o) {
        carList.remove(o);
    }
    public static String returnList() {
        return carList.toString();
    }
    public static String returnV12() {
        List<String> listV12 = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngine().equals(EngineType.V12)) {
                listV12.add(car.getModel());
            }
        }
        return  listV12.toString();
    }
    public static String before1999() {
        List<Car> before1999 = new ArrayList<>();
        for (Car car: carList) {
            if(car.getModelYear().isBefore(LocalDate.of(1999, 12, 31))) {
                before1999.add(car);
            }
        }
        return before1999.toString();
    }
    public static String mostExpensive() {
        int mostExpensive = 0;
        String mostExpensiveName = "";
        for (Car car : carList) {
            if(car.getPrice() > mostExpensive) {
                mostExpensive = car.getPrice();
                mostExpensiveName = car.getBrandName();
            }
        }
        return mostExpensiveName + mostExpensive;
    }
    public static String cheapestCar() {
        int cheapest = 1000000000;
        String cheapestName = "";
        for (Car car : carList) {
            if(car.getPrice() < cheapest) {
                cheapest = car.getPrice();
                cheapestName = car.getBrandName();
            }
        }
        return cheapestName + cheapest;
    }
    /*public static String atLeastThree() {
        if(carList.stream().map(Car::getBrandName).count() == 3) {
            return
        }
    }*/
    public static String listAscending() {
         List<String> names = new ArrayList<>();
         for(Car car : carList) {
             names.add(car.getBrandName());
         }
         Collections.sort(names);
         return names.toString();
    }
    public static String listDescending() {
        List<String> names = new ArrayList<>();
        for(Car car : carList) {
            names.add(car.getBrandName());
        }
        Collections.sort(names);
        Collections.reverse(names);
        return names.toString();
    }
    public static boolean findCar(String carName) {
        boolean found = false;
        for (Car car : carList) {
            if (car.getModel().equals(carName)) {
                return true;
            }
        }return found;
    }
    public static String byManufacturer(String brand) {
        List<String> allCars = new ArrayList<>();
        for (Car car : carList) {
            if(car.brandName.equals(brand)) {
                allCars.add(car.getModel());
            }
        }
        return allCars.toString();
    }
    public static String sortCars(LocalDate date, String input) {
        List<String> sorted = new ArrayList<>();
        for (Car car : carList) {
            if (input.equals(">")) {
                if(car.getYearOfEstablishment().isAfter(date)) {
                    sorted.add(car.getModel());
                }
            }
            if (input.equals("<")) {
                if(car.getYearOfEstablishment().isBefore(date)) {
                    sorted.add(car.getModel());
                }
            }
            if (input.equals("=")) {
                if(car.getYearOfEstablishment().getYear() == date.getYear()) {
                    sorted.add(car.getModel());
                }
            }
            if (input.equals("!=")) {
                if(car.getYearOfEstablishment().getYear() != date.getYear()) {
                    sorted.add(car.getModel());
                }
            }
        }
        return sorted.toString();
    }

}
