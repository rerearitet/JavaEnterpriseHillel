package com.company.solid.liskov_substitution.bad;

public class Ferrari extends Car {
    int price = 10000000;

    @Override
    public int order() {
        return price;
    }
}
