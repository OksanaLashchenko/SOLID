package service.impl;

import service.SmsNotification;

public class DefaultSmsNotification implements SmsNotification {

    @Override
    public void sendSms(String phoneNumber, String message) {
        System.out.println("Sending message" + message + "via SMS to " + phoneNumber);
    }

}
