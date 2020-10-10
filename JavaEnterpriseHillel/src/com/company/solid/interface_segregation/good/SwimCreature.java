package com.company.solid.interface_segregation.good;

public class SwimCreature implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
