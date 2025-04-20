package com.example.lab12.subject;
import com.example.lab12.observer.Observer;
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
