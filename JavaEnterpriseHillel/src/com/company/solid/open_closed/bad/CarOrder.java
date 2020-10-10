package com.company.solid.open_closed.bad;

public class CarOrder {
    String car;

    public CarOrder(String car) {
        this.car = car;
    }

    public int orderCar() {
        if (car.equals("Toyota")) {
            return 1000;
        } else if (car.equals("Porsche")) {
            return 100000;
        } else if (car.equals("Ferrari")) {
            return 10000000;
        } else return 0;
    }
}
