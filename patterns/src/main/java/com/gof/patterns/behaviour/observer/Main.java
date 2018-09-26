package com.gof.patterns.behaviour.observer;

public class Main {

    public static void main(String[] args) {
        Notifier notifier = new EventNotifier();
        notifier.addObserver(new SmsEventReceiver(new TextMessageSender()));
        notifier.addObserver(new MailEventReceiver(new MailSender()));

        notifier.notifyObservers();
    }

}
