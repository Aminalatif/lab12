package com.example.lab12.observer;
public class NewsChannel implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("News Channel - Breaking Weather: "
                + temperature + "°C, " + humidity + "% humidity");
    }
}

