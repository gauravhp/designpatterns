package com.gaurav.observer;

public class EmailAlertsListenerImpl implements EventListener {
    private String emailAddr;

    public EmailAlertsListenerImpl(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public void update(String message) {
        System.out.println("Email message : \'" + message + "\' sent to " + emailAddr);
    }
}
