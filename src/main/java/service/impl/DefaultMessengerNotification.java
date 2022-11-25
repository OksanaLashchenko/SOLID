package service.impl;

import service.MessengerNotification;

public class DefaultMessengerNotification implements MessengerNotification {

    @Override
    public void sendMessage(String messenger, String message) {
        System.out.println("Sending message" + message + "via Messenger " + messenger);
    }

}
