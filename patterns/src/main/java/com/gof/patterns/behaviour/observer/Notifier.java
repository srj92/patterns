package com.gof.patterns.behaviour.observer;

import java.util.List;

public interface Notifier {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}