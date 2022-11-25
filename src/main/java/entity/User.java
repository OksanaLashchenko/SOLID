package entity;

public class User {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final String messenger;

    public User(String firstName, String lastName, String email, String phoneNumber, String messenger) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.messenger = messenger;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessenger() {
        return messenger;
    }

}
