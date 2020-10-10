package com.company.solid.liskov_substitution.bad;

public class Porsche extends Car {
    int price = 100000;

    @Override
    public int order() {
        return price;
    }
}
