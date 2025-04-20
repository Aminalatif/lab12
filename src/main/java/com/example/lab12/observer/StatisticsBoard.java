package com.example.lab12.observer;
public class StatisticsBoard implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Statistics Board - Avg Temp/Humidity Stats Updating...");
    }
}
