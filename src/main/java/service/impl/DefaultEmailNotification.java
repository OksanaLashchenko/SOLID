package service.impl;

import service.EmailNotification;

public class DefaultEmailNotification implements EmailNotification {

    @Override
    public void sendEmail(String email, String message) {
        System.out.println("Sending message" + message + "via Email to " + email);
    }

}
