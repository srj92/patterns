package com.gof.patterns.behaviour.observer;

public class SmsEventReceiver implements Observer {

    private TextMessageSender textMessageSender;

    public SmsEventReceiver(TextMessageSender textMessageSender) {
        this.textMessageSender = textMessageSender;
    }

    public void onEvent() {
        textMessageSender.sendTextMessage();
    }

}
