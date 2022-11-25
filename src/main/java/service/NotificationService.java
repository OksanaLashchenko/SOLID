package service;

import entity.Project;
import entity.User;

public interface NotificationService {

    void send(String message, String contactData);

    void notify(User user, Project project, String contactData);

}
