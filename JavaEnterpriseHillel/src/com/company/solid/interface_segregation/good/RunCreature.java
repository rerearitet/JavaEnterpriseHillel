package com.company.solid.interface_segregation.good;

public class RunCreature implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm running!");
    }
}
