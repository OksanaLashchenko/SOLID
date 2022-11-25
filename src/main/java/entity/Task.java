package entity;

import java.time.LocalDateTime;

public class Task {

    private final LocalDateTime updatedAt;
    private final User user;

    public Task(LocalDateTime updatedAt, User user) {
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public User getUser() {
        return user;
    }

}
