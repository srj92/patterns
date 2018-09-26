package com.gof.patterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class EventNotifier implements Notifier {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observerList) {
            o.onEvent();
        }
    }
}