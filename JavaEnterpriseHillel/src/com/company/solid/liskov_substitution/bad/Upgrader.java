package com.company.solid.liskov_substitution.bad;

public class Upgrader {
    Car car;

    public Upgrader(Car car) {
        this.car = car;
    }

    public int upgrade() {
        if (!car.getClass().getSimpleName().equals("Toyota")) return car.order() -1000;
        else return car.order();
    }
}
