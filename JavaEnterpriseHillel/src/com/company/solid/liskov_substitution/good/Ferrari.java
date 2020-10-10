package com.company.solid.liskov_substitution.good;

public class Ferrari extends Car {
    int price = 10000000;

    @Override
    public int order() {
        return price - 1000;
    }
}
