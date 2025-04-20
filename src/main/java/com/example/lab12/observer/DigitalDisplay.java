package com.example.lab12.observer;
public class DigitalDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Digital Display - Temperature: " +
                temperature + "°C, Humidity: " + humidity + "%");
    }
}


