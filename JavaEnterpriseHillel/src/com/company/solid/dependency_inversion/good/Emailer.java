package com.company.solid.dependency_inversion.good;

public class Emailer implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "sunny");
        System.out.print("It is sunny");
    }
}