package io.codelex.polymorphism.practice.exercise1;

public class Opel implements Car, Boost {
    Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 30;
    }

    @Override
    public String getName() {
        return Opel.class.getSimpleName();
    }
}
