package com.example.lab12.subject;
import com.example.lab12.observer.Observer;
import java.util.ArrayList;
import java.util.List;
public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    public WeatherStation() {
        observers = new ArrayList<>();}
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);}
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);}
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity);}}
    public void setWeatherData(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();}}
