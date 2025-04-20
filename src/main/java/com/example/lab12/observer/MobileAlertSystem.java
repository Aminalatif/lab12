package com.example.lab12.observer;
public class MobileAlertSystem implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Mobile Alert - Weather Update: Temp = "
                + temperature + ", Humidity = " + humidity);
    }
}
