package com.company.solid.interface_segregation.bad;

public class SwimCreature implements Creature {
    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }

    // Don't need
    @Override
    public void run() {

    }
}
