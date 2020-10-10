package com.company.solid.liskov_substitution.bad;

public class Toyota extends Car {
    int price = 1000;

    @Override
    public int order() {
        return price;
    }
}
