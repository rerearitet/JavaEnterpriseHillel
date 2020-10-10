package com.company.solid.open_closed.good;

public class CarOrder {
    Car car;

    public CarOrder(Car car) {
        this.car = car;
    }

    public int orderCar() {
        return this.car.order();
    }
}
