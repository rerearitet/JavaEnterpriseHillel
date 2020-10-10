package com.company.solid.interface_segregation.bad;

public class RunCreature implements Creature {
    @Override
    public void run() {
        System.out.println("I'm running!");
    }

    // Don't need
    @Override
    public void swim() {

    }
}
