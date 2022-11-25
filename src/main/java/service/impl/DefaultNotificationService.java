package service.impl;

import entity.Project;
import entity.User;
import service.EmailNotification;
import service.MessengerNotification;
import service.NotificationService;
import service.SmsNotification;

public class DefaultNotificationService implements NotificationService {

    private final SmsNotification smsNotification;
    private final EmailNotification emailNotification;
    private final MessengerNotification messengerNotification;

    public DefaultNotificationService(SmsNotification smsNotification,
                                      EmailNotification emailNotification,
                                      MessengerNotification messengerNotification) {
        this.smsNotification = smsNotification;
        this.emailNotification = emailNotification;
        this.messengerNotification = messengerNotification;
    }

    @Override
    public void send(String message, String contactData) {
        if (contactData.contains("@")) {
            emailNotification.sendEmail(contactData, message);
        } else {
            if (contactData.matches("^[0-9]")) {
                smsNotification.sendSms(message, contactData);
            } else {
                messengerNotification.sendMessage(message, contactData);
            }
        }
    }

    @Override
    public void notify(User user, Project project, String contactData) {
        String message = "User " + user.getLastName() + " " + user.getFirstName() + " added to project "
                + project.getName();
        send(message, contactData);
    }

}
