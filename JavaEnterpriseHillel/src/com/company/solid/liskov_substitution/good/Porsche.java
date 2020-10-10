package com.company.solid.liskov_substitution.good;

public class Porsche extends Car {
    int price = 100000;

    @Override
    public int order() {
        return price - 1000;
    }
}
