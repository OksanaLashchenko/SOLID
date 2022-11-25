package service.impl;

import entity.Task;
import service.Logger;

public class DefaultLogger implements Logger {

    @Override
    public void logInformation(Task task) {
        System.out.println("Logging information: User " + task.getUser() + "made changes at " + task.getUpdatedAt());
    }

}
