package com.company.solid.dependency_inversion.bad;

public class Emailer {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}