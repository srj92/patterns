package com.gof.patterns.behaviour.observer;

public class MailEventReceiver implements Observer {

    private MailSender mailSender;

    public MailEventReceiver(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void onEvent() {
        mailSender.sendMail();
    }
}