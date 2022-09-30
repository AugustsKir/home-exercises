package io.codelex.oop.Exercise3Cars;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Manufacturer {
    String name;
    String model;
    int price;
    LocalDate modelYear;
    EngineType engine;




    public Car(String name, LocalDate yearOfEstablishment, String country, String model, int price, LocalDate modelYear, EngineType engine) {
        super(name, yearOfEstablishment, country);
        this.name = name;
        this.model = model;
        this.price = price;
        this.modelYear = modelYear;
        this.engine = engine;
    }
    public LocalDate getModelYear() {
        return modelYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(modelYear, car.modelYear) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, model, price, modelYear, engine);
    }

    public EngineType getEngine() {
        return engine;
    }

    public int getPrice() {
        return price;
    }
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "\nCar List: -> " +
                " Brand = '" + name + '\'' +
                ", Model = '" + model + '\'' +
                ", Price = " + price +
                ", Model Year = " + modelYear +
                ", Engine = " + engine +
                " <- " + "\n";
    }
}
