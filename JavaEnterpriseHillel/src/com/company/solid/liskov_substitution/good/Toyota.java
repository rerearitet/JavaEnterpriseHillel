package com.company.solid.liskov_substitution.good;

public class Toyota extends Car {
    int price = 1000;

    @Override
    public int order() {
        return price;
    }
}
